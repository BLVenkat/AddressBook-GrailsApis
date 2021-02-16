package com.bridgelabz.addressbook

import grails.transaction.Transactional


@Transactional
class AddressBookService {

	def getAllAddresses(def params, def request) {
		return AddressBook.findAll()
	}
	
	def getAddress(def params, def request) {
		def address = AddressBook.findById(params?.id)
		return address
		
	}
	
	def saveAddress(def params, def request) {
		def address = request.JSON
		def addressInstance = new AddressBook(address)
		
		addressInstance = addressInstance.save()

		return addressInstance
	}
	
	def updateAddress(def params, def request) {
		def address = request.JSON
		def addressInstance = AddressBook.get(params?.id)
		addressInstance.properties = address
		addressInstance = addressInstance.save()
		return addressInstance
	}

	def deleteAddress(def params, def request) {
		
		def addressInstance = AddressBook.get(params?.id)
	//	addressInstance = addressInstance.delete()

		return addressInstance
	}
}
