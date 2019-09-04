
public class Employee2 implements Runnable{
	public int eno;
	public String ename;
	public int basicSalary;
	
	
	public Employee2(int eno, String ename, int basicSalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}
	

	public void calSalary()
	{
		System.out.println(Thread.currentThread().getName()+" HRA: "+((10*basicSalary)/100));
		System.out.println(Thread.currentThread().getName()+" DA: "+((25*basicSalary)/100));
		System.out.println(Thread.currentThread().getName()+" CA: "+((10*basicSalary)/100));
	}
	
	
	@Override
	public void run() {
		
		calSalary();
	}
	
	public static void main(String args[])
	{
		Employee e1=new Employee(1,"Tanish",1000);  
		Employee e2=new Employee(2,"Jay",2000);		
		Employee e3=new Employee(3,"Vijay",3000);	
		Employee e4=new Employee(4,"Vinod",4000);	
		Employee e5=new Employee(5,"Anuj",5000);	
		
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e2);
		Thread t3=new Thread(e3);
		Thread t4=new Thread(e4);
		Thread t5=new Thread(e5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}




	

	
	
	
}


