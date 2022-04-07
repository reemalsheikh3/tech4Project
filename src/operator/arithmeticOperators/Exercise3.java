package operator.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {

        /*
        create variable
        calculate monthly salary, weekly salary, biweekly salary
        print them out
         */

        double avgSalary = 90000.00;
        double monthlySalary = (avgSalary / 12);
        double weeklySalary = (avgSalary / 52);
        double biweeklySalary = ((avgSalary / 52) * 2);

        System.out.println("Monthly salary = " + monthlySalary);
        System.out.println("Weekly salary = " + weeklySalary);
        System.out.println("Biweekly salary = " + biweeklySalary);



    }
}
