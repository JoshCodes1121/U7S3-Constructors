package partA;


public class PlayerTest {
    public static String Player() {
        String response = "";

        /**
         * Your code goes here
         */

//        Player one = new Player();
//        one.setFields("cam", 2.5, 5);
//
//        Player two = new Player();
//        two.setFields("Karen", 1.2, 15);

        Player one2 = new Player("Carl", 2.3, 22);
        Player two2 = new Player("Katherin", 3.3, 9);

        return response;

    }

    public static void main(String[] args) {
        String playerOutput = Player();
        System.out.print(playerOutput);

    }
}
