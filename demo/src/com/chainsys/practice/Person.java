package com.chainsys.practice;

public class Person {
	
	
	public Person(String personName, String bloodGroup, String contact) {
		
		this.personName = personName;
		this.bloodGroup = bloodGroup;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", BloodGroup=" + bloodGroup + ", contact=" + contact + "]";
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	String personName ;
	String bloodGroup;
	String contact;

}
