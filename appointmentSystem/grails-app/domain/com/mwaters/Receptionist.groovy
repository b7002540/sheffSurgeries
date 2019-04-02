package com.mwaters

class Receptionist {
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

//r
	String toString()
	{
		return recepName
	}

    static constraints = {
	recepName nullable:false
	recepEmail nullable:false
	recepEmail email:true
	recepUsername nullable:false
	recepPassword nullable:false
	recepPhone nullable:false	
    }
}
