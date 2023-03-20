package mypack;
class B {	
	public B() {
		System.out.println("hai from B ! ");
	}
}
class D extends B {	
	public D() {
		System.out.println("hai   from   D !!! ");
	}
}
class D2 extends B {	
	public D2() {
		System.out.println("hai from D2  ! takes 2 to tango ");
	}
}
class SD extends D {
	public SD() {
		System.out.println("hai from SD ! howya doin");
	}
}
public class InhDemo2 {
	public static void main(String[] args) {
		
		SD obj=new SD();	
		
		// B => D single 
		// 		D	=> SD multilevel
		// B => D2 hierarchy
		
		// constructors in inheritance
		// When we instantiate derived object
		//		Base constructor is called first.
		//		Derived constructor is called second 
		System.out.println(obj);
	}
}
