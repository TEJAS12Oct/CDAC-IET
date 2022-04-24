package Q2_1;

public class DetectCycleList 
{
	public static void main(String[] args) 
	{
		LinkedList LL = new LinkedList();

		LL.append(1);
		LL.append(2);
		LL.append(3);
		LL.append(4);
		LL.append(5);
		LL.append(6);
		LL.append(7);

		System.out.println(LL);

		LL.creatCycle(4);

//`		System.out.println(LL);
		Node c = LL.detectCycle();
		if(c != null)
		{
			int length = LL.lengthList(c);
			Node it = LL.head;
			for(int i = 1;i<length;i++)
			{
				it = it.next;
			}
			it.next=null;
			System.out.println(" CYCLE DETECTED : "+LL);
			
		}
		else
		{
			System.out.println(" NO CYCLE DETECTED ");
		}

	}

}
