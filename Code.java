import java.net.Socket;
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String username,password;
        String welcomeMessage= "Hello !";
        int attempt=3;
        int choise;
        double balance=1500;
        double amount;
        for(int i=1;i<=attempt;){
            System.out.print("Username : ");
            username=input.nextLine();
            System.out.print("Password : ");
            password=input.nextLine();
            if(username.equals("patika")&&password.equals("java101")){
                System.out.println(welcomeMessage);
                System.out.println("How Can I Help You?");
                do{
                System.out.println("1-Balance\n2-Withdrawal\n3-Deposit\n4-Exit\nPlease Select :");
                choise=input.nextInt();
                /*//SOLUTION WITH IF LOOP! 
                
                if(choise==1){
                    System.out.println("Balance : "+balance+" $");
                }else if(choise==2){
                    System.out.print("Amount To Be Withdrawal : ");
                    amount=input.nextInt();
                    if(amount<=balance){
                        balance-=amount;
                        System.out.println("Balance : "+balance+" $");
                    }else{
                        System.out.println("Insufficient Balance!");
                    }
                }else if(choise==3){
                    System.out.println("Amount To Be Deposit : ");
                    amount=input.nextInt();
                    balance+=amount;
                    System.out.println("Balance : "+balance+" $");

                }else if(choise==4){
                    System.out.println("Have a Good Day, Bye!");
                }*/

                //SOLUTION WITH SWITH CASE

                switch (choise) {
                    case 1: System.out.println("Balance : "+balance+" $");
                        
                        break;
                    case 2:System.out.print("Amount To Be Withdrawal : ");
                    amount=input.nextInt();
                    if(amount<=balance){
                        balance-=amount;
                        System.out.println("Balance : "+balance+" $");
                    }else{
                        System.out.println("Insufficient Balance!");
                    }
                        
                        break;
                    case 3:System.out.println("Amount To Be Deposit : ");
                    amount=input.nextInt();
                    balance+=amount;
                    System.out.println("Balance : "+balance+" $");
                        
                        break;
                    case 4:System.out.println("Have a Good Day, Bye!");
                        
                        break;
                
                    default:System.out.println("Selection Error!\nTry Again...");
                        break;
                }
                
                }while(choise!=4);
        break;
            
            }else{
                System.out.println("Wrong Username/Password, Please Try Again"+"\nattempt left : "+--attempt);
                if(attempt==0){
                    System.out.println("Your Account Blocked!\nPlease Contact With Costumer Services");
                }
            }
        }
    }
    
}
