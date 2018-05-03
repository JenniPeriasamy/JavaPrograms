public class VIPcustomer {


    private String name;
    private double creditLimit;
    private String email;


    public VIPcustomer()

    {
        this("default_name", 5000.0 , "default@email.com");
    }

    public VIPcustomer(String name, double creditLimit)
    {
        this(name, creditLimit ,"unknown@email.com");
    }

    public VIPcustomer(String name, double creditLimit, String email)
    {
        this.name =name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}


