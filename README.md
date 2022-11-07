Mini Project , to apply the learnt concepts.

Java application for customer management system.

3.1 Customer : id(int) name(string),email(string),password(string)


customer id is system generated , using auto increment.



Validation Rules for using the application..
email must contain "@" 
reg ex : "^[\\w-\\.]+@([\\w-]+\\.)+(com|org)$";

password must be min 5 max 10 chars long. Must be alphanumeric n 
reg ex : "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*%]).{5,10}";

duplicate customer details should not be stored.
 

Centralized exception handling for smooth termination of program 


EBANK UI..
1. Customer registration
Accept n Validate customer details.
Iff it's valid , store it  , o.w display error message via custom exception

2. Display details of all registered customers



4. Change Password 
i/p : email ,old password ,new password

5. Un subscribe customer(del a perticular account)

Main Menu 


			("1.Add account");
			("2.Display an account");
			("3.Display all account");
			("4.Remove an account");
			("5.withdraw");
			("6.Deposit");
			("7.Transfer");
			("8.Seach account");
			("9.check account bal");
			("10.Change Password");
			("11.exit");




