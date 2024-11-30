//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1122,20000);
        acc.setAnnualInterestRate(4.5);

        acc.withdraw( 2500);
        acc.deposit(3000);

        System.out.println("balance = "+ acc.getBalance() );
        System.out.println("Monthly Interest = $"+ acc.getMonthlyInterest() );
        System.out.println("account creation date : " + acc.getDateCreated());


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}
