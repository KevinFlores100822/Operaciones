public class Student {
    private long controlNumber;
    private String name;
    private String lastName;
    private String career;
    private int semester;

    public Student( ) {

    }

    public Student(long controlNumber, String name, String lastName, String career, int semester) {
        this.controlNumber = controlNumber;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.semester = semester;
    }

    public void student(){

    }


    public long getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(long controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    public double generalAvg(long controlNumber) {
        return 0.0;
    }
    public double semesterAvg(long ControlNumber, int semester){
        return 0.0;
    }
    public double subjectGrade (long controlNumber, String subject){
        return 0.0;
    }
    public String toString(){
        System.out.println("los datos del estudiante: ");
        System.out.println("numero de control: " + getControlNumber());
        System.out.println("nombre: " + getName());
        System.out.println("apellido: " + getLastName());
        System.out.println("carrera: " + getCareer());
        System.out.println("semestre: " + getSemester());


        return "";
    }
}