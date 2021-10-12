package com.lti.handson;

import java.util.Scanner;

public class Inheritance {
		public static void main(String[] args) {
			
		     Last b=new Last();
			b.update();
		}
	}
	class Account{
		int id;
		String name;
		int amount;
		void get() {
			System.out.println("enter acc id:");
			Scanner s=new Scanner(System.in);
	        id=s.nextInt();
	        System.out.println("enter name:");
	        name=s.next();
	        System.out.println("enter amount:");
			amount=s.nextInt();
		    
			}

		void show() {
			System.out.println("id :"+id+" name :"+name);
			System.out.println("amount :"+amount);
		}
		
	}

	class SavingAccount extends Account{
		int intrest;
		
		void cal(int i) {
			System.out.println(amount);
			intrest=i;
			amount=intrest+amount;
	        System.out.println("New amount:"+amount);
			}
	}

	class CurrentAccount extends SavingAccount{
		int draft=1000;
		void data(int i) {
			if(i>1000) {
				System.out.println("extends limit");
			}
			else {
				super.cal(i);
			}	
			}
		}
	class Last extends CurrentAccount
	{
		    void update()
		    {
		    super.get();
		    super.show();
			System.out.println("enter interest");
			Scanner s=new Scanner(System.in);
			intrest=s.nextInt();
		    super.data(intrest);
		}
	}
