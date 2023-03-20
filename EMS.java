import java.util.*;
class Emp 
{
    public int id;
    public String name;
    public double salary;
    public Emp() { }
    public Emp(int i, String n, double s ) { }
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter id, name, salary ");
        id = s.nextInt();
        s.nextLine();
        name = s.nextLine();
        salary = s.nextDouble();
    }
    public void display(){
        System.out.println("Emp details ...");
        System.out.println("id      :"+id);
        System.out.println("name    :"+name);
        System.out.println("salary  :"+salary);
    }
}
// Employee Management System
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Emp> emplist = new ArrayList<Emp> ();
	    Scanner scanner = new Scanner(System.in);
	    Emp e;
	    while(true)
	    {
            System.out.println("1. Add an Employee ");
            System.out.println("2. View All Employees ");
            System.out.println("3. View a particular Employee ");
            System.out.println("4. Edit an Employee ");
            System.out.println("5. Remove an Employee ");
            System.out.println("0. quit ");
            System.out.println("Enter choice ");
            int ch = scanner.nextInt();
            switch(ch)
            {
                case 1:
                    e =new Emp();
                    e.input();
                    emplist.add(e);
                    break;
                case 2:
                    for(Emp t : emplist) {
                        t.display();
                    }
                    break;
                case 3:
                    System.out.println("enter id ");
                    int id = scanner.nextInt();
                    for(Emp t : emplist) {
                        if(t.id == id)
                            t.display();
                    }
                    break;
                case 0:
                    return;
            }
	    }
	}
}