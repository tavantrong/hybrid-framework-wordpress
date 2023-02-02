package javaBasic;

public class Topic05_Dynamic_Locator {

	// 1 - Click vào đường link có tên About us
	public static final String ABOUT_US_LINK = "//a[text()='About us']";
	public static final String NEW_PRODUCT_LINK = "//a[text()='New products']";
	
	// 2 - Không cần phải định nghĩa nhiều biến cho locator cùng loại
	public static final String DYNAMIC_FOOTER_LINK = "//a[text()='%s']";
	
	// 3 - Dùng 1 locator đại diện cho header / footer có 2 tham số
	public static final String DYNAMIC_LINK = "//div[@class='%s']//a[text()='%s']";
	
	public static void main(String[] args) {
		// Truyền locator cố định bình thường
		clickToElement(ABOUT_US_LINK);
		clickToElement(NEW_PRODUCT_LINK);
		
		// Locator có 1 tham số
		clickToElement(DYNAMIC_FOOTER_LINK, "About us");
		clickToElement(DYNAMIC_FOOTER_LINK, "New products");
		
		// Locator có 2 tham số
		clickToElement(DYNAMIC_LINK, "header", "Register");
		clickToElement(DYNAMIC_LINK, "header", "Log in");
		clickToElement(DYNAMIC_LINK, "header", "My Account");
		
		clickToElement(DYNAMIC_LINK, "footer", "About us");
		clickToElement(DYNAMIC_LINK, "footer", "New products");


	}
	
	
	// Abstract Page (Base page)
	public static void clickToElement(String locator) {
		System.out.println(locator);
	}
	
	// Có 1 tham số động
	public static void clickToElement(String locator, String pageName) {
		System.out.println(String.format(locator, pageName));
	}
	
	// Có 2 tham số động
	public static void clickToElement(String locator, String panel, String pageName) {
		System.out.println(String.format(locator, panel, pageName));
	}
	
	// Có 2 hay nhiều hơn hoặc n tham số - Sử dụng cho nhiều tham số
	// Tham số này phải đứng ở cuối cùng
	// Phải cùng kiểu dữ liệu khi truyền vào sử dụng
	// "..." - Đại diện cho mảng giá trị tham số (Rest parameter)
	public static void clickToElement(String locator, String... values) {
		System.out.println(String.format(locator, (Object[])values));
	}
	
	
}
