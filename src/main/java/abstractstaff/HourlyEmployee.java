package abstractstaff;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours, HireDate hireDate) {
        super(firstName, lastName, socialSecurityNumber, hireDate);
        this.wage = wage;
        this.hours = hours;
    }

    double earnings() {
        return getWage() * getHours();
    }



    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }



    @Override
    public String toString() {
        return super.toString();
    }

}
