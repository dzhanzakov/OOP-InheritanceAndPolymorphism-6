package task5;

public class Students extends User{
    private double gpa;

    private String courses[] = new String[100];

    private int indexOfCourses = 0;

    public Students(double gpa, String[] courses, int indexOfCourses) {
        this.gpa = gpa;
        this.courses = courses;
        this.indexOfCourses = indexOfCourses;
    }

    public Students(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
        this.indexOfCourses = indexOfCourses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    public void addCourse(String course){
        this.courses[indexOfCourses] = course;
        this.indexOfCourses++;
    }


    @Override
    public String getData(){
        String arrayOut = "";

        for(int i = 0; i < indexOfCourses; i++){
            arrayOut += this.courses[i] + "; ";
        }
        return super.getData() + "\n" +
                "GPA: " + this.gpa + "\nCourses: " + arrayOut;

    }
}
