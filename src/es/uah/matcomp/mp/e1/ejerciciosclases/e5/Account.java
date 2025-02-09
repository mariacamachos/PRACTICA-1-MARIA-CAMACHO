package es.uah.matcomp.mp.e1.ejerciciosclases.e5;
/**
 * The Account class models a bank account with an ID, name, and balance.
 */

public class Account {
    private String id;
    private String name;
    private int balance;

    /** Constructor with ID, Name, and default balance */
    public Account (String id, String name) {
        this.id = String.valueOf(id);
        this.name = name;
        this.balance = 0;
    }
    /** Constructor with ID, Name, and balance */
    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    /** Returns the id */
    public String getId(){
        return id;
    }
    /** Returns the name */
    public String getName(){
        return name;
    }
    /** Returns the balance */
    public int getBalance(){
        return balance;
    }
    /** This is a method to modify the valor of balance with different conditions */
    public int credit(int amount){
        this.balance = amount + balance;
        return this.balance;
    }
    public int debit(int amount){
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else {
           System.out.println("Amount exceeded balance");
        }
            return balance;
    }
    public int transferTo(Account another, int amount){
        if (amount <= this.balance) {
            this.balance -= amount;
            another.credit(amount);
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    /** Override toString() method */
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + this.balance + "]";
    }
}
