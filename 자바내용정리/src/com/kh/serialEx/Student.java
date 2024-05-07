package com.kh.serialEx;

import java.io.Serializable;

//학생을 직렬화 하기
public class Student implements Serializable{
//필드	
	private String name;
	private int age;
//메서드
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//기본 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//필수 생성자
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//toString
	@Override
	public String toString() {
		return "name =" + name + ", age=" + age ;
	}
	
	
	
}
