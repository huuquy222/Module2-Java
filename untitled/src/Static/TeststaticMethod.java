package Static;

public class TeststaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Qúy");
        Student s2 = new Student(222, "Tiên");
        Student s3 =   new Student(333, "Hiếu");

        s1.display();
        s2.display();
        s3.display();

    }
}
