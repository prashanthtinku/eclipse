package jcPackage;

public class JCClass {

	public static void main(String[] args) {
		System.out.println("In Main");
		JCClass jc=new JCClass();
		jc.JavaClass();
		jc.secondFunction();	

	}
	
	public void JavaClass(){
		System.out.println("In the Function JC Class");
	}
	
	public void secondFunction(){
		System.out.println("Second Entry");
		System.out.println("In the second method");
	}

}
