package rajat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public void getExcelData() throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/test.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet("SheetName").getRow(1).getCell(1).getStringCellValue();
	}
	public void setExcelData() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/test.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet("hi").getRow(1).getCell(1).setCellValue("data");
		FileOutputStream fos=new FileOutputStream("./data/test.xlsx");
		wb.write(fos);
		wb.close();
	}
}
