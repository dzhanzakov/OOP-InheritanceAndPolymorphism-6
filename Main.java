package task5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        User student4 = new Students(4, "admin4", "0000", "name4", "surname4",4.3);
//        ((Students) student4).addCourse("Art");((Students)  student4).addCourse("Design");
//        User student5 = new Students(5, "admin5", "0000", "name5", "surname5",4.5);
//        ((Students) student5).addCourse("IT Automation");

        User[] users = new User[100];

        Scanner input = new Scanner(System.in);
        ///input an option
        int id = 0;
        while (true) {

            System.out.print("""
                Press [1] ADD USER
                PRESS [2] TO LIST USERS
                PRESS [0] TO EXIT
                ---                
                """);
            int option = input.nextInt();

            if (option == 1) {
                System.out.println("""
                        PRESS [1] TO ADD STUDENT             
                        PRESS [2] TO ADD STAFF""");
                int optionInsideOption1 = input.nextInt();
                if (optionInsideOption1 == 1) {

                    System.out.print("Login: ");
                    String login = input.next();

                    System.out.print("Password: ");
                    String password = input.next();

                    System.out.print("Name: ");
                    String name = input.next();

                    System.out.print("Surname: ");
                    String surname = input.next();

                    System.out.print("GPA(e.g 4.0): ");
                    double gpa = input.nextDouble();

                    User user = new Students(id, login, password, name, surname, gpa);


                    System.out.println("Insert Courses. To stop adding them input [STOP]");

                    while(true) {
                        String courses = input.next();

                        if (!courses.equals("STOP")) {
                            ((Students) user).addCourse(courses);
                        } else if (courses.equals("STOP")) {
                            break;
                        }
                    }

                    id++;
                    users[id] = user;


                }

                if (optionInsideOption1 == 2) {

                    System.out.print("Login: ");
                    String login = input.next();

                    System.out.print("Password: ");
                    String password = input.next();

                    System.out.print("Name: ");
                    String name = input.next();

                    System.out.print("Surname: ");
                    String surname = input.next();

                    System.out.print("Salary: ");
                    double salary = input.nextDouble();

                    User user = new Stuff(id, login, password, name, surname, salary);

                    System.out.println("Insert Subjects. To stop adding them input [STOP]");

                    while(true) {
                        String subject = input.next();
                        if (!subject.equals("STOP")) {
                            ((Stuff) user).addSubject(subject);
                        } else if (subject.equals("STOP")) {
                            break;
                        }
                    }

                    id++;
                    users[id] = user;

                }
            }

            if(option == 2) {

                System.out.println("""
                        PRESS [1] TO LIST STUDENTS 
                        PRESS [2] TO LIST STAFF""");
                int optionInsideOption2 = input.nextInt();


                if (optionInsideOption2 == 1) {
                    for (User u : users) {
                        if (u instanceof Students) {
                            System.out.println(u.getData() + "\n");
                        }
                    }
                }
                if (optionInsideOption2 == 2) {
                    for (User u : users) {
                        if (u instanceof Stuff) {
                            System.out.println(u.getData() + "\n");
                        }
                    }
                }
            }

            if(option == 0){
                break;
            }
        }
    }
}

