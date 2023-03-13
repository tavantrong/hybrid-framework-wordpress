package javaBasic;

import java.util.Calendar;
import java.util.Random;

import com.github.javafaker.Faker;


public class Topic10_Fake_Data {

	public static void main(String[] args) throws InterruptedException {
		//commons-lang3-3.5 mới chạy
		Faker faker = new Faker();
		System.out.println(faker.name().fullName());
		System.out.println(faker.name().name());
		System.out.println(faker.name().username());
		
	}
	
	//Get random from 100 to 999 - sometimes duplicate
	public static int getRandomNumber() {
		int uLimit = 999;
		int lLimit = 100;
		Random rand = new Random();
		return lLimit + rand.nextInt(uLimit - lLimit);
	}
	
	//Get random number từ bàn phím nhập vào từ giá trị min -> max - sometimes duplicate
	public static int getRandomNumber(int minimum, int maximum) {
		Random rand = new Random();
		return minimum + rand.nextInt(maximum - minimum);
	}
	
	//Get random email + random number by date time minute second (no duplicate)
	//Tính theo thời gian nên ko thể chạy cùng 1 lúc - duplicate (cách 1s chạy 1 lần - ko bị trùng)
	public static String getRandomEmail() {
		return "automation" + getRandomNumberByDateTime() + "@live.com";
	}

	// Get random number by date time minute second (no duplicate)
	public static long getRandomNumberByDateTime() {
		return Calendar.getInstance().getTimeInMillis() % 100000;
	}
}
