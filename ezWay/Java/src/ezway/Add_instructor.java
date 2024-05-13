package ezway;
import static ezway.DesignCourseMangmentSystem.listOfCourses;
import jaco.mp3.player.MP3Player;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
public class Add_instructor extends javax.swing.JFrame {
    public Add_instructor() {
        initComponents();
        setResizable(false);
        jTextArea1.setVisible(false);
        jLabel9.setVisible(false);
       jLabel10.setVisible(false);
    }
    public static final String SONG="click sound.mp3";
    MP3Player mp3player =new MP3Player(new File(SONG));
    public static final String err ="error sound.mp3";
    MP3Player mp3player2 =new MP3Player(new File(err));
    
   public static ArrayList <Instructor> employee =new ArrayList<Instructor>(); 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldJopTitle = new javax.swing.JTextField();
        jButtonAddPicture = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("DialogInput", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("Enter Data for Instructor");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 400, 33);

        jLabel2.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 84, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 135, 80, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 169, 84, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 210, 84, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setText("Phone");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 250, 84, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setText("Code of course");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 290, 120, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setText("Salary");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 330, 84, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 50, 129, 30);

        jTextField2.setToolTipText("8 charachters at least.");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 130, 129, 30);

        jTextField3.setToolTipText("integer only");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(160, 170, 129, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(160, 210, 129, 30);

        jTextField5.setToolTipText("integer only");
        jPanel1.add(jTextField5);
        jTextField5.setBounds(160, 250, 129, 30);

        jTextField6.setToolTipText("integer only");
        jPanel1.add(jTextField6);
        jTextField6.setBounds(160, 290, 129, 30);

        jTextField7.setToolTipText("integer or float");
        jPanel1.add(jTextField7);
        jTextField7.setBounds(160, 330, 129, 30);

        jButton1.setText("Add to System");
        jButton1.setToolTipText("make sure you have filled all of the above.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 440, 150, 22);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 510, 92, 22);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(330, 330, 234, 204);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel9.setText("Data Entered");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(350, 290, 110, 19);

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(330, 60, 170, 170);

        jButton3.setText("Modifay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 470, 150, 22);

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel11.setText("Jop title");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 370, 73, 25);

        jTextFieldJopTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldJopTitleKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldJopTitle);
        jTextFieldJopTitle.setBounds(160, 370, 129, 30);

        jButtonAddPicture.setText("Add picture");
        jButtonAddPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPictureActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddPicture);
        jButtonAddPicture.setBounds(170, 440, 150, 22);

        jLabel12.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel12.setText("Email");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 90, 73, 30);

        jTextField8.setToolTipText("make sure end with @gmail.com");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(160, 90, 129, 30);

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel13.setText("Instructor image");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(363, 247, 118, 19);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/715-570.jpg"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, -10, 720, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        PrintWriter allDataOfEmoloyees = new PrintWriter(new FileWriter ("allDataOfEmoloyees.txt ",true));
        double salary = Double.parseDouble(jTextField7.getText());
        if(Instructor.searsh(employee,jTextField8.getText())&& jTextField8.getText().endsWith("@gmail.com"))
        {
           if(Course.isCodeAvailable(listOfCourses, jTextField6.getText())){
                if(jTextField8.getText().endsWith("@gmail.com") && jTextField2.getText().length() >= 8 && jTextField1.getText().length() > 0 && jTextField3.getText().length() > 0 &&jTextField4.getText().length() > 0 && jTextField5.getText().length() > 0 && jTextField6.getText().length() > 0 && jTextField7.getText().length() > 0 && jTextFieldJopTitle.getText().length() > 0){
                    mp3player.play();
                    int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextField6.getText());
                    employee.add(new Instructor(employee));
                    employee.get(employee.size() - 1).setName(jTextField1.getText());
                    employee.get(employee.size() - 1).setEmail(jTextField8.getText());
                    employee.get(employee.size() - 1).setPassword(jTextField2.getText());
                    employee.get(employee.size() - 1).setAge(jTextField3.getText());
                    employee.get(employee.size() - 1).setAddress(jTextField4.getText());
                    employee.get(employee.size() - 1).setPhone(jTextField5.getText());
                    employee.get(employee.size() - 1).setRegisteredCourses(listOfCourses.get(indexOfCourse));
                    employee.get(employee.size() - 1).setSalary(salary);
                    employee.get(employee.size() - 1).setJopTitle(jTextFieldJopTitle.getText());
                    jTextArea1.setText(null);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                    jTextField3.setText(null);
                    jTextField4.setText(null);
                    jTextField5.setText(null);
                    jTextField6.setText(null);
                    jTextField7.setText(null);
                    jTextArea1.setVisible(true);
                    jLabel9.setVisible(true);
                    jTextArea1.append("Name :"+employee.get(employee.size() - 1).getName());
                    jTextArea1.append("\nEmail :"+employee.get(employee.size() - 1).getEmail());
                    jTextArea1.append("\nPassword :"+employee.get(employee.size() - 1).getPassword());
                    jTextArea1.append("\nJope title :"+employee.get(employee.size() - 1).getJopTitle());
                    jTextArea1.append("\nAge :"+employee.get(employee.size() - 1).getAge());
                    jTextArea1.append("\nAddress :"+employee.get(employee.size() - 1).getAddress());
                    jTextArea1.append("\nPhone :"+employee.get(employee.size() - 1).getPhone());
                    jTextArea1.append("\nName of Course :"+employee.get(employee.size() - 1).getRegisteredCourses().get(indexOfCourse).getCourseName()); 
                    jTextArea1.append("\nSalary :"+employee.get(employee.size() - 1).getSalary());
                    jTextArea1.append("\n Adding Success");
                    jLabel10.setVisible(true);
                    allDataOfEmoloyees.println("DATA OF EMLOYEE #"+(employee.size() - 1));
                    allDataOfEmoloyees.println("NAME : "+employee.get(employee.size() - 1).getName()+"\n");
                    allDataOfEmoloyees.println("EMAIL : "+employee.get(employee.size() - 1).getEmail()+"\n");
                    allDataOfEmoloyees.println("JOP TITLE : "+employee.get(employee.size() - 1).getJopTitle()+"\n");
                    allDataOfEmoloyees.println("PASSWORD : "+employee.get(employee.size() - 1).getPassword());
                    allDataOfEmoloyees.println("AGE"+employee.get(employee.size() - 1).getAge()+"\n");
                    allDataOfEmoloyees.println("ADDRESS"+employee.get(employee.size() - 1).getAddress()+"\n");
                    allDataOfEmoloyees.println("PHONE : "+employee.get(employee.size() - 1).getPhone()+"\n");
                    allDataOfEmoloyees.println("NAME OF COURSE : "+employee.get(employee.size() - 1).getRegisteredCourses().get(indexOfCourse).getCourseName());
                    allDataOfEmoloyees.println("SALARY : "+employee.get(employee.size() - 1).getSalary()+"\n");
                    allDataOfEmoloyees.println("----------------------------------------------------------------------------------");
                    allDataOfEmoloyees.close();
                    listOfCourses.get(indexOfCourse).setInstructor(employee.get(employee.size() - 1));
                }else{
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, "Enter invalid data", "Adding Failed", JOptionPane.ERROR_MESSAGE);
                }
           }else{
               mp3player2.play();
               JOptionPane.showMessageDialog(this, "The code of Course is not exist ", "Adding Failed", JOptionPane.ERROR_MESSAGE);
           }
        }
        else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "This email already exist change it", "Adding Failed", JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(NumberFormatException e)
        {
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Enter Numeric value only for Password","Adding failed",JOptionPane.ERROR_MESSAGE);
        } 
        catch(IOException e)
        {
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "File Not Exsist ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    mp3player.play();
        Admins_Page back = new Admins_Page();
     back.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       mp3player.play();
       jTextArea1.setText(null);
       jTextField1.setText(null);
       jTextField2.setText(null);
       jTextField3.setText(null);
       jTextField4.setText(null);
       jTextField5.setText(null);
       jTextField6.setText(null);
       jTextField7.setText(null);
       jTextArea1.setVisible(false);
       jLabel9.setVisible(false);
       jLabel10.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonAddPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPictureActionPerformed
       if (evt.getSource() == jButtonAddPicture) {
           mp3player.play();
           JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showOpenDialog(getParent());
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = fileChooser.getSelectedFile();
                    BufferedImage picture = ImageIO.read(file);
                    employee.get(employee.size() - 1).setImageIcon(new ImageIcon( picture));
                    jLabel10.setIcon(employee.get(employee.size() - 1).getImageIcon());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            }
        }

    }//GEN-LAST:event_jButtonAddPictureActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
       
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextFieldJopTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldJopTitleKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
            PrintWriter allDataOfEmoloyees = new PrintWriter(new FileWriter ("allDataOfEmoloyees.txt ",true));
            double salary = Double.parseDouble(jTextField7.getText());
            if(Instructor.searsh(employee,jTextField8.getText())&& jTextField8.getText().endsWith("@gmail.com"))
            {
               if(Course.isCodeAvailable(listOfCourses, jTextField6.getText())){
                    if(jTextField8.getText().endsWith("@gmail.com") && jTextField2.getText().length() >= 8 && jTextField1.getText().length() > 0 && jTextField3.getText().length() > 0 &&jTextField4.getText().length() > 0 && jTextField5.getText().length() > 0 && jTextField6.getText().length() > 0 && jTextField7.getText().length() > 0 && jTextFieldJopTitle.getText().length() > 0){
                        int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextField6.getText());
                        employee.add(new Instructor(employee));
                        employee.get(employee.size() - 1).setName(jTextField1.getText());
                        employee.get(employee.size() - 1).setPassword(jTextField2.getText());
                        employee.get(employee.size() - 1).setAge(jTextField3.getText());
                        employee.get(employee.size() - 1).setAddress(jTextField4.getText());
                        employee.get(employee.size() - 1).setPhone(jTextField5.getText());
                        employee.get(employee.size() - 1).setRegisteredCourses(listOfCourses.get(indexOfCourse));
                        employee.get(employee.size() - 1).setSalary(salary);
                        employee.get(employee.size() - 1).setJopTitle(jTextFieldJopTitle.getText());
                        jTextArea1.setVisible(true);
                        jLabel9.setVisible(true);
                        jTextArea1.append("Name :"+employee.get(employee.size() - 1).getName());
                        jTextArea1.append("\nEmail :"+employee.get(employee.size() - 1).getEmail());
                        jTextArea1.append("\nPassword :"+employee.get(employee.size() - 1).getPassword());
                        jTextArea1.append("\nJope title :"+employee.get(employee.size() - 1).getJopTitle());
                        jTextArea1.append("\nAge :"+employee.get(employee.size() - 1).getAge());
                        jTextArea1.append("\nAddress :"+employee.get(employee.size() - 1).getAddress());
                        jTextArea1.append("\nPhone :"+employee.get(employee.size() - 1).getPhone());
                        jTextArea1.append("\nName of Course :"+employee.get(employee.size() - 1).getRegisteredCourses().get(indexOfCourse).getCourseName()); 
                        jTextArea1.append("\nSalary :"+employee.get(employee.size() - 1).getSalary());
                        jTextArea1.append("\n Adding Success");
                        jLabel10.setVisible(true);
                        allDataOfEmoloyees.println("DATA OF EMLOYEE #"+(employee.size() - 1));
                        allDataOfEmoloyees.println("NAME : "+employee.get(employee.size() - 1).getName()+"\n");
                        allDataOfEmoloyees.println("EMAIL : "+employee.get(employee.size() - 1).getEmail()+"\n");
                        allDataOfEmoloyees.println("JOP TITLE : "+employee.get(employee.size() - 1).getJopTitle()+"\n");
                        allDataOfEmoloyees.println("PASSWORD : "+employee.get(employee.size() - 1).getPassword());
                        allDataOfEmoloyees.println("AGE"+employee.get(employee.size() - 1).getAge()+"\n");
                        allDataOfEmoloyees.println("ADDRESS"+employee.get(employee.size() - 1).getAddress()+"\n");
                        allDataOfEmoloyees.println("PHONE : "+employee.get(employee.size() - 1).getPhone()+"\n");
                        allDataOfEmoloyees.println("NAME OF COURSE : "+employee.get(employee.size() - 1).getRegisteredCourses().get(indexOfCourse).getCourseName());
                        allDataOfEmoloyees.println("SALARY : "+employee.get(employee.size() - 1).getSalary()+"\n");
                        allDataOfEmoloyees.println("----------------------------------------------------------------------------------");
                        allDataOfEmoloyees.close();
                        listOfCourses.get(indexOfCourse).setInstructor(employee.get(employee.size() - 1));
                    }else{
                        mp3player2.play();
                        JOptionPane.showMessageDialog(this, "Enter invalid data", "Adding Failed", JOptionPane.ERROR_MESSAGE);
                    }
               }else{
                   mp3player2.play();
                   JOptionPane.showMessageDialog(this, "The code of Course is not exist ", "Adding Failed", JOptionPane.ERROR_MESSAGE);
               }
            }
            else{
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "This email already exist change it", "Adding Failed", JOptionPane.ERROR_MESSAGE);
            }}
            catch(NumberFormatException e)
            {
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "Enter Numeric value only for Password","Adding failed",JOptionPane.ERROR_MESSAGE);
            } 
            catch(IOException e)
            {
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "File Not Exsist ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldJopTitleKeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_instructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAddPicture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldJopTitle;
    // End of variables declaration//GEN-END:variables
}
