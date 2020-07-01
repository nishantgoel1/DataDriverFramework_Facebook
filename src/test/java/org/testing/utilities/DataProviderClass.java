package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderClass
{

	@DataProvider(name="testData")
	public static Object[][] testData() throws BiffException, IOException
	{
		File f=new File("C:\\Users\\dfd\\Desktop\\Credentials.xls");
		
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int row=sh.getRows();
		int col=sh.getColumns();
		
		Object[][] obj=new Object[row][col];

		for(int i=0; i<row; i++)
		{
			
			for(int j=0; j<col;j++)
			{
				
				
				Cell c=sh.getCell(j, i);
				
				obj[i][j]=c.getContents();
				
				
			}
			
		}
		return obj;
		

		
		
		
	}
	
}
