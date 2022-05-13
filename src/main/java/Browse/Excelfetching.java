package Browse;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfetching {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\manual\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row ro=sh.getRow(1);
		Cell ce=ro.getCell(1);
		String data=ce.getStringCellValue();
		System.out.println(data);
	}

}
