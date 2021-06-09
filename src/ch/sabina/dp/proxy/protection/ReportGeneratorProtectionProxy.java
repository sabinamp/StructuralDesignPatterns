package ch.sabina.dp.proxy.protection;

/*
 * use Protection Proxy which checks if the object which is trying to generate the report is
 * the owner; in this case, the report gets generated, otherwise it is not
 */
public class ReportGeneratorProtectionProxy implements ReportGenerator{
	
	private boolean isOwner;
	private ReportGenerator generator;

	
	public ReportGeneratorProtectionProxy(boolean owner, ReportGenerator gen){	
		this.isOwner = owner;
		this.generator = gen;
	}

	@Override
	public String generateDailyReport() {
		try {
			if(generator != null && isOwner) {
				return generator.generateDailyReport();
			}else {
				return "Not authorized to generate reports";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error";
		
	}

}
