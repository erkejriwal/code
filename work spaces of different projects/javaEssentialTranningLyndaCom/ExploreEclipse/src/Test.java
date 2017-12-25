
public class Test {
	public int i =5;
	protected void myMethod(int a){
		System.out.println(a);
		Test.myMethodStatic(a);
		myMethodStatic(a);
		//myMethod(a);
	}
	protected static void myMethodStatic(int a){
		System.out.println(a);
		Test t = new Test();
		t.myMethod3(a);
	}
	protected void myMethod3(int a){
		System.out.println(a);
		
		//myMethod(a);
	}
}
