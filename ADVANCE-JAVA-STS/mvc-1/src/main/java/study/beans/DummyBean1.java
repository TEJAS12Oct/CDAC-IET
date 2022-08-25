package study.beans;

public class DummyBean1 {
	
	private String data,name;  //property name should start with small case

	
	public DummyBean1()
	{
		System.out.println("dummy bean created");
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String s)
	{
		name=s;
	}
	
	

}
