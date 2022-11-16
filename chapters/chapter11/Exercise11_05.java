package chapters.chapter11;

public class Exercise11_05 {
    public static void main(String[] args) {
        //The Course class

        Course course1 = new Course("FRENCH");
        Course course2 = new Course("ENGLISH");

        course1.addStudent("ALI");
        course1.addStudent("VELI");
        course1.addStudent("AYSE");
        course2.addStudent("AYSE");
        course2.addStudent("VELI");
        System.out.println("NUMBER OF STUDENTS IN COURSE-1 : " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();

        System.out.println("NUMBER OF STUDENTS IN COURSE-2 : " + course2.getNumberOfStudents());
        String[] students1 = course2.getStudents();
        for (int j = 0; j < course2.getNumberOfStudents(); j++) {
            System.out.print(students[j] + ", ");
        }
        System.out.println();

    }
}
