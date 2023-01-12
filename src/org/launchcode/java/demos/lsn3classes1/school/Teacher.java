package org.launchcode.java.demos.lsn3classes1.school;

public class Teacher {
    //firstName
    private String firstName;
    // lastName,
    private String lastName;
    // subject,
    private String subject;
    // yearsTeaching
    private int yearsTeaching;

    //Getters and setter
    public String getFirstName() {return this.firstName; }

    public String getLastName() {return this.lastName; }

    public String getSubject() {return this.subject;}

    public int getYearsTeaching() {return yearsTeaching; }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
