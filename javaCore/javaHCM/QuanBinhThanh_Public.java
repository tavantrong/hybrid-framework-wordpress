package javaHCM;

import javaHN.QuanHoanKiem;

public class QuanBinhThanh_Public {

	public static void main(String[] args) {
		//Khởi tạo new Instance
		QuanHoanKiem binhThanh = new QuanHoanKiem();
		System.out.println(binhThanh.food);
		System.out.println(binhThanh.getFood());
		
		//Sử dụng hàm từ class khác thay đổi biến dùng cho class này
		binhThanh.setFood("phở Thành Phố");
		System.out.println(binhThanh.getFood());
		
		System.out.println(binhThanh instanceof QuanHoanKiem);



	}

}
