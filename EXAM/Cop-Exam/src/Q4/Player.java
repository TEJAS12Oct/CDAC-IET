package Q4;

public class Player {
	private String Name;
	private int Run;
	private String Role;

	Player(String Name, int Run, String Role) {
		this.Name = Name;
		this.Run = Run;
		this.Role = Role;
	}

	public int getTotalRuns() {
		return Run;
	}

	public String toString() {
		String str = "Name = " + this.Name + " ," + " Runs = " + this.Run + " ," + " Roll = " + this.Role;
		return str;
	}

}
