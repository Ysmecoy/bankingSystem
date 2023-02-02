package bankingSystem;

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		a1.insert(832345, "Perez", 1500);
		a1.display();
		a1.checkBalance();
		a1.deposit(3500);
		a1.withdraw(1000);
		a1.checkBalance();
		System.out.println("-------------------------------------------------");
		a2.insert(832346, "Montes", 500);
		a2.display();
		a2.checkBalance();
		a2.deposit(3500);
		a2.withdraw(1000);
		a2.checkBalance();
	}

}
