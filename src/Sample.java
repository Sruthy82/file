import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;



public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream(new File("C:\\Users\\vinee\\OneDrive\\Documents\\java.xls"));
//creating a workbook instance that refers to file
HSSFWorkbook wb = new HSSFWorkbook(fis);
//Creating sheet object to retrieve the object
HSSFSheet sheet = wb.getSheetAt(0);
HSSFRow row = sheet.getRow(0);
System.out.println(row.getCell(0).getStringCellValue());
//evaluating cell type

	}  
	
	//declare a string and path in string
	//call hssf workbook,creating objet of it.since its a file,stream in inputfilestream
	//in xcell multiole sheets are there ,to get we have HSSFSheet class,then call the reference variable of workbook and 
	//from workbook,i will get the sheet.once you have the sheet,we will get rows and columns
	//HSSFRow class allows to get rows
	// cell by cell,we will access


	}


