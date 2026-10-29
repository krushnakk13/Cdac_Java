
public class TrainingMain {
	public static void main(String[]args) {
		
		OfflineTraining ot = new OfflineTraining();
		ot.conduct();
		
		System.out.println("=========");
		
//		Training obj = new OfflineTraining();//upcasting
//		obj.conduct();
//		
		System.out.println("=========");
		
		OnlineTraining ont = new OnlineTraining("SQL",33,"https://meet.google.com/98544");
		ont.conduct();
		System.out.println("=========");
		
//		Training obj1 = new OnlineTraining();//upcasting
//		obj1.conduct();
		
		System.out.println(ot.getDetails());
		System.out.println(ont.getDetails());
		
		
		
		
				
		
	}

}
