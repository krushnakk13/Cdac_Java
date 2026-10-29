
public class ParameterPassing {

	private static void changeIndex(int idx) {
		idx =10;
	}
	
	private static void changeBookName(Book currentBook) {
		currentBook.setName("WWE");
	}
	public static void main(String[] args) {
		
		int index=7;
		System.out.println("Index Before Change "+index);
		changeIndex(index);
		System.out.println("Index After Change "+index);
		System.out.println("===========================");
		Book myBook = new Book();
		
		System.out.println("Book title brfor change "+myBook.getName());
		changeBookName(myBook);
		System.out.println("Book title After change "+myBook.getName());
		
		
		
	}
}
