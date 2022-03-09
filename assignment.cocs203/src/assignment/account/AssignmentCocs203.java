package assignment.cocs203;


public class AssignmentCocs203 {

   
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------\n" +
                           "---------------- welcome To Samba Bank Group --------------\n" +
                           "-----------------------------------------------------------\n\n");

        SavingAccount FirstAccount = new SavingAccount("Hassan Wasfi",  "Saving Account", 30000, "32");
        CheckingAccount SecondAccount = new CheckingAccount("Ahmad Khoj", "Checking Account", 35000, "0231");

        System.out.println(FirstAccount.printinfo());

        System.out.println("================= Hassan Wasfi Acount =====================");
        System.out.println("Hassan Wasfi Account information after depositing: 40000\n");
        FirstAccount.deposit(40000);
        System.out.println(FirstAccount.printinfo() + "\n");

        System.out.println("================= Ahmad Khoj Account =====================");
        System.out.println(SecondAccount.printinfo()+"\n");

        System.out.println("================= Ahmad Khoj Account =====================");
        System.out.println("Ahmad Khoj Account information after depositing: 40000\n");
        SecondAccount.deposit(40000);
        System.out.println(SecondAccount.printinfo() + "\n");

        System.out.println("================= Ahmad Khoj Account =====================");
        System.out.println("Ahmad Khoj account after withdraw: 2000");
        SecondAccount.withdraw(2000);
        System.out.println(SecondAccount.printinfo() + "\n");

        System.out.println("=============================================");
        ArrayList<Account> list = new ArrayList();
        list.add(FirstAccount);
        list.add(SecondAccount);
        int i ;
        for (i = 0; i <list.size();i++)
            System.out.println(list.get(i).printInfo());
    }
}
