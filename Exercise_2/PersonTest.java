class Person
{
    // Properties of the class...
    public String name;
    public int age;
    private int height;

    // Constructor of the class...
    /*
    public Person(String aName, int anAge, int aHeight)
    {
        name = aName;
        age = anAge;
        height = aHeight;
    }
    */

    // Methods of the class...
    public void talk()
    {
        System.out.println("Hi, my name's " + name);
        System.out.println("and my age is " + age);
        System.out.println("and my height is " + height);
        commentAboutAge();
        System.out.println();
    }
    public void commentAboutAge()
    {
        if (age < 5)
        {
            System.out.println("baby");
        }
        if (age == 5)
        {
            System.out.println("time to start school");
        }
        if (age > 60)
        {
            System.out.println("old person");
        }
    }
    public void growOlder()
    {
        age++;
    }
    public void growOlderBy(int years)
    {
        age = age + years;
    }
    public void giveKnighthood()
    {
        name = "Sir " + name;
    }
}

class PersonTest
{
   // The main method is the point of entry into the program...
   public static void main(String[] args)
   {
        Person ls = new Person(/*"Luke Skywalker",34,150*/);
        Person wp = new Person(/*"Winston Peters",48,195*/);

        ls.talk();
        wp.talk();
        wp.growOlder();
        wp.giveKnighthood();
        wp.talk();
        ls.growOlderBy(10);
        System.out.println(ls.name + "'s " + "age is " + ls.age);
   }
}
