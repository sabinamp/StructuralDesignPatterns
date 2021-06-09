package ch.sabina.dp.proxy.virtual;

public class Company {
	private String companyName;
	private String companyAddress;
	private String companyContactNo;
	private ContactList contactListImpl ;
	
	public Company(String companyName,String companyAddress, String companyContactNo, ContactList contactList){
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyContactNo = companyContactNo;
		this.contactListImpl = contactList;
		System.out.println("Company object created...");
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String getCompanyAddress() {
		return companyAddress;
	}
	
	public String getCompanyContactNo() {
		return companyContactNo;
	}
	
	public ContactList getContactListImpl(){
		return contactListImpl;
	}
}
