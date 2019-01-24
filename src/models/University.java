package models;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

//This statement means that class "University.java" is the root-element of our example
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class University {

    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "studentList")
    // XmlElement sets the name of the entities
    @XmlElement(name = "student")
    private ArrayList<Student> studentList;
    private String name;

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}