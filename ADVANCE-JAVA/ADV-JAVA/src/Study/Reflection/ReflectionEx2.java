package Study.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionEx2 {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Class Name : "); // Type in Console => Study.Reflection.SocialEvent
		Class C1 = Class.forName(SC.next());

		System.out.println("The Class Is : " + C1.getName());
//		Object obj = C1.newInstance();

		Constructor ctor = C1.getDeclaredConstructor(null);
		Object obj = ctor.newInstance();

		Constructor ctor2 = C1.getDeclaredConstructor(String.class, int.class);
		Object obj2 = ctor2.newInstance("Wedding Party ", 30);

		Field[] Properties = C1.getDeclaredFields();

		for (Field Property : Properties) {
			Property.setAccessible(true);
			System.out.println("Obj : " + Property.getName() + " : " + Property.get(obj));
			System.out.println("Obj2 : " + Property.getName() + " : " + Property.get(obj2));
		}

		System.out.println("Enter the Name of the method to Call : "); // Type in console => show
		String MName = SC.next();

		Method method = C1.getDeclaredMethod(MName);
		method.invoke(obj); // Calling the  specified method using  a specific object
		method.invoke(obj2);

	} // End Of Main

} // End Of Ex-2

class SocialEvent {
	String EventName;
	int NoOfPeople;

	public SocialEvent() {
		EventName = "Birthday Party ";
		NoOfPeople = 12;
	}

	public SocialEvent(String eventName, int noOfPeople) {
		EventName = eventName;
		NoOfPeople = noOfPeople;
	}

	public void show() {
		System.out.println(EventName + "" + NoOfPeople);
	}

	public String getEventName() {
		return EventName;
	}

	public void setEventName(String eventName) {
		EventName = eventName;
	}

	public int getNoOfPeople() {
		return NoOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		NoOfPeople = noOfPeople;
	}

}