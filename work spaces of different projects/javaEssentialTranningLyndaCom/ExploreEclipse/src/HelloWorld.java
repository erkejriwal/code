import java.util.ArrayList;
import java.util.Date;


public class HelloWorld {

	public static void main(String[] args) {
		
		/*toUpperCharacter();
		int i = 5;
		int j = 6;
		overloadingExample(i, j);
		Date d = new Date();
		double db= 12;
		outPut(d, i, j, db);
		switchUse(i);
		
		Test t= new Test();
		t.myMethod(34);*/
		
		/*mainTaskToCheckCallByReferenceOrValue(); 
		
		stringUse();*/
		
		
	//	exceptionHandlingFromMain();
		
		useOfArrayList();
	}

	private static void useOfArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("my");
		list.add("name");
		list.add("is");
		list.add("James");
		list.add("Bond");

		System.out.println(list);
		
		
	    Person p = new Person();
	    p.setPersonId(1);
	    p.setPersonName("Tom");

	    ArrayList<Object> lstObject = new ArrayList<Object>();
	    lstObject.add(1232);
	    lstObject.add("String");
	    lstObject.add(122.212f);
	    lstObject.add(p);

	    for (Object obj : lstObject) {
	        if (obj.getClass() == String.class) {
	            System.out.println("I found a string :- " + obj);
	        }
	        if (obj.getClass() == Integer.class) {
	            System.out.println("I found an int :- " + obj);
	        }
	        if (obj.getClass() == Float.class) {
	            System.out.println("I found a float :- " + obj);
	        }
	        if (obj.getClass() == Person.class) {
	            Person person = (Person) obj;
	            System.out.println("I found a person object");
	            System.out.println("Person Id :- " + person.getPersonId());
	            System.out.println("Person Name :- " + person.getPersonName());
	        }
	    }
	}

	private static void exceptionHandlingFromMain() {
		System.out.println("before exception");
		try {
			exceptionHandling();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("there was an erro due to  exception");
		}
		
		System.out.println("after exception");
	}

	private static void exceptionHandling() throws ArrayIndexOutOfBoundsException {
		String[] st = {"i"," m"," bond"};
		System.out.println(st[4]);
	}

	private static void stringUse() {
		String st = "welcome to      california !    ";
		System.out.println(st);
		System.out.println(st.length());
		String st1 = st.substring(11);
		System.out.println(st1);
		System.out.println(st1.length());

		String st2 = st1.trim();
		System.out.println(st2);
		System.out.println(st2.length());
	}

	private static void mainTaskToCheckCallByReferenceOrValue() {
		int a = 1;
		int b = 4;
		Integer c=7;
		Integer d = 10;
		int[] arrayInt = {1,2,3,4,5};
		callByValueCheck(arrayInt);
		for (int i : arrayInt) {
			System.out.println(i);
		}
		callByValueCheck(a, b);
		System.out.println(a);
		System.out.println(b);
		callByValueCheck(c, d);
		System.out.println(c);
		System.out.println(d);
		
		Test p =new Test();
		callByValueCheck(p);
		System.out.println("from outside method" + p.i);
	}

	private static void callByValueCheck(int a, int b) {
		a++;
		b++;
	}
	private static void callByValueCheck(Integer a, Integer b) {
		a = Integer.valueOf(9);
		b++;
	}
	private static void callByValueCheck(int...b ) {
		b[0]=9;
		System.out.println("from inside method");

		for (int i : b) {
			System.out.println(i);
		}
	}
	private static void callByValueCheck(Test t) {
		t.i = 11;
		System.out.println("from inside method" + t.i);
	}
	private static void toUpperCharacter() {
		char a = 'd';
		Character ch = new Character(a);
		Character.toUpperCase(ch);
		System.out.println(ch);
		System.out.println(Character.toUpperCase(ch));
	}

	private static void switchUse(int i) {
		switch (i) {
		case 5:
			
			break;

		default:
			break;
		}
	}

	private static void overloadingExample(int i, int j) {
		System.out.println("Here is addition " + add(i, j));
		System.out.println("Here is addition " + add(4, 3, 12));
		System.out.println("Here is addition " + add(i, j, 12));
		System.out.println("Here is addition " + add(2, 12));
	}

	private static int add(int i, int j) {
		
		System.out.println("from two parameter");
		return i+j;
	}
	private static int add(int... arrayInt) {
		int result = 0 ;
		System.out.println("from ....");

		for (int k : arrayInt) {
			result = result + k;
		}
		return result;
	}

	private static void outPut(Date d, int i, int j, double db) {
		System.out.println(d);
		System.out.println(i+j);
		System.out.println("my"+i+j+d);
		System.out.println(i+j+"my"+d);
		System.out.println(i+j+db+"my"+d);
	}

}

class Person {
public int personId;
public String personName;

public int getPersonId() {
    return personId;
}

public void setPersonId(int personId) {
    this.personId = personId;
}

public String getPersonName() {
    return personName;
}

public void setPersonName(String personName) {
    this.personName = personName;
}}
