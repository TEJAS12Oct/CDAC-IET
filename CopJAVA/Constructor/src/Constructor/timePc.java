package Constructor;

public class timePc {
	int hrs;
	int min;
	int sec;
	
	timePc(int hh , int mm ,  int ss){
		hrs = hh;
		min = mm;
		sec = ss;
	}
	
	void display(){
		System.out.println("hh = " + hrs + "\t" + "mm = " + min + "\t" + "ss = " + sec + "\n");
	}

	public static void main(String[] args) {
		timePc t1 = new timePc(1,20,51);
		timePc t2 = new timePc(2,24,31);
		t1.display();
		t2.display();
	}

}
