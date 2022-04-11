package Employee;

public class EmployeeDLL {

	EmpNode head;
	EmpNode tail;

	EmployeeDLL() {
		this.head = null;
		this.tail = null;
	}

	EmployeeDLL(EmpNode head) {
		this.head = head;
		this.tail = null;
	}

	EmployeeDLL(EmpNode head, EmpNode tail) {
		this.head = head;
		this.tail = tail;
	}

	public void setTail(EmpNode tail) {
		this.tail = tail;
	}

	public EmpNode getTail() {
		return this.tail;
	}

	public void sethead(EmpNode head) {
		this.head = head;
	}

	public EmpNode gethead() {
		return this.head;
	}

	public void insert(Employee e) {
		EmpNode newnode = new EmpNode(e);

		if (this.head == null) // if no node present
		{
			this.head = this.tail = newnode;
		} else // if no of nodes in linkedlist
		{
			newnode.set_Next(this.head);
			this.head.set_Pre(newnode);
			this.head = newnode;
		}
	}

	public int getNodeCount() {
		int count = 0;
		EmpNode it = head;
		while (it != null) {
			count++;
			it = it.get_Next();
		}
		return count;
	}

	public void insert_by_position(int pos, Employee data) {
		EmpNode newnode = new EmpNode(data);
		if (pos == 1) {
			insert(data);
		} else if (pos == getNodeCount() + 1) {
			append(data);
		} else if (pos > 1 && pos < getNodeCount() + 1) {
			EmpNode it = head;
			for (int i = 1; i < pos - 1; i++) {
				it = it.get_Next();
			}
			/*
			  Node tmp=it.next; it.next=newnode; newnode.pre=it; newnode.next=tmp;
			  tmp.pre=newnode;
			 */

			newnode.set_Next(it.get_Next());
			newnode.set_Pre(it);
			newnode.get_Next().set_Pre(newnode);
			it.set_Next(newnode);

		}
	}

	public void insertAtMiddle(Employee e) {
		EmpNode newnode = new EmpNode(e);
		if (head == tail) {

		} else {
			int c = getNodeCount() / 2;
			System.out.println(c);
			insert_by_position(c + 1, e);

		}
//		if(head==null)
//		{
//			System.out.println("linked list is empty");
//		}
//		else
//		{
//			if(head.get_Next()==null)
//			{
//				System.out.println(" Only one node present...so u cant add at first..");
//			}
//			else
//			{
//				EmpNode it=head,last=tail;
//				while(it!=last)
//				{
//					it=it.get_Next();
//					last=last.get_Pre();
//				}
//				System.out.println(it);
//				System.out.println(last);
//				newnode.set_Pre(last.get_Pre());
//				newnode.set_Next(last);
//				it.get_Pre().set_Next(newnode);
//				last.set_Pre(newnode);
//			}
//		}

	}

	public void append(Employee e) // add at last
	{
		EmpNode newnode = new EmpNode(e);

		if (this.head == null) // if last node is first node
		{
			this.head = this.tail = newnode;
		} else // add at last
		{
			this.tail.set_Next(newnode);
			newnode.set_Pre(this.tail);
			this.tail = newnode;
		}
	}

	public void append(EmployeeDLL e) {

		if (this.head == null || e.head == null) {
			System.out.println(" empty linked list");
		} else if (this.tail.get_Next() == null) {
			this.tail.set_Next(e.head);
			e.head.set_Pre(this.tail);
			// this.tail=e.tail;
		}

	}

	public void append(String name, int age, int salary) {
		EmpNode newnode = new EmpNode(name, age, salary); // we directly pass value without using emnode data
		if (head == null) {
			this.head = this.tail = newnode;
		} else {
			this.tail.set_Next(newnode);
			newnode.set_Pre(this.tail);
			this.tail = newnode;
		}
	}

	public void delete_first() {
		if (head == null) {
			System.out.println(" Linked list is empty");
		} else {
			if (head.get_Next() == null) {
				head = null;
				tail = null;
			} else {
				EmpNode it = head;
				head = it.get_Next();
				head.set_Pre(null);
				it.set_Next(null);
			}
		}
	}

	public void delete_last() {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			if (head.get_Next() == null) {
				head = null;
				tail = null;
			} else {
				EmpNode it = tail;
				tail = it.get_Pre();
				it.get_Pre().set_Next(null);
				it.set_Pre(null);
			}
		}
	}

	public void delete_by_position(int pos) {
		EmpNode it = head;
		if (pos == 1) {
			delete_first();
		} else if (pos == getNodeCount()) {
			delete_last();
		} else {

			for (int i = 1; i < pos - 1; i++) {
				it = it.get_Next();
			}
			EmpNode t = it.get_Next();
			it.set_Next(it.get_Next().get_Next());
			t.set_Pre(null);
			t.set_Next(null);

		}
	}

	public void deleteOlderThan31Age() {
		EmpNode it = head;
		int i = 0;
		while (it != null) {
			if (it.get_Data().getAge() > 31) {
				i++;
				delete_by_position(i);
			}
			it = it.get_Next();
		}
	}

	public static void printCommonEmployees(EmployeeDLL e1, EmployeeDLL e2) {
		System.out.println();
		EmpNode it = e1.head;
		EmpNode it2 = e2.head;
		while (it != null) {
			it2 = e2.head;
			while (it2 != null) {
				if ((it.get_Data().getAge() == it2.get_Data().getAge())
						&& (it.get_Data().getSalary() == it2.get_Data().getSalary())
						&& (it.get_Data().getName().compareToIgnoreCase(it2.get_Data().getName()) == 0)) {
					System.out.println("Common Employee" + it.get_Data());
				}
				it2 = it2.get_Next();
			}
			it = it.get_Next();
		}

	}

	public static EmployeeDLL concat(EmployeeDLL e1, EmployeeDLL e2) {

		e2.head.set_Pre(e1.tail);
		e1.tail.set_Next(e2.head);
		e1.tail = e2.tail;
		// list3.head=e1.head;
		// list3.tail=e2.tail;

		EmployeeDLL res = new EmployeeDLL(e1.head);

		return res;
	}

	public String toString() {
		String str = " ";
		if (this.head == null) {
			str = " Linkedlist is empty";
		} else {
			EmpNode it = head;
			while (it != null) {
				str += "\n" + it.get_Data();
				it = it.get_Next();
			}
		}
		return str;
	}
}
