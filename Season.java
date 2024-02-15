import java.util.*;
public class Season {
    public static void main(String args[])
    {
        System.out.println(" Enter any month between 1 to 12 ");
        Scanner sc = new Scanner(System.in);
                int month = sc.nextInt();
                if(month<=12)
                {
                    switch (month)
                    {
                        case 12:
                            System.out.println("Winter");
                            break;
                        case 1:
                            System.out.println("Winter");
                            break;
                        case 2:
                            System.out.println("Winter");
                            break;
                        case 3:
                            System.out.println("Summer");
                            break;
                        case 4:
                            System.out.println("Summer");
                            break;
                        case 5:
                            System.out.println("Summer");
                            break;
                        case 6:
                            System.out.println("Rainy");
                            break;
                        case 7:
                            System.out.println("Rainy");
                            break;
                        case 8:
                            System.out.println("Rainy");
                            break;
                        case 9:
                            System.out.println("Rainy");
                            break;
                        case 10:
                            System.out.println("Monsoon");
                            break;
                        case 11:
                            System.out.println("Monsoon");
                            break;
                    }
                }
                else {
                    System.out.println("Allowed Numbers only 1 to 12 , So Pls Enter Accordingly :)");
                }
           // default:
             //   throw new IllegalStateException("Unexpected value: " + month);

    }
}
