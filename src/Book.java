
public class Book {
	
	private String name;
	private String author;
	private int pageCount;
	private int price;
	
	public Book() {
		//No Argument Constructor
		name= "kk";
		author="kk";
		pageCount=2000;
		price=5000;
	}
	

	public Book(String name, String author, int pageCount, int price) {
		//Parameterized Constructor
		
		this.name = name;
		this.author = author;
		this.pageCount = pageCount;
		this.price = price;
	}



	public Book(int pageCount, String name, String author, int price) {
		
		this.pageCount = pageCount;
		this.name = name;
		this.author = author;
		this.price = price;
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
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
