package ch.sabina.dp.proxy.protection;

public class TestProtectionProxy {
	
	public static void testProtectionProxy() {
		ReportGenerator gen = new ReportGeneratorImpl();
		Staff owner = new Owner();
		
		ReportGenerator reportGenerator1 = new ReportGeneratorProtectionProxy(true, gen);
		owner.setReportGenerator(reportGenerator1);
		
		Staff employee = new Employee();
		
		ReportGenerator reportGenerator2 = new ReportGeneratorProtectionProxy(false, gen);
		employee.setReportGenerator(reportGenerator2);
		
		System.out.println("For owner:");
		System.out.println(owner.reportGenerator.generateDailyReport());
		System.out.println("For employee:");
		System.out.println(employee.reportGenerator.generateDailyReport());
	}

}
