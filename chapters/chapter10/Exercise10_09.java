package chapters.chapter10;

public class Exercise10_09 {
    public static void main(String[] args) {
        //The Course class

        Course course = new Course("DANCE");

        course.addStudent("ALI");
        course.addStudent("VELI");
        course.addStudent("AYSE");

        course.dropStudent("VELI");
        System.out.println(course.getCourseName() + " COURSE ~~~ STUDENTS NAME");
        System.out.println("------------------------------");

        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }

    }
}
