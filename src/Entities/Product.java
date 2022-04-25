package Entities;

public class Product {
    private int ac;
    public String name;
    private double balance;

    public int getAc() {
        return ac;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(int ac, String name, double balance) {
    this.ac = ac;
    this.name = name;
    }

    public void adddeposit(double balance){
        this.balance += balance;
    }
    public void whithdrawn (double balance){
        this.balance -= balance+5;

    }

    public String toString() {
        return "Account:" +  ac+ "\nHolder: "+ name+ "\nBalance:"+"$"+ balance+"\n";
    }


}
