package lab2;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

public class Search extends ActionSupport { 
	private String authorName;    // for search
	private ArrayList<Author> authors;      // search ans
	private String authorID;     // choose an author in res anthors 
	private ArrayList<Book> books;      //  books for some one 
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}
	public String getAuthorID() {
		return authorID;
	}
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String search() {
		String sql = "select * from bookdb.author where Name = " + "'" + authorName + "'";
		System.out.println(authorName);
		Sql.quer(sql, 1);
		authors = Sql.ansAuthors;
		return SUCCESS;
	}
	public String all() {
		String sql = "SELECT * FROM bookdb.author";
		Sql.quer(sql, 1);
		authors = Sql.ansAuthors;
		return SUCCESS;
	}
	public String book() {
		String sql = "select * from bookdb.book where AuthorID = " + authorID;
		System.out.println(authorID + "fun book");
		Sql.quer(sql, 2);
		books = Sql.ansBooks;
		return SUCCESS;
	}
}
