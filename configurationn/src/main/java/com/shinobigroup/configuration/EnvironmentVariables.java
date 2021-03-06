package com.shinobigroup.configuration;

import java.util.Properties;
import java.io.*;

@SuppressWarnings("serial")
public class EnvironmentVariables extends Properties {

	// instance initializer
	{
		putAll(System.getenv());
	}
	
	public EnvironmentVariables() {}
	public EnvironmentVariables(Properties defaults) {
		super(defaults);
	}

	//
	// Property accessors
	//
	
	@Override
	public Object setProperty(String key, String value) {
		return getProperty(key);
	}
	
	//
	// Load operations
	//
	
	@Override
	public void load(InputStream in) {}
	
	@Override
	public void load(Reader reader) {}
	
	@Override
	public void loadFromXML(InputStream in) {}
}
