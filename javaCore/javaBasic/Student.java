package javaBasic;

public class Student {

public Student (String name, int age, double mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
		
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	public double getMark() {
		return mark;
		
	}

	private String name;
	private int age;
	private double mark;
}
