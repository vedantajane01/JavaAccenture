package collections;
import java.util.*;
public class Emp_Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList();
		
		Employee e1 = new Employee(101, "Amit");
		Employee e2 = new Employee(106, "Vikas");
		Employee e3 = new Employee(102, "Mahesh");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
//		System.out.println(emp);
		
//		Collections.sort(emp);
//		
//		for(Employee ob : emp)
//		{
//			System.out.println(ob);
//		}
		
		Collections.sort(emp, new IdComparator());
		
		Employee obj = new Employee();
		obj.display(emp);
		
//		for(Employee ob : emp)
//			{
//				System.out.println(ob);
//			}
		
	}

}
