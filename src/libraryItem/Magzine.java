package libraryItem;

public class Magzine implements LibraryItem{
	private String title;
	private String author;
	private int UniqueId;
	private int quantity;
	private int issued = 0;
	public Magzine(String title,String author,int UniqueId,int quantity)
	{
		this.author = author;
		this.title = title;
		this.UniqueId = UniqueId;
		this.quantity = quantity;
		
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
