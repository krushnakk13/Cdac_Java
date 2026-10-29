
public class OnlineTraining extends Training{
	
	private String meetingLink;

	public OnlineTraining() {
		
		meetingLink = "https://www.zoom.us/48575";
	}

	public OnlineTraining(String moduleName, int duration ,String meeringLink) {
		super(moduleName, duration);
		
		this.meetingLink=meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	
	 public void conduct() {
	    	
	    	System.out.println("This is Online Session");
	    	String currentModule = getModuleName();
	    	int currentDuration = getDuration();
	    	String ml = getMeetingLink();
	    	
	    	System.out.println("Connducting the training on : "+ currentModule);
	    	System.out.println("for " + currentDuration + " duration");
	    	System.out.println("using the link " + ml);
			
		}
	 
	 
	 public String getDetails() {
	    	return super.getDetails() + " , " +meetingLink;
	    }
		
	
	
	
	
	
	
	
	

}
