package Exercise2;

public class INGBank implements BankFunctions{
    @Override
    public String deposit(int amount) {
        System.out.println("ING: You successfully deposited: "+amount+" amount of money in your account");
        return null;
    }

    @Override
    public String withdraw(int amount) {
        System.out.println("ING: You successfully withdraw: "+amount+" amount of money from your account");
        return null;
    }
}
