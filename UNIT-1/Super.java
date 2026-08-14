 class vehicle{
    int speed = 120;
    vehicle(){
        System.out.println("Vehicle Constructer Called");
    }
    void run(){
        System.out.println("Vehicle is running");
    }
 }

    class car extends vehicle{
    int speed = 180;

    car(){
      super();
    }
    void display(){
        System.out.println(" Car Speed: " + speed);
        System.out.println("Vehicle Speed:" + super.speed);
        super.run();

    }
 }

    public class Super{
    public static void main (String []args){
        car c=new car();
        c.display();
    }
 }