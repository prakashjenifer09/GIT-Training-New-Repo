package day13;

import java.io.File;

public class Files_Ex {

	public static void main(String[] args) {
		//fileEx();
		fileInterviewQuestion();
	}
	
	public static void fileEx() {
		File oFolder = new File("D:\\File");
		System.out.println("Method Executed!!!");
		if(oFolder.exists()) {
			System.out.println("File is Existing!!!");
		}else {
			System.out.println("File is not existing, So create a new Folder");
			oFolder.mkdir();
		}
	}
	
	public static void fileInterviewQuestion() {
		File desktop = new File("C:\\Users\\LENOVO\\Desktop\\Desktop Files");
		String[] list = desktop.list();
		for (String fileName : list) {
		if(fileName.contains(".txt")) {
				System.out.println(fileName);
			}
		}
	}

}
