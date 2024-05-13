package ezway;
import static ezway.Add_instructor.employee;
import static ezway.Admin_password.k;
import static ezway.DesignCourseMangmentSystem.listOfCourses;
import static ezway.DisplayAllDataOFEmployees.f;
import static ezway.DisplayAllDataOFEmployees.g;
import static ezway.DesignCourseMangmentSystem.o;
import jaco.mp3.player.MP3Player;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Admins_Page extends javax.swing.JFrame {
    public Admins_Page() {
        initComponents();
        setResizable(false);
        jPanel2.setVisible(false);
        jTextField1.setVisible(false);
        jButton7.setVisible(false);
        jLabel7.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("welcome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(39, 13, 106, 30);

        jButton2.setText("Add new Instructor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(12, 89, 160, 22);

        jButton3.setText("Add new course");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(12, 132, 160, 22);

        jButton5.setText("remove instructor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(12, 217, 160, 22);

        jButton6.setText("remove Course");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(12, 260, 160, 22);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setLayout(null);

        jTextField1.setToolTipText("integer only");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 40, 160, 30);

        jButton7.setText("OK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(30, 80, 100, 22);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 109, 160, 0);

        jLabel2.setText("Enter email of instructor");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 20, 150, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 10, 180, 120);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jTextField2.setToolTipText("integer only");
        jPanel3.add(jTextField2);
        jTextField2.setBounds(10, 40, 160, 30);

        jButton8.setText("OK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(30, 80, 100, 22);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 100, 148, 20);

        jLabel3.setText("Enter code of course");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 20, 120, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(200, 140, 180, 130);

        jButton9.setText("Employee data");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(12, 303, 160, 22);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(12, 364, 80, 22);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton4.setText("Add instructor to course");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(10, 170, 160, 21);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton10.setText("OK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter email of instructor  ");

        jLabel8.setText("Enter code of course");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(200, 220, 180, 170);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/715-570.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-280, 0, 720, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       mp3player.play();
        Add_instructor h =new Add_instructor();
        h.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mp3player.play();
        jPanel2.setVisible(true);
        jTextField1.setVisible(true);
        jButton7.setVisible(true);     
        jPanel4.setVisible(false);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

       String s = jTextField1.getText();
      if(Instructor.removeinstrucrore(employee,s)){
          mp3player.play();
          JOptionPane.showMessageDialog(null,"Done");
          jPanel2.setVisible(false);
      }
       else
      {
          mp3player2.play();
            JOptionPane.showMessageDialog(null,"Email Not Valid", "Error", JOptionPane.ERROR_MESSAGE);
      }  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mp3player.play();
        AddCourseFram c = new AddCourseFram();
        listOfCourses.add(AddCourseFram.i, new Course());
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mp3player.play();
        jPanel3.setVisible(true);
        jTextField2.setVisible(true);
        jButton8.setVisible(true);   
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
String s = jTextField2.getText();
jLabel7.setVisible(true);
if(Course.removeCourse(DesignCourseMangmentSystem.listOfCourses,s))
{  
    mp3player.play();
    jPanel3.setVisible(false);
    JOptionPane.showMessageDialog(null, "Done");
}
else
{
    mp3player2.play();
    JOptionPane.showMessageDialog(null, "This Code Not Valid");
}    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 try{
     mp3player.play();
            PrintWriter allDataOfEmoloyees = new PrintWriter(new FileWriter ("allDataOfEmoloyees.txt ",true));
            allDataOfEmoloyees.println("TOTAL NUMBER OF EMPLOYEES : "+(employee.size()));
           // DisplayAllDataOFEmployees d = new DisplayAllDataOFEmployees();
            f.setVisible(true);
            g.setVisible(false);
        }
        catch(IOException e)
        {
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "File Not Found", "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mp3player.play();
        o.setVisible(true);
        g.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int indexOfinstructor = Instructor.getIndexFromEmail(employee, jTextField3.getText());
        int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextField4.getText());
        if(jTextField3.getText().endsWith("@gmail.com") && jTextField3.getText() != null){
            if(Instructor.isEmailAvailable(employee, jTextField3.getText())){
                if(Course.isCodeAvailable(listOfCourses, jTextField4.getText())){
                    if(listOfCourses.get(indexOfCourse).getInstructor() == null){
                        if(Course.isCodeAvailable(employee.get(indexOfinstructor).getRegisteredCourses(), jTextField4.getText())){
                            listOfCourses.get(indexOfCourse).setInstructor(employee.get(indexOfinstructor));
                            employee.get(indexOfinstructor).setRegisteredCourses(listOfCourses.get(indexOfCourse));
                            jPanel4.setVisible(false);
                            mp3player.play();
                            JOptionPane.showMessageDialog(this, "Done","State",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            mp3player2.play();
                            JOptionPane.showMessageDialog(this, "The instructor added in this Course already","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        mp3player2.play();
                        JOptionPane.showMessageDialog(this, "The course have instructor already","Error",JOptionPane.ERROR_MESSAGE);                    }
                }else{
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, "The code entered is not exist","Error",JOptionPane.ERROR_MESSAGE);                }
            }else{
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "The email entered is not exist","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Invalid data ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel4.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Admins_Page().setVisible(true);
                g.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
