package by.htp.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver {
	
	 
		public void save(String input) {
			final String FNAME = "test.txt";
			ArrayList<String> list_copy = new ArrayList<>();
			 
			list_copy.add ("Line 1");
			list_copy.add ("Line 2");
			
			try ( BufferedWriter bw = 
					new BufferedWriter (new FileWriter (FNAME)) ) 
			{			
				for (String line : list_copy) {
					bw.write (line + "\n");
				}
				
				bw.close ();
				
			} catch (IOException e) {
				e.printStackTrace ();
			}
		}
	 
	}


