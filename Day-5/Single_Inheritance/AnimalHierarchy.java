abstract class Animal {
    //create the instance of class
    public String name;
    public int age;
    //make Constructor to initialize the instance
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
      public int getAge(){
         return age;
     }
      public String getName(){
       return name;
   }
    //create the astract method
    public abstract void makeSound();
}
//make another class and they are extend the properties of animal class
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Unique implementation of makeSound()
    @Override
    public void makeSound() {
        System.out.println("name of animal :"+name + " barks: Woof Woof");
    }
}

//make Cat subclass
class Cat extends Animal {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Unique implementation of makeSound()
    @Override
    public void makeSound() {
        System.out.println("name of animal :"+name +" sound of "+name + " is meows: Mew Meow");
    }
}

// Bird subclass
class Bird extends Animal {
    // Constructor
    public Bird(String name, int age) {
        super(name, age);
    }

    // Unique implementation of makeSound()
    @Override
    public void makeSound() {
        System.out.println("name of animal is :"+name + " chirps: Tweet Tweet");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create instances of different animals
        Dog dog = new Dog("Dog", 3);
        Cat cat = new Cat("cat", 5);
        Bird bird = new Bird("bird", 2);

        // Demonstrate polymorphic behavior
        Animal[] animals = {dog, cat, bird};
        
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName()+ " Age: " + animal.getAge());
            animal.makeSound();
            
            System.out.println(); // Add a blank line for readability
        }
    }
}