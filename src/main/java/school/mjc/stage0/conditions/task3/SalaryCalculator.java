package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            double netSalary = salary * 0.85; // 15% tax
            System.out.println(netSalary);
        } else if (salary <= 20000) {
            double netSalary = salary * 0.82; // 18% tax
            System.out.println(netSalary);
        } else {
            double netSalary = salary * 0.8; // 20% tax
            System.out.println(netSalary);
        }
    }
}
