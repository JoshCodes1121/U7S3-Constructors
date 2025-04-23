package partB;

public class Constructor {
    public static String Constructor() {
        String response = "";

        /**
         * Your code goes here
         */



        return response;
    }

    private String name;

    public Constructor(String name){
    System.out.println("The Constructor is being called:");

    this.name = name;
}
//
//    public void outputs(){
//        System.out.println("The name is "+ name);
//    }//you can use this method involving a method &

    public static void main(String[] args) {
        String output = Constructor();
        System.out.print(output);

        Constructor three = new Constructor("Francis");
        System.out.println("The name is "+ three.name);//or print directly from main method
//        three.outputs();//this call
    }
}
