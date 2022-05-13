package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Data_fetching {

	public String Properties_Fetching(String Key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\manual\\note.PROPERTIES");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(Key);
	    return data;
	
	}
	
	
public String Excelfetching(String Sheet,int row,int cell) throws IOException{
	FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\manual\\Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("");
	Row ro=sh.getRow(1);
	Cell ce=ro.getCell(0);
	String data=ce.getStringCellValue();
	System.out.println(data);
	return data;

}

}
