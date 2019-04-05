package fbprg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		workbook---->worksheeet---->cell(row,column,value)
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Mr V\\Downloads\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet ws = wb.getSheet("Students");
//     	Row row =ws.getRow(0);
//        Cell cell=row.getCell(0);
	
     	System.out.println(ws.getRow(0).getCell(1));
		
		
	}

}
