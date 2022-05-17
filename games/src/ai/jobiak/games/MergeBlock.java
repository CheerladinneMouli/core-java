package ai.jobiak.games;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
class MergeBlock {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int size = sc.nextInt();
int arr[] = new int[size];
ArrayList<Integer>list = new ArrayList<Integer>(size);
System.out.println("Enter elements to an array");
for(int i=0;i<size;i++) {
arr[i] = sc.nextInt();
System.out.println("Enter the element that is to be added");
int ele = sc.nextInt();
while(ele>0)
{
	
	if((list.equals(arr[i]==ele))||(list.equals(arr[i+1]==ele))){
		list.add(ele);
	}
	System.out.println(list);
	}
}
}



/*list.add(0,20),list.add(1,33);
list.add(2,4);
list.add(3,7);
list.add(4,6);
list.add(5,4);
list.add(6,20);
list.add(7,14);
list.add(8,40);
list.add(9,80);
System.out.println(list);*/
}



