class A extends Thread{
	public void run() {
		System.out.println("Current ID OF A" + Thread.currentThread().getId());
	}
}
class B extends Thread{
	public void run() {
		System.out.println("Current ID OF B" + Thread.currentThread().getId());
	}
}
class C extends Thread{
	public void run() {
		System.out.println("Current ID OF C" + Thread.currentThread().getId());
	}
}
public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
	}

}
