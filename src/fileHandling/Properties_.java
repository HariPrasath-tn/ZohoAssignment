package fileHandling;

import java.io.*;
import java.util.Properties;

import static java.lang.System.out;

public class Properties_ {
    public static void main(String[] args) throws Exception{
        File file = new File("Temp.properties");
//        OutputStream os = new FileOutputStream(file);
        Properties prop = new Properties();
//        prop.setProperty("temp1", "1");
//        prop.setProperty("temp2", "2");
//        prop.setProperty("temp3", "3");
//        prop.setProperty("temp4", "4");
//        prop.store(os, null);

        InputStream is = new FileInputStream(file);
        prop.load(is);
        prop.list(out);
    }
}
