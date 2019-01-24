import java.io.*;
import java.util.ArrayList;

public class Aufgabe2 {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> arrayList = (ArrayList<Student>) ois.readObject();
            for (Student si : arrayList){
                System.out.println(si);
            }
            fis.close();
            ois.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
