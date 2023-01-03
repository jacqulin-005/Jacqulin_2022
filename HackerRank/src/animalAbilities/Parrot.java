package animalAbilities;

class Parrot implements Animal, Bird {
    
    public void eat() {
        System.out.println("Parrots can eat up to 100 gms in a day");
    }
    
    public void makeSound() {
        System.out.println("Parrots make sound of screech");
    }
    
    public void fly() {
        System.out.println("Parrots can fly up to 50 miles in a day");
    }
}  
