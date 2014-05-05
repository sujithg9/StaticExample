package com.staticE.example;

public class mainExample {
	
	public static void main(String[] args){
		Person p1=new Person("Sujith","G");
		Person p2=new Person("Srujan","G");
		Person p3=new Person("Sriraj","V");
	
		System.out.println(p2.getFirst());
		System.out.println(p2.getLast());
		System.out.println(p2.getPersons());
	}
}
