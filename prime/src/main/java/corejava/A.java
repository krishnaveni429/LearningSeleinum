package corejava;

public class A {
	public void display() {
		System.out.println("sport");
	}
}
class B extends A{
	public void display() {
		System.out.println("football");
	}
}
class c extends A{
	public void dispaly() {
		System.out.println("cricket");
	}
}
class main{
	public static void main(String[]args) {
		
		A A1=new B();
		A1.display();
		A A2=new c();
		A2.display();
	}
	}


