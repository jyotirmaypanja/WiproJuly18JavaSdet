package LabSession25thJuly;

public class LibraryMain {
	public static void main(String[] args) {
		LibraryManage Lm1=new LibraryManage ("C++", "Robert C. Martin", "9780132350884");
		LibraryManage Lm2=new LibraryManage("Java: The Complete Reference", "Sanjiv Mehra", "9781260440232");
		
		
		  // Display info
		Lm1.getBookInfo();
		Lm2.getBookInfo();
		
		
		// Issue book1
        System.out.println("Issuing book1...");
        Lm1.issueBook();
        Lm1.getBookInfo();
		
        
     // Try to issue again
        System.out.println("Trying to issue book1 again...");
        Lm1.issueBook();
        
        
     // Return book1
        System.out.println("Returning book1...");
        Lm1.returnBook();
        Lm1.getBookInfo();
	 }
		
	

}
