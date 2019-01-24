import com.fasterxml.jackson.databind.ObjectMapper;
import org.xml.sax.*;
import com.fasterxml.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Aufgabe3 {
    public static void main(String[] args) {

        Student s1 = new Student("Michael", "Erharter", 25, 123456);


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("student.json"), s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
