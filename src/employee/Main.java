package employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];

        int count = 0;

        while (true) {
            System.out.println("Welcome to the Employee Manager System");
//            write options below

            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. List Employees");
            System.out.println("4. Find employee with Highest Salary");
            System.out.println("5. Exit");
            System.out.println("Please choose an option");

            int input = sc.nextInt();

            sc.nextLine();

            switch (input) {
                case 1:
//              create manager logic here
                    System.out.println("Enter manager name");
                    String name = sc.nextLine();
                    System.out.println("Enter manager department");
                    String department = sc.nextLine();
                    System.out.println("Enter manager salary");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter manager bonus");
                    double bonus = sc.nextDouble();
                    employees[count++] = new Manager(name, department, bonus, salary);

                    break;

                case 2:
//                    create developer employee here
                    System.out.println("Enter Developer name");
                    String developerName = sc.nextLine();
                    System.out.println("Enter manager department");
                    String developerdepartment = sc.nextLine();
                    System.out.println("Enter manager salary");
                    double developersalary = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Language");
                    String devprogrammingLanguage = sc.nextLine();
                    employees[count++] = new Developer(developerName, developerdepartment, developersalary, devprogrammingLanguage);
                    break;
                case 3:
//                    list employees logic here
                    for (int i = 0; i < count; i++) {
                        if (employees[i] != null) {
                            employees[i].printEmployeeDetails();
                            System.out.println();
                        }
                    }
                    break;
                case 4:
//                    find employee logic here
//                    add logic to check if employees exist
                    if (count == 0) {
                        System.out.println("No employees found");
                        break;
                    }
                    Employee employeeWithHighestSalary = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i] != null && employees[i].getSalary() > employeeWithHighestSalary.getSalary()) {
                            employeeWithHighestSalary = employees[i];
                        }
                    }
                    if (employeeWithHighestSalary != null) {
                        employeeWithHighestSalary.printEmployeeDetails();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Employee Manager System");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");


            }
        }
    }
}
