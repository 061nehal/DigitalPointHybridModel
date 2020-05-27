package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {

	private static XSSFSheet worksheet;

	private static XSSFWorkbook workbook;

	private static XSSFCell cell;

	public static void setExcelFile()throws Exception
	{

		FileInputStream fis =new FileInputStream(userData.src);
		workbook = new XSSFWorkbook(fis);
		worksheet = workbook.getSheet("Test Steps");

	}

	public static String getCellData ( int rowNum, int colNum) throws Exception

	{
		cell=worksheet.getRow(rowNum).getCell(colNum);

		String ecellData =cell.getStringCellValue();
		return ecellData;


	}


}
