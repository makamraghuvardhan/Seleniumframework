package reusableFunctions;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcelData {
	public Sheet sheet;
	public File InputworkBook;
	public ReadExcelData(String sheetname,String filename) throws JXLException, IOException
	{
		InputworkBook=new File("D:\\workspace\\SeleniumFramework\\src\\testData\\"+filename);
		Workbook w;
		InputworkBook.getAbsolutePath();
		w=Workbook.getWorkbook(InputworkBook);
		sheet=w.getSheet(sheetname);
	}
	public String readData(int i,int j)
	{
		Cell cell=sheet.getCell(i, j);
		return cell.getContents();
	}
}
