package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig1 {
	Properties pro;
	public ReadConfig1() {
		//configuration of properties
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testing1.properties");
		try {
			FileInputStream fis=new FileInputStream(f);
		     pro=new Properties();
		     pro.load(fis);
	        }
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getApplication() {
		String URL=pro.getProperty("baseURL");
		return URL;
}
}