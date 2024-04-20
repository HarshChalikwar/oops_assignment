package person;

public class PhD extends Student{
	public final static String degree = "PhD";
	public final static int MAX_DURATION_DAYS = 63;
	public final static int MAX_LIMIT = 12;
	
	public PhD(String name,String ID) {
		super(name,ID);
	}
}
