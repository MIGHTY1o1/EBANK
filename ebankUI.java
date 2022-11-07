package testing;

import java.util.Scanner;

public class ebankUI {

	public static int mainmenu() {

		System.out.print("\n\tWELCOME TO EBANK");
		System.out.println("\t\t\t\t|Input token for service|");
		System.out.println("\t---------------");

		System.out.println("Banking Services :-\n");

		System.out.println("1.Add account");
		System.out.println("2.Display an account");
		System.out.println("3.Display all account");
		System.out.println("4.Remove an account");
		System.out.println("5.withdraw");
		System.out.println("6.Deposit");
		System.out.println("7.Transfer");
		System.out.println("8.Seach account");
		System.out.println("9.exit");

		for (int i = 0; i < 10; i++) {
			System.out.print("-");
		}
		System.out.print("\nRequired service : ");

		Scanner cin = new Scanner(System.in);
		int choice = cin.nextInt();
		cin.nextLine(); // for buffer clean up

		return choice;
	}

	public static void main(String args[]) {

		test3ebank ob1 = new test3ebank();
		boolean flags = false;

		
		ob1.addaccount("shubh", "shub@", "9898989898");
		ob1.addaccount("vikas", "viks@", "9898989898");
		ob1.addaccount("naman", "naman@", "9898989898");
		
		
		
		while (!flags) {

			System.out.print("\n\tWELCOME TO EBANK");
			System.out.println("\t\t\t\t|Input token for service|");
			System.out.println("\t---------------");

			System.out.println("Banking Services :-\n");

			System.out.println("1.Add account");
			System.out.println("2.Display an account");
			System.out.println("3.Display all account");
			System.out.println("4.Remove an account");
			System.out.println("5.withdraw");
			System.out.println("6.Deposit");
			System.out.println("7.Transfer");
			System.out.println("8.Seach account");
			System.out.println("9.check account bal");
			System.out.println("10.exit");

			for (int i = 0; i < 10; i++) {
				System.out.print("-");
			}
			System.out.print("\nRequired service : ");

			Scanner cin = new Scanner(System.in);
			int choice = cin.nextInt();
			cin.nextLine(); // for buffer clean up

			

			
			switch (choice) {

				// ----------------------------------------------------------------------

				case 1:

					System.out.println("\n\n\t1.Addaccount service\n");
					ob1.addaccount();

					System.out.println("ACCOUNT SUCCESSFULLY REGISTERED");

					// System.out.println("return to main menu press 1");
					// int num = cin.nextInt();
					// if(num == 1) {
					// num = mainmenu();

					// }
					// return to main menu

					break;
				// ---------------------------------------------------------------------- //done

				// ----------------------------------------------------------------------
				case 2:
					// cls.ClearConsole();
					System.out.println("\n\n\t2.Display an account"); /// not accepting the user input string
					System.out.print("ENTER ACCOUNT HOLDER NAME : ");
					String name = cin.nextLine();
					System.out.println(name);
					// ob1.showacc();
					ob1.dispacc(name);
					break;
				// --------------------------------------------------------------------------------
				// //done

				// ----------------------------------------------------------------------

				case 3:
					System.out.println("\n\n\t3.Display all account");
					ob1.traverse();
					System.out.println("records...");
					break;
				// ---------------------------------------------------------------------- //done

				// ----------------------------------------------------------------------

				case 4:
					System.out.println("\n\n\t4.Remove an account");
					System.out.println("BUILDING....");

					break;

				// ----------------------------------------------------------------------
				// //garbage collector needed

				// ----------------------------------------------------------------------

				case 5:
					System.out.println("\n\n\t5.withdraw");
					int bal = 0;
					String value = null;
					System.out.println("ENTER ACCOUNT HOLDER NAME :");
					value = cin.nextLine();
					test2 test = ob1.find(value);
					if (value != null) {
						System.out.println("ENTER AMOUNT :");
						bal = cin.nextInt();
						test.withdraw(bal);
					}
					break;
				// ----------------------------------------------------------------------//done

				// ----------------------------------------------------------------------//done

				case 6:
					System.out.println("6.Deposit");
					int bal2 = 0;
					String value2 = null;
					System.out.println("ENTER ACCOUNT HOLDER NAME :");
					value = cin.nextLine();
					test2 test2 = ob1.find(value);
					if (test2 != null) {
						System.out.println("ENTER AMOUNT :");
						bal2 = cin.nextInt();
						test2.deposit(bal2);
						System.out.println(test2.getname() + " your account is successfully credited with $" + bal2);
					}
					System.out.println("thankyou for using the services");
					break;

				// ----------------------------------------------------------------------//done

				// ----------------------------------------------------------------------//done

				case 7:
					System.out.println("\n\n\t7.Transfer");
					int bal3 = 0;
					String src = null;
					String dest = null;

					System.out.println("ENTER ACCOUNT HOLDER NAME :");
					src = cin.nextLine();

					System.out.println("ENTER RECIEVER  NAME :");
					dest = cin.nextLine();

					System.out.println("ENTER AMOUNT :");
					bal3 = cin.nextInt();

					boolean flag = ob1.transfer(src, dest, bal3);

					test2 t1 = ob1.find(src);
					test2 t2 = ob1.find(dest);

					if (flag == true) {
						System.out.println(t1.getname() + " your account is suuccessfully debited with $" + bal3
								+ " remaining balance is $" + t1.getbalance());
						System.out.println(t2.getname() + " your account is suuccessfully credited with $" + bal3
								+ " remaining balance is $" + t2.getbalance());

						System.out.println("Transaction successful...");
					}
					break;

				// ----------------------------------------------------------------------//done

				// ----------------------------------------------------------------------//done

				case 8:
					System.out.println("8.Seach account by email , name , phno");

					System.out.print("SEARCH HERE : ");
					String name2 = cin.nextLine();
					System.out.println(name2);
					// ob1.showacc();
					ob1.dispacc(name2);
					break;

				// ----------------------------------------------------------------------//done

				case 9:
					String src2;
					System.out.println("ENTER ACCOUNT HOLDER NAME :");
					src2 = cin.nextLine();
					test2 t3 = ob1.find(src2);

					System.out.println(t3.getname() + " your account balance is $" + t3.getbalance());
					break;

				case 10:
					System.out.println("\n\n\t\t\t\tTHANK YOU ..");
					return;

			}

			int ans;

			System.out.print("\npress 1 for main menu : ");
			ans = cin.nextInt();
			if (ans == 1) {
				flags = false;
			} else {
				flags = true;
				System.out.println("\n\n\t\t\t\tTHANK YOU ..");
			}

		}

	}

}

// crises
// -----------
// 1.how to clear screen
// 2.how to go to main menu again : done
