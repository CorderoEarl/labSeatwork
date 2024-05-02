public class Dog extends Pet implements Sound,Eat{
    public Dog(String name, String owner){
        super(name, owner);
    }
    
    public String makeSound() {
        return "Arf!";
    }   

    public String eat() {
        return "Eating Dog Food";
    }
}