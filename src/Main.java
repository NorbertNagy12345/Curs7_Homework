import Exercise1.EmailAd;
import Exercise1.FacebookAd;
import Exercise1.PrintAd;
import Exercise2.BRDBank;
import Exercise2.BTBank;
import Exercise2.INGBank;

public class Main {
    public static void main(String[] args) {
        new FacebookAd("This ad was published to facebook").displayAd();
        new EmailAd("This ad was sent via Email").displayAd();
        new PrintAd("This ad was printed on paper").displayAd();

        new INGBank().deposit(2000);
        new INGBank().withdraw(2000);

        new BRDBank().deposit(1000);
        new BRDBank().withdraw(1000);

        new BTBank().deposit(3000);
        new BTBank().withdraw(3000);
    }
}
