package abstractstaff;

public class SalariedEmployee extends Employee{

    private double weeklySal; //weekly salary


    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySal, HireDate hireDate) {
        super(firstName, lastName, socialSecurityNumber, hireDate);
        this.weeklySal = weeklySal;
    }

    double earnings() {
        return getWeeklySal();
    }


    public double getWeeklySal() {
        return weeklySal;
    }

    public void setWeeklySal(double weeklySal) {
        this.weeklySal = weeklySal;
    }








    @Override
    public String toString() {
        return super.toString();
    }



}
