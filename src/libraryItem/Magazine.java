package libraryItem;

public class Magazine implements LibraryItem{
	private String title;
	private String author;
	private int UniqueId;
	private int quantity;
	private int issued = 0;
	public Magazine(String title,String author,int UniqueId,int quantity)
	{
		this.author = author;
		this.title = title;
		this.UniqueId = UniqueId;
		this.quantity = quantity;
		
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
