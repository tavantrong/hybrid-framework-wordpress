package javaBasic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;

public class Topic09_Assertion {

	public static void main(String[] args) {
		// Có kết quả nhanh
		// Phù hợp tầng Unit/API
		String address = "Ho Chi Minh";
		int numberStudent = 100;

		// Kiểm tra condition trả về là đúng
		Assert.assertTrue(address.equals("Ho Chi Minh"));
		assertTrue(address.equals("Ho Chi Minh"));

		// Kiểm tra condition trả về là sai
		assertFalse(address.equals("Ho Minh"));

		// Các hàm trả về kiểu boolean: isDisplay, isEnable, isSelected, isMultiple

		// Kiểm tra 2 điều kiện (kiểu dữ liệu) bằng nhau
		// Các hàm get: getCurrentUrl, getTitle, getText, getAttribute, getSize.. -->
		// actual result
		// Kiểm tra bằng với expected result
		Assert.assertEquals(address, "Ho Chi Minh");
		assertEquals(numberStudent, 100);
	}

}