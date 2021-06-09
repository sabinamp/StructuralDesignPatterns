package ch.sabina.dp.proxy.virtual;

import java.util.List;

/*
 * The Virtual Proxy pattern is a memory saving technique that recommends postponing an object creation until it is needed; 
 * it is used when creating an object that is expensive in terms of memory usage or processing involved.
 * When an application is started, it may not need all of its objects
 * to be available immediately. In such cases, the Virtual Proxy pattern suggests deferring objects creation until it is needed by the
 * application. The object that is created the first time is referenced in the application and the same instance is reused from that
 * point onwards. The advantage of this approach is a faster application start-up time, as it is not required to create
 * and load all of the application objects.
 * This technique is also known as Lazy Loading where you are fetching the data only when it is required.
 */
public class TestVirtualProxy {
	
	public static void testVirtualProxy() {
		ContactList cList = new ContactListVirtualProxy();
		Company c = new Company("ABC Company", "India", "+91-011-28458965", cList);
		System.out.println("Requesting for contact list");
		
		List<Employee> empList  = c.getContactList().getContactList();
		
		for(Employee emp : empList){
			System.out.println(emp);
		}

	}

}
