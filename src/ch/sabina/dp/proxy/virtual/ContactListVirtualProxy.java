package ch.sabina.dp.proxy.virtual;

import java.util.List;

public class ContactListVirtualProxy implements ContactList {
	private ContactList contactList;

	@Override
	public List<Employee> getContactList() {
		if(contactList == null) {
			contactList = new ContactListImpl();
		}
		return contactList.getContactList();
	}

}
