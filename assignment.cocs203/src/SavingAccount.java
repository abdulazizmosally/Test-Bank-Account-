
public class SavingAccount extends Account implements PrintInfo {
       private String SerialNo;

    public SavingAccount(String name, String accountType, double amount, String serialNo) {
        super(name, accountType, amount);
        this.SerialNo = serialNo;
    }

    public String getSerialNo() {

        return SerialNo;
    }

    public void setSerialNo(String serialNo) {
        SerialNo = serialNo;
    }

    @Override
    public String printinfo(){
        return "name: " + getName() + "\nID: " + getID() + "\naccountType: " + getAccountType() + "\namount: " + getAmount() + "\nSerialNo: " + getSerialNo();
    }
}