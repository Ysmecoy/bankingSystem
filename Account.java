package bankingSystem;

public class Account {
	// Data fields
		int acc_no;
		String name;
		float amount;
		
		// Method to initialize object
		void insert(int a, String n, float amt) {
			acc_no = a;
			name = n;
			amount = amt;
		}
		
		// deposit method
		
		void deposit(float amt) {
			amount = amount + amt;
			System.out.println(amt + " deposited");
		}
		// withdraw method
		void withdraw(float amt) {
			if(amount < amt) {
				System.out.println("Insuficient Balance");
			}else {
				amount = amount - amt;
				System.out.println(amt + " withdrawn");
			
				}
		}
			// method to check balance
			void checkBalance() {
				System.out.println(amount + " Balance");
				
			}
		// method to display the value og an object
			
			void display() {
				System.out.println("Account number: " + acc_no);
				System.out.println("Name: " + name);
				System.out.println("Balance: " + amount);
				
			}

}
