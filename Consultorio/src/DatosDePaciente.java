import java.util.Scanner;
public class DatosDePaciente {
    private char sex;
    private String name;
    private int age;
    private double weight; //peso
    private int height; //altura

    Scanner sc = new Scanner(System.in);

    public DatosDePaciente(String name, int age, double weight, int height, char sex){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.sex=sex;
    }



    double IMC(double weight, int height){
        return (double) weight/(height*height);
    }

    public String compitition(double imc){
        if (imc <= 18.5){
            return "Underweight";
        }
        else if (imc >18.5 && imc <= 24.9){
            return "Normal";
        }
        else if (imc >= 25){
            return "Overheight";
        }
        else {
            return "Obesity";
        }
    }
    public void IndiceDeMasaCorporal(double height, double weight){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }




}
