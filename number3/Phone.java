package number3;

public class Phone {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        basicPhone.makeCalls("09958316736");
        basicPhone.sendSMS("09958316731", "Hi");
        
        System.out.println();

        samsung.makeCalls("09958316732");
        samsung.sendSMS("09958316733", "Hello");
        samsung.browseWeb("facebook.com");
        samsung.takePicture();

        System.out.println();

        iphone.makeCalls("09958316734");
        iphone.sendSMS("09958316735", "Good Morning.");
        iphone.browseWeb("instagram.com");
        iphone.takePicture();
    
    }
}
