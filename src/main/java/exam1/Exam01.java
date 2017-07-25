package exam1;

import static java.lang.StrictMath.abs;

public class Exam01 {
    private final String firstPerson;
    private final String secondPerson;
    private int scoreA = 0;
    private int scoreB = 0;


    public Exam01(String firstPerson, String secondPerson) {
        this.firstPerson   = firstPerson;
        this.secondPerson = secondPerson;
    }


    public void playerAWin() {
        scoreA+=1;

    }

    public void playerBWin() {
        scoreB+=1;
    }

    public String getScore() {
        String[] point = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        if(isWinner()){
            if(scoreA>scoreB){
                return "Win for "+firstPerson;
            }return "Win for "+secondPerson;
        } else if (isDuece()) {
            if (isAdvantage()) {
                if (scoreA > scoreB) {
                    return "Advantage Player A";
                } else {
                    return "Advantage Player B";
                }
            }
            return "Deuce";
        } else if(isEqual()){
                return point[scoreA]+"-All";
        } else if(isNotEqual()){
                return point[scoreA]+"-"+point[scoreB];
        }

        return null;
    }

    public boolean isAdvantage(){
        if(scoreA - scoreB ==1 || scoreB-scoreA==1){
            return true;
        }
        return false;
    }
    public boolean isEqual(){
        if(scoreA == scoreB) {
            return true;
        }
        return false;
    }


    public boolean isNotEqual(){

        if(scoreA!=scoreB) {
            return true;
        }
        return false;
    }

    public boolean isDuece() {
        if(scoreA>=3 && scoreB>=3){
            return true;
        }
        return false;
    }

    public boolean isWinner() {
        if((scoreA>=4 || scoreB>=4)&& (scoreA-scoreB >=2 ||scoreB-scoreA >=2)){
            return true;
        }
        return false;
    }
}