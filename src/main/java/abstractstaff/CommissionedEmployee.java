package abstractstaff;

public class CommissionedEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionedEmployee(String firstName, String lastName, String socialSeecurityNumber, double grossSales, double commissionRate, HireDate hiredate) {
        super(firstName, lastName, socialSeecurityNumber, hiredate);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    double earnings() {
        return getCommissionRate() * getGrossSales();
    }


    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
