public class methods {

        public static void main(String[] args) {


            int p1= calculatescore(1900);
            display('A', p1);
            int p1= calculatescore(800);
            display('B', p1);
            int p1= calculatescore(400);
            display('C', p1);
            int p1= calculatescore(19);
            display('D', p1);


            public static void display(char name,int position )
            {
                System.out.println(name + "managed to get into position"
                        + position + "in the high score table");
            }

            public static int calculatescore(int score)
            {
                if (score > 1000)
                {
                    return 1;
                }
                else if (score > 500 && score < 1000)
                {
                    return 2;

                }
                else if (score > 100 && score < 500)
                {
                    return 3;
                }
                else
                {
                    return 4;
                }
            }


        }
    }

