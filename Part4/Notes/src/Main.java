public class Main {
    //final - cannot change the value
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value.";
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

        //method overloading - same method name but different parameters
        int newScore = calculateScore("Tim", 500);
        System.out.println("new score is "+ newScore);
        newScore = calculateScore(100); //overload method
        System.out.println("unamed score is "+ newScore);
        calculateScore();//overload method

        System.out.println("It's "+calcFeetAndInchesToCentimeters(172)+" centimeters.");

        System.out.println(getDurationString(65,9));
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

    //method overloading
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+"scored "+score+" points");
        return score * 1000;
    }
    public static int calculateScore( int score){
        System.out.println("unamed scored" + score  + "points");
        return score * 1000;
    }

    public static int calculateScore( ){
        System.out.println("no player no scored");
        return 0;
    }

    //Overloading Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches >12){
            System.out.println("invalid data");
            return -1;
        }
        //calculate how many centimeters
        double centimeter = (feet*12 + inches) * 2.54;
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double result = 0;
        if(inches>=0){
            //calculate how many feet
            double feet = (int)inches/12;
            double remainingInches = inches%feet;
            System.out.println(inches+" inches is equal to "+feet+
                    " feet and "+remainingInches+" inches.");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return -1;
    }

    private static String getDurationString (long minutes, long seconds){
        if (minutes<0 || seconds<0 || seconds>59){
            return INVALID_VALUE_MESSAGE;
        }
        long calcHours = minutes / 60;
        long remainingMins  = minutes % 60;
        String hourStr = Long.toString(calcHours);
        String minStr = Long.toString(remainingMins);
        String secStr = Long.toString(seconds);
        if(calcHours<10){
            hourStr = "0"+hourStr;
        }
        if(remainingMins<10){
            minStr = "0"+minStr;
        }
        if(seconds<10){
            secStr = "0"+secStr;
        }
        return hourStr+" h "+ minStr+ " m "+ secStr+" s";
    }

    private static String getDurationString (long seconds){
        if (seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        //calc minutes
        long calcMinutes = seconds/60;
        long remainingSeconds = seconds%60;
        return getDurationString(calcMinutes, remainingSeconds);
    }
}