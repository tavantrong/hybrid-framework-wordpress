package javaBasic;

public class Topic03_Parameter {
	
	public static String fullName = "Automation FC";
	public static int studentNumber = 100;
	public static boolean mariiedStatus = true;

	public static void main(String[] args) {
		
		System.out.println();

	}
	
	//Tham số String name
	public void setFullname(String name) {
		fullName = name;
	}
	public String getFullname() {
		return fullName;
	}
	
	public static int getStudentNumber() {
		return studentNumber;
	}
	
	public boolean getMarriedStatus() {
		return mariiedStatus;
	}
	
	//Các hàm để lấy dữ liệu: data type (boolean/ int/ float/ date/ String/ Array/ Class/ Object/ Collection(list)..)

}
