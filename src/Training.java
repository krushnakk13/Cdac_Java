
public class Training {
	private String moduleName;
	private int duration;
	
	public Training() {
		moduleName = "OOP USING JAVA";
		duration = 60;
	}

	public Training(String moduleName, int duration) {
		super();
		this.moduleName = moduleName;
		this.duration = duration;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void conduct() {
		
	}
	
	
	//With The help of Extension
	public String getDetails() {
		String details = moduleName + "," + duration;
		return details;
		
	}
	
}
