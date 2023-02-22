package javaBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Topic02_Loop_SapXepMang_II {
	
public static void main(String[] args) {
	Student s1 = new Student("Nguyen Van A", 16, 6);
	Student s2 = new Student("Nguyen Van B", 20, 8);
	Student s3 = new Student("Nguyen Van C", 19, 9);
	Student s4 = new Student("Nguyen Van D", 17, 5);
	
	List<Student> list = new ArrayList<>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	
	for (Student bienO : list) {
		System.out.println("Danh sách trước khi sắp xếp: ");
		System.out.println("Name: " + bienO.getName() + ", Age: " + bienO.getAge() + ", Mark: " + bienO.getMark());
	}
	
	
	// Sắp xếp theo điểm
	Collections.sort(list, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return (int) (o1.getMark() - o2.getMark());
		}
	});
	System.out.println("Danh sách Mark tăng dần: ");
	for (Student bienO : list) {
		System.out.println("Name: " + bienO.getName() + ", Age: " + bienO.getAge() + ", Mark: " + bienO.getMark());
	}
	
	// Sắp xếp theo tuổi
	Collections.sort(list, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return (o1.getAge() - o2.getAge());
		}
	});
	System.out.println("Danh sách Age tăng dần: ");
	for (Student bienO : list) {
		System.out.println("Name: " + bienO.getName() + ", Age: " + bienO.getAge() + ", Mark: " + bienO.getMark());
	}
	
	// Sắp xếp theo tên
	Collections.sort(list, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	});
	System.out.println("Danh sách Name Theo Thứ Tự: ");
	for (Student bienO : list) {
		System.out.println("Name: " + bienO.getName() + ", Age: " + bienO.getAge() + ", Mark: " + bienO.getMark());
	}
	
	
}












}
