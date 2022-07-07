package study.Do;

public class Appointment {

	private String name;
	private String pass;
	private String reason;

	public Appointment() {

	}

	public Appointment(String name, String pass, String reason) {

		this.name = name;
		this.pass = pass;
		this.reason = reason;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "Appointment [name=" + name + ", pass=" + pass + ", reason=" + reason + "]";
	}

}
