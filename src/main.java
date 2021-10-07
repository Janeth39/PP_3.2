import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        System.out.println (numToText());
    }
    public static String numToText()
    {
        int num;
        String word = "zero";

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a number(0-9): ");
        num = scan.nextInt();

        if(num == 1)
        {
            word = "one";
        }
        else if (num == 2)
        {
            word = "two";
        }
        else if (num == 3)
        {
            word = "three";
        }
        else if (num == 4){
            word = "four";
        }
        else if (num == 5){
            word = "five";
        }
        else if (num == 6){
            word = "six";
        }
        else if (num == 7){
            word = "seven";
        }
        else if (num == 8){
            word = "eight";
        }
        else if (num == 9){
            word = "nine";
        }
        else if(num != 0)
        {
            word = "numeber is out of bounds";
        }

        return(word);

    }
}
