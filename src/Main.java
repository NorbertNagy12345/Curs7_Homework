import Exercise1.EmailAd;
import Exercise1.FacebookAd;
import Exercise1.PrintAd;

public class Main {
    public static void main(String[] args) {
        new FacebookAd("This ad was published to facebook").displayAd();
        new EmailAd("This ad was sent via Email").displayAd();
        new PrintAd("This ad was printed on paper").displayAd();
    }
}
