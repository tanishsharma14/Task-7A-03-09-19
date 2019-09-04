
class Employee extends Thread{
	
	public int eno;
	public String ename;
	public int basicSalary;
	
	
	
	public Employee(int eno, String ename, int basicSalary) {
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
	
	public void run()
	{
		calSalary();
	}

	public static void main(String args[])
	{
			Employee e1=new Employee(1,"Tanish",1000);  e1.setName("First Employee");
			Employee e2=new Employee(2,"Jay",2000);		e2.setName("Second Employee");
			Employee e3=new Employee(3,"Vijay",3000);	e3.setName("Third Employee");
			Employee e4=new Employee(4,"Vinod",4000);	e4.setName("Fourth Employee");
			Employee e5=new Employee(5,"Anuj",5000);	e5.setName("Fifth Employee");
			
			
			e1.start();
			e2.start();
			e3.start();
			e4.start();
			e5.start();
	}
}