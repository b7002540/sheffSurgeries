package com.mwaters

class Prescription {
	String pharmacyName
	int prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying
    static constraints = {
	pharmacyName nullable:false
	prescripNumber nullable:false
	prescripNumber unique:true
	medicine nullable:false
	totalCost nullable:false
	totalCost maxSize:10
	dateIssued nullable:false
	patientPaying nullable:false
    }
}
