package ai.jobiak.collection;
import java.util.*;
import java.util.Map.Entry;

public class EmployHashMap {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("Ramu","22-04-1996");
		map.put("Hari","1-03-1997");
		map.put("pavani","22-04-1990");
		map.put("Anji","25-07-1991");
		map.put("Mouli","15-04-2001");
		
		System.out.println(map.size());
		System.out.println(map);
		
		
		Set emp = map.keySet();
		Iterator iter = emp.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collection dob = map.values(); {
		for(Object obj:dob);
	}
	Set<Entry<Object,Object>>entries = map.entrySet();
	Iterator iter2 = entries.iterator();
	while(iter2.hasNext()) {
		Entry entry = (Entry)iter2.next();
		System.out.println(entry.getKey()+"-->"+entry.getValue());
	}
	}
}
