package com.mwaters

class Nurse {
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	int nursePhone
    static constraints = {
	nurseName nullable: false
	qualifications nullable: false
	nurseEmail nullable: false
	nurseEmail email:true
	nurseOffice nullable: false
	nursePhone maxSize:11
	nursePhone minSize:11
	nursePhone nullable:false
    }
}
