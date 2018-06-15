package com.example.store;

import java.util.ArrayList;
import java.util.List;

import com.example.bean.Student;

public class DBStore {


	 private static List  studentList =new ArrayList<Student>();
	 private  static int count=0;
	
	 
	 
	 public static void addStudent(Student student){
		 
	      	studentList.add(student);
	     	      	
	      	System.out.println("Added"+count +"Totalno"+ studentList.size());
	      	count++;
		 
	 }
	 
	 
	  
	 
	 
	 
	 
	
}
