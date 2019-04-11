package com.gs.ilp.corejava.interfaces;

public class Office {
	public static void main(String[] args) {

		HRExecutive hr = new HRExecutive();

		// own member
		hr.specialization = new String[] { "Staffing" };

		System.out.println(hr.specialization[0]);//
		// child can see parent
		hr.name = "Pavni gupta";
		System.out.println(hr.name);
		hr.conductInterview();

		Employeeee emp = new HRExecutive();

		// emp.specialization= new String[]{"Staffing"};;
		emp.name = "Mohit";
		System.out.println(emp.name);
		
		//emp.conductInterview();
		
		Interviewer hrInterviewer = new HRExecutive();
		
		//interviewer.specialization = new String[] { "Staffing" };
		//interviewer.name = "Pavni gupta";
		hrInterviewer.conductInterview();
		
		
		Interviewer[] interviewers = new Interviewer[2];
		
		Interviewer manager = new Manager();
		
		interviewers[0] = manager;
		interviewers[1] = hrInterviewer;
		
		System.out.println("Benefits of interface pitfalls");
		
		for(Interviewer interviewer : interviewers) {
			interviewer.conductInterview();
		}
		
		

	}

}
