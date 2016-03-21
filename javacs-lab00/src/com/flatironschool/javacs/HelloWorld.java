	package com.flatironschool.javacs;

	public class HelloWorld {
	    public static double getVersion() {
	    	String javaVersionString = System.getProperty("java.specification.version");
	    	Double javaVersion = Double.parseDouble(javaVersionString);
	        return javaVersion;
	        
	    }

	    public static void main(String[] args) {
		   double javaVersion = getVersion();
		   System.out.println(javaVersion);
	    }
	}
