public class EncapsuleEx{
    private String name;
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }
    public static void main (String [] args){
        EncapsuleEx emp = new EncapsuleEx();
        emp.SetName("Harsh");
        System.out.println(" Employee Name:" + emp.getName());
    }
}