public class whileloop {

    public static void main(String[] args)
    {
        int number= 4;
        int finishnumber = 20;
        int evennumberfound=0;
        while(number <= 20)
        {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }


            System.out.println("Even number " + number);evennumberfound++;

            if(evennumberfound>=5){
                break;
            }


        }
        System.out.println("Total number of even number found " + evennumberfound);

    }

    public static boolean isEvenNumber(int number)
    {

        if(number % 2 == 0)
        {
            return true;
        }
        return false;
    }
}
