package UEFA;

public class groupF {

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

    public groupF() {

        dortmund(3, 2, 1, 9, 6);
        lazio(3, 1, 0, 2, 5);
        brugge(3, 1, 1, 1, 4);
        zenit(3, 0, 2, 1, 1);

        System.out.println(getdortmund());
        System.out.println(getlazio());
        System.out.println(getbrugge());
        System.out.println(getzenit());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
    }

    public void dortmund(int played, int team1wins, int team1loss, int team1draws, int team1points) {

        this.played = played;
        this.team1wins = team1wins;
        this.team1loss = team1loss;
        this.team1draws = team1draws;
        this.team1points = team1points;

    }

    public void lazio(int played, int team2wins, int team2loss, int team2draws, int team2points) {

        this.played = played;
        this.team2wins = team2wins;
        this.team2loss = team2loss;
        this.team2draws = team2draws;
        this.team2points = team2points;

    }

    public void brugge(int played, int team3wins, int team3loss, int team3draws, int team3points) {

        this.played = played;
        this.team3wins = team3wins;
        this.team3loss = team3loss;
        this.team3draws = team3draws;
        this.team3points = team3points;

    }

    public void zenit(int played, int team4wins, int team4loss, int team4draws, int team4points) {

        this.played = played;
        this.team4wins = team4wins;
        this.team4loss = team4loss;
        this.team4draws = team4draws;
        this.team4points = team4points;

    }

    public String getdortmund() {
        return "Borussia Dortmund:       [ Played: " + played + "][ Won: " + team1wins + "][ Loss: " + team1loss
                + "][ Drawn: " + team1draws + "][ Point: " + team1points + "]";
    }

    public String getlazio() {
        return "SS Lazio:                [ Played: " + played + "][ Won: " + team2wins + "][ Loss: " + team2loss
                + "][ Drawn: " + team2draws + "][ Point: " + team2points + "]";
    }

    public String getbrugge() {
        return "Club Brugge:             [ Played: " + played + "][ Won: " + team3wins + "][ Loss: " + team3loss
                + "][ Drawn: " + team3draws + "][ Point: " + team3points + "]";
    }

    public String getzenit() {
        return "FC Zenit:                [ Played: " + played + "][ Won: " + team4wins + "][ Loss: " + team4loss
                + "][ Drawn: " + team4draws + "][ Point: " + team4points + "]";
    }

}