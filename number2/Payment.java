package number2;

public class Payment {
    public static void main(String[] args) {
        Customer student = new Customer("Earl", "Student", 100.00);
        Customer senior = new Customer("Rhyne", "Senior Citizen", 100.00);
        Customer regular = new Customer("Corder", "Regular", 100.00);
    
        System.out.println("Student Discounted price is " + student.applyDiscount(student.getAmount()));
        System.out.println("Senior Discounted price is " + senior.applyDiscount(senior.getAmount()));
        System.out.println("Regular price is " + regular.applyDiscount(regular.getAmount()));
    }
}
