package abstractstaff;

public class Main {
    public static void main(String[] args) {

        Employee hourEmployee = new HourlyEmployee("Yuzuru", "Satomi", "343-44-7255", 40.00, 28.00,new HireDate(2, 14, 2021));

        Employee salaryEmployee = new SalariedEmployee("Morinaga", "Souichi", "444-53-4454", 10000.00,new HireDate(12, 24, 2020));

        Employee commissionEmployee = new CommissionedEmployee("Wade", "Wilson", "666-33-6646", 2000.00, 0.35, new HireDate(7, 16, 2007));

        Employee basePlusComEmployee = new BasePlusCommissionEmployee("Zee", "Thompsonowak", "77-77-7777", 5000.00, 0.5, 165.50,new HireDate(4, 2, 2018));



        System.out.println("=====================================");

        Employee[] staff = new Employee[]{hourEmployee, salaryEmployee, commissionEmployee, basePlusComEmployee};

        for(Employee eStaff : staff){
            System.out.println(eStaff.getFirstName() + " " + eStaff.getLastName() + " : " + "\n" + " | Earnings $" +
                    eStaff.earnings() + "\n" + "He was hired on: " + eStaff.getHireDate());
        }





    }
}
