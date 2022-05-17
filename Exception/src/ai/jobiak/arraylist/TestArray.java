package ai.jobiak.arraylist;

public class TestArray {

	public static void main(String[] args) {
		
				ArrayList bookList = new ArrayList();
				System.out.println(bookList.size);
				
				bookList.add("java program");
		        bookList.add("Programming in java");
		        boolist.add("Every day injava");
		        bookList.add("Head first java");
		        
		        
		        System.out.println(bookList.size());
		        System.out.println(bookList);
		        
		        System.out.println(bookList.size());
		        bookList.add("Java frameworks");
		        bookList.add("The java EE server Programming");
		        
		        System.out.println(bookList.size());
		        System.out.println(bookList);
		        System.out.println(bookList.get(5));
		        
		        System.out.println(bookList.contains("thinking in java"));
		        
		        List list=bookList;
		        System.out.println(list);
		        Collection collection = list;
		        System.out.println(collection);
		        
		        
		        /////////////iteration
		        
		        Iterator iter = bookList.iterator();
		        while(iter.hasNext()) {
		       	 
		       	 System.out.println(iter.next());
		        } 
		          
		        
		        for(Object book : bookList) {
		       	 System.out.println(book);
		        }
		        
		        for(int i=0;i<bookList.size();i++);
		       		 System.out.printlnbookList.get(i)); 
		}

		Collections.sort(bookList);
		System.out.println(bookList);
		int foundAt = Collections.binarySearch(bookList,"java for dummies in 21days");
		System.out.println(foundAt);

			
			}
				
	}


