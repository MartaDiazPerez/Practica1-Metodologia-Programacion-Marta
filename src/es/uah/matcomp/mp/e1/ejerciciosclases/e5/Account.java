package es.uah.matcomp.mp.e1.ejerciciosclases.e5;

//ZONA DE ATRIBUTOS
public class Account {
    private String id;
    private String name;
    private int balance = 0;
    //ZONA DE METODOS
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    // Metodo para añadir dinero a la cuenta
    public int debit(int amount) {
        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    //Metodo para quitar dinero de la cuenta
    public int transferTo(Account another, int amount) {
        if (amount <= balance){
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    //Para enseñar la informacion de la cuenta
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
