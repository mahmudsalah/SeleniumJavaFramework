package data;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetTestData {
	
	static String ExcelSheetPath ;
	static XSSFWorkbook WorkBook;
	static XSSFSheet Sheet ;
	
	public ExcelSheetTestData(String ExcelPath, String SheetName)
	{
		try
		{
			ExcelSheetPath = System.getProperty("user.dir") + "\\ExcelSheet\\Data.xlsx";
			WorkBook = new XSSFWorkbook(ExcelPath);
			Sheet = WorkBook.getSheet(SheetName);

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	public static int GetRowCount()
	{
		int RowCount = 0;
		try
		{
			RowCount = Sheet.getPhysicalNumberOfRows();
			System.out.println( "Number of Rows = " + RowCount);

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		return RowCount;
	}
	
	public static int GetColCount()
	{
		int ColCount =0;
		try
		{
			ColCount = Sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of col = " + ColCount);

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		return ColCount;
	}
	
    public static String GetCellDataString(int rowNum, int colNum)
    {
    	String CellData = null;
    	try
		{
    		CellData = Sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
    	
    	return CellData ;
    }
    
    public static double GetCellDataNumber(int rowNum, int colNum)
    {
    	double CellData = 0 ;
    	try
		{
    		CellData =  Sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
    	
    	return CellData ;
    }

}
