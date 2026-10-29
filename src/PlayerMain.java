// inherted classes are invoked classes from bottom to top but execution of top to bottom
public class PlayerMain {
	public static void main(String[] args) {
		CricketPlayer cr = new CricketPlayer();
		
		cr.setName("Abhishek Dhawale");
		cr.setAge(24);
		cr.setRuns(25555);
		cr.setBattingAvg(55.03f);
		
		System.out.println(cr.getName());
		System.out.println(cr.getAge());
		System.out.println(cr.getRuns());
		System.out.println(cr.getBattingAvg());
		
		
		System.out.println("=========================");
		CricketPlayer crPlayer2 = new CricketPlayer("MSD",44,12345,55.65f);
		//Remaining code to get and print values.

		
	}

}
