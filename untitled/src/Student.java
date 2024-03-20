public class Student {
    String name;
    String surname;
    String s;

    Student(String name, String surname, String s){
        this.name = name;
        this.surname = surname;
        this.s = s;
    }

    public String toString() {
        return this.name + " " + this.surname + " " + this.s;
    }
}
