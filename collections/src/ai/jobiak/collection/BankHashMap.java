package ai.jobiak.collection;
import java.util.*;
import java.util.Map.Entry;
public class BankHashMap {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("IDBI","Mumbai");
		map.put("Indian Bank","Chennai");
		map.put("Andhra Bank","Hyderabad");
		map.put("RBI","Mumbai");
		map.put("CITI Bank","Newyark");
		map.put("Karnataka Bank","Mangalore");
		map.put("Punjab National Bank","New Delhi");
		map.put("World Bank","Washington D.C");
		
		System.out.println(map.size());
		System.out.println(map);
		
		Set banks = map.keySet();
		Iterator iter = banks.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection hq = map.values();
		for(Object obj : hq) {
			System.out.println(obj);
		}
		Set<Entry<Object,Object>>entries = map.entrySet();
		Iterator iter2 = entries.iterator();
		while(iter2.hasNext()) {
			
			Entry entry = (Entry)iter2.next();
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}

	}

}
