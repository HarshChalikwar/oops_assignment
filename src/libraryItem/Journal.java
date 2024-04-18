package libraryItem; 

public class Journal implements LibraryItem{
	private String title;
	private String author;
	private int UniqueId;
	private int volume;
	private int quantity;
	private int issued = 0;
	public Journal(String title,String author,int UniqueId,int quantity,int volume)
	{
		this.author = author;
		this.title = title;
		this.UniqueId = UniqueId;
		this.quantity = quantity;
		this.volume = volume;
	}
	boolean isAvailable()
	{
		if(this.issued < this.quantity) return true;
		return false;
	}
	public String getTitle()
	{
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public int getUniqueId() {
		return this.UniqueId;
	}
}
