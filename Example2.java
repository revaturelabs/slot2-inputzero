package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**CheckedException **/
// when i try to read a file, compiler itself telling you to do handle that exception
// before you run that is at compile time
public class Example2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\PorkodiVenkatesh\\Documents\\student.txt");
		
		//try {
			Scanner sc = new Scanner(f);  //System.in
			
			//reads the content in the file line by line
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
	}

}
