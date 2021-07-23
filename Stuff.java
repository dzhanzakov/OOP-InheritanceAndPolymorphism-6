package task5;

import java.util.Arrays;

public class Stuff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Stuff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    public void addSubject(String subject) {
        this.subjects[indexOfSubject] = subject;
        this.indexOfSubject++;
    }

    @Override
    public String getData(){
        String arrayOut = "";

        for(int i = 0; i < indexOfSubject; i++){
            arrayOut += this.subjects[i] + "; ";
        }
        return super.getData() + "\nStaff salary: " + this.salary + "\nSubjects: " + arrayOut;

    }
}
