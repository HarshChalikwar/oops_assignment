package libraryRecord;
import libraryItem.Books;
import libraryItem.Journal;
import libraryItem.Magzine;
public class LibraryRecord{
    private Books[] books;
    private Journal[] journals;
    private Magzine[] magzines; 
    
    private final int MAX_BOOKS = 100;
    private final int MAX_JOURNALS = 100;
    private final int MAX_MAGZINES = 100;
    private final int MAX_STUDENTS = 100;

    private int currentBooks = 0;
    private int currentJournals = 0;
    private int currentMagzines = 0;

    public LibraryRecord() {
        this.books = new Books[MAX_BOOKS];
        this.journals = new Journal[MAX_JOURNALS];
        this.magzines = new Magzine[MAX_MAGZINES]; 
    }
    public boolean addBook(Books book) {
        if (currentBooks < MAX_BOOKS) {
            books[currentBooks++] = book;
            return true;
        } 
        else return false;
    }
    public boolean addJournal(Journal journal)
    {
    	if(currentJournals < MAX_JOURNALS) {
    		journals[currentJournals++] = journal;
    		return true;
    	}
    	else return false;
    }
    public boolean addMagzine(Journal journal)
    {
    	if(currentJournals < MAX_MAGZINES) {
    		journals[currentMagzines++] = journal;
    		return true;
    	}
    	else return false;
    }
//  write functions  remove book , remove journal, remove magzine    
}