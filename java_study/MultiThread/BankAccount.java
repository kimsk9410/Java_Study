package MultiThread;

public class BankAccount {

	private int balance = 100;

	 public int getBalance(){
		 return balance;
	 }

	 public synchronized void deposit(int money){
		 balance += money;
	     System.out.println("���� : " + balance + " ( " + money + "��ŭ �Ա� )");
	 }

	 public synchronized void withdraw(int money){
		 balance -= money;
		 System.out.println("���� : " + balance + " ( " + money + "��ŭ ��� )");
	 }
	
}
