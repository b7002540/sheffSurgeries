package com.mwaters

class Patient {
	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date patientRegistered
	String patientPhone
	
//relationships
	static hasMany=[prescriptions:Prescription, doctors:Doctor]
	static belongsTo=[Doctor]

    static constraints = {


	patientName nullable: false
	patientAddress nullable: false
	patientResidence nullable: false
	patientDob nullable: false
	patientID nullable: false
	patientID unique: true
	patientRegistered nullable:false
	patientPhone nullable:false

	
	
    }
}
