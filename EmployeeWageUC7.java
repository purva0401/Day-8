package EmployeeWage;

public class UC7 {
    public static final int PartTime = 1;
    public static final int FullTime = 2;
    public static final int Emp_Wage_Per_Hour = 20;
    public static final int Num_of_Working_Days = 2;
    public static final int Max_Hours_in_Month  = 10;

    public static void main(String[] args) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays=0;
        while (totalEmpHrs <= Max_Hours_in_Month && totalWorkingDays < Num_of_Working_Days){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case PartTime:
                    empHrs=4;
                    break;
                case FullTime:
                    empHrs=8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + "EmpHr:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * Emp_Wage_Per_Hour;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }

}