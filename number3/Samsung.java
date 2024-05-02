package number3;

public class Samsung implements Message, Call, Browser, Camera{
    public void makeCalls(String number) {
        System.out.println("Samsung is Calling " + number);
    }

    public void sendSMS(String number, String message) {
        System.out.println("Samsung Sending message: " + message + " to " + number);
    }

    public void browseWeb(String url) {
        System.out.println("Samsung Browsing on the " + url);
    }

    public void takePicture() {
        System.out.println("Samsung Took a picture");
    }
}
