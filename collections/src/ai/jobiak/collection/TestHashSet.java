package ai.jobiak.collection;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		
		/*HashSet<Course> courseSet = new HashSet<Course>();
		Course c1 = new Course("BCL1","Computer Basics",20,500);
		Course c2 = new Course("PGL1","Algorithms",40,2500);
		Course c3 = new Course("AdvProgrL3","Java Basics",60,5000);
		Course c4 = new Course("AdvProgrL3","Java Basics",60,5000);
		
		//System.out.println(c3.hashCode());
		//System.out.println(c4.hashCode()); */
		TreeSet fruits = new TreeSet();
		fruits.add("leach");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("oranges");
		
		System.out.println(fruits);
		
		TreeSet ranks = new TreeSet();
		ranks.add(7);
		ranks.add(6);
		ranks.add(5);
		ranks.add(4);
		
		System.out.println(ranks);
		
		
		Course c1 = new Course("BCL1","Computer Basics",20,5000);
		Course c2 = new Course("PGL1","Algorithms",40,2500);
		Course c3 = new Course("AdvProgrL3","Java Basics",60,5000);
		Course c4 = new Course("AdvProgrL3","Java Basics",60,5000);
		
		TreeSet courseTree = new TreeSet();
		courseTree.add(c1);
		courseTree.add(c2);
		courseTree.add(c3);
		courseTree.add(c4);
		
		
		System.out.println(courseTree);
				
		
		/*courseSet.add(c1);
		courseSet.add(c2);
		courseSet.add(c3);
		courseSet.add(c4);
		courseSet.add(null);*/
		
		//for(Object obj:courseSet);
		
	}

}
