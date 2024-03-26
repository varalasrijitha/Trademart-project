package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
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
	public String getEmail() {
		String email=pro.getProperty("email");
		return email;
	}
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String search() {
		String search=pro.getProperty("searched");
		return search;
	}
	public String Search() {
		String search1=pro.getProperty("searched1");
		return search1;
	}
			
}

