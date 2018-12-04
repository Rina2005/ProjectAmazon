package com.amazon.library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlePropertyFile 
{

	static Properties prop;
	static FileInputStream propfile;
	
	public static String getProperty(String pathOfPropertyFile, String key) throws IOException
	{
		
		propfile= new FileInputStream(pathOfPropertyFile);
		
		prop = new Properties();
		
		prop.load(propfile);
		String value = prop.getProperty(key);
		return value;
	
		
	}
	
	
	
	
}
