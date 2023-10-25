package collections;

import java.util.*;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id.compareTo(o2.id);            // Wrapper class is used in collections 
		                                          // so id should be Integer not int 
//		if(o1.id>o2.id)                           // We can use String 
//		{
//			return 1;
//		}
//		else if(o1.id<o2.id)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
	}

}
