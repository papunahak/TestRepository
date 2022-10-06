package com.Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.StudentDetails;
import StudentRegistrationService.StudentService;

public class Student extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		//System.out.println("This is doPost Method");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		int age=Integer.parseInt(req.getParameter("age"));
		String gender=req.getParameter("Gender");
		String qualification=req.getParameter("Qualification");
		
       // PrintWriter out=resp.getWriter();
		
		//out.println("name="+name);
		//out.println("email="+email);
		//out.println("age="+age);
		//out.println("gender="+gender);
		//out.println("qualification="+qualification);
		
		StudentDetails s=new StudentDetails();
		s.setAge(age);
		s.setName(name);
		s.setEmail(email);
		s.setGender(gender);
		s.setQualification(qualification);
		
		StudentService service=new StudentService();
		service.saveStudent(s);
		System.out.println("This is doPost Method");
	}

}
