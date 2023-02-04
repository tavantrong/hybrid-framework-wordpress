package javaBasic;

public class Topic08_Try_Catch {

	public static void main(String[] args) {
		// Try : Khi xử lý 1 fuction thì các case mà nó luôn đúng
		// Catch: bắt lại, xử lý các case mà làm cho các testcases/ chức năng bị dừng lại (Failed)
		
		//Step 1 
		String[] address = {"Ha Noi 0", "Sai Gon 1", "Da Nang 2"};
		// In ra index theo thu tu 0, 1, 2 (ko có 3,4)
		// |  0		|	1		|	2		|
		// |  HaNoi |	SaiGon	|	Da nang	|
		//Sorround with - Try catch Block: Xử lý bỏ qua error - skip đến Step 2
		try {
			System.out.println(address[0]);
			System.out.println(address[1]);
			System.out.println(address[2]);
			// Không có try catch - Failed tại đây
			System.out.println(address[3]);
			System.out.println(address[4]);
		} catch (Exception e) {
			//Show error: e.printStackTrace();
		}
		
		//Step 2
		System.out.println("Chạy tiếp step 2");

	}
}