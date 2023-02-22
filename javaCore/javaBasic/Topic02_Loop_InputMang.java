package javaBasic;

import java.util.Scanner;

public class Topic02_Loop_InputMang {
	
public static void main(String[] args) {
	//Tạo 1 mảng số được input tối đa lenght = 5
	int mang[] = new int[5];
	Scanner scan =  new Scanner(System.in);
	
	System.out.println("Vui lòng nhập giá trị của mảng: ");
	// Lặp từ vị trí số 0 đến vị trí cuối cùng của mảng
	for (int i = 0; i < mang.length; i++) {
		//mang[i] - lấy từ giá trị số của bàn phím
		mang[i] = scan.nextInt();
	}
	System.out.println("Mảng được nhập vào là: ");
	for (int x : mang) {
		System.out.println(x);
	}
	
	//Tìm phần tử trong mảng
	System.out.println("Nhập phần tử muốn tìm kiếm: ");
	int k = scan.nextInt();
	
	for (int i = 0; i < mang.length; i++) {
		int value = mang[i];
		if (k == mang[i]) {
			System.out.println("Phần tử muốn tìm ở vị trí: " + i);
			System.out.println("Giá trị số: " + value);

		}
		
	}
	
	
	
}
}
