//write a java program of hierarchical inheritence

class Animal{
    void eat(){
    System.out.println("this animal is eating");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("the dog bark woaf! woaf!");
    }
}

class puppy extends Animal{
    void weep(){
        System.out.println("puppy is weeping");
    }
}

public class unit2prog3{

    public static void main (String args[]){
        dog mydog = new dog();
        puppy p = new puppy();

        mydog.eat();
        mydog.bark();

        p.eat();
        p.weep();
    }
}