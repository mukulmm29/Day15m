class A1 extends Thread{
	public void run() {
		System.out.println("Current ID OF A1" + Thread.currentThread().getId());
	}
}
class B1 extends Thread{
	public void run() {
		System.out.println("Current ID OF B1" + Thread.currentThread().getId());
	}
}
class C1 extends Thread{
	public void run() {
		System.out.println("Current ID OF C1" + Thread.currentThread().getId());
	}
}
class D1 implements Runnable{

	public void run() {
		System.out.println("Current ID OF D1" + Thread.currentThread().getId());
	}
	
}
public class Thread1Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.start();
		B1 b = new B1();
		b.start();
		C1 c = new C1();
		c.start();
		D1 d = new D1();
		Thread th = new Thread(d);
		th.start();
		System.out.println("ID Of Main Method Is :- " + Thread.currentThread().getId());
	}

}
