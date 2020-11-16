package UEFA;

public class groupH {

    private int played;

    private int team1wins;
    private int team1loss;
    private int team1draws;
    private int team1points;

    private int team2wins;
    private int team2loss;
    private int team2draws;
    private int team2points;

    private int team3wins;
    private int team3loss;
    private int team3draws;
    private int team3points;

    private int team4wins;
    private int team4loss;
    private int team4draws;
    private int team4points;

    public groupH() {

        manunited(3, 2, 1, 0, 6);
        leipzig(3, 2, 1, 0, 6);
        psg(3, 1, 2, 0, 3);
        basaksehir(3, 1, 2, 0, 3);
        System.out.println(getmanunited());
        System.out.println(getleipzig());
        System.out.println(getpsg());
        System.out.println(getbasaksehir());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
    }

    public void manunited(int played, int team1wins, int team1loss, int team1draws, int team1points) {

        this.played = played;
        this.team1wins = team1wins;
        this.team1loss = team1loss;
        this.team1draws = team1draws;
        this.team1points = team1points;

    }

    public void leipzig(int played, int team2wins, int team2loss, int team2draws, int team2points) {

        this.played = played;
        this.team2wins = team2wins;
        this.team2loss = team2loss;
        this.team2draws = team2draws;
        this.team2points = team2points;

    }

    public void psg(int played, int team3wins, int team3loss, int team3draws, int team3points) {

        this.played = played;
        this.team3wins = team3wins;
        this.team3loss = team3loss;
        this.team3draws = team3draws;
        this.team3points = team3points;

    }

    public void basaksehir(int played, int team4wins, int team4loss, int team4draws, int team4points) {

        this.played = played;
        this.team4wins = team4wins;
        this.team4loss = team4loss;
        this.team4draws = team4draws;
        this.team4points = team4points;

    }

    public String getmanunited() {
        return "Manchester United FC:    [ Played: " + played + "][ Won: " + team1wins + "][ Loss: " + team1loss
                + "][ Drawn: " + team1draws + "][ Point: " + team1points + "]";
    }

    public String getleipzig() {
        return "RB Leipzig:              [ Played: " + played + "][ Won: " + team2wins + "][ Loss: " + team2loss
                + "][ Drawn: " + team2draws + "][ Point: " + team2points + "]";
    }

    public String getpsg() {
        return "Paris Saint-Germain:     [ Played: " + played + "][ Won: " + team3wins + "][ Loss: " + team3loss
                + "][ Drawn: " + team3draws + "][ Point: " + team3points + "]";
    }

    public String getbasaksehir() {
        return "İstanbul Başakşehir:     [ Played: " + played + "][ Won: " + team4wins + "][ Loss: " + team4loss
                + "][ Drawn: " + team4draws + "][ Point: " + team4points + "]";
    }

}
