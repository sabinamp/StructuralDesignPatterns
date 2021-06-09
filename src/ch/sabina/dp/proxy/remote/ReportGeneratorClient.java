package ch.sabina.dp.proxy.remote;

import java.rmi.Naming;

public class ReportGeneratorClient {
	public static void registerRemoteProxy() {
		try {
				ReportGenerator reportGenerator = new ReportGeneratorRemoteProxy();
				Naming.rebind("PizzaCoRemoteGenerator", reportGenerator);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void generateReport(){
		try {
			ReportGenerator reportGenerator = (ReportGenerator)Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
		System.out.println(reportGenerator.generateDailyReport());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void printResult() {
		registerRemoteProxy();
		new ReportGeneratorClient().generateReport();
	}
}
