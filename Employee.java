package collections;
import java.util.*;
public class Employee implements Comparable<Employee>{
	Integer id;
	String name;
	public Employee()
	{
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
//	public String toString()
//	{
//		return id + " " + name;
//	}
//	
	public void display(ArrayList<Employee> emp)
	{
		for(Employee l : emp)
		{
			System.out.println(l.id + " " + l.name);
		}
	}

	@Override
	public int compareTo(Employee o) {
		if(this.id>o.id)
		{
			return 1;
		}
		else if(this.id<o.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
}
