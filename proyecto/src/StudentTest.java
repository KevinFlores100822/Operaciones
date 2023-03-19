public class StudentTest {
    public static void main(String[] args) {
        System.out.println("voy a probar la clase Student");
        Student alumno1500 = new Student(
                12345689,
                "Arturo",
                "Rodriguez",
                "Informatica",
                2);

        Student alumno1501 = new Student();

        alumno1500.toString();
    }
}
