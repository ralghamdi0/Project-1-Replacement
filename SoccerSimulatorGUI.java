import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class SoccerSimulatorGUI extends JFrame {
    private JComboBox<String> team1ComboBox;
    private JComboBox<String> team2ComboBox;
    private JButton createTeamButton;
    private JButton addPlayerButton;
    private JButton simulateButton;
    private JTextArea resultTextArea;

    private ArrayList<Team> teams;

    private Team currentTeam; // Used during player creation

    public SoccerSimulatorGUI() {
        setTitle("Soccer Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        teams = new ArrayList<>();

        JLabel team1Label = new JLabel("Team 1:");
        team1ComboBox = new JComboBox<>();
        addTeamsToComboBox();
        createTeamButton = new JButton("Create Team");

        JLabel team2Label = new JLabel("Team 2:");
        team2ComboBox = new JComboBox<>();
        addTeamsToComboBox();
        createTeamButton = new JButton("Create Team");

        addPlayerButton = new JButton("Add Player to Selected Team");
        addPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPlayerToSelectedTeam();
            }
        });

        simulateButton = new JButton("Simulate Game");
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        createTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createTeam();
            }
        });

        simulateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String team1Name = (String) team1ComboBox.getSelectedItem();
                String team2Name = (String) team2ComboBox.getSelectedItem();

                Team selectedTeam1 = findTeam(team1Name);
                Team selectedTeam2 = findTeam(team2Name);

                SoccerGame game = new SoccerGame(selectedTeam1, selectedTeam2);
                game.simulateGame();

                resultTextArea.append("Game Result:\n");
                resultTextArea.append(selectedTeam1.name + " vs. " + selectedTeam2.name + "\n");
                resultTextArea.append(selectedTeam1.name + " Score: " + game.team1Score + "\n");
                resultTextArea.append(selectedTeam2.name + " Score: " + game.team2Score + "\n\n");
            }
        });

        add(team1Label);
        add(team1ComboBox);
        add(createTeamButton);
        add(new JLabel()); // Placeholder
        add(team2Label);
        add(team2ComboBox);
        add(createTeamButton);
        add(addPlayerButton);
        add(simulateButton);
        add(scrollPane);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addTeamsToComboBox() {
        for (Team team : teams) {
            team1ComboBox.addItem(team.name);
            team2ComboBox.addItem(team.name);
        }
    }

    private void createTeam() {
        String teamName = JOptionPane.showInputDialog("Enter Team Name:");
        if (teamName != null && !teamName.trim().isEmpty()) {
            currentTeam = new Team(teamName);
            teams.add(currentTeam);
            team1ComboBox.addItem(teamName);
            team2ComboBox.addItem(teamName);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Team Name");
        }
    }

    private void addPlayerToSelectedTeam() {
        String selectedTeamName = (String) team1ComboBox.getSelectedItem();
        Team selectedTeam = findTeam(selectedTeamName);

        if (selectedTeam != null) {
            String playerName = JOptionPane.showInputDialog("Enter Player Name:");
            if (playerName != null && !playerName.trim().isEmpty()) {
                int speed = Integer.parseInt(JOptionPane.showInputDialog("Enter Player Speed:"));
                int dribbling = Integer.parseInt(JOptionPane.showInputDialog("Enter Player Dribbling:"));
                int shooting = Integer.parseInt(JOptionPane.showInputDialog("Enter Player Shooting:"));

                Player player = new Player(playerName, speed, dribbling, shooting);
                selectedTeam.addPlayer(player);
                JOptionPane.showMessageDialog(null, "Player added to " + selectedTeam.name);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Player Name");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No team selected");
        }
    }

    private Team findTeam(String teamName) {
        for (Team team : teams) {
            if (team.name.equals(teamName)) {
                return team;
            }
        }
        return null;
    }
}