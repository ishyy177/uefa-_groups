package UEFA;

public class groupD {

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

    public groupD() {
        liverpool(3, 3, 0, 0, 9);
        ajax(3, 1, 1, 1, 4);
        atalanta(3, 1, 1, 1, 4);
        midtjylland(3, 0, 3, 0, 0);

        System.out.println(getliverpool());
        System.out.println(getajax());
        System.out.println(getatalanta());
        System.out.println(getmidtjylland());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
    }

    public void liverpool(int played, int team1wins, int team1loss, int team1draws, int team1points) {

        this.played = played;
        this.team1wins = team1wins;
        this.team1loss = team1loss;
        this.team1draws = team1draws;
        this.team1points = team1points;

    }

    public void ajax(int played, int team2wins, int team2loss, int team2draws, int team2points) {

        this.played = played;
        this.team2wins = team2wins;
        this.team2loss = team2loss;
        this.team2draws = team2draws;
        this.team2points = team2points;

    }

    public void atalanta(int played, int team3wins, int team3loss, int team3draws, int team3points) {

        this.played = played;
        this.team3wins = team3wins;
        this.team3loss = team3loss;
        this.team3draws = team3draws;
        this.team3points = team3points;

    }

    public void midtjylland(int played, int team4wins, int team4loss, int team4draws, int team4points) {

        this.played = played;
        this.team4wins = team4wins;
        this.team4loss = team4loss;
        this.team4draws = team4draws;
        this.team4points = team4points;

    }

    public String getliverpool() {
        return "Liverpool FC:            [ Played: " + played + "][ Won: " + team1wins + "][ Loss: " + team1loss
                + "][ Drawn: " + team1draws + "][ Point: " + team1points + "]";
    }

    public String getajax() {
        return "AFC Ajax:                [ Played: " + played + "][ Won: " + team2wins + "][ Loss: " + team2loss
                + "][ Drawn: " + team2draws + "][ Point: " + team2points + "]";
    }

    public String getatalanta() {
        return "Atalanta BC:             [ Played: " + played + "][ Won: " + team3wins + "][ Loss: " + team3loss
                + "][ Drawn: " + team3draws + "][ Point: " + team3points + "]";
    }

    public String getmidtjylland() {
        return "FC midtjylland:          [ Played: " + played + "][ Won: " + team4wins + "][ Loss: " + team4loss
                + "][ Drawn: " + team4draws + "][ Point: " + team4points + "]";
    }

}
