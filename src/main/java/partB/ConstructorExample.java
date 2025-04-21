package partB;

public class ConstructorExample {

    int x = 2; // variable

    public  ConstructorExample() {
        x = 5;
    }//argument

    public static void main(String[] args) {
       ConstructorExample myClass = new  ConstructorExample();
        System.out.println(myClass.x);// prints out 5
    }
}
