package Study.errors;

public class TestHeapFullProblem {

	public static void main(String[] args) {
		BigData[] arr = new BigData[10000];
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
			arr[i] = new BigData();
			//
			//
			arr[i] = null;
			System.gc();
		}
	}

}//end of class

class BigData
{
	long[] data = new long[1000000];
	
	@Override
	protected void finalize() throws Throwable {
		//cleanup or storing or printing to be done just before object is released
		System.out.println(this + " this object is being released ");
	}
	
}
