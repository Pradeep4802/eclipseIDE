package practice.multithreaded;

public class RunnableDemo_02_21 implements Runnable{
	
	public RunnableDemo_02_21() {}
	public RunnableDemo_02_21(String name,int priority) {
		Thread newTh = new Thread(this);
		newTh.setName(name);
		newTh.setPriority(priority);
		newTh.start();
	}
	
	public String newName(String Name) {
		return Name;
	}
	
	public void run() {
		System.out.println("Thread was executed : ");
		for(int i = 0;i < 5;i++) {
			System.out.println("Executed : "+Thread.currentThread().toString());
			try {
				Thread.sleep(300);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		RunnableDemo_02_21 rn = new RunnableDemo_02_21();
		Thread th = new Thread(rn);
		th.start();
		System.out.println("New Name are : "+rn.newName("Manish"));
		System.out.println("IsAlive : "+Thread.currentThread().isAlive());
		RunnableDemo_02_21 rn1 = new RunnableDemo_02_21("CYAN",9);
		Thread th1 = new Thread(rn1);
		th1.start();
	}
}
