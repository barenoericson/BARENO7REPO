
package mainbareno08;

import java.util.Scanner;

public class MAINBARENO08 {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        Salary08 sl = new Salary08();
        Accounts08 acs = new Accounts08();
        Receipts08 rc = new Receipts08();
        
        String transaction;
        
        System.out.println("Operation Menu System\n");
        
        do{
                           
                            
                             System.out.println("1. Salary");
                             System.out.println("2. Account");  
                             System.out.println("3. Reciept");
                             System.out.println("Enter selection: ");
            int select = sc.nextInt();

            switch(select){
                case 1:
                    sl.getSalary08();
                    break;
                case 2: 
                  acs.getAccounts();
                break;
                case 3:
                    rc.getreceipts();
                    break;
                default: System.out.println("Invalid choice.");
            }
            System.out.print("Make another transaction? (y/n): ");
            transaction = sc.next();
        } while(transaction.contains("y"));
        
    }
}