package javaBasic;

public class Topic02_Loop_SapXepMang {
	
public static void main(String[] args) {
	int mang[]={3,8,9,8,4,10,2,-12};
	
	//Tăng dần
	// i=0 vị trí đầu; i < mang.leght(8) -1 ko lấy vị trí cuối
	for (int i = 0; i < mang.length -1; i++) {
		int temp = mang [i];
		// j = i+1 vi trí thứ 2; j < 8 ko lấy vị trí đầu
		for (int j = i + 1; j < mang.length; j++) {
			// nếu 3(i) > 2(j)
			if (temp > mang[j]) {
				// vị trí [i] = vị trí [j]
				mang[i] = mang[j];
				// vị trí [j] = giá trị số [i]
				mang[j] = temp;
				// giá trị số [i] = vị trí [i]
				temp = mang[i];
			}
		}
	}
	System.out.println("Mang duoc sap xep theo vi tri tang dan: ");
	for (int x : mang) {
		System.out.println(x);
	}
	 
	//Giảm dần
	for (int i = 0; i < mang.length -1; i++) {
		int temp = mang [i];
		for (int j = i + 1; j < mang.length; j++) {
			
			// Sắp xếp tăng dần
			if (temp < mang[j]) {
				mang[i] = mang[j];
				mang[j] = temp;
				temp = mang[i];
			}
		}
	}
	System.out.println("Mang duoc sap xep theo vi tri giảm dần: ");
	for (int x : mang) {
		System.out.println(x);
	}
	
	//Lấy giá trị lớn nhất
	int max = 0;
	for (int i = 0; i < mang.length; i++) {
		if (mang[i] > max) {
			max = mang[i];
			}	
		}
	System.out.println("Gia trị lớn nhất trong mảng: " + max);
		
	//Lấy giá trị lớn nhất
	int min = 0;
	for (int i = 0; i < mang.length; i++) {
			if (i == 0) {//Nếu i đang đứng ở vị trí 0 - đầu tiên
				min = mang[i];
			} else if(mang[i] < min) {
				min = mang[i];
			}
		}
	System.out.println("Gia trị nhỏ nhất trong mảng: " + min);	
		
		
}
}
	
	
	

