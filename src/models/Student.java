package models;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "student")
// If you want you can define the order in which the fields are written
// Optional
@XmlType(propOrder = { "jahrgang", "name", "alter", "PKZ" })
public class Student {

    private String name;
    private int alter;
    private int PKZ;
    private int jahrgang;


    // If you like the variable name, e.g. "name", you can easily change this
    // name for your XML-Output:
    @XmlElement(name = "title")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getPKZ() {
        return PKZ;
    }

    public void setPKZ(int PKZ) {
        this.PKZ = PKZ;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }



}