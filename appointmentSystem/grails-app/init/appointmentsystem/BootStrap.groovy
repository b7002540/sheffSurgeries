package com.mwaters

class BootStrap {

    def init = { servletContext ->
//Surgery
	def surgery1=new Surgery (
	name:'Kings Landing Surgery',
	address:'Kings Landing',
	postcode:'KS1 2RK',
	telephone:'18989765654',
	numberOfPatients:'65',
	description:'Hear Us Roar',
	openingTime:'7am to 7pm'
	).save()

	def surgery2=new Surgery (
	name:'High Garden',
	address:'The Reach',
	postcode:'R1 HG3',
	telephone:'89891234541',
	numberOfPatients:'45',
	description:'Growing Strong',
	openingTime:'7am to 7pm'
	).save()

//Doctors:
	def doc1=new Doctor (
	fullName:'Arya Stark',
	qualification:'Degree 2:1',
	position:'GP',
	doctorEmail:'aryastark@got.co.uk',
	password:'password',
	doctorOffice:'b700',
	doctorPhone:'10800001066',
	bio:'Winter is Coming'
	).save()
	
	def doc2=new Doctor (
	fullName:'Sansa Stark',
	qualification:'Degree 1st',
	position:'Surgeon',
	doctorEmail:'sansastark@got.co.uk',
	password:'password',
	doctorOffice:'b701',
	doctorPhone:'20303004056',
	bio:'Winter is Coming'
	).save()

//Nurse 
	def nurse1=new Nurse (
	nurseName:'Jaime Lannister',
	qualifications:'Masters 2:2',
	nurseEmail:'jamie@got.co.uk',
	nurseOffice:'c201',
	nursePhone:'12345678901'
	).save()
	
	def nurse2=new Nurse (
	nurseName:'cersei Lannister',
	qualifications:'Masters 1st',
	nurseEmail:'cersei@got.co.uk',
	nurseOffice:'c200',
	nursePhone:'13455672921'
	).save()	

//Patient
	def pat1=new Patient (
	patientName:'Jon Snow',
	patientAddress:'Winterfell',
	patientResidence:'The North',
	patientDob:new Date('21/06/1998'),
	patientID:'1',
	patientRegistered:new Date('15/04/2019'),
	patientPhone:'87656543232'
	).save()
	
	def pat2=new Patient (
	patientName:'Daenerys Targaryen',
	patientAddress:'Meereen',
	patientResidence:'essos',
	patientDob:new Date('30/06/1998'),
	patientID:'2',
	patientRegistered:new Date('22/05/2019'),
	patientPhone:'98076565432'
	).save()

//receptionist
	def recep1=new Receptionist (
	recepName:'Margery Tyrell',
	recepEmail:'mtyrell@got.co.uk',
	recepUsername:'username1',
	recepPassword:'password',
	recepPhone:'86765454321'
	).save()

	def recep2=new Receptionist (
	recepName:'Loras Tyrell',
	recepEmail:'ltyrell@got.co.uk',
	recepUsername:'username2',
	recepPassword:'password',
	recepPhone:'8765654323'
	).save()


//Appointments:	
	def app1=new Appointment (
	appDate:new Date('20/1/2020'),
	appTime:'13:00',
	appDuration:'15',
	roomNumber:'b700',
	thePatient:pat2
	).save()
	
	def app2=new Appointment (
	appDate:new Date('21/1/2020'),
	appTime:'14:00',
	appDuration:'10',
	roomNumber:'b701',
	thePatient:pat1
	).save()

//prescription
	def pre1=new Prescription (
	pharmacyName:'Kings Landing',
	prescripNumber:'1',
	medicine:'calpol',
	totalCost:'£20.20',
	dateIssued:new Date('29/05/2019'),
	patientPaying:true,
	theDoctor:doc1,
	).save()

	def pre2=new Prescription (
	pharmacyName:'High Garden',
	prescripNumber:'2',
	medicine:'cream',
	totalCost:'£7.20',
	dateIssued:new Date('23/11/2019'),
	patientPaying:false,
	theDoctor:doc2,
	).save()

	doc2.addToAppointments(app1)

	surgery2.addToReceptionists(recep2)

	pat2.addToPrescriptions(pre2)

	doc1.addToPrescriptions(pre2)

	surgery1.addToNurses(nurse2)
	
    }
    def destroy = {
    }
}
