package javaHCM;

import javaHN.QuanHoanKiem;

public class QuanThuDuc_Protected extends QuanHoanKiem {

	public static void main(String[] args) {
		// Protected - truy cập từ class con khác package
		// Sử dụng cách kế thừa - khai báo - import vào
			//Có thể truy cập trực tiếp, ko cần khai báo New Instance
		System.out.println(street);
		System.out.println(getStreet());

	}

}
