package javaBasic;

public class Topic06_String_Format {

	public static void main(String[] args) {
		
		String fullName = "Xin mời anh chị: %s";
		
		// Mảng
		String [] khachMoi = {"Đăng Khoa", "Văn Bưởi", "Trường Giang"};
		
		for (String khach : khachMoi) {
			System.out.println(String.format(fullName, khach));
		}

	}

}
