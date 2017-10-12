package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.HashMap;
import java.util.Map;

public class Validator {

	private final static String [] stringVariables = {"OS","FILTER_TYPE","BAG_TYPE","WAND_TYPE","COLOR","FREQUENCY_RANGE"};
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		Map<E, Object> val = new HashMap<E, Object>();
		val = criteria.getCriteria();
		double valDouble;
		for (Map.Entry entry : val.entrySet())
		{
			if(entry.getValue() == null||String.valueOf(entry.getKey()).equals("")){
				System.out.println("Empty value in "+entry.getKey());
				return false;
			} else if(checkString(String.valueOf(entry.getKey()))){
				try{
					valDouble= Double.parseDouble(String.valueOf(entry.getValue()));
				}
				catch (Exception ex){
					System.out.println("Incorrect value in "+entry.getKey());
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkString(String str){
		for (String strVar: stringVariables)
		{
			if (str.equals(strVar)){
				return false;
			}
		}
		return true;
	}
}


