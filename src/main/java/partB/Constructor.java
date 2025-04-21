package partB;

public class Constructor {
    public static String Constructor() {
        String response = "";

        /**
         * Your code goes here
         */



        return response;
    }

    public String name;

public Constructor(String name){
    System.out.println("This Constructor is being called:"+ "\n");

    this.name = name;
}
    public static void main(String[] args) {
        String output = Constructor();
        System.out.print(output);

        Constructor three = new Constructor("James");

    }
}
