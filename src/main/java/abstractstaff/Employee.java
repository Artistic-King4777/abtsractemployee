package abstractstaff;

public abstract class Employee {

    //instance variables
    private static int count = 0;
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;
    private HireDate hireDate;


    //method signature / stubs
    abstract double earnings();

    //constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, HireDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hireDate = hireDate;
        count++;

        System.out.printf("Constructed employee %s %s | count=%d%n", firstName, lastName, count);
    }


    //getters
    public static int getCount() {
        return count;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //getters-setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }

    //toString Override
    @Override
    public String toString() {
        return "Employee{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';
    }

}
