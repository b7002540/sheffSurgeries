package com.mwaters

class Surgery {
	String name
	String address
	String postcode
	String telephone
	String numberOfPatients
	String description
	String openingTime

//realationship
	static hasMany=[doctors:Doctor, nurses:Nurse, patients:Patient, appointments:Appointment, receptionists:Receptionist]
	

    static constraints = {
	name nullable:false
	address nullable:false
	postcode nullable:false
	telephone nullable:false
	numberOfPatients nullable:false
	description nullable:false
	openingTime nullable:false
    }
}
