package Study.IsA.HW;

public class Patient extends Person {
	private String bloodGroup;
	private String bp;
	private String heartRate;

	public Patient(String bloodGroup, String bp, String heartRate, String name, MyDate dob) {
		super(name, dob);// super constructor
		this.bloodGroup = bloodGroup;
		this.bp = bp;
		this.heartRate = heartRate;
	}

	public Patient(String bloodGroup, String bp, String heartRate) {
		super();
		this.bloodGroup = bloodGroup;
		this.bp = bp;
		this.heartRate = heartRate;
	}

	public Patient() {
		this.bloodGroup = null;
		this.bp = null;
		this.heartRate = null;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	public String toString() {
		return "Patient==>bloodGroup-" + bloodGroup + ", bp-" + bp + ", heartRate-" + heartRate + " "
				+ super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj) == true) {
			System.out.println("Patient - Equals called");

			if (obj instanceof Patient) {
				Patient temp = (Patient) obj;
				if (this.bloodGroup.equals(temp.bloodGroup) && this.bp.equals(temp.bp)
						&& this.heartRate.equals(temp.heartRate)) {
					System.out.println("Compare");
					return true;
				} else
					return false;

				// return super.equals(obj);
			} else
				return false;
		}
		return false;
	}
}