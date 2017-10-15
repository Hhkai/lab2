package lab2;

public class Book {
	public String ISBN;
	public String Title;
	public String AuthorID;
	public String Publisher;
	public String PublishDate;
	public String Price;
	Book(String _ISBN, String _Title, String _AuthorID, String _Publisher,
			String _PublishDate, String _Price) {
		ISBN = _ISBN;
		Title = _Title;
		AuthorID = _AuthorID;
		Publisher = _Publisher;
		PublishDate = _PublishDate;
		Price = _Price;
	}
}
