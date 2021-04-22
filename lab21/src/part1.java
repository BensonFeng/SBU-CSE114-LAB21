import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class part1 {
	public static void main(String []args) {
		File f = new File("File.txt");
		File f2 = new File("File2.txt");
		
	    boolean isValid = true;
		try {
			Scanner s = new Scanner(f);
			Scanner s2 = new Scanner(f2);

			part1 x = null;
			boolean Equal = x.FileEquals(f, f2);
			
		} catch (FileNotFoundException e) {
			isValid = false;
		}
	    
		if (!isValid)
		{
			try {
				FileReader fr = new FileReader(f);
				FileReader fr2 = new FileReader(f2);

		
			}
			catch(IOException ioe){}
		
			try {
				Scanner s = new Scanner(f);
				
			} catch (FileNotFoundException e) {
			}
			
			
		}// close if loop
	}//close public class

	private boolean FileEquals(File f, File f2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean contentEquals(File f, File f2) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
