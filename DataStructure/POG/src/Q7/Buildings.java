package Q7;

public class Buildings {

	public static void main(String[] args) {
		int arr[]=new int [] { 12,20,3,50,89,53,14};
		int c=1;
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				c++;
				max=arr[i];
			}
		}
		System.out.println("Count: "+c);
	}
}