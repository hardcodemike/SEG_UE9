import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Aufgabe4 {
    public static void main(String[] args) {
        Student s1 = new Student("Michael", "Erharter", 25, 123456);
        Student s2 = new Student("Krispin", "Raich", 35, 123456);
        Student s3 = new Student("Paul", "Paul", 15, 123456);
        Student s4 = new Student("Rob", "Jobert", 45, 123456);
        Student s5 = new Student("Phil", "Magnum", 24, 123456);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("studentlist.json"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
