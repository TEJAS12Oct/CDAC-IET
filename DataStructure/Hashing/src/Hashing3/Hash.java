package Hashing3;

public class Hash {
	static int count=0;
	String []arrhash;

	Hash()
	{
		arrhash=new String[10];
	}
	Hash(int size)
	{
		arrhash=new String[size];
	}

	//---------------------------------------------------------------INSERT
	
	public void insert(String str)
	{
		int i=indexByHashTable(str);
		if(arrhash[i]!=null)
		{
			System.out.println("Array is full...");
		}
		else
		{
			arrhash[i]=str;
		}
	}
	//---------------------------------------------------------------getIndex
	public int indexByHashTable(String str)
	{
		int sum=0,i=0,flag=0;

		for(i=0;i<str.length();i++)
		{
			sum = sum + str.charAt(i);
		}
		sum=(sum % arrhash.length);

		//-------------------------------------loop
		
		if(arrhash[sum]==null)
		{
			return sum;
		}
		else
		{
			for(i=sum+1;i<arrhash.length;i++)
			{
				if(flag==2)
				{
					break;
				}
				
				if(arrhash[i]==null)
				{
					return i;
				}
				
				if(i==arrhash.length-1)
				{
					i=0;
					++flag;
					if(flag==2)
					{
						break;
					}
					continue;
				}
			}
		}
		return sum; 
	}
	//---------------------------------------------------------------removeStringFunction
	public void removeData(String rmvStr)
	{
		int j,flag=0;
		if(count==0)
		{
			System.out.println("LIST IS EMPTY...YOU CAN ADD ELEMENTS");
		}
		else
		{
			int index=indexRemoveData(rmvStr);

			for(j=index;j<arrhash.length;j++)
			{
				if(arrhash[j].equals(rmvStr))
				{
					arrhash[j]=null;
					break;
				}
				if(j==arrhash.length-1)
				{
					j=0;
					++flag;

					if(flag==2)
					{
						System.out.println("Invalid Element Input");
						break;
					}
					continue;
				}
			}
		}
	}
	//---------------------------------------------------------------get Index removeStringFunction
	public int indexRemoveData(String str)
	{
		int sum=0,j=0;

		for(j=0;j<str.length();j++)
		{
			sum = sum + str.charAt(j);
		}
		sum=(sum % arrhash.length);

		return sum;
	}
	

	//-------------------------------------------------------------------String
	
	public String toString()
	{
		String str=" ";
		for(int i=0;i<arrhash.length;i++)
		{
			str= str + arrhash[i]+", ";
		}
		
		return str;
	}	
}
