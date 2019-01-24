package test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import models.Student;
import models.University;

public class StudentMain {

    private static final String STUDENT_XML = "./student.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Student> studentList = new ArrayList<Student>();

        // create students
        Student student1 = new Student();
        student1.setJahrgang(2017);
        student1.setName("Michael Erharter");
        student1.setAlter(25);
        student1.setPKZ(123123);
        studentList.add(student1);

        Student student2 = new Student();
        student2.setJahrgang(2017);
        student2.setName("Kris Raich");
        student2.setAlter(25);
        student2.setPKZ(123123);
        studentList.add(student2);

        Student student3 = new Student();
        student3.setJahrgang(2017);
        student3.setName("Paul Paul");
        student3.setAlter(25);
        student3.setPKZ(123123);
        studentList.add(student3);

        Student student4 = new Student();
        student4.setJahrgang(2017);
        student4.setName("Phil Magnum");
        student4.setAlter(25);
        student4.setPKZ(123123);
        studentList.add(student4);

        Student student5 = new Student();
        student5.setJahrgang(2017);
        student5.setName("Bobby Bob");
        student5.setAlter(25);
        student5.setPKZ(123123);
        studentList.add(student5);

        // create university, assigning student
        University university = new University();
        university.setName("FH Kufstein");
        university.setStudentList(studentList);

        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(University.class, Student.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        m.marshal(university, System.out);

        // Write to File
        m.marshal(university, new File(STUDENT_XML));

        // get variables from our xml file, created before
        System.out.println();
        System.out.println("Output from our XML File: ");
        //Aufgabe 6
        Unmarshaller um = context.createUnmarshaller();
        University university2 = (University) um.unmarshal(new FileReader(
                STUDENT_XML));
        ArrayList<Student> list = university2.getStudentList();
        for (Student student : list) {
            System.out.println("Student: " + student.getName() + " PKZ "
                    + student.getPKZ());
        }
    }
}