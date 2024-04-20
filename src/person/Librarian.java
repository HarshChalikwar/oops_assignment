package person;
import library.Library;
import libraryItem.Book;
import libraryItem.Journal;
import libraryItem.Magazine;
public class Librarian {
	private Student[] issuedTo;
	private int numStudents; // no of students whom book is issued
	
	public Librarian() {
		issuedTo = new Student[300];
	}
	public boolean issueBook(Student student, String title, String category, String issueDate) {
		if(category.equals("BOOK")) {
			Book []arr = Library.getBook();
			for(Book b : arr) {
				if(b.getTitle().equals(title)) {
					b.decreaseQuantity();
					issuedTo[numStudents] = student;
					numStudents++;
				}
			}
			
		}
		//search in library in category array
		//decrease count
		//add book in student's category array
		//add student in issuedTo array
		//use instanceof to check max limit and max duration, allocate accordingly
		//set book's due date and issue date
	}
	
	public int acceptBook(Student student, String title, String category, String returnDate) {
		
		//remove book from student's category array
		//add to library's category array
		//decrease count for student
		//increase count for library
		//check for fine
	}
}