
public class BookMain {
	public static void main(String[]args) {
		
		Book bk = new Book();
		Book bk1 = new Book("a","z",1000,3000);
		Book bk2 = new Book(1000,"AAA","qwer",500);
		
		
//		bk.setName("Prince of Parshia");
//		bk.setAuthor("Pratik Tiger");
//		bk.setPageCount(40000);
//		bk.setPrice(5000);
//		
		System.out.println("Book Name:"+ bk.getName());
		System.out.println("Book Author:"+ bk.getAuthor());
		System.out.println("Book Page Count:"+ bk.getPageCount());
		System.out.println("Book Price:"+ bk.getPrice());
	}

}
