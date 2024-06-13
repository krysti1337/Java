public class Method_in_Java {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 10000, 8, 200);//There are two ways in which we can give the values to the method

        int highScore = secondCalculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        System.out.println("The next highScore is " +
                secondCalculateScore(true, 10000, 8, 200));


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

        }
    }

    public static int secondCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

}