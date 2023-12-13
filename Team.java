import java.util.ArrayList;

class Team {
    String name;
    ArrayList<Player> roster;

    public Team(String name) {
        this.name = name;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        roster.add(player);
    }
}
