package restAPIs;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class task2 {
	public static void main(String[] args) {
			    Properties prop = new Properties();
			    InputStream input = null;
			    try {
			    	FileInputStream chai = new FileInputStream("C:\\Users\\ctany\\eclipse-workspace\\nani_main\\src\\LJI-REST\\src\\restAPIs\\config.properties");
			        prop.load(chai);
			        System.out.println(prop.getProperty("domainURL"));
			        System.out.println(prop.getProperty("x-api-key"));
			        System.out.println(prop.getProperty("username"));
			        System.out.println(prop.getProperty("password"));
			        System.out.println(prop.getProperty("programID"));

			    } catch (IOException ex) {
			        ex.printStackTrace();
			    } finally {
			        if (input != null) {
			            try {
			                input.close();
			            } catch (IOException e) {
			                e.printStackTrace();
			            }
			        }
			    }

			  }
	}


