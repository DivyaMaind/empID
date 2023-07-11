package com;
import java.sql.*;
import java.util.Scanner;
public class Demo1{
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

            PreparedStatement p = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Id: ");
            int Id = sc.nextInt();

            System.out.println("Enter name: ");
            String name = sc.next();

            System.out.println("Enter age: ");
            int age = sc.nextInt();

            System.out.println("Enter salary: ");
            int salary = sc.nextInt();

            System.out.println("Enter designation: ");
            String desig = sc.next();

            p.setInt(1, Id);
            p.setString(2, name);
            p.setInt(3, age);
            p.setInt(4, salary);
            p.setString(5, desig);

            p.execute();
            p.close();
            System.out.println("data inserted sucessfully..! ");

        } catch(Exception e) {

            System.out.println(e);
        }

    }
}


