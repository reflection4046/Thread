
public class Test {
public static void main(String[] args) {
Thread t1 = new Thread(new Runnable() {
@Override
public void run() {
for (int i = 1; i <= 500; i++) {
Account.deposit();
  }
  }
  });
Thread t2 = new Thread(new Runnable() {
@Override
public void run() {
for (int i = 1; i <= 200; i++) {
Account.withdraw();

    }
   }
    });
t1.start();
t2.start();
try {
t1.join();
t2.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println(Account.getBalance());
}
}