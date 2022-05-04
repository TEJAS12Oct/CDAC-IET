package Study.Interface;

import java.security.spec.MGF1ParameterSpec;

public interface I1 {
	void F1();

}

interface I2 {
	void F1();

	void F2();
}

interface I3 extends I2 {
	void F3();

	void F4();
}

interface I5 {
	void F5();

	default void F6() {
		System.out.println("Some Default Implementation of F6");
	}
}

interface I6 {

	default void F6() {
		System.out.println(" Default In I6");
	}
}

class Dummmy implements I1, I2 {

	@Override
	public void F1() {
		System.out.println("F1 Of Dummy");
	}

	@Override
	public void F2() {
	}
}

class Dummy2 implements I3 {
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

class Dummy implements I5, I6 {
	@Override
	public void F5() {
	}

	@Override
	public void F6() {
		I5.super.F6();
		I6.super.F6();
		System.out.println("Dummy Also Implemenst F6");
	}
}

//  Default Of F6 May be used by Dummy4
//  F1 must be implemented
class Dummy4 implements I1, I6 {
	@Override
	public void F1() {
	}
}