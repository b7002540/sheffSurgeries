package com.mwaters

class Patient {
	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date patientRegistered
	int patientPhone
    static constraints = {
	patientName nullable: false
	patientAddress nullable: false
	patientResidence nullable: false
	patientDob nullable: false
	patientID nullable: false
	patientID unique: true
	patientRegistered nullable:false
	patientPhone nullable:false
	patientPhone maxSize:11
	patientPhone minSize:11
    }
}
