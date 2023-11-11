package Exercise1;

public class FacebookAd implements Advertisement {
    private String message;

    public FacebookAd(String message){
        this.message = message;
    }

    @Override
    public void displayAd() {
        System.out.println("Facebook: "+ message);
    }

}
