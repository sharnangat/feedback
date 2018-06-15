package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.bean.Student;
import com.example.store.DBStore;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
			
		    String studentNo =  request.getParameter("studentNo");
		  
		    String studentName =  request.getParameter("studentName");
			
		    
		    Student  student=new Student();
		    
		    
		    student.setStudentNo(Integer.parseInt(studentNo));
		  
		    student.setStudentName(studentName);
		    
		    		    
		    DBStore db =new DBStore();   
		    db.addStudent(student);
		    
		 
		 
		 
		 
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
