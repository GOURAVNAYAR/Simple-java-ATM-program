 import java.util.*;
	class Account {               
	public static void main(String [] args){
		
	 Scanner a1 = new Scanner(System.in);
	// int nayar = 0;
	 int preeti = 0;
	 int ecourse = 500;
	
		System.out.println("WELCOM TO SBI");
		
		System.out.println("ENTER YOUR CARD NUMBER");
		long number = a1.nextInt();
		if(number == 11){
						System.out.println(number);
								}
								
		           else {
				        System.out.println(" Enter 11 digite Card number please");
						System.out.println(number);
						long m = a1.nextLong();
						     }
		
						System.out.println("ENTER YOUR PIN NUMBER");
							int numberr = a1.nextInt();
							
							
 	
		//     System.out.println("SELECT TRANCACTION");
			
		     System.out.println();
		  
             System.out.println("SELECT TRANCACTION"+'\n'+'\n'+"1) Balance_Inquiry" + '\n' + "2) Doposit" + '\n' + "3) Withdrawal" + '\n' + "4) Pin_Change" + '\n' + "5) ATM Block " +'\n' + "6) Money_Transfer" + '\n' + "7) Exit" + '\n');
			 System.out.println("ANY ISSUE TO CONTACT YOUR BRANCH AND CALL 24*7" +'\n'+" HELPLINE AT 1800 6815 3598");
			  int TRANCACTION = a1.nextInt();
			 System.out.println("you press "+TRANCACTION);
	
	
switch(TRANCACTION){
				
             case 1 : System.out.println("  Available Balance" + ecourse );
                      System.out.println("Thank you");
                      break;
            
             case 2 : System.out.println("How Much Money Do You Want To Deposit");
			          int nayar = a1.nextInt();
					  ecourse = ecourse + nayar;
			          System.out.println("Deposit Successfull " + nayar);
                      System.out.println(" Thank you");
					  System.out.println("If you want to do balance inquiry then press 1 if you don't want to do it then press 2 ");
					  int press = a1.nextInt();
					  if(press == 1){
								System.out.println("Available Balance" + ecourse);
					  }
							else{
								System.out.println(" Thank you");
							}
                      break;
                     
             case 3 : System.out.println("How Much Money Do You Want To Withdrawal");
			          int raghav = a1.nextInt();
					  ecourse = ecourse - raghav ;
			          System.out.println("Withdrawal Successfull " + raghav);
                      System.out.println(" Thank you");
					  System.out.println("If you want to do balance inquiry then press 1 if you don't want to do it then press 2 ");
					  int mtresi = a1.nextInt();
					  if(mtresi == 1){
								System.out.println("Available Balance" + ecourse);
					  }
							else if(mtresi == 2){
								System.out.println(" Thank you");
							}
							    else {
									  System.out.println("Pressed the wrong button, then process again");
								}
							   
                      break;
             case 4 : System.out.println("If you want to create a new PIN, press 1 and if you have forgotten your PIN, press 2.");
			           int right = a1.nextInt();
			           if(right == 1){
								System.out.println("Enter your old PIN");
								 int store = a1.nextInt();
								 		System.out.println("Enter your new PIN");
								          int enhar = a1.nextInt();
										     System.out.println("create a new PIN Successfull");
											
					  }         
							else if(right == 2){
								System.out.println("If you have forgotten your PIN then you have to go to the bank for it ......sorry");
							}
								else {
									  System.out.println("Pressed the wrong button, then process again");
								}
									    
                      System.out.println(" Thank you");
                      break;
                     
             case 5 : System.out.println("you really want to block atm then press 1 otherwise press 2");
			           int side = a1.nextInt();
			          if(side == 1){
								System.out.println("Enter your old PIN");
								    int worid = a1.nextInt();
									System.out.println("Are you sure block a ATM");
									  int rock = a1.nextInt();
									  
					  }
							else if(side == 2){
								System.out.println( );
							}
								else {
									  System.out.println("Pressed the wrong button, then process again");
								}
                      System.out.println(" Thank you ");
                      break;
                     
             case 6 : System.out.println("How Much Money Do You Want To Transfer");
			           int atore = a1.nextInt();
					  System.out.println("Enter the account number in whose account you do not want money");
					      int btore = a1.nextInt();
						    
							 if(btore == 123456){
								System.out.println(" transfar Successfully");
								  preeti = ecourse-atore;
							 }
						
								else {
									  System.out.println( );
								}
						   
                    
                      break;
            
          
            default :System.out.println("Exit"); 
                     System.out.print("Thank you");
        }
			 
	}
	
}
  	