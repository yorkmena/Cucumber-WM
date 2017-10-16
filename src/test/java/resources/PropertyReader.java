package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	File file =new File("./Configurations/Property");
	Properties p;
	FileInputStream fis = null;
	public PropertyReader() {
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		p=new Properties();
			try {
				p.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public String getProperty(String key)
	{
		return p.getProperty(key);
		
	}
	
}
