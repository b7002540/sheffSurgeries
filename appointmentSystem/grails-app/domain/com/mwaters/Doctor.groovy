package com.mwaters

class Doctor {
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

//realationships
	static hasMany=[prescriptions:Prescription, patients:Patient, nurses:Nurse, appointments:Appointment]
	static belongsTo=[Patient, Nurse]

	String toString()
	{
		return fullName
	}

    static constraints = {
	fullName nullable:false
	qualification nullable:false
	position nullable:false
	doctorEmail nullable:false
	doctorEmail email:true
	password nullable:false
	doctorOffice nullable:false
	doctorPhone nullable:false
	bio nullable:false
    }
}
