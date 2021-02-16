package com.bridgelabz.addressbook

import grails.rest.RestfulController;

class AddressBookController extends RestfulController {

	def addressBookService = new AddressBookService();
	
	 static responseFormats = ['json', 'xml']
	
	 AddressBookController() {
		super(AddressBook)
	}
	
	 @Override
	def index() {
		
		respond addressBookService.getAllAddresses(params,request)
	}

	@Override
	def show() {
		respond addressBookService.getAddress(params,request)
	}

	@Override
	def save() {
		def address = addressBookService.saveAddress(params,request)
		respond address
	}

	@Override
	def update() {
		def address = addressBookService.updateAddress(params,request)
		respond address
	}

	@Override
	def delete() {
		def address = addressBookService.deleteAddress(params,request)
		respond address
	}

}
