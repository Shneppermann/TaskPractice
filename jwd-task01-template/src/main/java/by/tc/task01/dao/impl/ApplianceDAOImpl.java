package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.commandCreate.ApplianceDirector;
import by.tc.task01.dao.impl.commandCreate.CommandCreate;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.command.CommandSort;
import by.tc.task01.entity.criteria.command.EnumDirector;

import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO{

	private String filename = ".\\src\\main\\resources\\appliances_db.txt";
	private FileReader createFile;
	private java.util.Scanner scanner;
	private String [] splitString;
	private String patternString;
	private String result;
	private Object[] objectArray;

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		ApplianceDirector director = new ApplianceDirector();
		try {
			createFile = new FileReader(filename);
			scanner = new Scanner(createFile);
			splitString = criteria.getString().split(" ");
			patternString = getPattern(splitString,criteria.getApplianceType());

			while(scanner.hasNext()){
				result = scanner.findInLine(Pattern.compile(patternString));
				if(result!=null){
					break;
				}
				scanner.nextLine();
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("File not found!");
			return null;
		}

		if(result!=null) {
			objectArray=createValues(result,criteria.getApplianceType());
			CommandCreate command = director.getCommand(criteria.getApplianceType());
			Appliance appliance = command.execute(objectArray);
			return appliance;
		} else {return null;}
	}

	private String getPattern(String[] str, String type){
		String ResultStr ="("+type+")";
		for(String res: str){
			ResultStr+=".+("+res+")";
		}
		ResultStr+=".+";
		return ResultStr;
	}



	private Object[] createValues (String str, String type){
		Pattern p;
		Matcher mch;
		EnumDirector director = new EnumDirector();
		CommandSort commandSort=director.getCommand(type);
		Enum [] enumSearchCriteria = commandSort.execute();
		String [] PatternStr = new String[enumSearchCriteria.length];
		for(int i=0; i<enumSearchCriteria.length;i++)
		{
			if(enumSearchCriteria[i]==enumSearchCriteria[enumSearchCriteria.length-1]) {
				PatternStr[i] = "(" + String.valueOf(enumSearchCriteria[i]) + "=).{1,11}(?:;)";
			}
			else {
				PatternStr[i] = "(" + String.valueOf(enumSearchCriteria[i]) + "=).{1,11}(?:,)";
			}
		}
		String [] ArrayParam=new String[PatternStr.length];
		for(int i=0; i<PatternStr.length; i++)
		{
			p=Pattern.compile(PatternStr[i]);
			mch = p.matcher(str);
			while(mch.find()) {
				ArrayParam[i]=str.substring(mch.start(), mch.end());
			}
		}
		for (int i=0; i<ArrayParam.length;i++){
			if(enumSearchCriteria[i]==enumSearchCriteria[enumSearchCriteria.length-1]){
				ArrayParam[i] = ArrayParam[i].replaceAll(String.valueOf(enumSearchCriteria[i])+"=","");
				ArrayParam[i] =ArrayParam[i].replaceAll(";","");
			}
			else {
				ArrayParam[i] = ArrayParam[i].replaceAll(String.valueOf(enumSearchCriteria[i])+"=","");
				ArrayParam[i] =ArrayParam[i].replaceAll(",","");
			}
		}
		return ArrayParam;
	}

}




