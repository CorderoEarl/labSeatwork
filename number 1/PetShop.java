public class PetShop {
    public static void main(String[] args) {
        Pet cat = new Pet("Browny", "Earl");
        Eat petEat = new Eat();
        Sound petSound=  new Sound();

        petEat.eat(cat, "cat food");
        petSound.makeSound(cat, "Meow!");

        System.out.println();

        Pet dog = new Pet("Kitty", "Cordero");
        petEat.eat(dog, "dog food");
        petSound.makeSound(dog, "Arf!");
    }
}
