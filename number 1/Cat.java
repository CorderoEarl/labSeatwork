public class Cat extends Pet implements Sound,Eat {
    public Cat(String name, String owner){
        super(name,owner);
    }

    public String makeSound() {
        return "Meow!";
    }

    public String eat() {
        return "Eating Cat Food!";
    }
    
    
}