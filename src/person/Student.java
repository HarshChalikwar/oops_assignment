package person;
import libraryItem.Book;
import libraryItem.Journal;
import libraryItem.Magazine;

public class Student{
	private String name;
	private String ID;
	private Book[] issuedBooks;
	private Journal[] issuedJournals;
	private Magazine[] issuedMagazines;
	public int fine;
	
	protected int MAX_DURATION_DAYS;
	protected int MAX_LIMIT;
	
	
	public Student(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	
	public String getDueDate(String issueDate, int max_duration_days) {
		return "";
	}
	
	
	
}
