public class forloop {

    public static void main(String[] args)
    {

        for(int i=2; i<9; i++)
        {
            System.out.println("10,000 at " + i + "%" + "  interest at " + String.format("%.2f",calculateInterest(10000.0, i)) );

        }
        System.out.println("-----------------------------");
        for(int i=8; i>1; i--)
        {
            System.out.println("10,000 at " + i + "%" + "  interest at " + String.format("%.2f",calculateInterest(10000.0, i) ));

        }
// Prime number
        for(int i=1;i<20;i++)
        {
           boolean p = isPrime(i);
           if(p)
           {
               System.out.println(i);
           }

        }


    }
    public static double calculateInterest(double amount, double interest)
    {
        return(amount * (interest/100));

    }


    public static boolean isPrime(int n)
    {
        if (n==1)
            return false;

        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;

    }
}
