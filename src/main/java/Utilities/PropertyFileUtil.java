package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil 
{
	public static String getValueForKey( String key) throws Throwable
	{
		Properties configproperties = new Properties();
		FileInputStream fi = new FileInputStream("E:\\Selenium_Evining\\ERP_Maven\\PropertyFile\\Environment.properties");
		configproperties.load(fi);
		return configproperties.getProperty(key);
	}
}
