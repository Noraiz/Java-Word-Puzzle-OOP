
public class eatables {
	 static String categories []={"Sports","Vehicles", "Films", "Celebrites","Animals","Eatables","Technology"};
	public static void main(String[] args) {
		for(String a: categories ){
			System.out.println(" "+a);
		}
		 A a = new A(3);
	 }
		 }
	
		 class A extends B {
		 public A(int t) {
		 System.out.println("A's constructor is invoked");
		 }
		 }
		
		 class B {
		 public B() {
		 System.out.println("B's constructor is invoked");
		}
		 }