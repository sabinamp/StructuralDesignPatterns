package ch.sabina.dp.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/*
 * a proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer.
 * Here are several common situations in which the Proxy pattern is applicable:
 *	• A remote proxy provides a local representative for an object in a different address space.
 *	• A virtual proxy creates expensive objects on demand.
 *	• A protection proxy controls access to the original object. Protection proxies are useful when objects should have different
 * access rights
 */
public class RemoteProxy extends UnicastRemoteObject implements ReportGenerator{
	private static final long serialVersionUID = 3107413009881629428L;
	
	protected RemoteProxy() throws RemoteException {
	}
	
	@Override
	public String generateDailyReport() throws RemoteException {
	StringBuilder sb = new StringBuilder();
		sb.append("********************Location X Daily Report********************");
		sb.append("\\n Location ID: 012");
		sb.append("\\n Today’s Date: "+new Date());
		sb.append("\\n Total Pizza’s Sell: 112");
		sb.append("\\n Total Price: $2534");
		sb.append("\\n Net Profit: $1985");
		sb.append("\\n ***************************************************************");
	return sb.toString();
	}
	
	public static void testRemoteProxy() {
		try {
			ReportGenerator reportGenerator = new RemoteProxy();
				Naming.rebind("PizzaCoRemoteGenerator", reportGenerator);
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
