package Study.IsA.HW;

public class Patient {

	String bloodGroup, Name;
	int bp, heartRate;

	public Patient() {
		this.bloodGroup = bloodGroup;
		Name = Name;
		this.bp = bp;
		this.heartRate = heartRate;
	}

	public Patient(String bloodGroup, String name, int bp, int heartRate) {
		super();
		this.bloodGroup = bloodGroup;
		Name = name;
		this.bp = bp;
		this.heartRate = heartRate;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getBp() {
		return bp;
	}

	public void setBp(int bp) {
		this.bp = bp;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	@Override
	public String toString() {
		return "Patient [bloodGroup=" + bloodGroup + ", Name=" + Name + ", bp=" + bp + ", heartRate=" + heartRate + "]";
	}

}
