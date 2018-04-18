package abstractstaff;

public class BasePlusCommissionEmployee extends CommissionedEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary, HireDate hireDate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, hireDate);
        this.baseSalary = baseSalary;
    }


    double earnings() {
        return super.earnings() + getBaseSalary();
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
