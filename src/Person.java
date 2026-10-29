
public class Person {

	private String name;//A new copy is created for every object
	private int age;//A new copy is created for every object
	public static int personCount;//only single copy is created for whole class 
	private static int person_count;
	
	public static int getPerson_Count() {  //non static
		return person_count;
	}
	
	
	
	public Person() {
		name="Krushna";
		age=23;
		personCount++;
		person_count++;
		
		
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		personCount++;
		person_count++;
	}
	public Person(int age, String name) {
		
		this.age = age;
		this.name = name;
		personCount++;
		person_count++;
	}
	
	//Getters and Setters Impl.
	
	
	
	
	

}
