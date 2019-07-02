package basicAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass4 {
	
	@Test(dataProvider="getdata")
	public void test(String username, String password)
	{
		System.out.println("Username"+username);
		System.out.println("Password-"+password);
		System.out.println("click on login button");
		
	}

	
	@DataProvider
	public String[][] getdata() throws IOException
	{
		
        Xls_Reader x1=new Xls_Reader("E:\\TestData.xls");
		
		int rows =x1.getrowcount("Sheet1");
		int cols =x1.getColumncount("Sheet1");
		
		String[][] data= new String[rows-1][cols];
		

		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=x1.getCellData("Sheet1", r, c);
				
			}
		}
		
		/*//Row1
		data[0][0]="U1";
		data[0][1]="P1";
		
		//Row1
	    data[1][0]="U2";
	    data[1][1]="P2";
				
	    //Row1
		data[2][0]="U3";
		data[2][1]="P3";
		
		//Row1
		data[3][0]="U4";
		data[3][1]="P4";
		
		//Row1
		data[4][0]="U5";
		data[4][1]="P5";
		*/
		return data;
		
		
		
	}
}
