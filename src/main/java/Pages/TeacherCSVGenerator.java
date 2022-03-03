package Pages;
import com.opencsv.CSVWriter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TeacherCSVGenerator {

    private static String filePath= "src/main/java/Pages/UploadTeachers.csv";


    public static void main(String[] args) {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filePath);


        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);


            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);


            // create a List which contains String array
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"Employee Id", "WFM Id", "First Name","Last Name","Username","Password","Venture","Email","Department","Role" });
            data.add(new String[] {(String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(),"PAK", (String) randomStringGenerator()+"@mailinator.com",null,"automation role"});
            writer.writeAll(data);

            // closing writer connection
           writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
    public static CharSequence randomStringGenerator() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

}
