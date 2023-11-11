package Exercise1;

public class PrintAd implements Advertisement {

    private String message;

    public PrintAd(String message){
        this.message = message;
    }

    @Override
    public void displayAd() {
        System.out.println("Print: "+ message);
    }
}
