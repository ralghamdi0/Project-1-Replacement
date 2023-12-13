import java.util.Random;

class SoccerGame {
    Team team1, team2;
    int team1Score;
    int team2Score;

    public SoccerGame(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void simulateGame() {
        Random random = new Random();

        for (int minute = 1; minute <= 90; minute++) {
            simulatePlay(random);

            if (checkForGoal()) {
                handleGoal();
            }
        }

        System.out.println("Game Result:");
        System.out.println(team1.name + " " + team1Score + " - " + team2Score + " " + team2.name);
    }

    private void simulatePlay(Random random) {
        // Simulate a play and update scores, etc.
        // For simplicity, let's say there's a 5% chance of a goal attempt in each minute
        if (random.nextDouble() < 0.05) {
            System.out.println("Goal attempt!");
        }
    }

    private boolean checkForGoal() {
        // Check if a team has scored a goal
        // For simplicity, let's say there's a 2% chance of scoring in each goal attempt
        return new Random().nextDouble() < 0.02;
    }

    private void handleGoal() {
        // Handle scoring logic
        // For simplicity, each goal adds 1 to the team's score
        if (team1Score <= team2Score) {
            team1Score++;
        } else {
            team2Score++;
        }
    }
}