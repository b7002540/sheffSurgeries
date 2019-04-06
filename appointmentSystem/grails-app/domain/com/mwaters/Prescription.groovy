package com.mwaters

class Prescription {
	String pharmacyName
	String prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying

//r
	static hasMany=[patients:Patient, doctors:Doctor]
	static belongsTo=[Doctor, Patient]

	String toString()
	{
		return prescripNumber
	}

    static constraints = {
	pharmacyName nullable:false
	prescripNumber nullable:false
	medicine nullable:false
	totalCost nullable:false
	dateIssued nullable:false
	patientPaying nullable:false
    }
}
