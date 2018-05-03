public class overloading {

    public void main(String[] args) {

        // method Overloading - method name should be same and differs in parameters
        double cent = calccentimeters(8, 11);
        System.out.println(cent);


    }

    public static double calccentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 && inches > 12)) {
            return -1;
        }

        else {
            double centimeter1 = feet * 2.54;
            double centimeter2 = inches * 12;
            double centimeter = centimeter1 + centimeter2;
            return centimeter;
        }
    }

    public  static double calcentimeters(double inches)
    {
    if (inches < 0)
    {
     return  -1;
    }



    }



}