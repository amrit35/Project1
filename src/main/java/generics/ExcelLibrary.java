package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstant
{
	public static String getCellValues(String path, String sheet, int row, int column) throws IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		return cellvalue;
		
	}

}
