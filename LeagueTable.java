
public class LeagueTable{
    MatchEngine[] games = new MatchEngine[56];
    Team[] t = new Team[8];

    //Manchester United
    // Update goalkeeper
    Goalkeeper t1g = new Goalkeeper("David", "De Gea", "GK", 25, 18, 18, 20);

    // Update defenders
    Defender t1d1 = new Defender("Harry", "Maguire", "CB", 28, 16, 18, 17);
    Defender t1d2 = new Defender("Victor", "Lindelof", "CB", 27, 18, 17, 18);
    Defender t1d3 = new Defender("Aaron", "Wan-Bissaka", "RB", 23, 14, 17, 18);
    Defender t1d4 = new Defender("Luke", "Shaw", "LB", 26, 16, 18, 17);

    // Update midfielders
    Midfielder t1m1 = new Midfielder("Bruno", "Fernandes", "CAM", 28, 17, 18, 16);
    Midfielder t1m2 = new Midfielder("Fred", "Rodrigues", "CM", 28, 16, 17, 16);
    Midfielder t1m3 = new Midfielder("Scott", "McTominay", "CDM", 24, 16, 17, 18);
    Midfielder t1m4 = new Midfielder("Marcus", "Rashford", "LM", 24, 17, 19, 18);

    // Update forwards
    Forwards t1f1 = new Forwards("Mason", "Greenwood", "RW", 20, 18, 17, 16);
    Forwards t1f2 = new Forwards("Edinson", "Cavani", "ST", 34, 17, 18, 17);


    // Chelsea
    Goalkeeper t2g = new Goalkeeper("Édouard", "Mendy", "GK", 30, 18, 17, 19);
    Defender t2d1 = new Defender("Thiago", "Silva", "CB", 37, 18, 17, 18);
    Defender t2d2 = new Defender("Antonio", "Rudiger", "CB", 28, 16, 17, 17);
    Defender t2d3 = new Defender("Ben", "Chilwell", "LB", 25, 16, 18, 17);
    Defender t2d4 = new Defender("Reece", "James", "RB", 22, 17, 18, 16);
    Midfielder t2m1 = new Midfielder("N'Golo", "Kanté", "CDM", 30, 17, 18, 16);
    Midfielder t2m2 = new Midfielder("Mason", "Mount", "CM", 23, 18, 18, 17);
    Midfielder t2m3 = new Midfielder("Christian", "Pulisic", "RM", 23, 18, 19, 18);
    Midfielder t2m4 = new Midfielder("Kai", "Havertz", "LM", 22, 16, 17, 16);
    Forwards t2f1 = new Forwards("Timo", "Werner", "ST", 25, 17, 18, 17);
    Forwards t2f2 = new Forwards("Romelu", "Lukaku", "ST", 28, 18, 17, 18);



    // AC Milan
    Goalkeeper t3g = new Goalkeeper("Gianluigi", "Donnarumma", "GK", 23, 18, 17, 18);
    Defender t3d1 = new Defender("Fikayo", "Tomori", "CB", 24, 17, 18, 16);
    Defender t3d2 = new Defender("Alessio", "Romagnoli", "CB", 27, 16, 17, 18);
    Defender t3d3 = new Defender("Theo", "Hernandez", "LB", 24, 15, 18, 17);
    Defender t3d4 = new Defender("Davide", "Calabria", "RB", 25, 16, 17, 16);
    Midfielder t3m1 = new Midfielder("Franck", "Kessié", "CDM", 25, 17, 18, 17);
    Midfielder t3m2 = new Midfielder("Sandro", "Tonali", "CM", 22, 17, 18, 16);
    Midfielder t3m3 = new Midfielder("Alexis", "Saelemaekers", "RM", 22, 16, 17, 15);
    Midfielder t3m4 = new Midfielder("Brahim", "Díaz", "LM", 22, 16, 18, 16);
    Forwards t3f1 = new Forwards("Olivier", "Giroud", "ST", 35, 17, 16, 17);
    Forwards t3f2 = new Forwards("Zlatan", "Ibrahimović", "ST", 40, 18, 17, 18);

    // Bayern Munich
    Goalkeeper t4g = new Goalkeeper("Alexander", "Nübel", "GK", 25, 18, 18, 19);
    Defender t4d1 = new Defender("David", "Alaba", "CB", 29, 17, 18, 17);
    Defender t4d2 = new Defender("Niklas", "Süle", "CB", 26, 17, 18, 17);
    Defender t4d3 = new Defender("Alphonso", "Davies", "LB", 21, 18, 17, 18);
    Defender t4d4 = new Defender("Benjamin", "Pavard", "RB", 26, 16, 18, 17);
    Midfielder t4m1 = new Midfielder("Leon", "Goretzka", "CM", 26, 18, 18, 18);
    Midfielder t4m2 = new Midfielder("Joshua", "Kimmich", "CDM", 26, 18, 19, 18);
    Midfielder t4m3 = new Midfielder("Leroy", "Sané", "RM", 26, 19, 18, 17);
    Midfielder t4m4 = new Midfielder("Kingsley", "Coman", "LM", 25, 17, 18, 17);
    Forwards t4f1 = new Forwards("Robert", "Lewandowski", "ST", 33, 19, 18, 19);
    Forwards t4f2 = new Forwards("Eric", "Choupo-Moting", "ST", 32, 17, 16, 17);


    // FC Barcelona
    Goalkeeper t5g = new Goalkeeper("Marc-André", "ter Stegen", "GK", 30, 18, 18, 17);
    Defender t5d1 = new Defender("Ronald", "Araújo", "CB", 23, 18, 18, 17);
    Defender t5d2 = new Defender("Gerard", "Piqué", "CB", 35, 17, 16, 17);
    Defender t5d3 = new Defender("Jordi", "Alba", "LB", 33, 16, 17, 18);
    Defender t5d4 = new Defender("Sergi", "Roberto", "RB", 29, 16, 17, 17);
    Midfielder t5m1 = new Midfielder("Pedri", "González", "CM", 19, 18, 19, 17);
    Midfielder t5m2 = new Midfielder("Frenkie", "de Jong", "CM", 25, 18, 18, 18);
    Midfielder t5m3 = new Midfielder("Ousmane", "Dembélé", "RM", 24, 17, 18, 17);
    Midfielder t5m4 = new Midfielder("Sergio", "Busquets", "CDM", 33, 16, 17, 18);
    Forwards t5f1 = new Forwards("Antoine", "Griezmann", "ST", 30, 17, 17, 17);
    Forwards t5f2 = new Forwards("Lionel", "Messi", "ST", 35, 20, 20, 19);


    // Juventus
    Goalkeeper t6g = new Goalkeeper("Wojciech", "Szczęsny", "GK", 31, 18, 18, 19);
    Defender t6d1 = new Defender("Matthijs", "de Ligt", "CB", 22, 19, 18, 18);
    Defender t6d2 = new Defender("Leonardo", "Bonucci", "CB", 34, 19, 17, 18);
    Defender t6d3 = new Defender("Alex Sandro", "LB","LB", 30, 17, 18, 17);
    Defender t6d4 = new Defender("Juan", "Cuadrado", "RB", 34, 14, 18, 16);
    Midfielder t6m1 = new Midfielder("Arthur", "Melo", "CM", 25, 18, 19, 18);
    Midfielder t6m2 = new Midfielder("Aaron", "Ramsey", "CM", 31, 17, 16, 17);
    Midfielder t6m3 = new Midfielder("Federico", "Chiesa", "RM", 24, 16, 17, 16);
    Midfielder t6m4 = new Midfielder("Paul", "Pogba", "LM", 29, 15, 16, 19);
    Forwards t6f1 = new Forwards("Cristiano", "Ronaldo", "ST", 36, 19, 18, 19);
    Forwards t6f2 = new Forwards("Alvaro", "Morata", "ST", 29, 17, 17, 17);


    // Real Madrid
    Goalkeeper t7g = new Goalkeeper("Thibaut", "Courtois", "GK", 29, 19, 18, 18);
    Defender t7d1 = new Defender("Eder", "Militão", "CB", 24, 17, 17, 19);
    Defender t7d2 = new Defender("David", "Alaba", "CB", 29, 17, 19, 17);
    Defender t7d3 = new Defender("Dani", "Carvajal", "RB", 30, 13, 16, 17);
    Defender t7d4 = new Defender("Ferland", "Mendy", "LB", 26, 14, 16, 18);
    Midfielder t7m1 = new Midfielder("Casemiro", "CDM","CDM", 29, 17, 17, 19);
    Midfielder t7m2 = new Midfielder("Luka", "Modrić", "CM", 36, 19, 19, 17);
    Midfielder t7m3 = new Midfielder("Rodrygo", "Goes", "RW", 21, 17, 18, 15);
    Midfielder t7m4 = new Midfielder("Vinícius", "Jr.", "LW", 21, 17, 17, 18);
    Forwards t7f1 = new Forwards("Karim", "Benzema", "ST", 34, 17, 17, 17);
    Forwards t7f2 = new Forwards("Cristiano", "Ronaldo", "ST", 37, 20, 19, 20);


    //Dortmund
    Goalkeeper t8g = new Goalkeeper("Roman", "Weidenfeller", "GK", 33, 17, 17, 16);
    Defender t8d1 = new Defender("Mats", "Hummels", "CB", 24, 17, 18, 19);
    Defender t8d2 = new Defender("Neven", "Subotic", "CB", 22, 18, 17, 18);
    Defender t8d3 = new Defender("Lukasz", "Piszczek", "RB", 25, 13, 16, 18);
    Defender t8d4 = new Defender("Kevin", " Großkreutz", "LB",26 , 12, 15, 17);
    Midfielder t8m1 = new Midfielder("Sven", "Bender", "CM", 28, 18, 16, 16);
    Midfielder t8m2 = new Midfielder("Mario", "Gotze", "CM", 22, 18, 18, 17);
    Midfielder t8m3 = new Midfielder("Jakub", "Blaszczykowski", "RM", 24, 17, 17, 16);
    Midfielder t8m4 = new Midfielder("Ilkay", "Gündogan", "LM", 25, 17, 17, 18);
    Forwards t8f1 = new Forwards("Marco", "Reus", "ST", 22, 18, 18, 19);
    Forwards t8f2 = new Forwards("Robert", "Lewandoski", "ST", 26, 18, 17, 17);

    public void setTeams(){
        t[0] = new Team("Manchester United", 5);
        t[1] = new Team("Chelsea FC", 5);
        t[2] = new Team("AC Milan", 4);
        t[3] = new Team("Bayern Munich", 5);
        t[4] = new Team("FC Barcelona", 5);
        t[5] = new Team("Juventus", 5);
        t[6] = new Team("Real Madrid", 5);
        t[7] = new Team("Borussia Dortmund", 5);
    }

    public String getTeam(int i){
        return t[i].getTeamName();
    }

    public void callMatchEngine(){
        games[0] = new MatchEngine(t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2, t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2); //Manchester United vs Chelsea
        games[1] = new MatchEngine(t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2, t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2); //Manchester United vs AC Milan
        games[2] = new MatchEngine(t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2, t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2); //Manchester United vs Bayern Munich
        games[3] = new MatchEngine(t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2, t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2); //Manchester United vs Barcelona
        games[4] = new MatchEngine(t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2, t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2); //Manchester United vs Juventus
        games[5] = new MatchEngine(t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2, t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2); //Manchester United vs Real Madrid
        games[6] = new MatchEngine(t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2, t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2); //Manchester United vs Dortmund

        games[7] = new MatchEngine(t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2, t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2); //Chelsea vs Manchester United
        games[8] = new MatchEngine(t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2, t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2); //Chelsea vs AC Milan
        games[9] = new MatchEngine(t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2, t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2); //Chelsea vs Bayern Munich
        games[10] = new MatchEngine(t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2, t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2); //Chelsea vs Barcelona
        games[11] = new MatchEngine(t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2, t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2); //Chelsea vs Juventus
        games[12] = new MatchEngine(t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2, t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2); //Chelsea vs Real Madrid
        games[13] = new MatchEngine(t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2, t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2); //Chelsea Dortmund

        games[14] = new MatchEngine(t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2, t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2); //AC Milan vs Manchester United
        games[15] = new MatchEngine(t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2, t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2); //AC Milan vs Chelsea
        games[16] = new MatchEngine(t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2, t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2); //AC Milan vs Bayern Munich
        games[17] = new MatchEngine(t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2, t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2); //AC Milan vs Barcelona
        games[18] = new MatchEngine(t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2, t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2); //AC Milan vs Juventus
        games[19] = new MatchEngine(t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2, t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2); //AC Milan vs Real Madrid
        games[20] = new MatchEngine(t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2, t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2); //AC Milan vs Dortmund

        games[21] = new MatchEngine(t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2, t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2); //Bayern Munich vs Manchester United
        games[22] = new MatchEngine(t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2, t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2); //Bayern Munich vs Chelsea
        games[23] = new MatchEngine(t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2, t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2); //Bayern Munich vs AC Milan
        games[24] = new MatchEngine(t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2, t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2); //Bayern Munich vs Barcelona
        games[25] = new MatchEngine(t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2, t1g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2); //Bayern Munich vs Juventus
        games[26] = new MatchEngine(t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2, t1g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2); //Bayern Munich vs Real Madrid
        games[27] = new MatchEngine(t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2, t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2); //Bayern Munich vs Dortmund

        games[28] = new MatchEngine(t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2, t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2); //Barcelona vs Manchester United
        games[29] = new MatchEngine(t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2, t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2); //Barcelona vs Chelsea
        games[30] = new MatchEngine(t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2, t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2); //Barcelona vs AC Milan
        games[31] = new MatchEngine(t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2, t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2); //Barcelona vs Bayern Munich
        games[32] = new MatchEngine(t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2, t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2); //Barcelona vs Juventus
        games[33] = new MatchEngine(t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2, t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2); //Barcelona vs Real Madrid
        games[34] = new MatchEngine(t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2, t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2); //Barcelona vs Dortmund

        games[35] = new MatchEngine(t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2, t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2); //Juventus vs Manchester United
        games[36] = new MatchEngine(t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2, t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2); //Juventus vs Chelsea
        games[37] = new MatchEngine(t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2, t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2); //Juventus vs AC Milan
        games[38] = new MatchEngine(t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2, t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2); //Juventus vs Bayern Munich
        games[39] = new MatchEngine(t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2, t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2); //Juventus vs Barcelona
        games[40] = new MatchEngine(t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2, t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2); //Juventus vs Real Madrid
        games[41] = new MatchEngine(t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2, t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2); //Juventus vs Dortmund

        games[42] = new MatchEngine(t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2, t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2); //Real Madrid vs Manchester United
        games[43] = new MatchEngine(t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2, t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2); //Real Madrid vs Chelsea
        games[44] = new MatchEngine(t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2, t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2); //Real Madrid vs AC Milan
        games[45] = new MatchEngine(t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2, t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2); //Real Madrid vs Bayern Munich
        games[46] = new MatchEngine(t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2, t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2); //Real Madrid vs Barcelona
        games[47] = new MatchEngine(t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2, t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2); //Real Madrid vs Juventus
        games[48] = new MatchEngine(t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2, t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2); //Real Madrid vs Dortmund

        games[49] = new MatchEngine(t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2, t1g, t1d1, t1d2, t1d3, t1d4, t1m1, t1m2, t1m3, t1m4, t1f1, t1f2); //Dortmund vs Manchester United
        games[50] = new MatchEngine(t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2, t2g, t2d1, t2d2, t2d3, t2d4, t2m1, t2m2, t2m3, t2m4, t2f1, t2f2); //Dortmund vs Chelsea
        games[51] = new MatchEngine(t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2, t3g, t3d1, t3d2, t3d3, t3d4, t3m1, t3m2, t3m3, t3m4, t3f1, t3f2); //Dortmund vs AC Milan
        games[52] = new MatchEngine(t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2, t4g, t4d1, t4d2, t4d3, t4d4, t4m1, t4m2, t4m3, t4m4, t4f1, t4f2); //Dortmund vs Bayern Munich
        games[53] = new MatchEngine(t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2, t5g, t5d1, t5d2, t5d3, t5d4, t5m1, t5m2, t5m3, t5m4, t5f1, t5f2); //Dortmund vs Barcelona
        games[54] = new MatchEngine(t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2, t6g, t6d1, t6d2, t6d3, t6d4, t6m1, t6m2, t6m3, t6m4, t6f1, t6f2); //Dortmund vs Juventus
        games[55] = new MatchEngine(t8g, t8d1, t8d2, t8d3, t8d4, t8m1, t8m2, t8m3, t8m4, t8f1, t8f2, t7g, t7d1, t7d2, t7d3, t7d4, t7m1, t7m2, t7m3, t7m4, t7f1, t7f2); //Dortmund vs Real Madrid

        for(int i=0; i<56; i++){
            games[i].score();
        }
    }

    public int homeScore(int i){
        return games[i].getTeam1Score();
    }

    public int awayScore(int i){
        return games[i].getTeam2Score();
    }

}
