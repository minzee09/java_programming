package lab03;

class Book {
	private String title;
	private String author;
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
		
}
public class BookTest
{
	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.setTitle("Harry Potter");
		b1.setAuthor("J.K.Rowling");
		
		System.out.println(b1.getTitle() + " " + b1.getAuthor());
	}
}
