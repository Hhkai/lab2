package lab2;

import java.sql.*;
import java.util.*;

public class Sql {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String user = "root";
	private static String url = "jdbc:mysql://localhost:3306/bookdb";
	private static String password = "1234";
	//sina 
	//private static String password = "123456";
	//private static String url = "jdbc:mysql://jackerpjhjcl.mysql.sae.sina.com.cn:10624/bookdb";
	
	public static ArrayList<Author> ansAuthors;
	public static ArrayList<Book> ansBooks;
	public static String quer(String sql, int ch) {
		// ch = 1, author; ch = 2, book
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed())
				System.out.println("connecting to the database successfully!");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);  
			if (ch == 1) {
				ansAuthors = new ArrayList();
				while (rs.next()) {
					Author tmp = new Author(
							rs.getString("AuthorID"),
							rs.getString("Name"),
							rs.getString("Age"),
							rs.getString("Country"));
					ansAuthors.add(tmp);
				}
			}
			if (ch == 2) {
				ansBooks = new ArrayList();
				while (rs.next()) {
					Book tmp = new Book(
							rs.getString("ISBN"),
							rs.getString("Title"),
							rs.getString("AuthorID"),
							rs.getString("Publisher"),
							rs.getString("PublishDate"),
							rs.getString("Price")
							);
					ansBooks.add(tmp);
				}
			}
			rs.close(); 
			conn.close(); 
			return "success";
		} catch(ClassNotFoundException e) {  
			System.out.println("sorry, can't find the driver!");  
			//e.printStackTrace();
			return "error";
		}  catch(SQLException e) {
			e.printStackTrace();
			return "error";
		} catch(Exception e){
			e.printStackTrace();
			return "error";
		}
	}
	public static String update(String sql) {
		// ch = 1, author; ch = 2, book
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed())
				System.out.println("connecting to the database successfully!");
			Statement statement = conn.createStatement();
			statement.executeUpdate(sql);  
			conn.close(); 
			return "success";
		} catch(ClassNotFoundException e) {  
			System.out.println("sorry, can't find the driver!");  
			//e.printStackTrace();
			return "error";
		}  catch(SQLException e) {
			e.printStackTrace();
			return "error";
		} catch(Exception e){
			e.printStackTrace();
			return "error";
		}
	}
	public static boolean haveAuthor(String authorID) {
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed())
				System.out.println("connecting to the database successfully!");
			Statement statement = conn.createStatement();
			String sql = "select * from bookdb.author where AuthorID = " + "'" + authorID + "'";
			ResultSet rs = statement.executeQuery(sql); 
			if (rs.next()) {
				rs.close(); 
				conn.close(); 
				return true;
			}
			rs.close(); 
			conn.close(); 
			return false;
		} catch(ClassNotFoundException e) {  
			System.out.println("sorry, can't find the driver!");  
			//e.printStackTrace();
			return false;
		}  catch(SQLException e) {
			e.printStackTrace();
			return false;
		} catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}