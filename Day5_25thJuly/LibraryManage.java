package LabSession25thJuly;
/*
 * Library Book Tracker
Fields: title, author, isbn, isAvailable
Use encapsulation to:
Issue a book (setAvailable(false))
Return a book (setAvailable(true))
Get book info
Write a small test class to simulate issuing and returning books
 */
// LibraryManage 

public class LibraryManage {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

   
    public LibraryManage(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; 
    }

   
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

   
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    
    public void getBookInfo() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("ISBN       : " + isbn);
        System.out.println("Available? : " + (isAvailable ? "Yes" : "No"));
        System.out.println("-------------------------------");
    }
}



