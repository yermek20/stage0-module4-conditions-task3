package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary<=10000 && salary>0) {
            System.out.println((double) (salary*85/100));
        } else if (salary<=20000 && salary>0) {
            System.out.println((double) (salary*82/100));
        } else if (salary>20000 && salary>0) {
            System.out.println((double) (salary*80/100));
        } else {
            System.out.println("wrong input!");
        }
    }
}
