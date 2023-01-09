package javaHN;

public class QuanHaiBaTrung_Default {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		//Default: cùng package, khởi tạo class khác thông qua 1 object "hoanKiem"
		QuanHoanKiem haiBaTrung = new QuanHoanKiem();
		
		//Gọi biến/ hàm default từ class QuanHoangKiem 
		System.out.println(haiBaTrung.bridge);
		System.out.println(haiBaTrung.getBridge());
		
		
		//Protedted: truy cập cùng package
		System.out.println(haiBaTrung.street);
		System.out.println(haiBaTrung.getStreet());
	

	}

}
