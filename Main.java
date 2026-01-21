
import java.util.*;

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override

    public String toString() {
        return "Mathitis: " + name + " - Vathmos: " + grade;
    }
}

public class Main {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n Menu ");

            System.out.println("1. Prosthiki mathiti");

            System.out.println("2. Emfanisi mathitwn");

            System.out.println("3. Anazitisi mathiti");

            System.out.println("4. Enimerosi vathmou");

            System.out.println("5. Diagrafi mathiti");

            System.out.println("6. Eksodos");

            System.out.println("Epilogh: ");

            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Onoma mathiti: ");

                    String name = scanner.nextLine().toLowerCase();

                    System.out.print("Vathmos: ");

                    double grade = scanner.nextDouble();

                    Student s = new Student(name, grade);

                    students.put(name, s);

                    System.out.println("O mathitis prostethike");

                    break;

                case 2:

                    if (students.isEmpty()) {

                        System.out.println("Den uparxoun mathites");
                    }

                    else {

                        Collection<Student> values = students.values();

                        ArrayList<Student> list = new ArrayList<>(values);

                        list.sort(Comparator.comparingDouble(Student::getGrade));

                        System.out.println("\n Lista mathitwn ");

                        for (Student st : list) {

                            System.out.println(st);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Onoma pros anazitisi: ");

                    String searchName = scanner.nextLine().toLowerCase();

                    Student found = students.get(searchName);

                    if (found != null) {

                        System.out.println("Vrethike: " + found);

                    }

                    else {

                        System.out.println("Den vrethike mathitis ");

                    }

                    break;

                case 4:

                    System.out.print("Onoma mathiti: ");

                    String updateName = scanner.nextLine().toLowerCase();

                    Student st = students.get(updateName);

                    if (st != null) {

                        System.out.print("Neos vathmos: ");

                        double newGrade = scanner.nextDouble();

                        st.setGrade(newGrade);

                        System.out.println("O vathmos enimerwthike");

                    }

                    else {

                        System.out.println("O mathitis den uparxei");

                    }

                    break;

                case 5:

                    System.out.print("Onoma mathiti gia diagrafi: ");

                    String deleteName = scanner.nextLine().toLowerCase();

                    Student removed = students.remove(deleteName);

                    if (removed != null) {

                        System.out.println("O mathitis diagraftike");

                    }

                    else {

                        System.out.println("Den vrethike mathitis");

                    }

                    break;

                case 6:

                    System.out.println("Eksodos apo Menu");

                    break;

                default:

                    System.out.println("Mh egkurh epilogh!");

            }
        } while (choice != 6);

        scanner.close();
    }

}
