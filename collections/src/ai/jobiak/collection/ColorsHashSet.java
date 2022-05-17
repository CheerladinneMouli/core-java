package ai.jobiak.collection;
import java.time.LocalDateTime;
import java.util.*;

public class ColorsHashSet {

	public static void main(String[] args) {
		
		HashSet colors = new HashSet();
		
		colors.add("white");
		colors.add("blue");
		colors.add("black");
		colors.add("yellow");
		colors.add("pink");
		colors.add("green");
		colors.add("violet");
		colors.add("orange");
		LocalDateTime ldt = LocalDateTime.now();
		colors.add(ldt);
		colors.add(null);
		colors.add(new Boolean("false"));
		
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.contains("purple"));

	}

}
