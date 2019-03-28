package com.mwaters

class Appointment {
	Date appDate
	String appTime
	int appDuration
	String roomNumber

//relationship
	Patient thePatient

    static constraints = {
	appDate nullable:false
	appTime nullable:false
	appDuration nullable:false
	roomNumber nullable:false
	thePatient nullable:false
	thePatient blank:false
    }
}
