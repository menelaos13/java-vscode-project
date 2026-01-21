public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Onomazomai " + name + " kai eimai " + age + " xronown.");
    }
}

public class main {
    public static void ergasiaide(String[] args) {
        Student student1 = new Student("Menelaos", 20);
        Student student2 = new Student("Basilhs", 22);

        student1.introduce();
        student2.introduce();
    }
}
