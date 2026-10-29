
public class OfflineTraining extends Training {
	private String venue;

	public OfflineTraining() {
		venue = "YCP,Mumbai";
	}

	public OfflineTraining(String moduleName, int duration, String venue) {
		super(moduleName, duration);
		this.venue = venue;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	
    public void conduct() {
    	
    	System.out.println("This is Offline Session");
    	String currentModule = getModuleName();
    	int currentDuration = getDuration();
    	
    	System.out.println("Connducting the training on : "+ currentModule);
    	System.out.println("for " + currentDuration + " duration");
    	System.out.println("at" + venue);
		
	}
    
    public String getDetails() {
    	return super.getDetails()+ "," +venue;
    }
	
	
	

}
