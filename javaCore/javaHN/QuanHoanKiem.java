package javaHN;


// Access Modify : Private (red), Default (blue), Protected (yellow), Public (green)
	//Private: Biến được set chỉ sử dụng trong cùng 1 class
	//Default: Có thể sử dụng giữa các class trong cùng package
	//Protected: 
public class QuanHoanKiem {
	// Thuộc tính (biến/ Variable)
	private static String district = "Tràng Tiền";

	// Phương thức (Hàm/ Method) --> Setter (gán / set dữ liệu)
	private static void setDistrict(String newDistrict) {
		district = newDistrict;
	}

	// Phương thức (Hàm/ Method) --> Getter (Lấy dữ liệu)
	private static String getDistrict() {
		return district;
	}

	public static void main(String[] args) {
		// Lấy dữ liệu thông qua biến / hàm
		// Sử dụng biến trong cùng 1 class
		System.out.println(district);
		// Sử dụng hàm
		System.out.println(getDistrict());
		// Gán dữ liệu thông qua biến
		setDistrict("quận Chương Dương");
	}
	
	// mặc định ko ghi gì là kiểu Default: phạm vi cùng Package
	String bridge = "cầu Long Biên"; 
	void setBridge(String bridge) { 
		this.bridge = bridge; //this.bridge = biến global (trường hợp biến "bridge" giống nhau)
		//còn lại là bridge của biến local
	}
	String getBridge() {
		return bridge;
	}
	
	//Protected: 
	protected static String street = "đường Hàng Bạc";
	protected void setStreet(String newStreet) {
		street = newStreet;
	}
	protected static String getStreet() {
		return street;
	}
	
	//Public - phạm vi all
	public String food = "phở Hà Nội";
	public void setFood(String newFood) {
		food = newFood;
	}
	public String getFood() {
		return food;
	}
	
	
	
	
}
