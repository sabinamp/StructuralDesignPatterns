package ch.sabina.dp.proxy.protection;


public abstract class Staff {
	protected ReportGenerator reportGenerator;
	
	public void setReportGenerator(ReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}


	public abstract boolean isOwner();
	

	
}
