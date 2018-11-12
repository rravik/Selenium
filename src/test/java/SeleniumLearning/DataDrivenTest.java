package SeleniumLearning;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Ravi\\Downloads\\HalfEbayTestData.xlsx");
		
		int rowNum = reader.getRowCount("RegTestData");
		
		System.out.println(rowNum);
		
		reader.addColumn("RegTestData", "Status");
		
		for(int row=2; row<=rowNum; row++)
		{
		
			String firstname = reader.getCellData("RegTestData", "firstname", row);
			System.out.println(firstname);
			reader.setCellData("RegTestData", "Status", row, "Pass");
		}
		
		

	}

}
