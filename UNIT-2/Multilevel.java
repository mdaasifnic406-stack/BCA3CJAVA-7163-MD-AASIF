// Program No: 04
// Write a java program to use multilevel inheritance.

class Animal
{
    String name = "Animal";

    void eat()
    {
        System.out.println("The dog can eat.");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("The dog can bark: Bhaou Bhaou");
    }
}

class Puppy extends Dog
{
    void weep()
    {
        System.out.println("The puppy is weeping.");
    }
}

public class Multilevel
{
    public static void main(String args[])
    {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}
