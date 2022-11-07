package testing;

import java.util.Scanner;

public class test3ebank {
	
	test2 head = null;
	
	
	public void addaccount(String n , String em  , String ph) {
	
		
		test2 newaccount = new test2(n,em,ph);
		
		
		
		if(head == null) {
			head = newaccount;
			return;
		}
		
		
		test2 temp = head;
		
		while(temp.next != null ) {
			
			temp = temp.next;
			
		}
		
		temp.next = newaccount;
		newaccount.prev = temp;
		
		
	}
	
public void addaccount() { //overloaded form for the addaccont
	
		
		test2 newaccount = new test2();
		
		
		
		if(head == null) {
			head = newaccount;
			return;
		}
		
		
		test2 temp = head;
		
		while(temp.next != null ) {
			
			temp = temp.next;
			
		}
		
		temp.next = newaccount;
		newaccount.prev = temp;
		
		
	}
	
	public void traverse() {
		
		
		test2 temp = head;
		
		if(head == null ) {
			System.out.println("nothing to show");
		}
		
		
		while(temp != null) {
			
			
			temp.show();
			temp = temp.next;
		}
		
		
		
	}
	
	
	
	
	
	
	
	public void del(String value ) {
		
		test2 loc = null;
		test2 ptr = head;
		
		test2 temp = find(value);
		
		 while( ptr !=  null )
		    {
			 
			//System.out.println(ptr);
			//System.out.println(temp);
		   
			if  ( ptr  == temp )
		      {
		        loc = ptr;
		        break;
		      }
		      ptr = ptr.next;
		 }
		 
		 
		   if  ( loc == null )
		      {
				System.out.println("value not found");
		         return ;
		       }
		   if(loc.prev == null) {
			   head = loc.next;
			    //  System.out.println("delete from beg");
			      return;
		   }
		   
		   
		   
		 if  (  loc.next == null )
		       {
			      loc.prev.next = null ; // at the end
			      return;
			   }
		       else
		         {
				 
		         loc.prev.next=loc.next ;
		         loc.next.prev=loc.prev;
		         }
		
	}
	
	
	
	
	public void deleteacc(String  value) 
    {
		
test2 temp = head;
	test2 testing = null;	
		
	if ( head == null)
	  {
	  	System.out.println("\n under flow");
	  	return ;
	  }	
	
	
	while (temp.next != null) { // find the node to delete 
			
			//System.out.println("inside delete loop");
			if(value == temp.getname() ) {
			//	System.out.println("inside delete loop  name");
				testing = temp;
				break;
			}

			if(value == temp.getphno() ) {
				
				testing = temp;
				break;
			}

			if(value == temp.getemail() ) {
				
				testing = temp;
				break;
			}
			
			
			temp = temp.next;
		}
		
		
	//System.out.println(temp.getname());
   test2 ptr = head;

 
//System.out.println("inside delete");
  test2 loc = null;
 while( ptr !=  null )
    {
	 
	//System.out.println(ptr);
	//System.out.println(temp);
   
	if  ( ptr  == temp )//if the head is the culprit and so on
      {
        loc = ptr;
        break;
      }
      ptr = ptr.next;
 }
 
 
   if  ( loc == null )
      {
		System.out.println("value not found");
         return ;
       }
   if(loc.prev == null) {
	   head = loc.next;
	    //  System.out.println("delete from beg");
	      return;
   }
   
   
   
 if  (  loc.next == null )
       {
	      loc.prev.next = null ; // at the end
	      return;
	   }
       else
         {
		 
         loc.prev.next=loc.next ;
         loc.next.prev=loc.prev;
         }
 
 //System.out.println("Deleted value " +  loc.getname());
       
	}

	
	
	
	
	public void dispacc(String value) {
		
		
		test2 temp = head;
		test2 testing = null;

		
		while (temp != null) { // for the verification of the node, which is the node ;
				
				//System.out.println("inside delete loop");
				if(temp.getname().equalsIgnoreCase(value) ) { // need to use this here to get the genuine results
				//	System.out.println("inside delete loop  name");
					testing = temp;
					break;
				}

				if(temp.getphno().equalsIgnoreCase(value) ) {
					
					testing = temp;
					break;
				}

				if(temp.getemail().equalsIgnoreCase(value) ) {
					
					testing = temp;
					break;
				}
				
				
				temp = temp.next;
			}
		if(testing != null) {
		testing.show();
		}else {
		System.out.println("account not found");
		}
	}
	
	
	
	public test2 find(String value ) {
		//need to add password chek here
		
		
		test2 temp = head;
		test2 testing = null;
		while (temp != null) { // for the verification of the node which is the node ;
				
		//		System.out.println("inside delete loop" + temp.getname());
				if(temp.getname().equalsIgnoreCase(value) ) {
					//System.out.println("inside delete loop  name");
					testing = temp;
					break;
				}

				if(temp.getphno().equalsIgnoreCase(value)  ) {
					
					testing = temp;
					break;
				}

				if( temp.getemail().equalsIgnoreCase(value)  ) {
					
					testing = temp;
					break;
				}
				
				
				temp = temp.next;
			}
			
   if(testing == null)
   {
	   System.out.println("account not found");
	  // return testing;
   }
	
	return testing;
	
	
	
	}
	
	
	
	public void withdrawl(String value , int amt ) {
		
		test2 temp = find(value);
		
		if(temp == null) {
			System.out.println("account not found");
			return ;
		}
	boolean flag = false;
	int count =0 ;
	while(!flag) {
	
		
		
		
		if(temp.config() == true ) {
		temp.withdraw(amt);
		flag = true ;
		}
		
		count ++;
		if (count >3) {
			System.out.println("you have exceede the limit try next time ");
			break;
		}
		
	}
		
	}
	

	public void deposit(String value , int amt ) {
		
		test2 temp = find(value);

		if(temp == null) {
			System.out.println("account not found");
			return;
		}
	    int curbal  = temp.getbalance();
	    
	    
	    curbal = curbal + amt;
	    
		temp.setbalance(curbal);
		
	}
	
	
	
	public boolean transfer(String src , String dst , int value ) {
		
		test2 source = find(src);
		test2 dest = find(dst);
		
		
		if(source == null || dst == null) {
			
			System.out.println("transaction denied");
			return false;
		}
		
		
		boolean flag = (boolean) source.withdraw(value);
		if (flag != true ) {
			
			System.out.println("transaction denied");
			return false;
		}
	//	int bal2 = source.getbalance();
	//	bal2 = bal2 - value;
		
		//source.setbalance(bal2);
		
		dest.deposit(value);
		return true;
		
	}
	
	
	
	
	
	public static void main(String args []) {
		
	}
	
	
	
	
	

}
