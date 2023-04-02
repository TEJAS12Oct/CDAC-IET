package Study.Do;

public class Appointment  {
	private String name;
	private String date;
	private String purpose;
	private String type;
	private String start;
	private String end;
	
	@Override
	public String toString() {
		return "ProductDO [name=" + name + ", date=" + date + ", purpose=" + purpose + ", type=" + type + ", start="
				+ start + ", end=" + end + "]";
	}
	public Appointment() {
		
	}
	public Appointment(String name, String date, String purpose, String type, String start, String end) {
		super();
		this.name = name;
		this.date = date;
		this.purpose = purpose;
		this.type = type;
		this.start = start;
		this.end = end;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
	
}
