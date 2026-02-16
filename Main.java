/*Polymorphism and method overriding */
class EmployeePayCheck {
    int check;
    String profession;
    EmployeePayCheck(int check, String profession) {
        this.check = check;
        this.profession = profession;
    }
    void calculateSalary() {
        System.out.println("Base Salary for " + profession + ": $" + check);
    }
}
class Manager extends EmployeePayCheck {
    
    Manager(int check, String profession) {
        super(check, profession);
    }
    @Override
    void calculateSalary() {
        int bonus = 5000;
        int total = this.check + bonus;
        System.out.println("Manager Salary (with Bonus): $" + total);
    }
}
class Intern extends EmployeePayCheck {
    
    Intern(int check, String profession) {
        super(check, profession);
    }
    @Override
    void calculateSalary() {
        System.out.println(" Intern Stipend (No Bonus): $" + this.check);
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeePayCheck emp = new EmployeePayCheck(50000, "Generic Employee");
        Manager mgr = new Manager(80000, "Project Manager");
        Intern itr = new Intern(20000, "Summer Intern");

        System.out.println("--- Payroll Report ---");

        emp.calculateSalary(); 
        mgr.calculateSalary(); 
        itr.calculateSalary(); 
    }
}