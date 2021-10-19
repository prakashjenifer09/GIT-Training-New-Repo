package day14;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataProperties {
	
	public static String sFile = "./data/Environment.properties";
	public static Properties oPro;

	public static void main(String[] args) throws Exception {
		System.out.println("Production Env URL is : "+readPropertyValue("Production"));
		System.out.println("UAT Env URL is : "+readPropertyValue("UAT"));
	}
	
	public static String readPropertyValue(String sKey) throws Exception {
		String sValue = "";
		File oFile = new File(sFile);
		FileInputStream in = new FileInputStream(oFile);
		oPro = new Properties();
		oPro.load(in);
		sValue = oPro.getProperty(sKey);
		return sValue;
		
	}

}
