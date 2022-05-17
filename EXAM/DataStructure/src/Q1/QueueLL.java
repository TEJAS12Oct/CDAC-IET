package Q1;

public class QueueLL {

	private Node Front;
//	private Node Rear;

	public QueueLL() {
		Front = null;
	}

	public QueueLL(Node Front) {
		this.Front = Front;
	}

	public void Insert(Employee Data) { // Insert From rear
		Node tmp = new Node(Data);

		if (Front == null) { // check if empty
			Front = tmp;
		} else {
			Node it = Front;
			while (it.Next != null) {
				it = it.Next;
			}

			// it reaches at last Node
			it.Next = tmp;
			tmp.Next = null;
		}
	}

	public void Remove() {

		if (Front == null) {
			System.out.println("Queue LinkList  Is Empty ");
		} else {

			if (Front.Next == null) {
				Front = null;

			} else {
				if (Front.Next == null) {
					Front = null;
				} else {

					Node t = Front;
					Front = t.Next;
					t.Next = null;
				}

			}

		}
	}

	public void PrintFemale(QueueLL qll) {
		Node it = qll.Front;

		while (it != null) {

			if (it.Data.Gender == 'F' || it.Data.Gender == 'f') {
				System.out.println(it.Data + " ");
			}
			it = it.Next;
		}

	}

	public void PrintMale(QueueLL qll) {
		Node it = qll.Front;
		while (it != null) {
			if (it.Data.Gender == 'M' || it.Data.Gender == 'm') {
				System.out.println(it.Data + " ");
			}
			it = it.Next;
		}

	}

	public void EmptyRecursion() {
		Node it = Front;
		Node itn = Front;
		Node itp = null;

		while (it != null) {
			itn = it.Next;
			it.Next = itp;
			itp = it;
			it = itn;
		}
		Front = itp;
	}

	public void ReversePrint() {

		System.out.println(" Reverse Queue uisng Recusrion: ");
		reverse(this.Front);
		System.out.println();

	}

	public void reverse(Node it) {
		if (it != null) {

			reverse(it.Next);
			System.out.println(it.Data + " ");
			Remove();
		}

	}

	public String toString() {
		String str = "";

		if (Front == null) {
			str = "QueueLL Is Empty \n";
		} else {
			Node it = Front;
			while (it != null) {

				str = str + it.Data + "  \n";
				it = it.Next;
			}
		}
		return str;
	}

}
