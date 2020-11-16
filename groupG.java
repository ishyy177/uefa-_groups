package UEFA;

public class groupG {

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

    public groupG() {

        barcelona(3, 3, 0, 0, 9);
        juventus(3, 2, 1, 0, 6);
        kyiv(3, 0, 2, 1, 1);
        ferencvarosi(3, 0, 2, 1, 1);
        System.out.println(getbarcelona());
        System.out.println(getjuventus());
        System.out.println(getkyiv());
        System.out.println(getferencvarosi());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
    }

    public void barcelona(int played, int team1wins, int team1loss, int team1draws, int team1points) {

        this.played = played;
        this.team1wins = team1wins;
        this.team1loss = team1loss;
        this.team1draws = team1draws;
        this.team1points = team1points;

    }

    public void juventus(int played, int team2wins, int team2loss, int team2draws, int team2points) {

        this.played = played;
        this.team2wins = team2wins;
        this.team2loss = team2loss;
        this.team2draws = team2draws;
        this.team2points = team2points;

    }

    public void kyiv(int played, int team3wins, int team3loss, int team3draws, int team3points) {

        this.played = played;
        this.team3wins = team3wins;
        this.team3loss = team3loss;
        this.team3draws = team3draws;
        this.team3points = team3points;

    }

    public void ferencvarosi(int played, int team4wins, int team4loss, int team4draws, int team4points) {

        this.played = played;
        this.team4wins = team4wins;
        this.team4loss = team4loss;
        this.team4draws = team4draws;
        this.team4points = team4points;

    }

    public String getbarcelona() {
        return "FC barcelona:            [ Played: " + played + "][ Won: " + team1wins + "][ Loss: " + team1loss
                + "][ Drawn: " + team1draws + "][ Point: " + team1points + "]";
    }

    public String getjuventus() {
        return "Juventus:                [ Played: " + played + "][ Won: " + team2wins + "][ Loss: " + team2loss
                + "][ Drawn: " + team2draws + "][ Point: " + team2points + "]";
    }

    public String getkyiv() {
        return "FC Dynamo Kyiv:          [ Played: " + played + "][ Won: " + team3wins + "][ Loss: " + team3loss
                + "][ Drawn: " + team3draws + "][ Point: " + team3points + "]";
    }

    public String getferencvarosi() {
        return "Ferencvarosi TC:         [ Played: " + played + "][ Won: " + team4wins + "][ Loss: " + team4loss
                + "][ Drawn: " + team4draws + "][ Point: " + team4points + "]";
    }

}
