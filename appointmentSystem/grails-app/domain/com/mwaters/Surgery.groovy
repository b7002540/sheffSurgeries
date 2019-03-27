package com.mwaters

class Surgery {
	String name
	String address
	String postcode
	int telephone
	int numberOfPatients
	String description
	String openingTime

    static constraints = {
	name nullable:false
	address nullable:false
	postcode nullable:false
	postcode maxSize:8
	telephone nullable:false
	telephome maxSize:11
	telephone minsize:11
	numberOfPatients nullable:false
	numberOfpatients max:100
	description maxSize:500
	description widget:'textarea'
    }
}
