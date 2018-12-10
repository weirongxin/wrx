package bean;

public class Book {
	private String id;
	private String name;
	private String author;
	private String datetime;
	private String publication;
	private String function;
	public Book() {
		super();
	}
	public Book(String id, String name, String author, String datetime, String publication) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.datetime = datetime;
		this.publication = publication;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", datetime=" + datetime + ", publication="
				+ publication + ", function=" + function + "]";
	}
	
}
