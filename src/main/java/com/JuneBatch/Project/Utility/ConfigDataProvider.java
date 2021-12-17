package com.JuneBatch.Project.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws IOException {
		String CpPath=System.getProperty("user.dir"+ "Configger\\ConfigProperties") ;
		
		File src= new File(CpPath);
		try {
			FileInputStream file=new FileInputStream(src);
			 pro= new Properties();
			 pro.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

}
