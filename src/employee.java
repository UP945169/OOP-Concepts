public class employee {
    String name;
    int age;
    double salary;
    String location;


    public employee(String name, int age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public double raiseSalary(){
        salary = salary + 10;
        return salary;
    }
}
