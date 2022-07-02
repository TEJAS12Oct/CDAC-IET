package study.beans;

public class DummyBean1 {
	private String data, name;

	public DummyBean1() {
	System.out.println("Default DummyBean Constructor Called...");
	}

	public DummyBean1(String data, String name) {
		super();
		this.data = data;
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
