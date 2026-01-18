package LW05;

public class Q02 {

    public static void main(String[] args) {

        Department seDept = new Department("Software Engineering");

        Degree csDegree = new Degree("Computer Science");

        Course oop = new Course("Object-Oriented Programming", "Compulsory");

        Lecturer lecturer = new Lecturer("Dr. Perera", "Senior Lecturer", seDept);

        Student student = new Student("Amal", "SE1234", "2nd Year");

        seDept.addLecturer(lecturer);
        seDept.appointDepartmentHead(lecturer);
        seDept.offerCourse(oop);

        csDegree.offerCourse(oop);

        lecturer.addCourse(oop);
        oop.addLecturerInCharge(lecturer);
        oop.addDegreeBelongsTo(csDegree);

        student.registerDegree(csDegree);
        student.enrollCourse(oop);

        System.out.println("\n--- Lecturer Info ---");
        lecturer.displayInfo();

        System.out.println("\n--- Student Info ---");
        student.displayInfo();

        System.out.println("\n--- Department Info ---");
        seDept.displayInfo();

        System.out.println("\n--- Course Info ---");
        oop.displayInfo();

        System.out.println("\n--- Degree Info ---");
        csDegree.displayInfo();
    }
}

