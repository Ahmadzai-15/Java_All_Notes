package Class31;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {

        //path where we want to create the new file and the name of the file with its extension
        String path="Files/test.properties";
        //we use FileOutPutStream when we have to write the data to a file
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        Properties properties=new Properties();
        //we use setProperty method to store data inside a properties file.
        properties.setProperty("Name","Anas");
        //A method to write the data to the disk
        properties.store(fileOutputStream,"A new name has been added");

    }
}
