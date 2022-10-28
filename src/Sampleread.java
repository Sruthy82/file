import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sampleread {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir")+"\\Utilities\\mytestfile.txt");
		String sFilepath = System.getProperty("user.dir")+"\\Utilities\\mytestfile.txt";
		String sLine;
		FileReader fr = new FileReader(sFilepath);
		BufferedReader br = new BufferedReader(fr);
		sLine = br.readLine();
		System.out.println(sLine);
		System.out.println(br.readLine());
		while ((sLine =br.readLine())!=null){
			
			System.out.println(sLine);
			
		}
	
	
	}
	
		
	}

		

	