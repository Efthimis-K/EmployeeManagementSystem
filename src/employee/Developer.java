package employee;

public class Developer extends Employee{
//    developer specific variables

    private String programmingLanguage;



    public Developer(String name, String department, double salary, String programmingLanguage) {
        super(name, department, salary);
        this.programmingLanguage = programmingLanguage;

    }


    @Override
    public void printEmployeeDetails(){
        super.printEmployeeDetails();
        System.out.println("programming language: " + programmingLanguage);

    }
}
