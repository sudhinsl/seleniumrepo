package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
public String getproperty(String Key) throws IOException {
FileInputStream fis=new FileInputStream("./data/commondata.property");
Properties p=new Properties();
p.load(fis);
String data = p.getProperty(Key);
return data;
}

public String getExcel(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
return data;
}

public void writeExcel(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);


}
	
}

