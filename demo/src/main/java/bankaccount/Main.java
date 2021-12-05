package bankaccount;

public class Main {
    
    public static void main(String[] args) throws IllegalAccessException {
        
        bankAccount johnAccount = new bankAccount("John" , "123456789", 10000);

        johnAccount.deposit(1000, "1 Deember 2021", " 13:00");
      

        johnAccount.withdrawal(50, "2 December 2021" , "14:00");
       

        bankAccount johnAccount2 = new bankAccount();
        System.out.println("Account Balance is: " + johnAccount2.getAccountBalance());

        bankAccount johnAccount3 = new bankAccount("John", 0);
        System.out.println("Acount balance is: " + johnAccount3.getName() + " for: " + johnAccount3.getAccountBalance());
    }
}
