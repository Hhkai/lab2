package lab2;

import com.opensymphony.xwork2.ActionSupport;

public class Change extends ActionSupport {
	private String AuthorID;
	private String Name;
	private String Age;
	private String Country;
	private String ISBN;
	private String Title;
	private String Author_ID;
	private String Publisher;
	private String PublishDate;
	private String Price;
	private int addOrCh;
	public String changeAuthorJ() {
		System.out.print("su");
		return SUCCESS;
	}
	public String changeAuthor() {
		if (addOrCh == 1) {
			return addAuthor();
		}
		String sql = "UPDATE `bookdb`.`author` SET"
				+ " `Name`= "+ "'" + Name + "' ,"
				+ "`Age` =" + "'" + Age + "' ,"
				+ "`Country` =" + "'" + Country + "'"
				+ " WHERE `AuthorID`=" + "'"+ AuthorID + "'";
		System.out.println(sql);
		Sql.update(sql);
		return SUCCESS;
	}
	public String deleteAuthor() {
		String sql = "delete from `bookdb`.`author` where AuthorID =" + "'" +AuthorID +"'";
		Sql.update(sql);
		return SUCCESS;
	}
	public String changeBookJ() {
		return SUCCESS;
	}
	public String changeBook() {
		if (addOrCh == 1) {
			return addBook();
		}
		String sql = "UPDATE `bookdb`.`book` SET"
				+ " `ISBN`= "+ "'" + ISBN + "' ,"
				+ " `Title`= "+ "'" + Title + "' ,"
				+ " `AuthorID`= "+ "'" + Author_ID + "' ,"
				+ " `Publisher`= "+ "'" + Publisher + "' ,"
				+ " `PublishDate`= "+ "'" + PublishDate + "' ,"
				+ "`Price` =" + "'" + Price + "'"
				+ " WHERE `ISBN`=" + "'"+ ISBN + "'";
		System.out.println(sql);
		Sql.update(sql);
		return SUCCESS;
	}
	public String deleteBook() {
		String sql = "delete from `bookdb`.`book` where ISBN =" + "'" + ISBN +"'";
		Sql.update(sql);
		return SUCCESS;
	}
	public String addAuthor() {
		String sql = "INSERT INTO `bookdb`.`author` (`AuthorID`, `Name`, `Age`, `Country`) VALUES (" 
				+ "'" + AuthorID + "', '" + Name + "', '" + Age + "', '" + Country + "4')";
		Sql.update(sql);
		return SUCCESS;
	}
	public String addBook() {
		if (Sql.haveAuthor(Author_ID) == false) 
			return ERROR;
		String sql = "INSERT INTO `bookdb`.`book` (`ISBN`, `Title`, `AuthorID`, `Publisher`, `PublishDate`, `Price`) VALUES ('" 
				+ ISBN + "', '" +Title + "', '" + Author_ID + "', '" + Publisher + "', '" + PublishDate + "', '" + Price + "')";
		Sql.update(sql);
		System.out.println(sql);
		return SUCCESS;
	}
	
	
	public String getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(String AuthorID) {
		this.AuthorID = AuthorID;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getAuthor_ID() {
		return Author_ID;
	}
	public void setAuthor_ID(String author_ID) {
		Author_ID = author_ID;
	}
	public int getAddOrCh() {
		return addOrCh;
	}
	public void setAddOrCh(int addOrCh) {
		this.addOrCh = addOrCh;
	}
}
