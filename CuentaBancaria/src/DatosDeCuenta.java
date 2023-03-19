public class DatosDeCuenta {

    private String name;
    private String lastName;
    private double balance;
    private int accountsNumber;

    public DatosDeCuenta(String name, String lastName, double balance, int accountsNumber){
        this.name = name;
        this.lastName = lastName;
        this.balance = balance;
        this.accountsNumber = accountsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountsNumber() {
        return accountsNumber;
    }

    public void setAccountsNumber(int accountsNumber) {

        this.accountsNumber = accountsNumber;
    }



    public String toString() {
        System.out.println("Titular de la cuenta: " + this.name + this.lastName);
        System.out.println("Numero de cuenta: " + this.accountsNumber);
        System.out.println("Saldo de cuenta: " + this.balance);
        return "";
    }





}
