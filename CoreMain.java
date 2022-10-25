package after1024;

import java.nio.file.*;
import java.io.*;

public class CoreMain {
	
	

	public static void main(String[] args)throws IOException {
		
		
		Path file = Paths.get("C:\\Users\\101-27\\Desktop\\nData2.png");
		
		BufferedWriter bw = null;
		
		//try {
			bw =Files.newBufferedWriter(file);
			bw.write('A');
			bw.write('B');
			bw.write('B');
			if(bw !=null) {
				bw.close();
		//	}
			
			
		}
		//catch(IOException e) {
			//e.printStackTrace();
		//}
		
		
		
	}

}
