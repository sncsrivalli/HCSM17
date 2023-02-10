package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./testresources/commondata.properties");

		//Step 2: Create an instance of Properties class
		Properties property = new Properties();
		
		//Step 3: Load all key-value pairs into Properties object
		property.load(fis);
		
		//Step 4: Write data into Properties file
		property.put("OS", "Windows");
		
		//Step 5: Save the changes in Properties file
		FileOutputStream fos = new FileOutputStream("./testresources/commondata.properties");
		property.store(fos, "Updated successfully");
	}

}
