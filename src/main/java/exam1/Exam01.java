package exam1;

public class Exam01 {
    int scoreA =0;
    int scoreB = 0;
    int checkroundA = 0;
    int checkroundB = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        checkroundA+=1;
        scoreA+=15;

             if(checkroundA == 3){
                 scoreA =40;
             }

    }

    public void playerBWin() {
        checkroundB+=1;
        scoreB+=15;

        if(checkroundB == 3){
            scoreB =40;
        }
    }

    public String getScore() {

        if(scoreA==15 && scoreB==15){
            return "Fifteen-All";
        }if(scoreA==30 && scoreB==30){
            return "Thirty-All";
        }if(scoreA==40 && scoreB==40){
            return "Deuce";
        }

        if(scoreA==15){
            return "Fifteen-Love";
        }
        if(scoreA == 30){
            return "Thirty-Love";
        }if(scoreA == 40){
            return "Forty-Love";
        }if(scoreA >40){
            return "Win for Player A";
        }

        if(scoreB == 15){
            return "Love-Fifteen";
        }
        if(scoreB ==30) {
            return "Love-Thirty";
        }if(scoreB == 40){
            return "Love-Forty";
        }if(scoreB >40){
            return "Win for Player B";
        }
        return "Love-All";
    }

}
