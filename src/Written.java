import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Written {

	private static String sFileNmae;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sFileName = System.getProperty("user.dir")+"\\Utilities\\Myfirstfile.txt";
		FileWriter fw = new FileWriter(sFileName);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("This is first\n");
		br.write(68);
		br.write(0);
		br.flush();
		br.close();
		
		
		
		

	}
}
