package com.mwaters

class DoctorController {

    def scaffold = Doctor

     def login(){

    }

    def validate() {
    def user1 = Doctor.findByDoctorEmail(params.doctorEmail)
	if (user1 && user1.password == params.password){
        	session.user1 = user1
        	render view:'home'
	}
    	else {
        flash.message = "Invalid username and password."
        render view:'login'
    	}

    
    }

    def logout() {
 	session.user1 = null
 	redirect(uri:'/')
    }

}
