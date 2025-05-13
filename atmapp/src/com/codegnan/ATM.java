package com.codegnan;



public class ATM {
	public Account authenticate(Account[] accounts, int accountCount, String accNum,String pin) {
		for(int i=0;i<accountCount;i++) {
			if(accounts[i]!=null&&accounts[i].getAccountNumber().equals(accNum) && accounts[i].getPin().equals(pin)) {
				return accounts[i];
			}
		}
		return null;
	}
    public void withdraw(Account account,double amount) throws InsufficientBalance {
    	
    		if(amount>account.getBalance() ||amount<100 ){
    			throw new InsufficientBalance("Cannot able to withdraw this amount ");
    
    		}
    		else{
    			account.setBalance(account.getBalance()-amount);
    			System.out.println("Amount Withdraw successfully!... ");	
    			System.out.println("................................");
    		}
    }

    public void deposit(Account account,double amount) throws InsufficientBalance {
    	 if (amount % 100 == 0||amount>100) {
             account.setBalance(account.getBalance() + amount);
             System.out.println("\nDeposit successful!\n");
         } else {
        	 throw new InsufficientBalance("Invalid deposit amount**");
         }
    	 
    }

    public void checkBalance(Account account) {
    	 System.out.println(account.getBalance());
    }

}