package partA;
import partA.Player;
public class PlayerTest {
    public static String Player() {
        String response = "";

        /**
         * Your code goes here
         */

        Player one = new Player("cam", 2.5, 5);

//      one.setFields("cam", 2.5, 5);

//        System.out.println(one.name+ "\n"+ one.height +  "\n"+ one.yearsInLeague);

        return response;

    }

    public static void main(String[] args) {
        String playerOutput = Player();
        System.out.print(playerOutput);

    }
}
