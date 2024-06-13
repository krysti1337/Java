public class Method_Challenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Andrea", calculateHighScorePosition(1000));
        displayHighScorePosition("George", calculateHighScorePosition(500));
        displayHighScorePosition("Lucas", calculateHighScorePosition(100));
        displayHighScorePosition("Nicolas", calculateHighScorePosition(25));


    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed tot get into position " + position + " on the high score");

    }

    public static int calculateHighScorePosition(int playerScore) {
        
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;
    }
}
