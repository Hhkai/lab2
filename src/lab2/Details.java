package lab2;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

public class Details extends ActionSupport { 
	private String ISBN;
	private Book book;
	private Author author;
	public String detail() {
		String sql = "select * from bookdb.book where ISBN = " + "'" + ISBN + "'";
		Sql.quer(sql, 2);
		book = Sql.ansBooks.get(0);
		sql = "select * from bookdb.author where AuthorID = " + book.AuthorID;
		Sql.quer(sql, 1);
		author = Sql.ansAuthors.get(0);
		System.out.println("de" + ISBN + ":" + book.AuthorID);
		return SUCCESS;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
}
