package Exercise1;

public class EmailAd implements Advertisement {
    private String message;

    public EmailAd(String message){
        this.message = message;
    }

    @Override
    public void displayAd() {
        System.out.println("Email: "+ message);
    }
}
