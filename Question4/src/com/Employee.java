package com;

import java.util.ArrayList;

public class Employee {
	
	private int id;
	private String name;
	private ArrayList<String> prog;
	
	public ArrayList<String> getProg() {
		return prog;
	}
	public void setProg(ArrayList<String> prog) {
		this.prog = prog;
	}
	public int getId()
	
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
	System.out.println(id+" "+name+" "+prog);
	}
}
