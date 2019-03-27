package com.mwaters

class Receptionist {
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	int recepPhone
    static constraints = {
	recepName nullable:false
	recepEmail nullable:false
	recepEmail email:true
	recepUsername nullable:false
	recepUsername unique:true
	recepPassword nullable:false
	recepPassword minSize:8
	recepPhone nullable:false
	recepPhone maxSize:11
	recepPhone minSize:11	
    }
}
