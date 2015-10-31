class Animal
{
    // Properties of the class...
    public int numberOfLegs;
    public boolean hasWings;

    // Constructor of the class...
    public Animal()
    {
        numberOfLegs = 4;
        hasWings = false;
    }

    // Methods of the class...
    public void talk()
    {
        System.out.println("Hello");
    }
}

class Bird extends Animal
{
    // Properties of the class...
    public boolean canFly;

    // Constructor of the class...
    public Bird()
    {
        numberOfLegs = 2;
        hasWings = true;
        canFly = true;
    }

    // Methods of the class...
    public void fly()
    {
        System.out.println("flap flap");
    }
}

class Eagle extends Bird
{
    // Properties of the class...
    private int numberOfKills;

    // Constructor of the class...
    Eagle()
    {
        numberOfKills = 0;
    }

    // Methods of the class...
    public void attack() 
    {
        numberOfKills++;
    }
}

class AnimalTest
{
    // The main method is the point of entry into the program...
    public static void main(String[] args)
    {
        Animal a = new Animal();
        System.out.println(a.numberOfLegs);
        System.out.println(a.hasWings);
        a.talk();
        // the line below doesn't compile because animal doesn't have this method
        //a.fly();

        Bird b = new Bird();
        System.out.println(b.numberOfLegs);
        System.out.println(b.hasWings);
        System.out.println(b.canFly);
        // the line below doesn't compile because bird doesn't have this variable
        //System.out.println(b.numberOfKills);
        b.talk();
        // the line below doesn't compile because bird doesn't have this method
        //b.attack(); 

        Eagle e = new Eagle();
        // the line below doesn't compile because numberOfKills is private
        //System.out.println(e.numberOfKills);
        System.out.println(e.numberOfLegs);
        System.out.println(e.hasWings);
        e.talk();
        e.attack();
        
        a = b;
        a.talk();
        // the line below doesn't compile because at the time of compiling,
        // a is still an animal and doesn't have a fly method
        //a.fly();
        
        // the line below doesn't compile because b has methods a doesn't have,
        // therefor preventing itself from later trying to get an animal to fly
        //b = a;
        b.talk();
        b.fly();
    }
}
