package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    //public String fileName = "testDataConfig.properties";
    //public String fileLocation ="src/test/java/TestConfig";

    public String getProperty(String key) {
        prop = new Properties();
        try {
            //input = new FileInputStream(fileLocation+fileName);
            input=new FileInputStream("src\\test\\java\\TestConfig\\testDataConfig.properties");
            //input="src/test/java/TestConfig/testDataConfig.properties";
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  prop.getProperty(key);
    }
}
