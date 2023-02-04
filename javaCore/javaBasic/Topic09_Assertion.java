package javaBasic;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic09_Assertion {

	@Test
	public void TC01_Assert() {
		// Có kết quả nhanh
		// Phù hợp tầng Unit/API
		String address = "Ho Chi Minh";
		int numberStudent = 100;

		// Kiểm tra condition trả về là đúng
		Assert.assertTrue(address.equals("Ho Chi Minh"));
		assertTrue(address.equals("Ho Chi Minh"));

		// Kiểm tra condition trả về là sai
		assertFalse(address.equals("Ho Chi Minh"));

		// Các hàm trả về kiểu boolean: isDisplay, isEnable, isSelected, isMultiple

		// Kiểm tra 2 điều kiện (kiểu dữ liệu) bằng nhau
		// Các hàm get: getCurrentUrl, getTitle, getText, getAttribute, getSize.. -->
		// actual result
		// Kiểm tra bằng với expected result
		Assert.assertEquals(address, "Ho Chi Minh");
		assertEquals(numberStudent, 100);
	}

}