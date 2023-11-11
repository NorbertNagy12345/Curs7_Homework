package Exercise2;

public class BRDBank implements BankFunctions{
    @Override
    public String deposit(int amount) {
        System.out.println("BRD: You successfully deposited: "+amount+" amount of money in your account");
        return "BRD";
    }

    @Override
    public String withdraw(int amount) {
        System.out.println("BRD: You successfully withdraw: "+amount+" amount of money from your account");
        return "BRD";
    }
}
