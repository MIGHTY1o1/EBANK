package testing;

import java.util.Scanner;

public class test2 {

	
	 private static int robo_id =2057109; 
	 private String  name ; 
	 private static  String phno ;
	 private String email;
	 private int balance =0;
	 private  final int  accno;
	 String password;
	 
	 test2 next;
	 test2 prev;
	 
	 {
		 accno = robo_id++;
		 next = null;
		 prev = null;
	 }
	 
	 test2(String n , String em , String ph ){
		 
		 name = n;
		 email = em;
		 password = "1234";
		 phno = ph;
		
	 }
	 
	
	 
	 
	test2(){
      	name  = setname();
	     email = setEmail();
	     phno = setphno();
	     password = setpass();
	}
	
	
	public String getname() {
		return name;
	}
	public String getphno() {
		return phno;
	}
	public String getemail() {
		return email;
	}
	
	
	
	public   String setname() 
	
	{
		
		boolean  flag = false ;
		
		String nm = "";
	//	System.out.print("ENTER YOUR NAME : ");
		Scanner cin = new Scanner(System.in);
	//	nm = cin.nextLine();
		
		
		while(!flag) {
			System.out.print("ENTER YOUR NAME : ");
			nm = cin.nextLine();

			if(nm.length() < 5) {
				System.out.println("\nSHOULD BE ATLEAT 5 CHAR\n try again..\n");
				//System.out.println("\u000c");
				
			}			 
			
			if(nm.length() >= 5) {
			//	System.out.println("final string prepared");
			flag = true;}
			}
		
		
		
		return nm;
		
	}

	

	public  String setEmail() {
		String em = "";
		
		
		//	System.out.print("ENTER YOUR EMAIL ID :");
			Scanner cin = new Scanner(System.in);
		//	em = cin.nextLine();
		
			boolean flag = false;
			
			while(!flag) {
				
					System.out.print("ENTER YOUR EMAIL ID :");
					em = cin.nextLine();
					
					for(int i =0 ; i < em.length();  i++) {
					if(em.charAt(i) == '@') {
						
					flag = true;
					}
						if(i == em.length() && flag == false) {
						System.out.print("\nENTER A VALID EMAIL");
						}
					}
				}
			
			
		
		
		return em;
	}
	
    public  String  setphno() {
		
		String ph = null ;
		

				Scanner cin = new Scanner(System.in);
		
			
				boolean flag = false;
				String s;
				
				while(!flag) {
					
						System.out.print("ENTER YOUR PHN_NO :");
					   ph = cin.nextLine();
						
				  if(ph.length() == 10) {
							
							flag = true;
							
						  break;
						}
				}
				
		
		
		return ph;
	}
	
    
    public String setpass() {
    	
    	String pass = null ;
		

		Scanner cin = new Scanner(System.in);

	
		boolean flag = false;
		
		
		while(!flag) {
			
				System.out.print("ENTER YOUR Password :");
			   pass = cin.nextLine();
				
		  if(pass.length() > 5) {
					
					flag = true;
					
				  break;
				}
		}
		


return pass;
    	
    }
    
    public boolean config() {
    	
		String test;

		System.out.println("Password :");
		Scanner cin = new Scanner(System.in);
		test = cin.nextLine();

		if(test.equals(password)){
				//System.out.println("Password: " + password );
				// System.out.println("correct pass");
			return true;
		}
		else {
			return false;
		}
    }

    
    public void changepass() {
    	
    	String test; 
    	Scanner cin = new Scanner(System.in);
    	System.out.println("Enter Prev Password");
    	test = cin.nextLine();
    	
    	if (test.equals(password)) {
    		System.out.println("Enter New Password");
        	test = cin.nextLine();
        	password = test;
        	
        	System.out.println("Password changed Successfully");
    	}
    	else {
    		System.out.println("request denied");
    	}
    	
    	
    	
    }
    
    
    
	public void show() {
		
		System.out.println("System verfication needed\nPlease enter Password for the Registered Account.");
		Scanner cin = new Scanner(System.in);
		//String test = cin.nextLine();
		int count = 0;
		
		boolean flag = false;
		
		while(!flag) {
				System.out.println("Password : ");
				String test = cin.nextLine();
		
			 if(test.equals(password) ){
		
		
		System.out.println("\n\t ACOUNT DETAILS " +  "\nACC_NO : " + accno  +
				"\nNAME :\t" + name + "\nemail :\t" + 
				email +"\nphno :\t" + phno
				 + "\nbalance : " + balance );
			 flag = true ;
			 }
			 count++;
			 
			 if (count >3) {
				 System.out.println("you have reached to limit try next time");
				 break;
			 }
		}
	
	
	}
	
	
	public int getbalance() {
		return balance;
	}
	
	public void setbalance(int value) {
		
		
		balance = value;
	}
	
public void deposit(int value) {
		
		
		balance = balance + value;
	}
	

	
	public boolean withdraw(int value) {
		
		
		
		int currbal = getbalance();
		
		
		
		if(currbal <= 100)
		{
			System.out.println("INSUFFICIENT BALANCE :" + balance);
			return false;
		}
		else 
		{
			currbal = currbal - value;
			setbalance(currbal);
		}
	return true;
	}
	
	public static void main(String[] args) {
	
	//	test2 t1 = new test2();
	//	t1.withdraw(100);
	//	System.out.print(t1);
		
		
	}
	
	
}
	

