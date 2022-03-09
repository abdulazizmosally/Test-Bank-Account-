
public class Account {
    private String accountType;
    private String name;
    private double amount;
    private long ID;

    public Account(String name, String accountType, double amount) {
        this.accountType = accountType;
        this.name = name;
        this.amount = amount;
        this.ID = ID;
    }



    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getID() {
        int a = 3000;
        long b = (long) (Math.random() * 2);
        System.out.println(a+b);

        return ID;
    }

    public void setID(long ID) {
       this.ID = ID;
    }

    public void deposit(double amount){
       this.amount+=amount;

    }

    public String printInfo(){
        return "name: \n" + getName() + " ID: \n" + getID() + "accountType: \n" + getAccountType() +  " amount: \n" + getAmount();
    }
}