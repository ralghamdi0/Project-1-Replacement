import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        super("Soccer Simulation");
        initComponents();
    }

    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UnitedScore = new javax.swing.JButton();
        ChelseaScore = new javax.swing.JButton();
        javax.swing.JButton milanScore = new javax.swing.JButton();
        BayernScore = new javax.swing.JButton();
        BarcaScore = new javax.swing.JButton();
        JuveScore = new javax.swing.JButton();
        RealScore = new javax.swing.JButton();
        DortmundScore = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SquareFont", 1, 24)); // NOI18N
        jLabel1.setText("         Welcome to Soccer Simulation");


        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Choose a team to simulate the home match for the season ");

        UnitedScore.setText("Manchester United");
        UnitedScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitedScoreActionPerformed(evt);
            }
        });

        ChelseaScore.setText("Chelsea FC");
        ChelseaScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChelseaScoreActionPerformed(evt);
            }
        });

        milanScore.setText("AC Milan");
        milanScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilanScoreActionPerformed(evt);
            }
        });

        BayernScore.setText("Bayern Munich");
        BayernScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayernScoreActionPerformed(evt);
            }
        });

        BarcaScore.setText("FC Barcelona");
        BarcaScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarcaScoreActionPerformed(evt);
            }
        });

        JuveScore.setText("Juventus");
        JuveScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuveScoreActionPerformed(evt);
            }
        });

        RealScore.setText("Real Madrid");
        RealScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealScoreActionPerformed(evt);
            }
        });

        DortmundScore.setText("Borussia Dortmund");
        DortmundScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DortmundScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(UnitedScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ChelseaScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(milanScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BayernScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(BarcaScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JuveScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RealScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DortmundScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UnitedScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ChelseaScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(milanScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BayernScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JuveScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RealScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DortmundScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BarcaScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnitedScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitedScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 0;
        while(next==0){
            if(j!=0){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(0) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }    }//GEN-LAST:event_UnitedScoreActionPerformed

    private void ChelseaScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChelseaScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 7;
        while(next==0){
            if(j!=1){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(1) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }
    }//GEN-LAST:event_ChelseaScoreActionPerformed

    private void MilanScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilanScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 14;
        while(next==0){
            if(j!=2){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(2) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }    }//GEN-LAST:event_MilanScoreActionPerformed

    private void BayernScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayernScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 21;
        while(next==0){
            if(j!=3){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(3) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }
    }//GEN-LAST:event_BayernScoreActionPerformed

    private void BarcaScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarcaScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 28;
        while(next==0){
            if(j!=4){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(4) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }
    }//GEN-LAST:event_BarcaScoreActionPerformed

    private void JuveScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuveScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 35;
        while(next==0){
            if(j!=5){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(5) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }
    }//GEN-LAST:event_JuveScoreActionPerformed

    private void RealScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 42;
        while(next==0){
            if(j!=6){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(6) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }
    }//GEN-LAST:event_RealScoreActionPerformed

    private void DortmundScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DortmundScoreActionPerformed
        LeagueTable seasonone = new LeagueTable();
        seasonone.setTeams();
        seasonone.callMatchEngine();
        int next =0;
        int j = 0;
        int i = 48;
        while(next==0){
            if(j!=7){
                next = JOptionPane.showConfirmDialog(null, seasonone.getTeam(7) + " " + seasonone.homeScore(i)+" : " + seasonone.awayScore(i) + " " + seasonone.getTeam(j), "Click Yes To Play The Next Match!", 0);
            }
            i++;
            j++;
        }
    }//GEN-LAST:event_DortmundScoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BarcaScore;
    private javax.swing.JButton BayernScore;
    private javax.swing.JButton ChelseaScore;
    private javax.swing.JButton DortmundScore;
    private javax.swing.JButton JuveScore;
    private javax.swing.JButton RealScore;
    private javax.swing.JButton UnitedScore;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
