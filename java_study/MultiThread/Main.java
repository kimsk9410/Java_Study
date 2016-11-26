package MultiThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankAccount = new BankAccount();

        Thread depositMan = new Thread(){
            public void run(){
            	/*synchronized(bankAccount){
            		for(int i = 0; i < 10; i++){
            			try{
            				bankAccount.deposit(10);
            				Thread.sleep(300);
            			}catch(InterruptedException ie){
            				ie.printStackTrace();
            			}
            		}		
            	}*/
            	
            	for(int i = 0; i < 10; i++){
        			try{
        				bankAccount.deposit(10);
        				Thread.sleep(300);
        			}catch(InterruptedException ie){
        				ie.printStackTrace();
        			}
        		}	
            }
        };

        Thread withdrawMan = new Thread(){
            public void run(){
            	/*synchronized(bankAccount){
            		for(int i = 0; i < 10; i++){
            			try{
            				bankAccount.withdraw(10);
            				Thread.sleep(300);
            			}catch(InterruptedException ie){
            				ie.printStackTrace();
            			}
            		}
            	}*/
            	
            	for(int i = 0; i < 10; i++){
        			try{
        				bankAccount.withdraw(10);
        				Thread.sleep(300);
        			}catch(InterruptedException ie){
        				ie.printStackTrace();
        			}
        		}	
            }
        };

        depositMan.start();
        /*try{
        	depositMan.join();
        }catch(Exception e){
        	
        }*/
        withdrawMan.start();
		
	}

}
