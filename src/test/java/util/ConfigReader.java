package util;

import java.io.*;
import java.util.Properties;

public class ConfigReader {
       public static void main(String[] args) {
       }

              private Properties properties;
              private final String propertyFilePath = "Config/config.properties";


              public void ConfigFileReader () {
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

              public String getDriverPath() {
                     String driverPath = properties.getProperty("url");
                     if (driverPath != null) return driverPath;
                     else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
              }


              public String getUsername() {
                     String Username = properties.getProperty("username");
                     if (Username != null) return Username;
                     else throw new RuntimeException("username not found");
              }

              public String getPassword() {
                     String password = properties.getProperty("password");
                     if (password != null) return password;
                     else throw new RuntimeException("password not found");
              }
       }

