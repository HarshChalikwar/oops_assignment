package libraryItem;
public class Books implements LibraryItem{
	private String title;
	private String author;
	private int UniqueId;
	private int edition;
	private int quantity;
	private int issued = 0;
	public Books(String title,String author,int UniqueId,int edition,int quantity)
	{
		this.author = author;
		this.title = title;
		this.edition = edition;
		this.quantity = quantity;
		this.UniqueId = UniqueId;
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
