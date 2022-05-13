package Browse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class data_fetching {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\Javapgms-sel");
		Properties pobj=new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		System.out.println(url);
		String username=pobj.getProperty("username");
		System.out.println(username);
		String password=pobj.getProperty("password");
		System.out.println(password);
		
	}

}
