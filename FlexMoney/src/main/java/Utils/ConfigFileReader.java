package Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigFileReader {
 
 private Properties properties;
 private final String propertyFilePath= "src/main/java/testData//testData.properties";
 
 
 public ConfigFileReader(){
 BufferedReader reader;
 try {
 reader = new BufferedReader(new FileReader(propertyFilePath));
 properties = new Properties();
 try {
 properties.load(reader);
 reader.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
 } 
 }
 

 public String getApplicationUrl() {
 String url = properties.getProperty("url");
 if(url != null) return url;
 else throw new RuntimeException("url not specified in the Configuration.properties file.");
 }
 
 public String getIncorrectMobileno() {
     String incorrectmobileno = properties.getProperty("incorrectMobileNo");
     if(incorrectmobileno != null) return incorrectmobileno;
     else throw new RuntimeException("incorrectmobileno not specified in the Configuration.properties file.");
     }
 
 public String getMobileno() {
 String mobileno = properties.getProperty("MobileNo");
 if(mobileno != null) return mobileno;
 else throw new RuntimeException("MobileNo not specified in the Configuration.properties file.");
 }
 
 public String getMDebitCardDetails() {
     String debitCardDetails = properties.getProperty("debitCardNo");
     if(debitCardDetails != null) return debitCardDetails;
     else throw new RuntimeException("debitCardDetails not specified in the Configuration.properties file.");
     }
 
 public String getOPT() {
     String fetchOTP = properties.getProperty("OTP");
     if(fetchOTP != null) return fetchOTP;
     else throw new RuntimeException("fetchOTP not specified in the Configuration.properties file.");
     }
 
}
