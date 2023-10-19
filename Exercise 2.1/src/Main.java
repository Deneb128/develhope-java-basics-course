public class Main {
    public static void main(String[] args)
    {
        var student = new Student(1, "Paolo", "Rossi");
        System.out.println("Student " + student.getID() + " with name: " + student.getName() + " and last name: " + student.getLastName() + " created.");
    }
}