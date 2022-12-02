package chapters.chapter13;

public class Exercise13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Enable the Course class cloneable

        Course course1 = new Course("JAVA PROGRAMMING");
        course1.addStudent("Ali ");
        course1.addStudent("Ayse ");
        course1.addStudent("Veli ");

        Course course2 = course1.clone();

        course2.addStudent("Ahmet ");
        course2.addStudent("Mehmet ");

        System.out.println(" COURSE-1 :");
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i]);
            System.out.println();
        }

        System.out.println(" COURSE-2 : ");
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(students2[i]);
            System.out.println();
        }
    }
}

