package com.mwaters

class Nurse {
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone

//Realationships
	static hasMany=[doctors:Doctor, surgerys:Surgery]
	static belongsTo=[Doctor, Surgery]

	String toString()
	{
		return nurseName
	}

    static constraints = {
	nurseName nullable: false
	qualifications nullable: false
	nurseEmail nullable: false
	nurseEmail email:true
	nurseOffice nullable: false
	nursePhone nullable:false
    }
}
