
public class CheckingAccount extends Account implements PrintInfo {
        private String CardNo;

    public CheckingAccount(String accountType, String name, double amount, String CardNo) {
        super(accountType, name, amount);
        this.CardNo = CardNo;
    }
        public void withdraw(double amount){
       double withd = super.getAmount();
       withd = withd - amount;
       super.setAmount(withd);
    }
       
    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        this.CardNo = cardNo;
    }

    @Override
    public String printInfo(){
        return "name: " + getName() + "\nID: " + getID() + "\naccountType: " + getAccountType() + "\namount: " + getAmount() + "\ncardNo: " + getCardNo();
    }
}