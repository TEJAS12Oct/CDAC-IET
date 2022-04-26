package Q6;
public class StudentNames
{
	String [] names;
	int index;
	
	public StudentNames(int size) 
	{
		names = new String[size];
		this.index = -1;
	}
	public StudentNames() 
	{
		names = new String[10];
		this.index = -1;
	}
	
	public void addName(String name)
	{
		if(this.index < names.length)
		{
			index++;
			this.names[index] = name;
		}
		else
			System.out.println("Array is full no place for new names");
	}
	public String getNameOnIndex(int index)
	{
		if(index < names.length && names[index] != null)
			return names[index];
		else
			return "No Name at that index";
	}
	public void showAllNames()
	{
		for (int i = 0; i < names.length; i++)
		{
			if(names[i] != null)
				System.out.print(names[i]+", ");
		}System.out.println("\n");
	}
}
