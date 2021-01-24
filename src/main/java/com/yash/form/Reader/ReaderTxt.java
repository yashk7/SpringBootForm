package com.yash.form.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderTxt {
	
	
	public List<String> countrydata()
	{
		List<String> CountryList=new ArrayList<String>();
		 try {
		      File myObj = new File("./src/main/resources/COUNTRYLIST.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        CountryList.add(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		return CountryList;
	}
	
	
	
	

}
