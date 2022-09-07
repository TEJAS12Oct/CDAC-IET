package study.aop.beans;



public class AccountBean {
         private int accountId;
         private double balance;
		public int getAccountId() {
			return accountId;
		}
		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
         
        public void withdraw(int amt)
        {
        	balance = balance-amt;
        	System.out.println("after withdrawal balance is "+balance);
        }
         
}
