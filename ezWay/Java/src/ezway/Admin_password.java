package ezway;

import javax.swing.JOptionPane;
import static ezway.DesignCourseMangmentSystem.o;
import static ezway.DisplayAllDataOFEmployees.g;
import jaco.mp3.player.MP3Player;
import java.awt.event.KeyEvent;
import java.io.File;

public class Admin_password extends javax.swing.JFrame {
    static Admin_password k = new Admin_password();
    public Admin_password() {
       // setResizable(false);
        initComponents();
        setResizable(false);
    }
     public static final String SONG="click sound.mp3";
    MP3Player mp3player =new MP3Player(new File(SONG));
    public static final String err ="error sound.mp3";
    MP3Player mp3player2 =new MP3Player(new File(err));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Please Enter you password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 40, 310, 29);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 180, 149, 21);

        jButton1.setText("Ok");
        jButton1.setToolTipText("make sure you have filled all of the above.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 140, 70, 30);

        jTextField1.setToolTipText("8 charachters at least.");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 90, 170, 30);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 210);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 210, 80, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/420-320.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, -4, 420, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a=0;
        Admins [] adminsInformation =new Admins[2];
        adminsInformation[0] =new Admins();
        adminsInformation[0].setName("Ahmed Hussien");
        adminsInformation[0].setPassword("1254asw");
        adminsInformation[1] =new Admins();
        adminsInformation[1].setName("Ahmed Hamdy");
        adminsInformation[1].setPassword("1254aswt");
        String p = jTextField1.getText();
        for(int i=0 ; i<2 ; i++)
        {
            if(adminsInformation[i].getPassword().compareTo(p)==0)
            {
                mp3player.play();
                a=1;
            }
        }
        if(a==1)
        {
           g.setVisible(true);
           k.setVisible(false);
           jTextField1.setText(null);
        }
        else
        {
         mp3player2.play();
            JOptionPane.showMessageDialog(this,"This Password Not Valid");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    mp3player.play();
        o.setVisible(true);
        k.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int a=0;
            Admins [] adminsInformation =new Admins[2];
            adminsInformation[0] =new Admins();
            adminsInformation[0].setName("Ahmed Hussien");
            adminsInformation[0].setPassword("1254asw");
            adminsInformation[1] =new Admins();
            adminsInformation[1].setName("Ahmed Hamdy");
            adminsInformation[1].setPassword("1254aswt");
            String p = jTextField1.getText();
            for(int i=0 ; i<2 ; i++)
            {
                if(adminsInformation[i].getPassword().compareTo(p)==0)
                {
                    mp3player.play();
                    a=1;
                }
            }
            if(a==1)
            {
               g.setVisible(true);
               k.setVisible(false);
               jTextField1.setText(null);
            }
            else
            {
             mp3player2.play();
                JOptionPane.showMessageDialog(this,"This Password Not Valid");
            }
        }
    }//GEN-LAST:event_jTextField1KeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               // new Admin_password().setVisible(true); 
            k.setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
