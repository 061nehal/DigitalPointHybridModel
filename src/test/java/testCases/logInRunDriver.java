package testCases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.excelReader;
import utilities.userData;

public class logInRunDriver {
	public static WebDriver driver;

	@Test
	public static void userlogin() throws Exception
	{


		//String sPath = userData.Excel_File ;


		excelReader.setExcelFile();

		for (int iRow=1;iRow<=8;iRow++)
		{
			String celReader = excelReader.getCellData(iRow, 3); 

			if(celReader.equals("openBrowser"))
			{ 
				logInObjectKeyword.openBrowser();

			}
			else if(celReader.equals("navigate"))
			{
				logInObjectKeyword.navigate();
			}
			else if(celReader.equals("input_id"))
			{
				logInObjectKeyword.input_id();
			}
			else if(celReader.equals("input_pw"))
			{
				logInObjectKeyword.input_pw();
			}
			else if(celReader.equals("click_Login"))
			{
				logInObjectKeyword.click_Login();
			} 
			else if(celReader.equals("click_dropdown"))
			{
				logInObjectKeyword.click_dropdown();
			} 
			else if(celReader.equals("click_Logout"))
			{
				logInObjectKeyword.click_Logout();
			} 


			else if(celReader.equals("closeBrowser"))
			{
				logInObjectKeyword.closeBrowser();
			} 


		}

	}

}
