
public class Account {
	
		private static double balance;
		public static synchronized void deposit() {
		balance = balance + 5;
		}
		public static synchronized void withdraw() {
		balance = balance - 1;
		}
		public static double getBalance() {
		return balance;
		}
		}

