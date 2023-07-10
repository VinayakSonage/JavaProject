package string;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ah {
public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	FileOutputStream Output = new FileOutputStream("C:\\Users\\vinay\\OneDrive\\Desktop\\Pogramming\\ProgrammingBatch");
     try {
    	 System.out.println(Output);
	} catch (Throwable e) {
		// TODO: handle exception
          System.out.println(e);	
	}
//	
}
}
