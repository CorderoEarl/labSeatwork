package number2;

public class Customer {
    private String name;
    private Discount discount;
    private double amount;
  
    public Customer(String name, String type, double amount) {
        this.name = name;
        this.amount = amount;
        setDiscount(type);
      }

    public double getAmount(){
        return amount;
    }

    private void setDiscount(String type) {
        if(type.toLowerCase().equals("student")){
            discount = new Student();
        }
        else if (type.toLowerCase().equals("senior citizen")) {
            discount = new SeniorCitizen();
        }
        else{
            discount = new Regular();
        }
    }

    public double calculateDiscount(double amount) {
        return discount.calculateDiscount(amount);
    }

    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }


}

