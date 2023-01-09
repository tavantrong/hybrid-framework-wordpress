package javaBasic;

public class Topic01_System_Property {
	
public static void main(String[] args) {
	String projectLocation = System.getProperty("user.dir");
	System.out.println(projectLocation);
	
	String osName = System.getProperty("os.name");
	System.out.println(osName);
	
}


	
}
