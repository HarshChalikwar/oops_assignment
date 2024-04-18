package person;

public class Student{
	private String degree;
	private String name;
	private String ID;
	static int MAX_DURATION_DAYS;
	static int MAX_LIMIT;
	private String issue_date;
	private String due_date;
	
	public Student(String name, String ID, String degree) {
		this.name = name;
		this.ID = ID;
		this.degree = degree;
	}
	
	public void setMaxDays(String degree) {
		if(degree.equals("Bachelors")) this.MAX_DURATION_DAYS = 21;
		if(degree.equals("Masters")) this.MAX_DURATION_DAYS = 42;
		if(degree.equals("PhD")) this.MAX_DURATION_DAYS = 63;
	}
	
	public void setMaxLimit(String degree) {
		if(degree.equals("Bachelors")) this.MAX_LIMIT = 3;
		if(degree.equals("Masters")) this.MAX_LIMIT = 7;
		if(degree.equals("PhD")) this.MAX_LIMIT = 12;
	}
	
	public String getDueDate(String issueDate, int max_duration_days) {
		return "";
	}

	public void setDueDate(String date) {
		this.due_date = date;
	}
	
	public void setIssueDate(String date) {
		this.issue_date = date;
	}
//	write function for requesting librarian a book , modify the request array
}
