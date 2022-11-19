package chapters.chapter11;

public class Exercise11_02 {
    public static void main(String[] args) {
        //The Person, Student, Employee, Faculty, and Staff classes

        Person person = new Person("Abdullah", "İzmir", "05994321111", "savran@savran.com");
        Student student = new Student("Ali", "İstanbul", "053353353300", "ali@eali.com", Student.SENIOR);
        Staff staff = new Staff("Arda", "İstanbul", "05656565", "arda@adra.com", 50000, "Supervisor");
        Faculty faculty = new Faculty("Alex", "Adana", "053434344", "alex@alex.com", 100, "10000", "Super");
        Employee employee = new Employee("Altay", "İzmir", "9384743", "altay@altay.com", 25010);

        System.out.println(person.toString());
        System.out.println(student);
        System.out.println(staff);
        System.out.println(faculty);
        System.out.println(employee);
    }
}

