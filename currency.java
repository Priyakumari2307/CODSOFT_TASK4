import java.util.*;
public class currency {
    public static void main(String[] args) {
        System.out.println("press 1 , for Ruppe");
        System.out.println("press 2 , for Dollar");
        System.out.println("press 3 , for Euro");
        System.out.println("press 4 , for pound");
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose any one currency");
        int choice = sc.nextInt();
        System.out.println("Enter the your amount that you want to convert it :- ");
        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
             case 4:
                pound_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice that you will enter !");
        }
    }

public static void Ruppe_to_other(double amt) {
    System.out.println("1 Ruppe in Dollar is equal to " + 0.012 + " Dollar");
    System.out.println(amt+" Ruppe will be " + (amt*0.012) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe in Euro is equal to " + 0.011 + " Euro");
    System.out.println(amt+" Ruppe will be " + (amt*0.011) + " Euro");
    System.out.println();

    System.out.println("1 Ruppe in pound is equal to " + 0.0093 + " pound");
    System.out.println(amt+" Ruppe will be " + (amt*0.0093) + " pound");
}  

public static void Dollar_to_other(double amt) {
    System.out.println("1 Dollar in Ruppe is equal to  " + 83.47 + " Ruppe");
    System.out.println(amt+" Dollar will be " + (amt*83.47) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar in Euro is equal to " + 0.92 + " Euro");
    System.out.println(amt+" Dollar will be " + (amt*0.92) + " Euro");
    System.out.println();

    System.out.println("1 Dollar in pound is equal to " + 0.78 + " pound");
    System.out.println(amt+" Dollar will be " + (amt*0.78) + " pound");
}
    
public static void Euro_to_other(double amt){
    System.out.println("1 Euro in Ruppe is equal to " + 90.51 + " Ruppe");
    System.out.println(amt+" Euro will be " + (amt*90.51) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro in Dollar is equal to " + 1.08 + " Dollar");
    System.out.println(amt+" Euro will be " + (amt*1.08) + " Dollar");
    System.out.println();

    System.out.println("1 Euro in pound is equal to " + 0.85 + " pound");
    System.out.println(amt+" Euro will be " + (amt*0.85) + " pound");
}

public static void pound_to_other(double amt){
    System.out.println("1 pound in euro is equal to " + 1.18 + " euro");
    System.out.println(amt+" pound will be " + (amt*1.18) + " euro");
    System.out.println();

    System.out.println("1 pound in Dollar is equal to " + 1.28 + " Dollar");
    System.out.println(amt+" pound will be " + (amt*1.28) + " Dollar");
    System.out.println();

    System.out.println("1 pound in Ruppe is equal to " + 106.98 + " Ruppe");
    System.out.println(amt+" pound will be " + (amt*106.98) + " Ruppe");
}
}