package exam1;

public class Exam01 {
    int scoreA =0;
    int scoreB = 0;
    int checkroundA = 0;
    int checkroundB = 0;
    int turn =0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        turn+=1;
        checkroundA+=1;
        scoreA+=15;

             if(checkroundA == 3){
                 scoreA =40;
             }

    }

    public void playerBWin() {
        turn+=1;
        checkroundB+=1;
        scoreB+=15;

        if(checkroundB == 3){
            scoreB =40;
        }
    }

    public String getScore() {

        if(turn>7 && checkroundA-checkroundB>=2){
            return "Win for Player A";
        }
        if(turn>7 && checkroundB-checkroundA>=2){
            return "Win for Player B";
        }
        if(checkroundA>=4 && turn>=7 && checkroundB<checkroundA){
            return "Advantage Player A";
        }
        if(checkroundB>=4 && turn>=7 && checkroundA<checkroundB){
            return "Advantage Player B";
        }
        if(turn==6 && scoreA>40){
            return "Win for Player A";
        }
        if(turn==6 && scoreB>40){
            return "Win for Player B";
        }
        if(turn==5 && scoreA == 40){

            return "Forty-Thirty";
        }
        if(turn==5 && scoreB == 40){

            return "Thirty-Forty";
        }
        if(scoreA==15 && scoreB==30){

            return "Fifteen-Thirty";
        }
        if(scoreA==30 && scoreB==15){
            return "Thirty-Fifteen";
        }if(scoreA==40 && scoreB== 15){
            return "Forty-Fifteen";
        }
        if(scoreA==15 && scoreB== 40){
            return "Fifteen-Forty";
        }
        if(checkroundA==4 && checkroundA>checkroundB){
            return "Win for Player A";
        }
        if(checkroundB==4 && checkroundB>checkroundA){
            return "Win for Player B";
        }



        if(scoreA==15 && scoreB==15){
            return "Fifteen-All";
        }if(scoreA==30 && scoreB==30){
            return "Thirty-All";
        }if(scoreA==40 && scoreB==40){
            return "Deuce";
        }
        if((scoreA>40 && scoreB>40)&&checkroundA==checkroundB){
            return "Deuce";
        }

        if(turn == 1){
            if(checkroundA==1){
                return "Fifteen-Love";
            }else{
                return "Love-Fifteen";
            }
        }
        if(turn == 2){
            if(checkroundA==2){
                return "Thirty-Love";
            }else if(checkroundB ==2){
                return "Love-Thirty";
            }else{
                return "Fifteen-All";
            }
        }
//        if(scoreA==15){
//            return "Fifteen-Love";
//        }
//        if(scoreA == 30){
//            return "Thirty-Love";
//        }
        if(scoreA == 40){
            return "Forty-Love";
        }if(scoreA >40){
            return "Win for Player A";
        }

//        if(scoreB == 15){
//            return "Love-Fifteen";
//        }
//        if(scoreB ==30) {
//            return "Love-Thirty";
//        }
        if(scoreB == 40){
            return "Love-Forty";
        }if(scoreB >40){
            return "Win for Player B";
        }
        return "Love-All";
    }

}
