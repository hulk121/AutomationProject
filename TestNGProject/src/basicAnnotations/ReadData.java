package basicAnnotations;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		Xls_Reader x1=new Xls_Reader("E:\\TestData.xls");
		
		int rows =x1.getrowcount("Sheet1");
		int cols =x1.getColumncount("Sheet1");
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				String val=x1.getCellData("Sheet1",r, c);
				System.out.println(val);
				
			}
		}
		
		
	}

}
