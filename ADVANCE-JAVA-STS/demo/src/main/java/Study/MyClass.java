package Study;

import Study.Annotation.MySticker;

@MySticker(value="www" ,roll = 49)
public class MyClass {

//	@MySticker(value="AAA",roll=49)
	public void f1() {
		System.out.println("f1");
	}

//	@MySticker(value="AAA",roll=49)@MySticker
	public void f2() {
		System.out.println("f2");
	}

}
