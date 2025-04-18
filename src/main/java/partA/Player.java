package partA;

public class Player {

    //Fields
    public String name;
    public double height;
    public int yearsInLeague;

    //Constructor
//Constructor
    public Player(String name, double height, int yearsInLeague){
//        System.out.println("This is a constructor");
        name = this.name;
        height = this.height;
        yearsInLeague = this.yearsInLeague;

        System.out.println(name +"\n" + height+"\n" + yearsInLeague);

    }//end constructor

    //Methods
    public void think(){
        System.out.println("I'll have my win.");
    }

//    public void setFields(String a, double b, int c){
//        name = a;
//        height = b;
//        yearsInLeague = c;
//    }
}
