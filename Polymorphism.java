class A{
	public void display(){
		System.out.println("Base Class");
	}
}

class B extends A {
	public void display() {
		System.out.println("Child Class");
	}
}



public class Polymorphism {

	public static void main(String[] args) {
		A obj1 = new B();
		obj1.display();
		
		

	}

}
