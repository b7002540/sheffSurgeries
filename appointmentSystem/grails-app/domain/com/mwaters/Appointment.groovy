package com.mwaters

class Appointment {
	Date appDate
	String appTime
	int appDuration
	String roomNumber
    static constraints = {
	appDate nullable: false
	appTime nullable:false
	appTime size:3..5
	appDuration nullable:false
	appDuration size:1..3
	roomNumber nullable:false
	roomNumber size:1..6
    }
}
