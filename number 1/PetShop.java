public class PetShop {
    public static void main(String[] args){

        Dog dog = new Dog("Cordero", "Earl"); 
        System.out.println("Dog Name: " + dog.getName());
        System.out.println("Owner: " + dog.getOwner());
        System.out.println("Dog Sound: " + dog.makeSound());
        System.out.println("Dog Food: " + dog.eat());
        System.out.println();

        Cat cat = new Cat("Cordero", "Earl"); 
        System.out.println("Cat Name: " + cat.getName());
        System.out.println("Owner: " + cat.getOwner());
        System.out.println("Cat Sound: " + cat.makeSound());
        System.out.println("Cat Food: " + cat.eat());
        System.out.println();
    }
}