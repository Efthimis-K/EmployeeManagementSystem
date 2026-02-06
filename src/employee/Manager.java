package employee;

public class Manager extends Employee{

//    manager attributes
    private double bonus;

    public Manager(String name, String department,double bonus, double salary) {
        super(name, department, salary);
        this.bonus = bonus;
    }


    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("bonus: " + bonus);
    }

//    get salary method overriden
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }


}
