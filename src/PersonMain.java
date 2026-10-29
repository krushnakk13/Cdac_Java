
public class PersonMain {
	static{
		System.out.println("Person Class is getting loaded");
	}
	
	public static void main(String[] args) {
		
		
		
		Person p1 = new Person();
		Person p2 = new Person("kk",23);
		Person p3 = new Person(23,"kk");
		
		System.out.println("Current Person Count : "+Person.getPerson_Count());
		new Person();
		new Person("kkk",34);
		System.out.println("Current Person Count : "+Person.personCount);
		
		for(int i=1;i<=10;i++) {
			new Person();
		}
		System.out.println("Current Person Count : "+Person.personCount);
		System.out.println("Final Count of Persons: "+Person.getPerson_Count());
		
	}

}
