package javaBasic;

public class Topic07_File_Path {

	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		
		String danangFileName = "building.png";
		String hanoiFileName = "church.jpg";
		String saigonFileName = "landscape.png";
		
		String FilePath = projectLocation + getDirectorySlash("uploadFiles");
		
		String fullFileName = "";
		String[] fileNames = {danangFileName, hanoiFileName, saigonFileName};

		for (String file : fileNames) {
			fullFileName = fullFileName + FilePath + file +"\n";
			System.out.println(fullFileName);
		}
		fullFileName.trim();
		System.out.println(fullFileName);
}
	
	public static String getDirectorySlash(String folderName) {
		String separator = System.getProperty("file.separator");
		//separator = FileSystems.getDefault().getSeparator();
		//separator = File.separator;
		
		return separator + folderName + separator;
	}
	
}