package com.staticE.example;

public class Person {
	private String first;
	private String last;
	private static int persons;
	
	public Person(String fn, String ln){
		first=fn;
		last=ln;
		persons++;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public static int getPersons() {
		return persons;
	}

	public static void setPersons(int persons) {
		Person.persons = persons;
	}
	
	
}
