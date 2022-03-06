class A2 extends Thread{
	public void run() {
		System.out.println("Current ID OF A2" + Thread.currentThread().getId());
	}
}
class B2 extends Thread{
	public void run() {
		System.out.println("Current ID OF B2" + Thread.currentThread().getId());
	}
}
class C2 extends Thread{
	public void run() {
		System.out.println("Current ID OF C2" + Thread.currentThread().getId());
	}
}
class D2 implements Runnable{

	public void run() {
		System.out.println("Current ID OF D2" + Thread.currentThread().getId());
	}
	
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2();
		a.setPriority(Thread.MIN_PRIORITY); //We give Priority but compiler shows there way 
		a.start();
		B2 b = new B2();
		b.setPriority(Thread.NORM_PRIORITY);
		b.start();
		C2 c = new C2();
		c.setPriority(Thread.MIN_PRIORITY);
		c.start();
		D2 d = new D2();
		Thread th = new Thread(d);
		th.setPriority(Thread.MAX_PRIORITY);
		th.start();
		for(int i=0;i<3;i++)
		{
			System.out.println("ID Of Main Method Is :- " + Thread.currentThread().getId());
		}
	}

}
