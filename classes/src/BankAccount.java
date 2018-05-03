public class BankAccount {


    private String accNo;
    private double balance;
    private String custName;
    private String email;
    private String phoneNo;


    // This is Bank Account class and tried to make some changes for versioning
    public void deposit(double depositAmt)
    {
       this.balance += depositAmt;

        System.out.println("Your deposit has been processed. your new balance is: this is for git "
        + this.balance);
    }
    public void withdrawal(double withdrawalAmt)
    {
       if (this.balance - withdrawalAmt  < 0)
        {
            System.out.println("Your  " + this.accNo + " has insufficient balance ."
                     + " your balance  is : " + this.balance);
        }
        else
       {
           this.balance -=withdrawalAmt;
           System.out.println("Your  " + this.balance + " has processed. "
                   + " your balance  is : " + this.balance);
       }
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
