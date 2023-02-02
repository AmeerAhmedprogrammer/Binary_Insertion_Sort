//Ameer Ahmed
public class Student {
    
    // instance variables
    private int stu_id;
    private String name;
    private int age;
    private double GPA;
    
    // fully loaded
    public Student(int stu_id, String name, int age, double GPA) {
        this.stu_id = stu_id;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
    // setters
    void setstu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    void setname(String name) {
        this.name = name;
    }

    void setage(int age) {
        this.age = age;
    }

    void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    // getters
    int getstu_id() {
        return this.stu_id;
    }

    String getname() {
        return this.name;
    }

    int getage() {
        return this.age;
    }

    double getGPA() {
        return this.GPA;
    }
    
    // toString method
    public String toString() {
        String output = "";
        output += "The Student's Information is: \n";
        output += "The student ID is: " + this.stu_id + '\n';
        output += "The name is: " + this.name + '\n';
        output += "The age is: " + this.age + '\n';
        output += "The GPA is: " + this.GPA + '\n';
        return output;
}
}
