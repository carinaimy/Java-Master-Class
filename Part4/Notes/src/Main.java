public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println(finalScore);

        int positionOne = calculateHighScorePosition(1000);
        int positionTwo = calculateHighScorePosition(500);
        int positionThree = calculateHighScorePosition(100);
        int positionFour = calculateHighScorePosition(50);

        displayHighScorePosition("Robert",positionOne);
        displayHighScorePosition("Carina",positionTwo);
        displayHighScorePosition("Jack",positionThree);
        displayHighScorePosition("Chloe",positionFour);





    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted *bonus);
            return finalScore;
        }
        return -1;
        //-1 used to indicate error
    };


    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position "+position+" on the high score table.");
    }

    public static int calculateHighScorePosition(int calculatedScore){
//        if(calculatedScore>=1000){
//            return 1;
//        } else if (calculatedScore>=500) {
//            return 2;
//        } else if (calculatedScore>=100) {
//            return 3;
//        }
//        return 4;

        //the other way to write it
        int position = 4;//assuming position 4 will be returned
        if(calculatedScore >= 1000){
            position = 1;
        } else if (calculatedScore >=500) {
            position = 2;
        } else if (calculatedScore >= 100) {
            position = 3;
        }
        return position;
    }
}