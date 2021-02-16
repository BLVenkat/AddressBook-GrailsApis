package com.bridgelabz.addressbook

class AddressBook {

	Long id
	String fullName
	String address
	String city
	String state
	Integer pincode
	String phoneNo
	
	
    static constraints = {
		fullName blank:false,nullable:false
		address blank:false,nullable:false
		city blank:false,nullable:false
		state blank:false,nullable:false
		pincode blank:false,nullable:false
		phoneNo blank:false,nullable:false
		
    }
	static mapping = {
		version false
	}
}
