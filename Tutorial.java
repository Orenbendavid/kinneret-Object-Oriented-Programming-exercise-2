import java.util.Random;
import java.util.Scanner;
//provided by Matan Shabi  + Oren Ben David
public class Tutorial {
    public Tutorial()//constructor
    {

    }

    public static int action()//Generate random int value from 0 to 3
    {
        Random objGenerator = new Random();
        return objGenerator.nextInt(3);
    }

    public static int randomNumber1() {//function of random num
        Random objGenerator1 = new Random();
        return objGenerator1.nextInt(10);
    }

    public static int randomNumber2() {//function of random num
        Random objGenerator2 = new Random();
        return objGenerator2.nextInt(10);
    }

    public static void main(String[] args) {    //main method
        String name;
        int answer=0;
        int ans = 0;//exercise answer
        int right = 0;//how many questions answered right
        int wrong = 0, Greeting, num1 = 0, num2 = 0;
        int a = 0;
        int i;
        String type;//user type answer

        System.out.println("enter your name:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello " + " " + name + " " + "  you have to solve 10  correct to finish or press s any time");//asking and scanning for users name

        for (i = 0; i < 10; i++) {
            if (wrong == 3) {
                wrong = 0;
            }
            Greeting = action();
            if (wrong == 0) {
                a = action();
            }

            if (wrong != 1) {
                num1 = randomNumber1();
                num2 = randomNumber2();
            }
            if (a == 0) {
                ans = num1 - num2;
                System.out.println(num1 + "-" + num2);
            }
            else if (a == 1) {
                ans = num1 + num2;
                System.out.println(num1 + "+" + num2);
            }
            else if (a == 2) {
                ans = num1 * num2;
                System.out.println(num1 + "*" + num2);
            }
            Scanner input2 = new Scanner(System.in);
            type = input2.nextLine();//scanning user answer into 'type'

            if(!type.equals("s")){
            answer=Integer.parseInt(type);//converting type data from string to int then placing it in 'answer'
            }

            if (ans == answer) { //random Greetings after every good answer
                right++;
                wrong = 0;
                switch (Greeting) {
                    case 0 -> System.out.println("Well done!");
                    case 1 -> System.out.println("Magnificent!");
                    case 2 -> System.out.println("Very Good!");
                }
            }

            if (ans !=  answer) {
                System.out.println("try again "); //providing the user option to answer again if he wrong
                wrong++;

                if (wrong == 2) {
                    System.out.println("the answer is " + ans + " \n "); // after he wrong twice presenting him the correct answer

                }
                if (type.equals("s")) {
                    System.out.println("You correctly solved " + right + " exercises out of " + i + "!");//if the user press 's' anytime during the run program will stop and present message
                    break;
                }
            }
        }
        if (i == 10) {
            switch (right) { // if user answer on 10 exercises ending message will appear and will give him feedback
                case 10 -> System.out.println("You correctly solved " + right + " exercises out of 10!Excellent!");
                case 9 -> System.out.println("You correctly solved " + right + " exercises out of 10!Very Well!");
                case 7, 8 -> System.out.println("You correctly solved " + right + " exercises out of 10!good!");
                case 6, 0, 1, 2, 3, 4, 5 -> System.out.println("You correctly solved " + right + " exercises out of 10!You need to practice more!!!");
            }
        }
    }
}



























