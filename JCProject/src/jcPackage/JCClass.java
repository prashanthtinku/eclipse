package jcPackage;

public class JCClass {

	public static void main(String[] args) {
		System.out.println("In Main changing the Message");
		JCClass jc=new JCClass();
		jc.JavaClass();
		jc.newOne();
		jc.secondFunction();
	}
	
	public void JavaClass(){
		System.out.println("In the Function JC Class");
	}
	
	public void secondFunction(){
		System.out.println("Second Entry");
		System.out.println("In the second method - Updated with the another Branch");
		for(int i=1;i<3;i++){
			System.out.println("Hello "+i);
		}
	}
	
	public void newOne(){
		System.out.println("In the New One");
	}

}
