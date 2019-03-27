package com.mwaters

class Doctor {
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	int doctorPhone
	String bio
    static constraints = {
	fullName nullable: false
	qualification nullable: false
	position nullable: false
	doctorEmail nullable: false
	doctorEmail email:true
	password nullable: false
	password minSize: 8
	doctorOffice nullable: false
	doctorPhone nullable: false
	doctorPhone maxsize: 11
	doctorPhone minsize: 11
	bio maxSize: 500
	bio widget: 'textarea'
    }
}
