import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private static double annualInterestRate=0;
    private Date dateCreated;


    public Account(){
        this.dateCreated = new Date();

    }

    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double setAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*((this.getMonthlyInterestRate())/100);
    }

    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }





}
