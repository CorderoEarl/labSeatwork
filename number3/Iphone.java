package number3;

public class Iphone implements Message, Call, Browser, Camera{
    
    public void makeCalls(String number) {
        System.out.println("IPhone is Calling " + number);
    }

    public void sendSMS(String number, String message) {
        System.out.println("Iphone Sending message: " + message + " to " + number);
    }


    public void browseWeb(String url) {
        System.out.println("IPhone Browsing on the " + url);
    }

    public void takePicture() {
        System.out.println("IPhone took a picture");
    }
}
