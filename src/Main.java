import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner resul = new Scanner(System.in);
        System.out.println("nhap so");
         int number = resul.nextInt();
    if(number>0&&number<10){
        switch (number){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            case 4 :
                System.out.println("for");
                break;
            case 5 :
                System.out.println("fire");
                break;
            case 6 :
                System.out.println("six");
                break;
            case 7 :
                System.out.println("seven");
                break;
                case 8 :
                System.out.println("age");
                    break;
            case 9 :
                System.out.println("nigthe");
                break;
        }
    }

    }
}
