package Class31;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //Location of file on the computer
        String path="Files/Book1.xlsx";
        //Navigate to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        //it's a class that know how to read and write data to an Excel file.
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
        for (int i = 0; i <4 ; i++) {
            Row row=sheet1.getRow(i);
            for (int j = 0; j <4 ; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
