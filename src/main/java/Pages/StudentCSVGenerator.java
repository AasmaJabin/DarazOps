package Pages;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import static Pages.StudentsPage.randomStringGenerator;

public class StudentCSVGenerator {

    private static String filePath1= "src/main/java/Pages/UploadStudent.csv";
    public static void main(String args) throws IOException {
    File file2 = new File(filePath1);
    try{
    FileWriter outputfile1 = new FileWriter(file2);
    CSVWriter writer1 = new CSVWriter(outputfile1);
    List<String[]> data1 = new ArrayList<String[]>();
        data1.add(new String[] {"Employee Id", "WFM Id", "First Name","Last Name","Username","Password","Venture","Email","Department","Role" });
        data1.add(new String[] {(String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(), (String) randomStringGenerator(),"PAK", null,"SQA", null});
        writer1.writeAll(data1);
        writer1.close();}


    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}


}
