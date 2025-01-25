package Single_Inheritance;

interface Worker {
    void performDuties();
}

 class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    private String speciality;

    public Chef(String name, String id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking " + speciality + " dishes");
    }
}

class Waiter extends Person implements Worker {
    private String section;

    public Waiter(String name, String id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers in " + section + " section");
    }
 }
  public class Restaurant_Management{

    public static void main(String[] args) {
        Worker chef = new Chef("Yogesh", "D25", "Indian");
        Worker waiter = new Waiter("Rajesh", "W252", "Main Hall");

        chef.performDuties();
        waiter.performDuties();
    }
}