package ai.jobiak.collection;
import java.util.HashMap;
import java.util.Map;
public class TestHash {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		Map<Employee,String> map = new HashMap<Employee,String>();
		map.put(emp1,"mouli");
		map.put(emp2, "mouli");
		
		System.out.println(map.size());

Integer i = new Integer(1);
Integer i2 = new Integer(1);
Map<Integer,String> map1 = new HashMap<Integer,String>();
map1.put(i,"one");
map1.put(i2,"one");
System.out.println(map1.size());
	}
}

	class Employee {
		int id;
		public Employee(int id) {
			this.id = id;
		}
	}
	

