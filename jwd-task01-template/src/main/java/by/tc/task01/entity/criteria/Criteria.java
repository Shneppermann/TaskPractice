package by.tc.task01.entity.criteria;



import by.tc.task01.entity.criteria.command.*;

import java.util.*;




public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();
	private String applianceType;


	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);

	}

	public String getString() {

		EnumDirector director = new EnumDirector();
		CommandSort commandSort=director.getCommand(this.getApplianceType());
		Enum [] x = commandSort.execute();
		String resultString = "";
		for(int i=0; i<x.length;i++){
			for (Map.Entry entry : this.criteria.entrySet()) {
				if(x[i] == entry.getKey()) {
					if(x[i]==x[x.length-1]&&x[x.length-1]==entry.getKey()){
						resultString += entry.getKey() + "=" + entry.getValue() + " ";
					}
					else {
						resultString += entry.getKey() + "=" + entry.getValue() + ", ";
					}
				}
			}
		}
		return resultString;
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public String getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}


}


























	/*@Override
	public int compareTo(Criteria<E> a) {
		return a.E.ordinal().compareTo(E.ordinal());
	}*/

	/*@Override
	public int compareTo(Criteria<E> o) {
		return this.EnumParametr.compareTo(o.EnumParametr);
	}*/
	// you may add your own code here

	/*List<Entry<E, Object>> entries = new ArrayList<Entry<E, Object>>(criteria.entrySet());
		Collections.sort(entries, new Comparator<Entry<E, Object>>() {
			@Override
			public int compare(Entry<E, Object> e1, Entry<E, Object> e2) {

				return e1.getKey().compareTo(e2.getKey());
			}
		});	*/


