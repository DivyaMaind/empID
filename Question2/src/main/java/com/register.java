package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public register() {  
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
        String sname = request.getParameter("sname");
        int phone = Integer.parseInt(request.getParameter("phone"));
        int marks = Integer.parseInt(request.getParameter("marks"));
        String branch = request.getParameter("branch");

        PrintWriter out = response.getWriter();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

            PreparedStatement p = con.prepareStatement("insert into student values(?, ?, ?, ?, ?)");

            p.setInt(1, sid);
            p.setString(2, sname);
            p.setInt(3, phone);
            p.setInt(4, marks);
            p.setString(5, branch);

            p.execute();
            p.close();

            out.print("<h1>");
            out.print("Id:" + sid + "<br>");
            out.print("Name: " + sname + "<br>");
            out.print("phone" + phone + "<br>");
            out.print("marks" + marks + "<br>");
            out.print("branch: " + branch + "<br>");
            out.print("</h1>");
            out.print("Congrats you are successfully registered");
           
        } catch(Exception e) {

            System.out.println(e);
        }    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
