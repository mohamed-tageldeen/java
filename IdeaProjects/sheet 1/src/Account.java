

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate;
    private Date dateCreated;

    public Account (){}
    public Account (int id , double balance ){
        this.id=id;
        this.balance=balance;
    }

    public void setId (int id){
        this.id=id;
    }
    public int getId (){
        return id;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance (){
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate= annualInterestRate;
    }
    public double getAnnualInterestRate (){
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlytInterstRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance * ((getMonthlytInterstRate())/100);
    }
    public void withdraw(double amount){
        balance= balance - amount;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }

}
