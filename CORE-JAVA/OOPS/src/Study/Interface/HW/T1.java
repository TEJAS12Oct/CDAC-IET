package Study.Interface.HW;

public interface T1 {
	void F1();

}

interface T2 extends T1 {

	void F2();
}

interface T3 extends T2 {
	void F3();

	void F4();
}

interface T4 {
	void F4();

	default void F5() {
		System.out.println("Some Default Implementation of F5");
	}
}

interface T5 {

	default void F5() {
		System.out.println(" Default In T5");
	}
}

class C1 implements T1 {

	@Override
	public void F1() {
		System.out.println("F1 Of Dummy");
	}
}

class C2 implements T3 {
	@Override
	public void F1() {
	}

	@Override
	public void F2() {
	}

	@Override
	public void F3() {
	}

	@Override
	public void F4() {
	}
}

class C3 implements T4 {

	private void F1() {
	}

	private void F2() {
	}

	private void F3() {
	}

	@Override
	public void F4() {
	}

	@Override
	public void F5() {
		T4.super.F5();
		System.out.println("Dummy Also Implemenst F6");
	}
}

class C4 implements T4, T5 {
//	@Override
//	public void F1() {
//	}

	private void F2() {
	}

	private void F3() {
	}

	@Override
	public void F4() {
	}

	@Override
	public void F5() {
		T4.super.F5();
	}
}