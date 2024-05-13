package ezway;

import static ezway.Add_instructor.employee;
import static ezway.Admin_password.k;
import static ezway.DisplayAllDataOFEmployees.f;
import static ezway.DisplayAllDataOFEmployees.g;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;


public class DesignCourseMangmentSystem extends javax.swing.JFrame {
    static DesignCourseMangmentSystem o = new DesignCourseMangmentSystem();
    public DesignCourseMangmentSystem() {
        mp3player3.play();
        setResizable(false);
        initComponents();
        jButtonEnterToExam.setVisible(false);
        jButtonReturnRegisteredCourse.setVisible(false);
        jButtonLastQuastion.setVisible(false);
        jButtonUndo.setVisible(false);
        jLabelExamTitleInStudentPage.setVisible(false);
        LastCoursejButton.setVisible(false);
    }
    
    public static final String SONG="click sound.mp3";
    MP3Player mp3player =new MP3Player(new File(SONG));
    public static final String err ="error sound.mp3";
    MP3Player mp3player2 =new MP3Player(new File(err));
    public static final String wel="audio.mp3";
    MP3Player mp3player3 =new MP3Player(new File(wel));
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel75 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        main = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        b_register = new javax.swing.JButton();
        b_instructor = new javax.swing.JButton();
        b_student = new javax.swing.JButton();
        b_admin = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        registStudent = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        loginStudent = new javax.swing.JPanel();
        emailTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        errorLogInLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        mainOptionsStudent = new javax.swing.JPanel();
        hallowjLabel = new javax.swing.JLabel();
        nameOfStudentjLabel = new javax.swing.JLabel();
        SeeCoursejButton = new javax.swing.JButton();
        RigsteredCoursesjButton = new javax.swing.JButton();
        myAccountjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jScrollPaneSeeCourses = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        CourseImagejLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        coursePricejLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        RegisterNowjButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        objectivejTextArea = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        requirementsjLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CourseNamejTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        languagejLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        codejLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        instructorImagejLabel = new javax.swing.JLabel();
        instructorRatingjLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        reviewsjLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        studentsjLabel = new javax.swing.JLabel();
        coursesjLabel = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        instructorNamejLabel = new javax.swing.JLabel();
        jopTitlejLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionjTextArea = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        contentjTextArea = new javax.swing.JTextArea();
        numberOfSectionjLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        numberOfLecturesjLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        totalHoursjLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        courseRatingjLabel = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel36 = new javax.swing.JLabel();
        fivejLabel = new javax.swing.JLabel();
        fourjLabel = new javax.swing.JLabel();
        threejLabel = new javax.swing.JLabel();
        twojLabel = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();
        onejLabel = new javax.swing.JLabel();
        nextCoursejButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        LastCoursejButton = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        option2Student = new javax.swing.JPanel();
        jLabelnemeOfCourse = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabelNextLec = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelNote = new javax.swing.JLabel();
        jButtonEnterToExam = new javax.swing.JButton();
        jButtonReturnRegisteredCourse = new javax.swing.JButton();
        jButtonNextRegisteredCourse = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabelRegisteredCourseCode = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabelExamTitleInStudentPage = new javax.swing.JLabel();
        jButtonStar1 = new javax.swing.JButton();
        jButtonStar10 = new javax.swing.JButton();
        jButtonStar2 = new javax.swing.JButton();
        jButtonStar4 = new javax.swing.JButton();
        jButtonStar3 = new javax.swing.JButton();
        jButtonStar5 = new javax.swing.JButton();
        jButtonStar6 = new javax.swing.JButton();
        jButtonStar8 = new javax.swing.JButton();
        jButtonStar9 = new javax.swing.JButton();
        jButtonStar7 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        EnterToExam = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaShowQuastion = new javax.swing.JTextArea();
        jButtonOption1 = new javax.swing.JButton();
        jButtonOption2 = new javax.swing.JButton();
        jButtonOption3 = new javax.swing.JButton();
        jButtonOption4 = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabelExamTitle = new javax.swing.JLabel();
        jButtonNextQuastion = new javax.swing.JButton();
        jButtonLastQuastion = new javax.swing.JButton();
        jButtonUndo = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        option3Student = new javax.swing.JPanel();
        NamejLabel = new javax.swing.JLabel();
        firstNamejLabel = new javax.swing.JLabel();
        secondNamejLabel = new javax.swing.JLabel();
        GenderjLabel = new javax.swing.JLabel();
        AgejLabel = new javax.swing.JLabel();
        FacualtyjLabel = new javax.swing.JLabel();
        EmailjLabel = new javax.swing.JLabel();
        PasswordjLabel = new javax.swing.JLabel();
        IDjLabel = new javax.swing.JLabel();
        studentGenderjLabel = new javax.swing.JLabel();
        studentAgejLabel = new javax.swing.JLabel();
        studentFacualtyjLabel = new javax.swing.JLabel();
        studentEmailjLabel = new javax.swing.JLabel();
        studentPasswordjLabel = new javax.swing.JLabel();
        studentRegisteredCoursesjLabel = new javax.swing.JLabel();
        studentIDjLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ChangeInfojButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        changeInfoStudent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        changeFirstNamejLabel = new javax.swing.JLabel();
        changeLastNamejLabel = new javax.swing.JLabel();
        changeAgejLabel = new javax.swing.JLabel();
        changeFacualtyjLabel = new javax.swing.JLabel();
        changeEmailjLabel = new javax.swing.JLabel();
        changePasswordjLabel = new javax.swing.JLabel();
        changeFirstNamejTextField = new javax.swing.JTextField();
        changeLastNamejTextField = new javax.swing.JTextField();
        changeAgejTextField4 = new javax.swing.JTextField();
        changeFacualtyjTextField = new javax.swing.JTextField();
        changeEmailjTextField = new javax.swing.JTextField();
        changePasswordjTextField = new javax.swing.JTextField();
        saveChangesjButton = new javax.swing.JButton();
        invalidDataMassagejLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jRadioButtonChangeGenderToMale = new javax.swing.JRadioButton();
        jRadioButtonChangeGenderToFemale = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        mainOptionsInstructor = new javax.swing.JPanel();
        jButtonUpdateInfoAboutCourse = new javax.swing.JButton();
        jButtonMakeExam = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        option1Instructor = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jTextFieldCourseCodeToUpdate = new javax.swing.JTextField();
        jLabelErrorCourseCodeToUpdate = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        updateInfoAboutCourse = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextFieldUpdateNextLec = new javax.swing.JTextField();
        jTextFieldUpdateDate = new javax.swing.JTextField();
        jTextFieldUpdateTime = new javax.swing.JTextField();
        jButtonUploadExamToStudent = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jTextFieldUpdateNote = new javax.swing.JTextField();
        jButtonSaveUpdate = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        uploadExamToStudent = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextFieldTitleExamToUpload = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel87 = new javax.swing.JLabel();
        option2Instructor = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextFieldNumberOfQ = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextFieldTitle = new javax.swing.JTextField();
        jButtonAddExam = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jTextFieldCourseCode = new javax.swing.JTextField();
        jLabelCodeNotAvailable = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        addQuastionToExam = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaQuastionStatment = new javax.swing.JTextArea();
        jTextFieldOption1 = new javax.swing.JTextField();
        jTextFieldOption2 = new javax.swing.JTextField();
        jTextFieldOption3 = new javax.swing.JTextField();
        jTextFieldCorrectAns = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButtonAddQuastion = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        loginInstructor = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButtonloginInstructor = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        Option3OfInstructor = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jTextFieldCourseCodeToInfoAboutStudent = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton20 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        showinfo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton19 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 610));
        setPreferredSize(new java.awt.Dimension(730, 710));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(730, 710));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(730, 710));

        main.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 102));
        jLabel16.setText("Welcome :)");
        main.add(jLabel16);
        jLabel16.setBounds(12, 13, 160, 40);

        b_register.setText("Register");
        b_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registerActionPerformed(evt);
            }
        });
        main.add(b_register);
        b_register.setBounds(30, 420, 100, 30);

        b_instructor.setText("Instructor");
        b_instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_instructorActionPerformed(evt);
            }
        });
        main.add(b_instructor);
        b_instructor.setBounds(30, 186, 100, 30);

        b_student.setText("Student");
        b_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_studentActionPerformed(evt);
            }
        });
        main.add(b_student);
        b_student.setBounds(30, 270, 100, 30);

        b_admin.setText("Admin");
        b_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adminActionPerformed(evt);
            }
        });
        main.add(b_admin);
        b_admin.setBounds(30, 340, 100, 30);

        jButton15.setText("Add every thing");
        jButton15.setToolTipText("add all stored data");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        main.add(jButton15);
        jButton15.setBounds(30, 110, 145, 22);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/1655304040746.png"))); // NOI18N
        main.add(jLabel92);
        jLabel92.setBounds(200, 10, 490, 480);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        jLabel76.setRequestFocusEnabled(false);
        main.add(jLabel76);
        jLabel76.setBounds(0, 0, 730, 490);

        jTabbedPane1.addTab("main ", main);

        registStudent.setLayout(null);

        jLabel17.setText("Enter your First Name");
        registStudent.add(jLabel17);
        jLabel17.setBounds(140, 110, 158, 30);

        jTextField1.setToolTipText("");
        registStudent.add(jTextField1);
        jTextField1.setBounds(320, 110, 208, 30);

        jLabel21.setText("Enter Your Last Name");
        registStudent.add(jLabel21);
        jLabel21.setBounds(140, 150, 142, 30);

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 102));
        jLabel27.setText("Welcome to Our System");
        registStudent.add(jLabel27);
        jLabel27.setBounds(140, 70, 320, 30);

        jTextField2.setToolTipText("");
        registStudent.add(jTextField2);
        jTextField2.setBounds(320, 150, 208, 30);

        jLabel29.setText("Enter your Age");
        registStudent.add(jLabel29);
        jLabel29.setBounds(140, 190, 111, 30);

        jTextField3.setToolTipText("integer only");
        registStudent.add(jTextField3);
        jTextField3.setBounds(320, 190, 208, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        registStudent.add(jRadioButton1);
        jRadioButton1.setBounds(310, 270, 80, 20);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        registStudent.add(jRadioButton2);
        jRadioButton2.setBounds(420, 270, 100, 20);

        jLabel30.setText("Choose Your Gender");
        registStudent.add(jLabel30);
        jLabel30.setBounds(140, 270, 150, 30);

        register.setText("register");
        register.setToolTipText("make sure you have filled all of the above.");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        registStudent.add(register);
        register.setBounds(360, 390, 90, 22);

        jLabel32.setText("Already have an account?");
        registStudent.add(jLabel32);
        jLabel32.setBounds(140, 450, 160, 30);

        jButton4.setText("back");
        jButton4.setToolTipText("Go back?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        registStudent.add(jButton4);
        jButton4.setBounds(360, 450, 90, 22);

        jLabel33.setText("Enter your Facualty ");
        registStudent.add(jLabel33);
        jLabel33.setBounds(140, 230, 150, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        registStudent.add(jTextField4);
        jTextField4.setBounds(320, 230, 208, 30);

        jLabel35.setText("Write your email address");
        registStudent.add(jLabel35);
        jLabel35.setBounds(140, 310, 160, 30);

        jLabel37.setText("Write your password");
        registStudent.add(jLabel37);
        jLabel37.setBounds(140, 350, 150, 30);

        jTextField5.setToolTipText("make sure end with @gmail.com");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        registStudent.add(jTextField5);
        jTextField5.setBounds(320, 310, 208, 30);

        jTextField6.setToolTipText("8 charachters at least.");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        registStudent.add(jTextField6);
        jTextField6.setBounds(320, 350, 208, 30);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        registStudent.add(jLabel77);
        jLabel77.setBounds(0, 0, 990, 720);

        jTabbedPane1.addTab("registStudent", registStudent);

        loginStudent.setLayout(null);

        emailTextField.setToolTipText("make sure end with @gmail.com");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        loginStudent.add(emailTextField);
        emailTextField.setBounds(180, 170, 303, 30);

        loginButton.setText("Login");
        loginButton.setToolTipText("make sure you have filled all of the above.");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginStudent.add(loginButton);
        loginButton.setBounds(260, 370, 120, 30);
        loginStudent.add(errorLogInLabel);
        errorLogInLabel.setBounds(116, 370, 382, 28);

        idTextField.setToolTipText("integers only");
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        idTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idTextFieldKeyPressed(evt);
            }
        });
        loginStudent.add(idTextField);
        idTextField.setBounds(180, 310, 303, 30);

        passwordTextField.setToolTipText("8 charachters at least.");
        passwordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordTextField.setName(""); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        loginStudent.add(passwordTextField);
        passwordTextField.setBounds(180, 240, 303, 30);

        emailLabel.setText("Email ");
        loginStudent.add(emailLabel);
        emailLabel.setBounds(180, 150, 74, 20);

        jLabel3.setText("Password");
        loginStudent.add(jLabel3);
        jLabel3.setBounds(180, 220, 83, 20);

        jLabel4.setText("Student ID");
        loginStudent.add(jLabel4);
        jLabel4.setBounds(180, 290, 80, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("login");
        loginStudent.add(jLabel2);
        jLabel2.setBounds(260, 50, 130, 80);

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        loginStudent.add(backButton);
        backButton.setBounds(40, 420, 80, 22);

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        loginStudent.add(jLabel78);
        jLabel78.setBounds(0, 0, 1120, 710);

        jTabbedPane1.addTab("loginStudent", loginStudent);

        mainOptionsStudent.setLayout(null);

        hallowjLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        hallowjLabel.setForeground(new java.awt.Color(255, 51, 102));
        hallowjLabel.setText("Hello");
        mainOptionsStudent.add(hallowjLabel);
        hallowjLabel.setBounds(41, 35, 50, 31);

        nameOfStudentjLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        nameOfStudentjLabel.setForeground(new java.awt.Color(255, 51, 102));
        nameOfStudentjLabel.setText("name");
        mainOptionsStudent.add(nameOfStudentjLabel);
        nameOfStudentjLabel.setBounds(90, 40, 56, 20);

        SeeCoursejButton.setText("See courses");
        SeeCoursejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeCoursejButtonActionPerformed(evt);
            }
        });
        mainOptionsStudent.add(SeeCoursejButton);
        SeeCoursejButton.setBounds(240, 90, 223, 95);

        RigsteredCoursesjButton.setText("Rigstered Courses");
        RigsteredCoursesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RigsteredCoursesjButtonActionPerformed(evt);
            }
        });
        mainOptionsStudent.add(RigsteredCoursesjButton);
        RigsteredCoursesjButton.setBounds(240, 210, 223, 95);

        myAccountjButton.setText("Info about my account ");
        myAccountjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAccountjButtonActionPerformed(evt);
            }
        });
        mainOptionsStudent.add(myAccountjButton);
        myAccountjButton.setBounds(240, 320, 223, 95);

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainOptionsStudent.add(jButton2);
        jButton2.setBounds(41, 417, 90, 22);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        mainOptionsStudent.add(jLabel79);
        jLabel79.setBounds(0, 0, 990, 730);

        jTabbedPane1.addTab("mainOptionsStudent", mainOptionsStudent);

        jScrollPaneSeeCourses.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel7.setText("EGP");

        coursePricejLabel.setText("coursePrice");

        jLabel9.setText("This Course includes :");

        jLabel10.setText("# Full lifetime access");

        jLabel11.setText("# Access on mobile and TV");

        jLabel12.setText("# Certificate of completion");

        jLabel13.setText("# Certificate of excellence");

        RegisterNowjButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        RegisterNowjButton.setForeground(new java.awt.Color(255, 204, 0));
        RegisterNowjButton.setText("Register now");
        RegisterNowjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterNowjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CourseImagejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterNowjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coursePricejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(CourseImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursePricejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterNowjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(15, 15, 15))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 102));
        jLabel14.setText("What you will learn ?");

        objectivejTextArea.setColumns(20);
        objectivejTextArea.setRows(5);
        objectivejTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        objectivejTextArea.setEnabled(false);
        objectivejTextArea.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(objectivejTextArea);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 102));
        jLabel26.setText("Requirements");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1340, 245, 70));

        requirementsjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requirementsjLabel.setText("This course is designed for users that already have a basic working knowledge of .........");
        jPanel4.add(requirementsjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1420, 670, 35));

        CourseNamejTextArea.setColumns(20);
        CourseNamejTextArea.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        CourseNamejTextArea.setRows(5);
        CourseNamejTextArea.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(CourseNamejTextArea);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 167));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Language :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 22));

        languagejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        languagejLabel.setText("language");
        jPanel4.add(languagejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 61, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Code :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 43, -1));

        codejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        codejLabel.setText("code");
        jPanel4.add(codejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 40, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel15.setText("Instructor rating ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 102));
        jLabel6.setText("Instructor");

        instructorRatingjLabel.setText("0.0");

        jLabel19.setText("Reviews");

        reviewsjLabel.setText("000");

        jLabel24.setText("Students");

        studentsjLabel.setText("00");

        coursesjLabel.setText("00");

        jLabel31.setText("Courses");

        instructorNamejLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        instructorNamejLabel.setText("instructorName");

        jopTitlejLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jopTitlejLabel.setText("jopTitle");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(instructorImagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(instructorRatingjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reviewsjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel24)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(coursesjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jopTitlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructorNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructorNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jopTitlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructorRatingjLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(reviewsjLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(studentsjLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coursesjLabel)
                            .addComponent(jLabel31))
                        .addGap(32, 32, 32))
                    .addComponent(instructorImagejLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(354, 354, 354))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1800, -1, 356));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        descriptionjTextArea.setColumns(20);
        descriptionjTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descriptionjTextArea.setRows(5);
        descriptionjTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        descriptionjTextArea.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(descriptionjTextArea);

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 102));
        jLabel28.setText("Description");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel28))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1470, -1, 311));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        contentjTextArea.setColumns(20);
        contentjTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contentjTextArea.setRows(5);
        contentjTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        contentjTextArea.setEnabled(false);
        contentjTextArea.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(contentjTextArea);

        numberOfSectionjLabel.setText("000");

        jLabel20.setText("Section");

        numberOfLecturesjLabel.setText("000");

        jLabel23.setText("Lectures");

        totalHoursjLabel.setText("000");

        jLabel25.setText("Total  hours");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 102));
        jLabel18.setText("Course contents");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(numberOfSectionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(numberOfLecturesjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(totalHoursjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfSectionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfLecturesjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalHoursjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, -1, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 102));
        jLabel34.setText("Student feadback");

        courseRatingjLabel.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        courseRatingjLabel.setForeground(new java.awt.Color(255, 153, 0));
        courseRatingjLabel.setText("3.5");

        jProgressBar1.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBar1.setValue(54);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), null));

        jProgressBar2.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), null));

        jProgressBar3.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), null));

        jProgressBar4.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBar4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), null));

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 153, 0));
        jLabel36.setText("Course Rating");

        fivejLabel.setText("%");

        fourjLabel.setText("%");

        threejLabel.setText("%");

        twojLabel.setText("%");

        jProgressBar5.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBar5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), null));

        onejLabel.setText("%");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(courseRatingjLabel)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(onejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fivejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(171, 171, 171))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseRatingjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fivejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(twojLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(onejLabel))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2170, 616, -1));

        nextCoursejButton.setText("Next course");
        nextCoursejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCoursejButtonActionPerformed(evt);
            }
        });
        jPanel4.add(nextCoursejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 2450, 234, 39));

        jButton10.setText("back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2460, -1, -1));

        LastCoursejButton.setText("Last course");
        LastCoursejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastCoursejButtonActionPerformed(evt);
            }
        });
        jPanel4.add(LastCoursejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 2450, 210, 40));

        jLabel96.setFont(new java.awt.Font("Segoe UI Black", 0, 60)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 51, 102));
        jLabel96.setText("Courses");
        jPanel4.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 250, 100));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/Picsart_22-06-11_21-38-23-231.jpg"))); // NOI18N
        jPanel4.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 980, 2500));

        jScrollPaneSeeCourses.setViewportView(jPanel4);

        jTabbedPane1.addTab("jScrollpaneSeeCourses", jScrollPaneSeeCourses);

        option2Student.setLayout(null);

        jLabelnemeOfCourse.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelnemeOfCourse.setForeground(new java.awt.Color(255, 51, 102));
        jLabelnemeOfCourse.setText("nemeOfCourse");
        option2Student.add(jLabelnemeOfCourse);
        jLabelnemeOfCourse.setBounds(20, 40, 680, 120);

        jLabel56.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel56.setText("Next lecture :  ");
        option2Student.add(jLabel56);
        jLabel56.setBounds(30, 220, 140, 27);

        jLabel57.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel57.setText("date : ");
        option2Student.add(jLabel57);
        jLabel57.setBounds(30, 250, 60, 26);

        jLabel58.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel58.setText("Time : ");
        option2Student.add(jLabel58);
        jLabel58.setBounds(30, 280, 70, 31);

        jLabel59.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel59.setText("Note :");
        option2Student.add(jLabel59);
        jLabel59.setBounds(30, 320, 60, 28);

        jLabel60.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel60.setText("Exam");
        option2Student.add(jLabel60);
        jLabel60.setBounds(60, 470, 80, 30);

        jLabelNextLec.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option2Student.add(jLabelNextLec);
        jLabelNextLec.setBounds(160, 220, 470, 27);

        jLabelDate.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option2Student.add(jLabelDate);
        jLabelDate.setBounds(90, 250, 290, 26);

        jLabelTime.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option2Student.add(jLabelTime);
        jLabelTime.setBounds(90, 290, 285, 30);

        jLabelNote.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option2Student.add(jLabelNote);
        jLabelNote.setBounds(90, 320, 591, 28);

        jButtonEnterToExam.setText("Enter to exam");
        jButtonEnterToExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterToExamActionPerformed(evt);
            }
        });
        option2Student.add(jButtonEnterToExam);
        jButtonEnterToExam.setBounds(170, 470, 173, 22);

        jButtonReturnRegisteredCourse.setText("Last course");
        jButtonReturnRegisteredCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnRegisteredCourseActionPerformed(evt);
            }
        });
        option2Student.add(jButtonReturnRegisteredCourse);
        jButtonReturnRegisteredCourse.setBounds(210, 540, 120, 41);

        jButtonNextRegisteredCourse.setText("Next course");
        jButtonNextRegisteredCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextRegisteredCourseActionPerformed(evt);
            }
        });
        option2Student.add(jButtonNextRegisteredCourse);
        jButtonNextRegisteredCourse.setBounds(520, 540, 123, 41);

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        option2Student.add(jButton6);
        jButton6.setBounds(30, 540, 80, 22);

        jLabelRegisteredCourseCode.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabelRegisteredCourseCode.setForeground(new java.awt.Color(255, 51, 102));
        jLabelRegisteredCourseCode.setText("CourseCode");
        option2Student.add(jLabelRegisteredCourseCode);
        jLabelRegisteredCourseCode.setBounds(20, 160, 191, 30);

        jLabel66.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel66.setText("Exam title : ");
        option2Student.add(jLabel66);
        jLabel66.setBounds(380, 470, 120, 20);

        jLabelExamTitleInStudentPage.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option2Student.add(jLabelExamTitleInStudentPage);
        jLabelExamTitleInStudentPage.setBounds(490, 470, 172, 30);

        jButtonStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar1.setToolTipText("Very bad");
        jButtonStar1.setBorder(null);
        jButtonStar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar1ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar1);
        jButtonStar1.setBounds(410, 350, 57, 50);

        jButtonStar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar10.setToolTipText("Excellent");
        jButtonStar10.setBorder(null);
        jButtonStar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar10ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar10);
        jButtonStar10.setBounds(650, 410, 57, 50);

        jButtonStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar2.setToolTipText("bad");
        jButtonStar2.setBorder(null);
        jButtonStar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar2ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar2);
        jButtonStar2.setBounds(470, 350, 57, 49);

        jButtonStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar4.setToolTipText("Good");
        jButtonStar4.setBorder(null);
        jButtonStar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar4ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar4);
        jButtonStar4.setBounds(590, 350, 57, 50);

        jButtonStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar3.setToolTipText("Average");
        jButtonStar3.setBorder(null);
        jButtonStar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar3ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar3);
        jButtonStar3.setBounds(530, 350, 57, 49);

        jButtonStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar5.setToolTipText("Excellent");
        jButtonStar5.setBorder(null);
        jButtonStar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar5ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar5);
        jButtonStar5.setBounds(650, 350, 57, 50);

        jButtonStar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar6.setToolTipText("Very bad");
        jButtonStar6.setBorder(null);
        jButtonStar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar6ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar6);
        jButtonStar6.setBounds(410, 410, 57, 50);

        jButtonStar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar8.setToolTipText("Average");
        jButtonStar8.setBorder(null);
        jButtonStar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar8ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar8);
        jButtonStar8.setBounds(530, 410, 57, 50);

        jButtonStar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar9.setToolTipText("Good");
        jButtonStar9.setBorder(null);
        jButtonStar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar9ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar9);
        jButtonStar9.setBounds(590, 410, 57, 50);

        jButtonStar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/StarFalse.PNG"))); // NOI18N
        jButtonStar7.setToolTipText("bad");
        jButtonStar7.setBorder(null);
        jButtonStar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStar7ActionPerformed(evt);
            }
        });
        option2Student.add(jButtonStar7);
        jButtonStar7.setBounds(470, 410, 57, 50);

        jLabel73.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel73.setText("Your fedback about the course in general ");
        option2Student.add(jLabel73);
        jLabel73.setBounds(20, 370, 390, 30);

        jLabel74.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel74.setText("Your fedback about the course's instructor");
        option2Student.add(jLabel74);
        jLabel74.setBounds(20, 420, 390, 30);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        option2Student.add(jLabel83);
        jLabel83.setBounds(0, 0, 990, 730);

        jTabbedPane1.addTab("option2Student", option2Student);

        EnterToExam.setBackground(new java.awt.Color(51, 51, 51));
        EnterToExam.setLayout(null);

        jTextAreaShowQuastion.setColumns(20);
        jTextAreaShowQuastion.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextAreaShowQuastion.setRows(5);
        jTextAreaShowQuastion.setEnabled(false);
        jScrollPane7.setViewportView(jTextAreaShowQuastion);

        EnterToExam.add(jScrollPane7);
        jScrollPane7.setBounds(30, 60, 574, 180);

        jButtonOption1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButtonOption1.setText("Option1");
        jButtonOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOption1ActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonOption1);
        jButtonOption1.setBounds(10, 250, 320, 52);

        jButtonOption2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButtonOption2.setText("Option2");
        jButtonOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOption2ActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonOption2);
        jButtonOption2.setBounds(360, 250, 350, 52);

        jButtonOption3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButtonOption3.setText("Option3");
        jButtonOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOption3ActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonOption3);
        jButtonOption3.setBounds(10, 370, 320, 52);

        jButtonOption4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButtonOption4.setText("Option4");
        jButtonOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOption4ActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonOption4);
        jButtonOption4.setBounds(360, 370, 350, 52);

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonSubmit);
        jButtonSubmit.setBounds(270, 450, 150, 37);

        jLabel45.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 51, 102));
        jLabel45.setText("Question");
        EnterToExam.add(jLabel45);
        jLabel45.setBounds(50, 20, 90, 33);

        jLabel46.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 51, 102));
        jLabel46.setText("1");
        EnterToExam.add(jLabel46);
        jLabel46.setBounds(140, 20, 63, 33);

        jLabelExamTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelExamTitle.setForeground(new java.awt.Color(255, 51, 102));
        jLabelExamTitle.setText("jLabelExamTitle");
        EnterToExam.add(jLabelExamTitle);
        jLabelExamTitle.setBounds(310, 0, 209, 64);

        jButtonNextQuastion.setText("Next question");
        jButtonNextQuastion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextQuastionActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonNextQuastion);
        jButtonNextQuastion.setBounds(470, 450, 150, 50);

        jButtonLastQuastion.setText("Last question");
        jButtonLastQuastion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLastQuastionActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonLastQuastion);
        jButtonLastQuastion.setBounds(100, 450, 130, 50);

        jButtonUndo.setText("Undo");
        jButtonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUndoActionPerformed(evt);
            }
        });
        EnterToExam.add(jButtonUndo);
        jButtonUndo.setBounds(310, 320, 90, 40);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        EnterToExam.add(jLabel80);
        jLabel80.setBounds(0, -20, 990, 750);

        jTabbedPane1.addTab("EnterToExam", EnterToExam);

        option3Student.setLayout(null);

        NamejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        NamejLabel.setText("Name :");
        option3Student.add(NamejLabel);
        NamejLabel.setBounds(30, 110, 70, 20);

        firstNamejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(firstNamejLabel);
        firstNamejLabel.setBounds(80, 110, 110, 20);

        secondNamejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(secondNamejLabel);
        secondNamejLabel.setBounds(200, 110, 110, 20);

        GenderjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        GenderjLabel.setText("Gender :");
        option3Student.add(GenderjLabel);
        GenderjLabel.setBounds(30, 140, 60, 20);

        AgejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        AgejLabel.setText("Age :");
        option3Student.add(AgejLabel);
        AgejLabel.setBounds(30, 170, 50, 20);

        FacualtyjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        FacualtyjLabel.setText("Facualty :");
        option3Student.add(FacualtyjLabel);
        FacualtyjLabel.setBounds(30, 200, 70, 20);

        EmailjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        EmailjLabel.setText("Email :");
        option3Student.add(EmailjLabel);
        EmailjLabel.setBounds(30, 230, 50, 20);

        PasswordjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        PasswordjLabel.setText("Password :");
        option3Student.add(PasswordjLabel);
        PasswordjLabel.setBounds(30, 260, 80, 20);

        IDjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        IDjLabel.setText("ID :");
        option3Student.add(IDjLabel);
        IDjLabel.setBounds(30, 290, 64, 20);

        studentGenderjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(studentGenderjLabel);
        studentGenderjLabel.setBounds(100, 140, 130, 20);

        studentAgejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(studentAgejLabel);
        studentAgejLabel.setBounds(90, 170, 150, 20);

        studentFacualtyjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(studentFacualtyjLabel);
        studentFacualtyjLabel.setBounds(100, 200, 290, 20);

        studentEmailjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(studentEmailjLabel);
        studentEmailjLabel.setBounds(80, 230, 290, 20);

        studentPasswordjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(studentPasswordjLabel);
        studentPasswordjLabel.setBounds(110, 260, 280, 20);
        option3Student.add(studentRegisteredCoursesjLabel);
        studentRegisteredCoursesjLabel.setBounds(169, 281, 95, 0);

        studentIDjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        option3Student.add(studentIDjLabel);
        studentIDjLabel.setBounds(70, 290, 290, 20);

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 102));
        jLabel22.setText("My account");
        option3Student.add(jLabel22);
        jLabel22.setBounds(230, 39, 260, 47);

        ChangeInfojButton.setText("Change Info...");
        ChangeInfojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeInfojButtonActionPerformed(evt);
            }
        });
        option3Student.add(ChangeInfojButton);
        ChangeInfojButton.setBounds(210, 370, 180, 50);

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        option3Student.add(jButton3);
        jButton3.setBounds(60, 380, 80, 22);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        option3Student.add(jLabel81);
        jLabel81.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("option3Student", option3Student);

        changeInfoStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        changeInfoStudent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 169, 127));

        changeFirstNamejLabel.setText("First name");
        changeInfoStudent.add(changeFirstNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        changeLastNamejLabel.setText("Last name");
        changeInfoStudent.add(changeLastNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 82, 20));

        changeAgejLabel.setText("Age ");
        changeInfoStudent.add(changeAgejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 42, 20));

        changeFacualtyjLabel.setText("Facualty ");
        changeInfoStudent.add(changeFacualtyjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 59, -1));

        changeEmailjLabel.setText("Email ");
        changeInfoStudent.add(changeEmailjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 62, 20));

        changePasswordjLabel.setText("Password ");
        changeInfoStudent.add(changePasswordjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 85, 20));

        changeFirstNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFirstNamejTextFieldActionPerformed(evt);
            }
        });
        changeInfoStudent.add(changeFirstNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 72, 194, 30));

        changeLastNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLastNamejTextFieldActionPerformed(evt);
            }
        });
        changeInfoStudent.add(changeLastNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 142, 194, 30));

        changeAgejTextField4.setToolTipText("integer only");
        changeInfoStudent.add(changeAgejTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 212, 194, 30));
        changeInfoStudent.add(changeFacualtyjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 282, 194, 30));

        changeEmailjTextField.setToolTipText("make sure end with @gmail.com");
        changeInfoStudent.add(changeEmailjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 402, 192, 30));

        changePasswordjTextField.setToolTipText("8 characters at least.");
        changePasswordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordjTextFieldActionPerformed(evt);
            }
        });
        changePasswordjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                changePasswordjTextFieldKeyPressed(evt);
            }
        });
        changeInfoStudent.add(changePasswordjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 472, 192, 30));

        saveChangesjButton.setText("Save changes");
        saveChangesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesjButtonActionPerformed(evt);
            }
        });
        changeInfoStudent.add(saveChangesjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 140, 40));
        changeInfoStudent.add(invalidDataMassagejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 581, 193, 27));

        jButton5.setText("back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        changeInfoStudent.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 80, -1));

        buttonGroup3.add(jRadioButtonChangeGenderToMale);
        jRadioButtonChangeGenderToMale.setText("Male");
        changeInfoStudent.add(jRadioButtonChangeGenderToMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 61, 43));

        buttonGroup3.add(jRadioButtonChangeGenderToFemale);
        jRadioButtonChangeGenderToFemale.setText("Female");
        jRadioButtonChangeGenderToFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonChangeGenderToFemaleActionPerformed(evt);
            }
        });
        changeInfoStudent.add(jRadioButtonChangeGenderToFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 80, -1));

        jLabel51.setText("gender ");
        changeInfoStudent.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 98, 22));

        jLabel95.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 51, 102));
        jLabel95.setText("Change information");
        changeInfoStudent.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 60));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        changeInfoStudent.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        jTabbedPane1.addTab("changeInfoStudent", changeInfoStudent);

        mainOptionsInstructor.setLayout(null);

        jButtonUpdateInfoAboutCourse.setText("Update Info About Course");
        jButtonUpdateInfoAboutCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateInfoAboutCourseActionPerformed(evt);
            }
        });
        mainOptionsInstructor.add(jButtonUpdateInfoAboutCourse);
        jButtonUpdateInfoAboutCourse.setBounds(210, 120, 207, 70);

        jButtonMakeExam.setText("Make Exam");
        jButtonMakeExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeExamActionPerformed(evt);
            }
        });
        mainOptionsInstructor.add(jButtonMakeExam);
        jButtonMakeExam.setBounds(210, 220, 207, 70);

        jButton11.setText("back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        mainOptionsInstructor.add(jButton11);
        jButton11.setBounds(50, 460, 80, 22);

        jLabel70.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 51, 102));
        jLabel70.setText("Hello");
        mainOptionsInstructor.add(jLabel70);
        jLabel70.setBounds(45, 21, 50, 29);

        jLabel71.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 51, 102));
        jLabel71.setText("name");
        mainOptionsInstructor.add(jLabel71);
        jLabel71.setBounds(100, 20, 327, 29);

        jButton17.setText("Info About Student");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        mainOptionsInstructor.add(jButton17);
        jButton17.setBounds(210, 320, 207, 67);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        mainOptionsInstructor.add(jLabel84);
        jLabel84.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("mainOptionsInstructor", mainOptionsInstructor);

        option1Instructor.setLayout(null);

        jLabel55.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 51, 102));
        jLabel55.setText("Update  Info About Course");
        option1Instructor.add(jLabel55);
        jLabel55.setBounds(140, 70, 340, 50);

        jButton8.setText("Next");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        option1Instructor.add(jButton8);
        jButton8.setBounds(290, 360, 130, 40);

        jLabel61.setText("Course code");
        option1Instructor.add(jLabel61);
        jLabel61.setBounds(150, 170, 70, 32);

        jTextFieldCourseCodeToUpdate.setToolTipText("integer only");
        jTextFieldCourseCodeToUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCourseCodeToUpdateActionPerformed(evt);
            }
        });
        jTextFieldCourseCodeToUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCourseCodeToUpdateKeyPressed(evt);
            }
        });
        option1Instructor.add(jTextFieldCourseCodeToUpdate);
        jTextFieldCourseCodeToUpdate.setBounds(220, 170, 185, 30);
        option1Instructor.add(jLabelErrorCourseCodeToUpdate);
        jLabelErrorCourseCodeToUpdate.setBounds(163, 205, 288, 34);

        jButton9.setText("back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        option1Instructor.add(jButton9);
        jButton9.setBounds(56, 393, 80, 22);

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        option1Instructor.add(jLabel85);
        jLabel85.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("option1Instructor", option1Instructor);

        updateInfoAboutCourse.setLayout(null);

        jLabel62.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel62.setText("next lecture");
        updateInfoAboutCourse.add(jLabel62);
        jLabel62.setBounds(60, 150, 110, 20);

        jLabel63.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel63.setText("Date");
        updateInfoAboutCourse.add(jLabel63);
        jLabel63.setBounds(60, 190, 50, 20);

        jLabel64.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel64.setText("Time");
        updateInfoAboutCourse.add(jLabel64);
        jLabel64.setBounds(60, 230, 70, 20);

        jLabel65.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel65.setText("Exam");
        updateInfoAboutCourse.add(jLabel65);
        jLabel65.setBounds(60, 320, 80, 26);

        jTextFieldUpdateNextLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUpdateNextLecActionPerformed(evt);
            }
        });
        updateInfoAboutCourse.add(jTextFieldUpdateNextLec);
        jTextFieldUpdateNextLec.setBounds(170, 150, 197, 30);

        jTextFieldUpdateDate.setToolTipText("integer only");
        updateInfoAboutCourse.add(jTextFieldUpdateDate);
        jTextFieldUpdateDate.setBounds(170, 190, 197, 30);

        jTextFieldUpdateTime.setToolTipText("integer only");
        updateInfoAboutCourse.add(jTextFieldUpdateTime);
        jTextFieldUpdateTime.setBounds(170, 240, 197, 30);

        jButtonUploadExamToStudent.setText("Upload exam to student");
        jButtonUploadExamToStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadExamToStudentActionPerformed(evt);
            }
        });
        updateInfoAboutCourse.add(jButtonUploadExamToStudent);
        jButtonUploadExamToStudent.setBounds(170, 320, 197, 34);

        jLabel53.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel53.setText("Note");
        updateInfoAboutCourse.add(jLabel53);
        jLabel53.setBounds(60, 270, 60, 20);

        jTextFieldUpdateNote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUpdateNoteKeyPressed(evt);
            }
        });
        updateInfoAboutCourse.add(jTextFieldUpdateNote);
        jTextFieldUpdateNote.setBounds(170, 280, 197, 30);

        jButtonSaveUpdate.setText("Save updates");
        jButtonSaveUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveUpdateActionPerformed(evt);
            }
        });
        updateInfoAboutCourse.add(jButtonSaveUpdate);
        jButtonSaveUpdate.setBounds(280, 420, 183, 40);

        jButton12.setText("back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        updateInfoAboutCourse.add(jButton12);
        jButton12.setBounds(80, 430, 80, 22);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        updateInfoAboutCourse.add(jLabel86);
        jLabel86.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("updateInfoAboutCourse", updateInfoAboutCourse);

        uploadExamToStudent.setLayout(null);

        jLabel52.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 51, 102));
        jLabel52.setText("Upload Exam To Student");
        uploadExamToStudent.add(jLabel52);
        jLabel52.setBounds(141, 66, 349, 74);

        jLabel54.setText("Exam title");
        uploadExamToStudent.add(jLabel54);
        jLabel54.setBounds(160, 220, 80, 30);

        jTextFieldTitleExamToUpload.setEnabled(false);
        uploadExamToStudent.add(jTextFieldTitleExamToUpload);
        jTextFieldTitleExamToUpload.setBounds(240, 220, 181, 30);

        jButton7.setText("Upload exam");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        uploadExamToStudent.add(jButton7);
        jButton7.setBounds(270, 360, 160, 37);

        jButton13.setText("back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        uploadExamToStudent.add(jButton13);
        jButton13.setBounds(95, 371, 80, 22);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        uploadExamToStudent.add(jComboBox1);
        jComboBox1.setBounds(430, 220, 96, 30);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        uploadExamToStudent.add(jLabel87);
        jLabel87.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("uploadExamToStudent", uploadExamToStudent);

        option2Instructor.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel47.setText("Numebr of  quastion ");
        option2Instructor.add(jLabel47);
        jLabel47.setBounds(110, 170, 200, 25);

        jTextFieldNumberOfQ.setToolTipText("integer only");
        jTextFieldNumberOfQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumberOfQActionPerformed(evt);
            }
        });
        option2Instructor.add(jTextFieldNumberOfQ);
        jTextFieldNumberOfQ.setBounds(420, 170, 197, 30);

        jLabel48.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel48.setText("Title");
        option2Instructor.add(jLabel48);
        jLabel48.setBounds(110, 130, 106, 26);

        jLabel49.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel49.setText("Give the  final degree to students");
        option2Instructor.add(jLabel49);
        jLabel49.setBounds(110, 220, 320, 26);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Yes");
        option2Instructor.add(jRadioButton3);
        jRadioButton3.setBounds(450, 220, 41, 20);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("No");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        option2Instructor.add(jRadioButton4);
        jRadioButton4.setBounds(540, 220, 49, 20);

        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });
        option2Instructor.add(jTextFieldTitle);
        jTextFieldTitle.setBounds(420, 130, 197, 30);

        jButtonAddExam.setText("Next");
        jButtonAddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddExamActionPerformed(evt);
            }
        });
        option2Instructor.add(jButtonAddExam);
        jButtonAddExam.setBounds(320, 370, 100, 40);

        jLabel50.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel50.setText("Course code");
        option2Instructor.add(jLabel50);
        jLabel50.setBounds(110, 270, 178, 26);

        jTextFieldCourseCode.setToolTipText("integer only");
        jTextFieldCourseCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCourseCodeActionPerformed(evt);
            }
        });
        jTextFieldCourseCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCourseCodeKeyPressed(evt);
            }
        });
        option2Instructor.add(jTextFieldCourseCode);
        jTextFieldCourseCode.setBounds(420, 260, 197, 30);
        option2Instructor.add(jLabelCodeNotAvailable);
        jLabelCodeNotAvailable.setBounds(177, 310, 273, 31);

        jButton14.setText("back");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        option2Instructor.add(jButton14);
        jButton14.setBounds(120, 381, 80, 22);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        option2Instructor.add(jLabel88);
        jLabel88.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("option2Instructor", option2Instructor);

        addQuastionToExam.setLayout(null);

        jLabel38.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 51, 102));
        jLabel38.setText("Question ");
        addQuastionToExam.add(jLabel38);
        jLabel38.setBounds(22, 15, 85, 62);

        jLabel39.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 51, 102));
        jLabel39.setText("1");
        addQuastionToExam.add(jLabel39);
        jLabel39.setBounds(114, 15, 76, 62);

        jLabel40.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel40.setText("Question statment ");
        addQuastionToExam.add(jLabel40);
        jLabel40.setBounds(22, 95, 130, 32);

        jTextAreaQuastionStatment.setColumns(20);
        jTextAreaQuastionStatment.setRows(5);
        jScrollPane6.setViewportView(jTextAreaQuastionStatment);

        addQuastionToExam.add(jScrollPane6);
        jScrollPane6.setBounds(22, 134, 403, 86);

        jTextFieldOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOption1ActionPerformed(evt);
            }
        });
        addQuastionToExam.add(jTextFieldOption1);
        jTextFieldOption1.setBounds(22, 251, 403, 30);

        jTextFieldOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOption2ActionPerformed(evt);
            }
        });
        addQuastionToExam.add(jTextFieldOption2);
        jTextFieldOption2.setBounds(22, 306, 403, 30);
        addQuastionToExam.add(jTextFieldOption3);
        jTextFieldOption3.setBounds(22, 365, 403, 30);

        jTextFieldCorrectAns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorrectAnsKeyPressed(evt);
            }
        });
        addQuastionToExam.add(jTextFieldCorrectAns);
        jTextFieldCorrectAns.setBounds(20, 420, 403, 30);

        jLabel41.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel41.setText("Option 1");
        addQuastionToExam.add(jLabel41);
        jLabel41.setBounds(22, 228, 137, 22);

        jLabel42.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel42.setText("Option 2");
        addQuastionToExam.add(jLabel42);
        jLabel42.setBounds(22, 286, 90, 22);

        jLabel43.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel43.setText("Option 3");
        addQuastionToExam.add(jLabel43);
        jLabel43.setBounds(22, 342, 80, 22);

        jLabel44.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel44.setText("Correct answer");
        addQuastionToExam.add(jLabel44);
        jLabel44.setBounds(22, 400, 110, 22);

        jButtonAddQuastion.setText("Add question");
        jButtonAddQuastion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQuastionActionPerformed(evt);
            }
        });
        addQuastionToExam.add(jButtonAddQuastion);
        jButtonAddQuastion.setBounds(150, 470, 140, 22);

        jLabel89.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        addQuastionToExam.add(jLabel89);
        jLabel89.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("addQuastionToExam", addQuastionToExam);

        loginInstructor.setLayout(null);

        jLabel67.setText("Email");
        loginInstructor.add(jLabel67);
        jLabel67.setBounds(237, 136, 90, 16);

        jTextField7.setToolTipText("make sure end with @gmail.com");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        loginInstructor.add(jTextField7);
        jTextField7.setBounds(237, 159, 213, 30);

        jLabel68.setText("Password");
        loginInstructor.add(jLabel68);
        jLabel68.setBounds(237, 194, 70, 16);

        jPasswordField2.setToolTipText("8 characters at least.");
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });
        loginInstructor.add(jPasswordField2);
        jPasswordField2.setBounds(237, 217, 213, 30);

        jButtonloginInstructor.setText("login");
        jButtonloginInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginInstructorActionPerformed(evt);
            }
        });
        loginInstructor.add(jButtonloginInstructor);
        jButtonloginInstructor.setBounds(278, 290, 100, 40);

        jButton16.setText("back");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        loginInstructor.add(jButton16);
        jButton16.setBounds(70, 340, 80, 22);
        loginInstructor.add(jLabel69);
        jLabel69.setBounds(237, 262, 368, 21);

        jLabel94.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 51, 102));
        jLabel94.setText("Login ");
        loginInstructor.add(jLabel94);
        jLabel94.setBounds(280, 50, 110, 50);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        loginInstructor.add(jLabel90);
        jLabel90.setBounds(0, 0, 990, 710);

        jTabbedPane1.addTab("LoginInstructors", loginInstructor);

        Option3OfInstructor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setText("Course code");
        Option3OfInstructor.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 156, 97, 22));

        jTextFieldCourseCodeToInfoAboutStudent.setEnabled(false);
        Option3OfInstructor.add(jTextFieldCourseCodeToInfoAboutStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 156, 210, -1));

        jButton18.setText("Show Info");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        Option3OfInstructor.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 247, 108, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        Option3OfInstructor.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 155, 111, -1));

        jButton20.setText("Back");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        Option3OfInstructor.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 80, -1));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/icon/730-710.jpg"))); // NOI18N
        Option3OfInstructor.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        jTabbedPane1.addTab("Ootion3OfInstructor", Option3OfInstructor);

        showinfo.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        showinfo.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 980, 620);

        jButton19.setText("Back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        showinfo.add(jButton19);
        jButton19.setBounds(20, 630, 110, 30);

        jTabbedPane1.addTab("showinfo", showinfo);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 730, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar7ActionPerformed

        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isVisibiltyOfInstructorFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setTwoOutOfFive();
            jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setFlagStar2(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setVisibiltyOfInstructorFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar7ActionPerformed

    private void jButtonStar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar9ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isVisibiltyOfInstructorFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setFourOutOfFive();
            jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setFlagStar4(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setVisibiltyOfInstructorFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar9ActionPerformed

    private void jButtonStar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar8ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isVisibiltyOfInstructorFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setThreeOutOfFive();
            jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setFlagStar3(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setVisibiltyOfInstructorFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar8ActionPerformed

    private void jButtonStar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar6ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isVisibiltyOfInstructorFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setOneOutOfFive();
            jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setFlagStar1(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setVisibiltyOfInstructorFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar6ActionPerformed

    private void jButtonStar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar5ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isVisibiltyOfCourseFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setFiveOutOfFive();
            jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setFlagStar5(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setVisibiltyOfCourseFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar5ActionPerformed

    private void jButtonStar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar3ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isVisibiltyOfCourseFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setThreeOutOfFive();
            jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setFlagStar3(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setVisibiltyOfCourseFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar3ActionPerformed

    private void jButtonStar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar4ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isVisibiltyOfCourseFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setFourOutOfFive();
            jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setFlagStar4(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setVisibiltyOfCourseFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar4ActionPerformed

    private void jButtonStar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar2ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isVisibiltyOfCourseFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setTwoOutOfFive();
            jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setFlagStar2(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setVisibiltyOfCourseFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar2ActionPerformed

    private void jButtonStar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar10ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isVisibiltyOfInstructorFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setFiveOutOfFive();
            jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setFlagStar5(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().setVisibiltyOfInstructorFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar10ActionPerformed

    private void jButtonStar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStar1ActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent,ID );
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isVisibiltyOfCourseFeadback()){
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setOneOutOfFive();
            jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setFlagStar1(true);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).setVisibiltyOfCourseFeadback(false);
        }
    }//GEN-LAST:event_jButtonStar1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 mp3player.play();
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonNextRegisteredCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextRegisteredCourseActionPerformed
        mp3player.play();
        clickNextRigsterdCourse++;
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        jButtonReturnRegisteredCourse.setVisible(true);
        if(clickNextRigsterdCourse < listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().size()){
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getVisibleExamButtonAndTitle()){
                jButtonEnterToExam.setVisible(true);
                jLabelExamTitleInStudentPage.setVisible(true);
            }else{
                jButtonEnterToExam.setVisible(false);
                jLabelExamTitleInStudentPage.setVisible(false);
            }
            jLabelnemeOfCourse.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getCourseName() + "");
            jLabelNextLec.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getNextlec()+ "");
            jLabelDate.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getDate()+ "");
            jLabelTime.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getTime()+ "");
            jLabelNote.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getNote()+ "");
            jLabelRegisteredCourseCode.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getCode()+ "");
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isVisibiltyOfCourseFeadback()){
                jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
            }else{
                if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar1()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar2()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar3()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar4()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar4()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                }
            }
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isVisibiltyOfInstructorFeadback()){
                jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
            }else{
                if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar1()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar2()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar3()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar4()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar5()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                }
            }
            if(clickNextRigsterdCourse == listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().size() - 1){
                jButtonNextRegisteredCourse.setVisible(false);
                jButtonReturnRegisteredCourse.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButtonNextRegisteredCourseActionPerformed

    private void jButtonReturnRegisteredCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnRegisteredCourseActionPerformed
 mp3player.play();
        clickNextRigsterdCourse--;
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        jButtonNextRegisteredCourse.setVisible(true);
        if(clickNextRigsterdCourse < listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().size()){
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getVisibleExamButtonAndTitle()){
                jButtonEnterToExam.setVisible(true);
                jLabelExamTitleInStudentPage.setVisible(true);
            }else{
                jButtonEnterToExam.setVisible(false);
                jLabelExamTitleInStudentPage.setVisible(false);
            }
            jLabelnemeOfCourse.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getCourseName() + "");
            jLabelNextLec.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getNextlec()+ "");
            jLabelDate.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getDate()+ "");
            jLabelTime.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getTime()+ "");
            jLabelNote.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getNote()+ "");
            jLabelRegisteredCourseCode.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getCode()+ "");
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isVisibiltyOfCourseFeadback()){
                jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
            }else{
                if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar1()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar2()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar3()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar4()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).isFlagStar4()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                }
            }
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isVisibiltyOfInstructorFeadback()){
                jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
            }else{
                if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar1()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar2()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar3()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar4()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(clickNextRigsterdCourse).getInstructor().isFlagStar5()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                }
            }
            if(clickNextRigsterdCourse == 0){
                jButtonReturnRegisteredCourse.setVisible(false);
                jButtonNextRegisteredCourse.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButtonReturnRegisteredCourseActionPerformed

    private void jButtonEnterToExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterToExamActionPerformed
        mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().size() == 1){
            jButtonNextQuastion.setVisible(false);
        }
        jLabel46.setText(1 + "");
        jButtonUndo.setVisible(false);
        jLabelExamTitle.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getTitle());
        jTextAreaShowQuastion.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(0).getQuastionStatment());
        jButtonOption1.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(0).getListOfOptions().get(0).getOptionStatment());
        jButtonOption2.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(0).getListOfOptions().get(1).getOptionStatment());
        jButtonOption3.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(0).getListOfOptions().get(2).getOptionStatment());
        jButtonOption4.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(0).getListOfOptions().get(3).getOptionStatment());
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButtonEnterToExamActionPerformed

    private void LastCoursejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastCoursejButtonActionPerformed
        objectivejTextArea.setText(null);
        contentjTextArea.setText(null);
        descriptionjTextArea.setText(null);
        CourseNamejTextArea.setText(null);
        clickCourse--;
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        nextCoursejButton.setVisible(true);
        CourseNamejTextArea.setText(listOfCourses.get(clickCourse).getCourseName());
        languagejLabel.setText(listOfCourses.get(clickCourse).getLanguage());
        codejLabel.setText(listOfCourses.get(clickCourse).getCode());
        coursePricejLabel.setText(listOfCourses.get(clickCourse).getCoursePrice() + "");
        CourseImagejLabel.setIcon(listOfCourses.get(clickCourse).getImageIcon());
        for(int j = 0;j < listOfCourses.get(clickCourse).getSizeOfObjective();j++){objectivejTextArea.append("# " + listOfCourses.get(clickCourse).getObjective(j) + "\n\n");}
        for(int j = 0;j < listOfCourses.get(clickCourse).getSizeOfContents();j++){contentjTextArea.append((j + 1)+ ") " +listOfCourses.get(clickCourse).getContents(j) + "\n\n");}
        descriptionjTextArea.setText(listOfCourses.get(clickCourse).getDescription());
        numberOfSectionjLabel.setText(listOfCourses.get(clickCourse).getNumberOfSection() + "");
        numberOfLecturesjLabel.setText(listOfCourses.get(clickCourse).getNumberOfLecture() + "");
        totalHoursjLabel.setText(listOfCourses.get(clickCourse).getTotalHours() + "");
        requirementsjLabel.setText(listOfCourses.get(clickCourse).getRequirements());
        instructorNamejLabel.setText(listOfCourses.get(clickCourse).getInstructor().getName());//from Instructor class
        jopTitlejLabel.setText(listOfCourses.get(clickCourse).getInstructor().getJopTitle());// from Instructor class
        instructorImagejLabel.setIcon(listOfCourses.get(clickCourse).getInstructor().getImageIcon());
        studentsjLabel.setText(listOfCourses.get(clickCourse).getInstructor().getTotalNumebrOfStudent()+ "");
        instructorRatingjLabel.setText(listOfCourses.get(clickCourse).getInstructor().getInstructorRating() + "");
        reviewsjLabel.setText(listOfCourses.get(clickCourse).getInstructor().getTotalResponse() + "");
        courseRatingjLabel.setText(listOfCourses.get(clickCourse).getCourseRating() + "");
        if(listOfCourses.get(clickCourse).getTotalResponse() != 0){
            int value5 = (listOfCourses.get(clickCourse).getFiveOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar1.setValue(Math.round(value5));
            fivejLabel.setText(value5 + "%");
            int value4 = (listOfCourses.get(clickCourse).getFourOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar2.setValue(Math.round(value4));
            fourjLabel.setText(value4 + "%");
            int value3 = (listOfCourses.get(clickCourse).getThreeOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar3.setValue(Math.round(value3));
            threejLabel.setText(value3 + "%");
            int value2 = (listOfCourses.get(clickCourse).getTwoOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar4.setValue(Math.round(value2));
            twojLabel.setText(value2 + "%");
            int value1 = (listOfCourses.get(clickCourse).getOneOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar5.setValue(Math.round(value1));
            onejLabel.setText(value1 + "%");
        }else{
            jProgressBar1.setValue(0);
            jProgressBar2.setValue(0);
            jProgressBar3.setValue(0);
            jProgressBar4.setValue(0);
            jProgressBar5.setValue(0);
            fivejLabel.setText(0 + "%");
            fourjLabel.setText(0 + "%");
            threejLabel.setText(0 + "%");
            twojLabel.setText(0 + "%");
            onejLabel.setText(0 + "%");
        }
        if(clickCourse == 0){
            nextCoursejButton.setVisible(true);
            LastCoursejButton.setVisible(false);
        }
        objectivejTextArea.setLineWrap(true);
        objectivejTextArea.setWrapStyleWord(true);
        contentjTextArea.setLineWrap(true);
        contentjTextArea.setWrapStyleWord(true);
        descriptionjTextArea.setLineWrap(true);
        descriptionjTextArea.setWrapStyleWord(true);
        CourseNamejTextArea.setLineWrap(true);
        CourseNamejTextArea.setWrapStyleWord(true);
        if(Course.isCodeAvailable(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),codejLabel.getText())){
            RegisterNowjButton.setEnabled(false);
            RegisterNowjButton.setText("Registered");
        }else{
            RegisterNowjButton.setEnabled(true);
            RegisterNowjButton.setText("Register now");
        }
        jScrollPaneSeeCourses.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_LastCoursejButtonActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        contentjTextArea.setText(null);
        objectivejTextArea.setText(null);
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void nextCoursejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCoursejButtonActionPerformed
        objectivejTextArea.setText(null);
        contentjTextArea.setText(null);
        descriptionjTextArea.setText(null);
        CourseNamejTextArea.setText(null);
        clickCourse++;
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        LastCoursejButton.setVisible(true);
        CourseNamejTextArea.setText(listOfCourses.get(clickCourse).getCourseName());
        languagejLabel.setText(listOfCourses.get(clickCourse).getLanguage());
        codejLabel.setText(listOfCourses.get(clickCourse).getCode());
        coursePricejLabel.setText(listOfCourses.get(clickCourse).getCoursePrice() + "");
        CourseImagejLabel.setIcon(listOfCourses.get(clickCourse).getImageIcon());
        for(int j = 0;j < listOfCourses.get(clickCourse).getSizeOfObjective();j++){objectivejTextArea.append("# " + listOfCourses.get(clickCourse).getObjective(j) + "\n\n");}
        for(int j = 0;j < listOfCourses.get(clickCourse).getSizeOfContents();j++){contentjTextArea.append((j + 1)+ ") " +listOfCourses.get(clickCourse).getContents(j) + "\n\n");}
        descriptionjTextArea.setText(listOfCourses.get(clickCourse).getDescription());
        numberOfSectionjLabel.setText(listOfCourses.get(clickCourse).getNumberOfSection() + "");
        numberOfLecturesjLabel.setText(listOfCourses.get(clickCourse).getNumberOfLecture() + "");
        totalHoursjLabel.setText(listOfCourses.get(clickCourse).getTotalHours() + "");
        requirementsjLabel.setText(listOfCourses.get(clickCourse).getRequirements());
        instructorNamejLabel.setText(listOfCourses.get(clickCourse).getInstructor().getName());//from Instructor class
        jopTitlejLabel.setText(listOfCourses.get(clickCourse).getInstructor().getJopTitle());// from Instructor class
        instructorImagejLabel.setIcon(listOfCourses.get(clickCourse).getInstructor().getImageIcon());
        studentsjLabel.setText(listOfCourses.get(clickCourse).getInstructor().getTotalNumebrOfStudent()+ "");
        instructorRatingjLabel.setText(listOfCourses.get(clickCourse).getInstructor().getInstructorRating() + "");
        reviewsjLabel.setText(listOfCourses.get(clickCourse).getInstructor().getTotalResponse() + "");
        courseRatingjLabel.setText(listOfCourses.get(clickCourse).getCourseRating() + "");
        if(listOfCourses.get(clickCourse).getTotalResponse() != 0){
            int value5 = (listOfCourses.get(clickCourse).getFiveOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar1.setValue(Math.round(value5));
            fivejLabel.setText(value5 + "%");
            int value4 = (listOfCourses.get(clickCourse).getFourOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar2.setValue(Math.round(value4));
            fourjLabel.setText(value4 + "%");
            int value3 = (listOfCourses.get(clickCourse).getThreeOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar3.setValue(Math.round(value3));
            threejLabel.setText(value3 + "%");
            int value2 = (listOfCourses.get(clickCourse).getTwoOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar4.setValue(Math.round(value2));
            twojLabel.setText(value2 + "%");
            int value1 = (listOfCourses.get(clickCourse).getOneOutOfFive() / listOfCourses.get(clickCourse).getTotalResponse()) * 100;
            jProgressBar5.setValue(Math.round(value1));
            onejLabel.setText(value1 + "%");
        }else{
            jProgressBar1.setValue(0);
            jProgressBar2.setValue(0);
            jProgressBar3.setValue(0);
            jProgressBar4.setValue(0);
            jProgressBar5.setValue(0);
            fivejLabel.setText(0 + "%");
            fourjLabel.setText(0 + "%");
            threejLabel.setText(0 + "%");
            twojLabel.setText(0 + "%");
            onejLabel.setText(0 + "%");
        }
        if(clickCourse == listOfCourses.size() - 1){
            nextCoursejButton.setVisible(false);
            LastCoursejButton.setVisible(true);
        }
        objectivejTextArea.setLineWrap(true);
        objectivejTextArea.setWrapStyleWord(true);
        contentjTextArea.setLineWrap(true);
        contentjTextArea.setWrapStyleWord(true);
        descriptionjTextArea.setLineWrap(true);
        descriptionjTextArea.setWrapStyleWord(true);
        CourseNamejTextArea.setLineWrap(true);
        CourseNamejTextArea.setWrapStyleWord(true);
        if(Course.isCodeAvailable(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),codejLabel.getText())){
            RegisterNowjButton.setEnabled(false);
            RegisterNowjButton.setText("Registered");
        }else{
            RegisterNowjButton.setEnabled(true);
            RegisterNowjButton.setText("Register now");
        }
        jScrollPaneSeeCourses.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_nextCoursejButtonActionPerformed

    private void RegisterNowjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNowjButtonActionPerformed
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfcourse = Course.getIndexFromCode(listOfCourses, codejLabel.getText());//index  == click question;
        listOfStudent.get(indexOfStudent).setListOfRegisteredCourse(listOfCourses.get(indexOfcourse));
        listOfCourses.get(indexOfcourse).IncreasNumberOfStudent();
        RegisterNowjButton.setText("Registered");
        RegisterNowjButton.setEnabled(false);
    }//GEN-LAST:event_RegisterNowjButtonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jTextFieldCourseCodeToInfoAboutStudent.setText(jComboBox2.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
 mp3player.play();
        if(Course.isCodeAvailable(listOfCourses, jTextFieldCourseCodeToInfoAboutStudent.getText())){
            int indexOfCourse = Course.getIndexFromCode(listOfCourses,jTextFieldCourseCodeToInfoAboutStudent.getText());
            String fileName = "studentInfoIn".concat(jTextFieldCourseCodeToInfoAboutStudent.getText());
            fileName = fileName.trim();
            PrintWriter studentFile = null;
            int count = 0;
            for(int i = 0;i < listOfStudent.size();i++){
                if(Course.isCodeAvailable(listOfStudent.get(i).getListOfRegisteredCourse(), jTextFieldCourseCodeToInfoAboutStudent.getText())){
                    try{
                        studentFile = new PrintWriter(new FileWriter(fileName + ".txt"));
                        studentFile.println("#Student number (" + count + 1 + ") ");
                        studentFile.println("#NAME : " + listOfStudent.get(i).getFirstName() + " " + listOfStudent.get(i).getLastName() + ".");
                        studentFile.println("#GENDER : " + listOfStudent.get(i).getGender() + ".");
                        studentFile.println("AGE : " + listOfStudent.get(i).getAge() + ".");
                        studentFile.println("FACULTY  : " + listOfStudent.get(i).getFaculty() + ".");
                        studentFile.println("EMAIL : " + listOfStudent.get(i).getEmail() + ".");
                        studentFile.println("ID : " + listOfStudent.get(i).getId() + ".");
                        studentFile.println("DEGREES IN EXAMS : ");
                        for(int j = 0;j < listOfStudent.get(i).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().size();j++){
                            studentFile.println(listOfStudent.get(i).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(j).getTitle()+ " : " + listOfStudent.get(i).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(j).getGradesObtaind() + "OUT OF" + listOfStudent.get(i).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(j).getListOfQuastions().size()+ ".");
                        }
                        studentFile.close();
                    }catch(IOException e){
                        mp3player2.play();
                        JOptionPane.showMessageDialog(this, "File Not Exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            try{
                Scanner readFile = new Scanner(new File (fileName + ".txt"));
                while(readFile.hasNext()){
                    jTextArea1.append(readFile.nextLine() + "\n");
                }
                readFile.close();
            }catch(IOException e){
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "File not exist because not found any registered student", "ERROR", HEIGHT);
            }
            jTabbedPane1.setSelectedIndex(17);
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Code is not valid", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButtonloginInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginInstructorActionPerformed
 mp3player.play();
        if(Instructor.isEmailAvailable(employee, jTextField7.getText())){
            int index = Instructor.getIndexFromEmail(employee, jTextField7.getText());
            if(jPasswordField2.getText().equals(employee.get(index).getPassword())){
                jLabel71.setText(employee.get(index).getName());
                jTabbedPane1.setSelectedIndex(9);
            }else{
                jLabel69.setText(Instructor.ErrorInPassword());
            }
        }else{
            jLabel69.setText(Instructor.ErrorInEmail());
        }
    }//GEN-LAST:event_jButtonloginInstructorActionPerformed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(Instructor.isEmailAvailable(employee, jTextField7.getText())){
                int index = Instructor.getIndexFromEmail(employee, jTextField7.getText());
                if(jPasswordField2.getText().equals(employee.get(index).getPassword())){
                    jLabel71.setText(employee.get(index).getName());
                    jTabbedPane1.setSelectedIndex(9);
                }else{
                    jLabel69.setText(Instructor.ErrorInPassword());
                }
            }else{
                jLabel69.setText(Instructor.ErrorInEmail());
            }
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButtonAddQuastionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQuastionActionPerformed
 mp3player.play();
        click++;
        int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCode.getText());
        int indexOFExam = Exam.getIndexFromTitle(listOfCourses.get(indexOfCourse).getListOfExams(),jTextFieldTitle.getText());
        int numberOfQuastion = Integer.parseInt(jTextFieldNumberOfQ.getText());
        Random r = new Random();
        if(jTextAreaQuastionStatment.getText().length() > 0 && jTextFieldOption1.getText().length() > 0 && jTextFieldOption2.getText().length() > 0 && jTextFieldOption3.getText().length() > 0 && jTextFieldCorrectAns.getText().length() > 0){
            if(listOfCourses.get(indexOfCourse).getListOfExams().get(indexOFExam).getNumeberOfQuastion() > click + 1){
                listOfQuastion.add(new Quastion());
                listOfQuastion.get(click).setQuastionStatment(jTextAreaQuastionStatment.getText());
                listOfQuastion.get(click).setPattrenOfQuastionOptions( Exam.getOptionsPattern(r.nextInt(0,24)));
                listOfOption.add(new Options()); listOfOption.get(0).setOptionStatment(jTextFieldOption1.getText());listOfOption.get(0).setIsCorrect(false);
                listOfOption.add(new Options());listOfOption.get(1).setOptionStatment(jTextFieldOption2.getText());listOfOption.get(1).setIsCorrect(false);
                listOfOption.add(new Options());listOfOption.get(2).setOptionStatment(jTextFieldOption3.getText());listOfOption.get(2).setIsCorrect(false);
                listOfOption.add(new Options());listOfOption.get(3).setOptionStatment(jTextFieldCorrectAns.getText());listOfOption.get(3).setIsCorrect(true);
                listOfQuastion.get(click).setListOfOptions(listOfOption);
                listOfOption.clear();
                jLabel39.setText(click + 2 + "");
            }else{
                listOfQuastion.add(new Quastion());
                listOfQuastion.get(click).setQuastionStatment(jTextAreaQuastionStatment.getText());
                listOfQuastion.get(click).setPattrenOfQuastionOptions( Exam.getOptionsPattern(r.nextInt(0,3)));
                listOfOption.add(new Options()); listOfOption.get(0).setOptionStatment(jTextFieldOption1.getText());listOfOption.get(0).setIsCorrect(false);
                listOfOption.add(new Options());listOfOption.get(1).setOptionStatment(jTextFieldOption2.getText());listOfOption.get(1).setIsCorrect(false);
                listOfOption.add(new Options());listOfOption.get(2).setOptionStatment(jTextFieldOption3.getText());listOfOption.get(2).setIsCorrect(false);
                listOfOption.add(new Options());listOfOption.get(3).setOptionStatment(jTextFieldCorrectAns.getText());listOfOption.get(3).setIsCorrect(true);
                listOfQuastion.get(click).setListOfOptions(listOfOption);
                listOfOption.clear();
                listOfCourses.get(indexOfCourse).getListOfExams().get(indexOFExam).setListOfQuastions(listOfQuastion);
                listOfQuastion.clear();
                click = -1;
                jLabel39.setText(1 + "");
                jTabbedPane1.setSelectedIndex(9);
            }
            jTextAreaQuastionStatment.setText("");jTextFieldOption1.setText("");jTextFieldOption2.setText("");jTextFieldOption3.setText("");jTextFieldCorrectAns.setText("");
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Please check that you entered all above requirments","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddQuastionActionPerformed

    private void jTextFieldCorrectAnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorrectAnsKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            click++;
            int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCode.getText());
            int indexOFExam = Exam.getIndexFromTitle(listOfCourses.get(indexOfCourse).getListOfExams(),jTextFieldTitle.getText());
            int numberOfQuastion = Integer.parseInt(jTextFieldNumberOfQ.getText());
            Random r = new Random();
            if(jTextAreaQuastionStatment.getText().length() > 0 && jTextFieldOption1.getText().length() > 0 && jTextFieldOption2.getText().length() > 0 && jTextFieldOption3.getText().length() > 0 && jTextFieldCorrectAns.getText().length() > 0){
                if(listOfCourses.get(indexOfCourse).getListOfExams().get(indexOFExam).getNumeberOfQuastion() > click + 1){
                    listOfQuastion.add(new Quastion());
                    listOfQuastion.get(click).setQuastionStatment(jTextAreaQuastionStatment.getText());
                    listOfQuastion.get(click).setPattrenOfQuastionOptions( Exam.getOptionsPattern(r.nextInt(0,3)));
                    listOfOption.add(new Options()); listOfOption.get(0).setOptionStatment(jTextFieldOption1.getText());listOfOption.get(0).setIsCorrect(false);
                    listOfOption.add(new Options());listOfOption.get(1).setOptionStatment(jTextFieldOption2.getText());listOfOption.get(1).setIsCorrect(false);
                    listOfOption.add(new Options());listOfOption.get(2).setOptionStatment(jTextFieldOption3.getText());listOfOption.get(2).setIsCorrect(false);
                    listOfOption.add(new Options());listOfOption.get(3).setOptionStatment(jTextFieldCorrectAns.getText());listOfOption.get(3).setIsCorrect(true);
                    listOfQuastion.get(click).setListOfOptions(listOfOption);
                    listOfOption.clear();
                    jLabel39.setText(click + 2 + "");
                }else{
                    listOfQuastion.add(new Quastion());
                    listOfQuastion.get(click).setQuastionStatment(jTextAreaQuastionStatment.getText());
                    listOfQuastion.get(click).setPattrenOfQuastionOptions( Exam.getOptionsPattern(r.nextInt(0,3)));
                    listOfOption.add(new Options()); listOfOption.get(0).setOptionStatment(jTextFieldOption1.getText());listOfOption.get(0).setIsCorrect(false);
                    listOfOption.add(new Options());listOfOption.get(1).setOptionStatment(jTextFieldOption2.getText());listOfOption.get(1).setIsCorrect(false);
                    listOfOption.add(new Options());listOfOption.get(2).setOptionStatment(jTextFieldOption3.getText());listOfOption.get(2).setIsCorrect(false);
                    listOfOption.add(new Options());listOfOption.get(3).setOptionStatment(jTextFieldCorrectAns.getText());listOfOption.get(3).setIsCorrect(true);
                    listOfQuastion.get(click).setListOfOptions(listOfOption);
                    listOfOption.clear();
                    listOfCourses.get(indexOfCourse).getListOfExams().get(indexOFExam).setListOfQuastions(listOfQuastion);
                    listOfQuastion.clear();
                    click = -1;
                    jLabel39.setText(1 + "");
                    jTabbedPane1.setSelectedIndex(9);
                }
                jTextAreaQuastionStatment.setText("");jTextFieldOption1.setText("");jTextFieldOption2.setText("");jTextFieldOption3.setText("");jTextFieldCorrectAns.setText("");
            }else{
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "Please check that you entered all above requirments","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldCorrectAnsKeyPressed

    private void jTextFieldOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOption2ActionPerformed

    private void jTextFieldOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOption1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextFieldCourseCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCourseCodeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTextAreaQuastionStatment.setText(null);
            jTextFieldOption1.setText(null);
            jTextFieldOption2.setText(null);
            jTextFieldOption3.setText(null);
            jTextFieldCorrectAns.setText(null);
            int indexOfInstructor = Instructor.getIndexFromEmail(employee, jTextField7.getText());
            int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCode.getText());
            if(Course.isCodeAvailable(employee.get(indexOfInstructor).getRegisteredCourses(), jTextFieldCourseCode.getText())){
                if(Exam.isUniqueTitle(listOfCourses.get(indexOfCourse).getListOfExams(), jTextFieldTitle.getText())){
                    boolean flag = true;
                    try{
                        listOfCourses.get(indexOfCourse).setListOfExams(new Exam(Integer.parseInt(jTextFieldNumberOfQ.getText()),jTextFieldTitle.getText(),jRadioButton3.isSelected()));
                    }catch(NumberFormatException e){
                        flag = false;
                        mp3player2.play();
                        JOptionPane.showMessageDialog(this, "number of question is not valid ","Errror",JOptionPane.ERROR_MESSAGE);
                    }
                    if(flag){
                        jTabbedPane1.setSelectedIndex(14);
                    }
                }else{
                    jLabelCodeNotAvailable.setText(Exam.ErrorInTitle());
                }
            }else{
                jLabelCodeNotAvailable.setText(Course.ErrorInCode());
            }
        }
    }//GEN-LAST:event_jTextFieldCourseCodeKeyPressed

    private void jTextFieldCourseCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCourseCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCourseCodeActionPerformed

    private void jButtonAddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddExamActionPerformed
 mp3player.play();
        jTextAreaQuastionStatment.setText(null);
        jTextFieldOption1.setText(null);
        jTextFieldOption2.setText(null);
        jTextFieldOption3.setText(null);
        jTextFieldCorrectAns.setText(null);
        int indexOfInstructor = Instructor.getIndexFromEmail(employee, jTextField7.getText());
        int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCode.getText());
        if(Course.isCodeAvailable(employee.get(indexOfInstructor).getRegisteredCourses(), jTextFieldCourseCode.getText())){
            if(Exam.isUniqueTitle(listOfCourses.get(indexOfCourse).getListOfExams(), jTextFieldTitle.getText())){
                boolean flag = true;
                try{
                    listOfCourses.get(indexOfCourse).setListOfExams(new Exam(Integer.parseInt(jTextFieldNumberOfQ.getText()),jTextFieldTitle.getText(),jRadioButton3.isSelected()));
                }catch(NumberFormatException e){
                    flag = false;
                    JOptionPane.showMessageDialog(this, "number of question is not valid ","Errror",JOptionPane.ERROR_MESSAGE);
                }
                if(flag){
                    jTabbedPane1.setSelectedIndex(14);
                }
            }else{
                jLabelCodeNotAvailable.setText(Exam.ErrorInTitle());
            }
        }else{
            jLabelCodeNotAvailable.setText(Course.ErrorInCode());
        }
    }//GEN-LAST:event_jButtonAddExamActionPerformed

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextFieldNumberOfQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumberOfQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumberOfQActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
 
        jTextFieldTitleExamToUpload.setText(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(10);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mp3player.play();
        int index = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCodeToUpdate.getText());
        listOfCourses.get(index).setVisibleExamButtonAndTitle(true);
        jTextFieldTitleExamToUpload.setText(jComboBox1.getSelectedItem().toString());
        jLabelExamTitleInStudentPage.setText(jTextFieldTitleExamToUpload.getText());
        JOptionPane.showMessageDialog(this, "Exam is uplodeaded successfully");
        jTabbedPane1.setSelectedIndex(11);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(11);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButtonSaveUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveUpdateActionPerformed
        mp3player.play();
        int index = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCodeToUpdate.getText());
        if(jTextFieldUpdateNextLec.getText().length() > 0 && jTextFieldUpdateDate.getText().length() > 0 && jTextFieldUpdateTime.getText().length() > 0 && jTextFieldUpdateNote.getText().length() > 0){
            listOfCourses.get(index).setNextlec(jTextFieldUpdateNextLec.getText());
            listOfCourses.get(index).setDate(jTextFieldUpdateDate.getText());
            listOfCourses.get(index).setTime(jTextFieldUpdateTime.getText());
            listOfCourses.get(index).setNote(jTextFieldUpdateNote.getText());
            JOptionPane.showMessageDialog(this, "Info updated successfully");
            jTabbedPane1.setSelectedIndex(9);
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Please check that you entered all above requirments","Errror",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSaveUpdateActionPerformed

    private void jTextFieldUpdateNoteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUpdateNoteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int index = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCodeToUpdate.getText());
            if(jTextFieldUpdateNextLec.getText().length() > 0 && jTextFieldUpdateDate.getText().length() > 0 && jTextFieldUpdateTime.getText().length() > 0 && jTextFieldUpdateNote.getText().length() > 0){
                listOfCourses.get(index).setNextlec(jTextFieldUpdateNextLec.getText());
                listOfCourses.get(index).setDate(jTextFieldUpdateDate.getText());
                listOfCourses.get(index).setTime(jTextFieldUpdateTime.getText());
                listOfCourses.get(index).setNote(jTextFieldUpdateNote.getText());
                JOptionPane.showMessageDialog(this, "Info updated successfully");
                jTabbedPane1.setSelectedIndex(9);
            }else{
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "Please check that you entered all above requirments","Errror",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldUpdateNoteKeyPressed

    private void jButtonUploadExamToStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadExamToStudentActionPerformed
        mp3player.play();
        int indexOfCourse = Course.getIndexFromCode(listOfCourses, jTextFieldCourseCodeToUpdate.getText());
        for(int i = 0;i < listOfCourses.get(indexOfCourse).getListOfExams().size();i++){
            jComboBox1.addItem(listOfCourses.get(indexOfCourse).getListOfExams().get(i).getTitle());
        }
        jTabbedPane1.setSelectedIndex(12);
    }//GEN-LAST:event_jButtonUploadExamToStudentActionPerformed

    private void jTextFieldUpdateNextLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUpdateNextLecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUpdateNextLecActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextFieldCourseCodeToUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCourseCodeToUpdateKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int indexOfInstructor = Instructor.getIndexFromEmail(employee,jTextField7.getText());
            if(jTextFieldCourseCodeToUpdate.getText().length() > 0){
                if(Course.isCodeAvailable(employee.get(indexOfInstructor).getRegisteredCourses(), jTextFieldCourseCodeToUpdate.getText())){
                    jTextFieldUpdateNextLec.setText(null);
                    jTextFieldUpdateDate.setText(null);
                    jTextFieldUpdateNote.setText(null);
                    jTextFieldUpdateTime.setText(null);
                    jTabbedPane1.setSelectedIndex(11);
                }else{
                    jLabelErrorCourseCodeToUpdate.setText("The course code is not valid");
                }
            }else{
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "Please check that you entered above requirments","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldCourseCodeToUpdateKeyPressed

    private void jTextFieldCourseCodeToUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCourseCodeToUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCourseCodeToUpdateActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 mp3player.play();
        int indexOfInstructor = Instructor.getIndexFromEmail(employee,jTextField7.getText());
        if(jTextFieldCourseCodeToUpdate.getText().length() > 0){
            if(Course.isCodeAvailable(employee.get(indexOfInstructor).getRegisteredCourses(), jTextFieldCourseCodeToUpdate.getText())){
                jTextFieldUpdateNextLec.setText(null);
                jTextFieldUpdateDate.setText(null);
                jTextFieldUpdateNote.setText(null);
                jTextFieldUpdateTime.setText(null);
                jTabbedPane1.setSelectedIndex(11);
            }else{
               
                jLabelErrorCourseCodeToUpdate.setText("The course code is not valid");
            }
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Please check that you entered above requirments","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        mp3player.play();
        int indexOfInstructor = Instructor.getIndexFromEmail(employee, jTextField7.getText());
        for(int i = 0;i < employee.get(indexOfInstructor).getRegisteredCourses().size();i++){
            jComboBox2.addItem(employee.get(indexOfInstructor).getRegisteredCourses().get(i).getCode());
        }
        jTabbedPane1.setSelectedIndex(16);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(15);
        //must return to login page to instructor
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButtonMakeExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeExamActionPerformed
         mp3player.play();
        jTextFieldTitle.setText(null);
        jTextFieldNumberOfQ.setText(null);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jTextFieldCourseCode.setText(null);
        jTabbedPane1.setSelectedIndex(13);
    }//GEN-LAST:event_jButtonMakeExamActionPerformed

    private void jButtonUpdateInfoAboutCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateInfoAboutCourseActionPerformed
        mp3player.play();
        jTextFieldCourseCodeToUpdate.setText(null);
        jTabbedPane1.setSelectedIndex(10);
    }//GEN-LAST:event_jButtonUpdateInfoAboutCourseActionPerformed

    private void jRadioButtonChangeGenderToFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonChangeGenderToFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonChangeGenderToFemaleActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void saveChangesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesjButtonActionPerformed
        mp3player.play();
        if(changeFirstNamejTextField.getText().length() > 0 && changeLastNamejTextField.getText().length() > 0 && changeAgejTextField4.getText().length() > 0 && changeFacualtyjTextField.getText().length() > 0 && changeEmailjTextField.getText().length() > 0 && changePasswordjTextField.getText().length() > 0 && (jRadioButtonChangeGenderToFemale.isSelected() || jRadioButtonChangeGenderToMale.isSelected())){
            int ID = Integer.parseInt(idTextField.getText());
            int index = Student.getIndexFromID(listOfStudent, ID);
            boolean flag1 = false,flag2 = false;
            boolean flag = true;
            try{
                listOfStudent.get(index).setAge(Integer.parseInt(changeAgejTextField4.getText()));
            }catch(NumberFormatException e){
                flag = false;
                mp3player2.play();
                JOptionPane.showMessageDialog(this,"Enter valid age","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(flag){
                listOfStudent.get(index).setFirstName(changeFirstNamejTextField.getText());
                listOfStudent.get(index).setLastName(changeLastNamejTextField.getText());
                listOfStudent.get(index).setFaculty(changeFacualtyjTextField.getText());
                if(jRadioButtonChangeGenderToMale.isSelected())
                listOfStudent.get(index).setGender("Male");
                else if(jRadioButtonChangeGenderToFemale.isSelected())
                listOfStudent.get(index).setGender("Female");
                if(changeEmailjTextField.getText().endsWith("@gmail.com")){
                    listOfStudent.get(index).setEmail(changeEmailjTextField.getText());
                    flag1 = true;
                }else{invalidDataMassagejLabel.setText(Student.errorInEmail());}
                if(changePasswordjTextField.getText().length() >= 8){
                    listOfStudent.get(index).setPassword(changePasswordjTextField.getText());
                    flag2 = true;
                }else{invalidDataMassagejLabel.setText(Student.errorInPassword());}
                if(flag1 && flag2){
                    JOptionPane.showMessageDialog(this,"The info changed successfully");
                    jTabbedPane1.setSelectedIndex(3);
                }
            }
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Please Check that you entered all above Requirment", "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_saveChangesjButtonActionPerformed

    private void changePasswordjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changePasswordjTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(changeFirstNamejTextField.getText().length() > 0 && changeLastNamejTextField.getText().length() > 0 && changeAgejTextField4.getText().length() > 0 && changeFacualtyjTextField.getText().length() > 0 && changeEmailjTextField.getText().length() > 0 && changePasswordjTextField.getText().length() > 0 && (jRadioButtonChangeGenderToFemale.isSelected() || jRadioButtonChangeGenderToMale.isSelected())){
                int ID = Integer.parseInt(idTextField.getText());
                int index = Student.getIndexFromID(listOfStudent, ID);
                boolean flag1 = false,flag2 = false;
                boolean flag = true;
                try{
                    listOfStudent.get(index).setAge(Integer.parseInt(changeAgejTextField4.getText()));
                }catch(NumberFormatException e){
                    flag = false;
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this,"Enter valid age","Error",JOptionPane.ERROR_MESSAGE);
                }
                if(flag){
                    listOfStudent.get(index).setFirstName(changeFirstNamejTextField.getText());
                    listOfStudent.get(index).setLastName(changeLastNamejTextField.getText());
                    listOfStudent.get(index).setFaculty(changeFacualtyjTextField.getText());
                    if(jRadioButtonChangeGenderToMale.isSelected())
                    listOfStudent.get(index).setGender("Male");
                    else if(jRadioButtonChangeGenderToFemale.isSelected())
                    listOfStudent.get(index).setGender("Female");
                    if(changeEmailjTextField.getText().endsWith("@gmail.com")){
                        listOfStudent.get(index).setEmail(changeEmailjTextField.getText());
                        flag1 = true;
                    }else{invalidDataMassagejLabel.setText(Student.errorInEmail());}
                    if(changePasswordjTextField.getText().length() >= 8){
                        listOfStudent.get(index).setPassword(changePasswordjTextField.getText());
                        flag2 = true;
                    }else{
                        mp3player2.play();
                        invalidDataMassagejLabel.setText(Student.errorInPassword());}
                    if(flag1 && flag2){
                        JOptionPane.showMessageDialog(this,"The info changed successfully");
                        jTabbedPane1.setSelectedIndex(3);
                    }
                }
            }else{
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "Please Check that you entered all above Requirment", "Error", JOptionPane.ERROR_MESSAGE);}
        }
    }//GEN-LAST:event_changePasswordjTextFieldKeyPressed

    private void changePasswordjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordjTextFieldActionPerformed

    private void changeLastNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLastNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeLastNamejTextFieldActionPerformed

    private void changeFirstNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFirstNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeFirstNamejTextFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ChangeInfojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeInfojButtonActionPerformed
        mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int index = Student.getIndexFromID(listOfStudent, ID);
        changeFirstNamejTextField.setText(listOfStudent.get(index).getFirstName());
        changeLastNamejTextField.setText(listOfStudent.get(index).getLastName());
        changeAgejTextField4.setText(listOfStudent.get(index).getAge() + "");
        changeFacualtyjTextField.setText(listOfStudent.get( index).getFaculty());
        changeEmailjTextField.setText(listOfStudent.get(index).getEmail());
        changePasswordjTextField.setText(listOfStudent.get(index).getPassword());
        if(listOfStudent.get(index).getGender().equals("Male")){
            jRadioButtonChangeGenderToMale.setSelected(true);
        }
        else{
            jRadioButtonChangeGenderToFemale.setSelected(true);
        }
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_ChangeInfojButtonActionPerformed

    private void jButtonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUndoActionPerformed
        mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        //String statment = jButtonOption1.getText();
        jButtonOption1.setEnabled(true);
        jButtonOption2.setEnabled(true);
        jButtonOption3.setEnabled(true);
        jButtonOption4.setEnabled(true);
        //return all jButtonOptions to default color
        jButtonOption1.setBackground(java.awt.Color.WHITE);
        jButtonOption2.setBackground(java.awt.Color.WHITE);
        jButtonOption3.setBackground(java.awt.Color.WHITE);
        jButtonOption4.setBackground(java.awt.Color.WHITE);
        jButtonUndo.setVisible(false);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsSolved(false);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsCorrect(false);
    }//GEN-LAST:event_jButtonUndoActionPerformed

    private void jButtonLastQuastionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastQuastionActionPerformed
        mp3player.play();
        clickQuastion--;
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        jButtonNextQuastion.setVisible(true);
        jLabel46.setText(clickQuastion + 1 + "");
        if(!listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getIsSolved()){
            jButtonUndo.setVisible(false);
            jButtonUndo.setVisible(false);
            jButtonOption1.setEnabled(true);
            jButtonOption2.setEnabled(true);
            jButtonOption3.setEnabled(true);
            jButtonOption4.setEnabled(true);
            jButtonOption1.setBackground(Color.WHITE);
            jButtonOption2.setBackground(Color.WHITE);
            jButtonOption3.setBackground(Color.WHITE);
            jButtonOption4.setBackground(Color.WHITE);
            if(clickQuastion < listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getNumeberOfQuastion()){
                jLabelExamTitle.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getTitle());
                jTextAreaShowQuastion.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getQuastionStatment());
                int [] optionsPattren = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getPattrenOfQuastionOptions();
                jButtonOption1.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[0]).getOptionStatment());
                jButtonOption2.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[1]).getOptionStatment());
                jButtonOption3.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[2]).getOptionStatment());
                jButtonOption4.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[3]).getOptionStatment());
                if(clickQuastion == 0){
                    jButtonNextQuastion.setVisible(true);
                    jButtonLastQuastion.setVisible(false);
                }
            }
        }else{
            jButtonUndo.setVisible(true);
            if(clickQuastion < listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getNumeberOfQuastion()){
                jLabelExamTitle.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getTitle());
                jTextAreaShowQuastion.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getQuastionStatment());
                int [] optionsPattren = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getPattrenOfQuastionOptions();
                jButtonOption1.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[0]).getOptionStatment());
                jButtonOption2.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[1]).getOptionStatment());
                jButtonOption3.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[2]).getOptionStatment());
                jButtonOption4.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[3]).getOptionStatment());
                int selectedAns = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getSelectedAns();
                if(selectedAns == 1){jButtonOption1.setBackground(java.awt.Color.PINK);jButtonOption2.setBackground(Color.WHITE);jButtonOption3.setBackground(Color.WHITE);jButtonOption4.setBackground(Color.WHITE);}
                if(selectedAns == 2){jButtonOption2.setBackground(java.awt.Color.PINK);jButtonOption1.setBackground(Color.WHITE);jButtonOption3.setBackground(Color.WHITE);jButtonOption4.setBackground(Color.WHITE);}
                if(selectedAns == 3){jButtonOption3.setBackground(java.awt.Color.PINK);jButtonOption1.setBackground(Color.WHITE);jButtonOption2.setBackground(Color.WHITE);jButtonOption4.setBackground(Color.WHITE);}
                if(selectedAns == 4){jButtonOption4.setBackground(java.awt.Color.PINK);jButtonOption1.setBackground(Color.WHITE);jButtonOption2.setBackground(Color.WHITE);jButtonOption3.setBackground(Color.WHITE);}
                jButtonOption1.setEnabled(false);
                jButtonOption2.setEnabled(false);
                jButtonOption3.setEnabled(false);
                jButtonOption4.setEnabled(false);
            }
            if(clickQuastion == 0){
                jButtonNextQuastion.setVisible(true);
                jButtonLastQuastion.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButtonLastQuastionActionPerformed

    private void jButtonNextQuastionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextQuastionActionPerformed
        mp3player.play();
        clickQuastion++;
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        jButtonLastQuastion.setVisible(true);
        jLabel46.setText(clickQuastion + 1 + "");
        if(!listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getIsSolved()){
            jButtonUndo.setVisible(false);
            jButtonOption1.setEnabled(true);
            jButtonOption2.setEnabled(true);
            jButtonOption3.setEnabled(true);
            jButtonOption4.setEnabled(true);
            jButtonOption1.setBackground(Color.WHITE);
            jButtonOption2.setBackground(Color.WHITE);
            jButtonOption3.setBackground(Color.WHITE);
            jButtonOption4.setBackground(Color.WHITE);
            if(clickQuastion < listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getNumeberOfQuastion()){
                jLabelExamTitle.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getTitle());
                jTextAreaShowQuastion.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getQuastionStatment());
                int [] optionsPattren = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getPattrenOfQuastionOptions();
                jButtonOption1.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[0]).getOptionStatment());
                jButtonOption2.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[1]).getOptionStatment());
                jButtonOption3.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[2]).getOptionStatment());
                jButtonOption4.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[3]).getOptionStatment());
                if(clickQuastion == listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getNumeberOfQuastion() - 1){
                    jButtonNextQuastion.setVisible(false);
                    jButtonLastQuastion.setVisible(true);
                }
            }
        }else{
            jButtonUndo.setVisible(true);
            if(clickQuastion < listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getNumeberOfQuastion()){
                jLabelExamTitle.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getTitle());
                jTextAreaShowQuastion.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getQuastionStatment());
                int [] optionsPattren = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getPattrenOfQuastionOptions();
                jButtonOption1.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[0]).getOptionStatment());
                jButtonOption2.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[1]).getOptionStatment());
                jButtonOption3.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[2]).getOptionStatment());
                jButtonOption4.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getListOfOptions().get(optionsPattren[3]).getOptionStatment());
                int selectedAns = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(clickQuastion).getSelectedAns();
                jButtonOption1.setOpaque(true);
                jButtonOption2.setOpaque(true);
                jButtonOption3.setOpaque(true);
                jButtonOption4.setOpaque(true);
                if(selectedAns == 1){jButtonOption1.setBackground(java.awt.Color.PINK);jButtonOption2.setBackground(Color.WHITE);jButtonOption3.setBackground(Color.WHITE);jButtonOption4.setBackground(Color.WHITE);}
                if(selectedAns == 2){jButtonOption2.setBackground(java.awt.Color.PINK);jButtonOption1.setBackground(Color.WHITE);jButtonOption3.setBackground(Color.WHITE);jButtonOption4.setBackground(Color.WHITE);}
                if(selectedAns == 3){jButtonOption3.setBackground(java.awt.Color.PINK);jButtonOption1.setBackground(Color.WHITE);jButtonOption2.setBackground(Color.WHITE);jButtonOption4.setBackground(Color.WHITE);}
                if(selectedAns == 4){jButtonOption4.setBackground(java.awt.Color.PINK);jButtonOption1.setBackground(Color.WHITE);jButtonOption2.setBackground(Color.WHITE);jButtonOption3.setBackground(Color.WHITE);}
                jButtonOption1.setEnabled(false);
                jButtonOption2.setEnabled(false);
                jButtonOption3.setEnabled(false);
                jButtonOption4.setEnabled(false);
            }
            if(clickQuastion == listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getNumeberOfQuastion() - 1){
                jButtonNextQuastion.setVisible(false);
                jButtonLastQuastion.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButtonNextQuastionActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        int gradeObtained = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getGradesObtaind();
        int numberOfQuastion = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().size();
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).isDgreeVision()){
            JOptionPane.showMessageDialog(this, "You got " + gradeObtained + " out of " + numberOfQuastion );
            jTabbedPane1.setSelectedIndex(0);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).setVisibleExamButtonAndTitle(false);
            clickQuastion = 0;
        }else{
            jTabbedPane1.setSelectedIndex(11);
            listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).setVisibleExamButtonAndTitle(false);
            clickQuastion = 0;
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOption4ActionPerformed
     mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        String statment = jButtonOption4.getText();
        boolean isCorrect = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).getisQuastionAnsCorrect(statment);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setSelectedAns(4);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsSolved(true);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsCorrect(isCorrect);
        jButtonOption4.setOpaque(true);
        jButtonOption4.setBackground(Color.PINK);
        jButtonOption1.setEnabled(false);
        jButtonOption2.setEnabled(false);
        jButtonOption3.setEnabled(false);
        jButtonOption4.setEnabled(false);
        jButtonUndo.setVisible(true);
    }//GEN-LAST:event_jButtonOption4ActionPerformed

    private void jButtonOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOption3ActionPerformed
   mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        String statment = jButtonOption3.getText();
        boolean isCorrect = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).getisQuastionAnsCorrect(statment);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setSelectedAns(3);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsSolved(true);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsCorrect(isCorrect);
        jButtonOption3.setOpaque(true);
        jButtonOption3.setBackground(Color.PINK);
        jButtonOption1.setEnabled(false);
        jButtonOption2.setEnabled(false);
        jButtonOption3.setEnabled(false);
        jButtonOption4.setEnabled(false);
        jButtonUndo.setVisible(true);
    }//GEN-LAST:event_jButtonOption3ActionPerformed

    private void jButtonOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOption2ActionPerformed
      mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        String statment = jButtonOption2.getText();
        boolean isCorrect = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).getisQuastionAnsCorrect(statment);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setSelectedAns(2);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsSolved(true);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsCorrect(isCorrect);
        jButtonOption2.setOpaque(true);
        jButtonOption2.setBackground(Color.PINK);
        jButtonOption1.setEnabled(false);
        jButtonOption2.setEnabled(false);
        jButtonOption3.setEnabled(false);
        jButtonOption4.setEnabled(false);
        jButtonUndo.setVisible(true);
    }//GEN-LAST:event_jButtonOption2ActionPerformed

    private void jButtonOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOption1ActionPerformed
      mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        int indexOfCourse = Course.getIndexFromCode(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),jLabelRegisteredCourseCode.getText());
        int indexOfExam = Exam.getIndexFromTitle(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams(),jTextFieldTitleExamToUpload.getText());
        String statment = jButtonOption1.getText();
        boolean isCorrect = listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).getisQuastionAnsCorrect(statment);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setSelectedAns(1);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsSolved(true);
        listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(indexOfCourse).getListOfExams().get(indexOfExam).getListOfQuastions().get(Integer.parseInt(jLabel46.getText()) - 1).setIsCorrect(isCorrect);
        jButtonOption1.setOpaque(true);
        jButtonOption1.setBackground(Color.PINK);
        jButtonOption1.setEnabled(false);
        jButtonOption2.setEnabled(false);
        jButtonOption3.setEnabled(false);
        jButtonOption4.setEnabled(false);
        jButtonUndo.setVisible(true);
    }//GEN-LAST:event_jButtonOption1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void myAccountjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountjButtonActionPerformed
         mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int index = Student.getIndexFromID(listOfStudent, ID);
        firstNamejLabel.setText(listOfStudent.get(index).getFirstName());
        secondNamejLabel.setText(listOfStudent.get(index).getLastName());
        studentGenderjLabel.setText(listOfStudent.get(index).getGender());
        studentAgejLabel.setText(listOfStudent.get(index).getAge() + "");
        studentFacualtyjLabel.setText(listOfStudent.get( index).getFaculty());
        studentEmailjLabel.setText(listOfStudent.get(index).getEmail());
        studentPasswordjLabel.setText(listOfStudent.get(index).getPassword());
        studentRegisteredCoursesjLabel.setText(listOfStudent.get(index).getListOfRegisteredCourse().size() + "");
        studentIDjLabel.setText(listOfStudent.get(index).getId() + "");
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_myAccountjButtonActionPerformed

    private void RigsteredCoursesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RigsteredCoursesjButtonActionPerformed
     mp3player.play();
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().size() == 1){
            jButtonNextRegisteredCourse.setVisible(false);
        }else{
            jButtonNextRegisteredCourse.setVisible(true);
        }
        if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().size() != 0){
            clickNextRigsterdCourse = 0;
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getVisibleExamButtonAndTitle()){
                jButtonEnterToExam.setVisible(true);
                jLabelExamTitleInStudentPage.setVisible(true);
            }else{
                jButtonEnterToExam.setVisible(false);
                jLabelExamTitleInStudentPage.setVisible(false);
            }
            jLabelnemeOfCourse.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getCourseName() + "");
            jLabelNextLec.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getNextlec()+ "");
            jLabelDate.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getDate()+ "");
            jLabelTime.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getTime()+ "");
            jLabelNote.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getNote()+ "");
            jLabelRegisteredCourseCode.setText(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getCode()+ "");
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).isVisibiltyOfCourseFeadback()){
                jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
            }else{
                if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).isFlagStar1()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).isFlagStar2()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).isFlagStar3()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).isFlagStar4()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).isFlagStar4()){
                    jButtonStar1.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar2.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar3.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar4.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar5.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                }
            }
            if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getInstructor().isVisibiltyOfInstructorFeadback()){
                jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
            }else{
                if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getInstructor().isFlagStar1()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getInstructor().isFlagStar2()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getInstructor().isFlagStar3()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getInstructor().isFlagStar4()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarFalse.png")));
                }else if(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse().get(0).getInstructor().isFlagStar5()){
                    jButtonStar6.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar7.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar8.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar9.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                    jButtonStar10.setIcon(new ImageIcon(getClass().getResource("/photo/icon/StarTrue.png")));
                }
            }
            jTabbedPane1.setSelectedIndex(5);
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this,"Your not registered in any course");
        }
    }//GEN-LAST:event_RigsteredCoursesjButtonActionPerformed

    private void SeeCoursejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeCoursejButtonActionPerformed
        mp3player.play();
      
        int ID = Integer.parseInt(idTextField.getText());
        int indexOfStudent = Student.getIndexFromID(listOfStudent, ID);
        CourseNamejTextArea.setText(listOfCourses.get(0).getCourseName());
        languagejLabel.setText(listOfCourses.get(0).getLanguage());
        codejLabel.setText(listOfCourses.get(0).getCode());
        coursePricejLabel.setText(listOfCourses.get(0).getCoursePrice() + "");
        CourseImagejLabel.setIcon(listOfCourses.get(0).getImageIcon());
        for(int j = 0;j < listOfCourses.get(0).getSizeOfObjective();j++){objectivejTextArea.append("# " + listOfCourses.get(0).getObjective(j) + "\n\n");}
        for(int j = 0;j < listOfCourses.get(0).getSizeOfContents();j++){contentjTextArea.append((j + 1)+ ") " +listOfCourses.get(0).getContents(j) + "\n\n");}
        descriptionjTextArea.setText(listOfCourses.get(0).getDescription());
        numberOfSectionjLabel.setText(listOfCourses.get(0).getNumberOfSection() + "");
        numberOfLecturesjLabel.setText(listOfCourses.get(0).getNumberOfLecture() + "");
        totalHoursjLabel.setText(listOfCourses.get(0).getTotalHours() + "");
        requirementsjLabel.setText(listOfCourses.get(0).getRequirements());
        instructorNamejLabel.setText(listOfCourses.get(0).getInstructor().getName());//from Instructor class
        jopTitlejLabel.setText(listOfCourses.get(0).getInstructor().getJopTitle());// from Instructor class
        instructorImagejLabel.setIcon(listOfCourses.get(0).getInstructor().getImageIcon());
        studentsjLabel.setText(listOfCourses.get(0).getInstructor().getTotalNumebrOfStudent()+ "");
        instructorRatingjLabel.setText(listOfCourses.get(0).getInstructor().getInstructorRating() + "");
        reviewsjLabel.setText(listOfCourses.get(0).getInstructor().getTotalResponse() + "");
        courseRatingjLabel.setText(listOfCourses.get(0).getCourseRating() + "");
        if(listOfCourses.get(0).getTotalResponse() != 0){
            int value5 = (listOfCourses.get(0).getFiveOutOfFive() / listOfCourses.get(0).getTotalResponse()) * 100;
            jProgressBar1.setValue(Math.round(value5));
            int value4 = (listOfCourses.get(0).getFourOutOfFive() / listOfCourses.get(0).getTotalResponse()) * 100;
            jProgressBar2.setValue(Math.round(value4));
            fourjLabel.setText(value4 + "%");
            int value3 = (listOfCourses.get(0).getThreeOutOfFive() / listOfCourses.get(0).getTotalResponse()) * 100;
            jProgressBar3.setValue(Math.round(value3));
            threejLabel.setText(value3  +"%");
            int value2 = (listOfCourses.get(0).getTwoOutOfFive() / listOfCourses.get(0).getTotalResponse()) * 100;
            jProgressBar4.setValue(Math.round(value2));
            twojLabel.setText(value2 + "%");
            int value1 = (listOfCourses.get(0).getOneOutOfFive() / listOfCourses.get(0).getTotalResponse()) * 100;
            jProgressBar5.setValue(Math.round(value1));
            onejLabel.setText(value1 + "%");
        }else{
            jProgressBar1.setValue(0);
            jProgressBar2.setValue(0);
            jProgressBar3.setValue(0);
            jProgressBar4.setValue(0);
            jProgressBar5.setValue(0);
            fivejLabel.setText(0 + "%");
            fourjLabel.setText(0 + "%");
            threejLabel.setText(0 + "%");
            twojLabel.setText(0 + "%");
            onejLabel.setText(0 + "%");
        }
        if(listOfCourses.size() == 1)
        nextCoursejButton.setVisible(false);
        objectivejTextArea.setLineWrap(true);
        objectivejTextArea.setWrapStyleWord(true);
        contentjTextArea.setLineWrap(true);
        contentjTextArea.setWrapStyleWord(true);
        descriptionjTextArea.setLineWrap(true);
        descriptionjTextArea.setWrapStyleWord(true);
        CourseNamejTextArea.setLineWrap(true);
        CourseNamejTextArea.setWrapStyleWord(true);
        clickCourse = 0;
        if(Course.isCodeAvailable(listOfStudent.get(indexOfStudent).getListOfRegisteredCourse(),codejLabel.getText())){
            RegisterNowjButton.setEnabled(false);
            RegisterNowjButton.setText("Registered");
        }else{
            RegisterNowjButton.setEnabled(true);
            RegisterNowjButton.setText("Register now");
        }
        jScrollPaneSeeCourses.getVerticalScrollBar().setValue(0);
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_SeeCoursejButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
         mp3player.play();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_backButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void idTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            boolean flag = true;
            int ID = 0;
            try{
                ID = Integer.parseInt(idTextField.getText());
            }catch(NumberFormatException e){
                flag = false;
                JOptionPane.showMessageDialog(this, "Enter valid ID","Error", JOptionPane.ERROR_MESSAGE);
            }
            if(flag && emailTextField.getText().length() > 0 && passwordTextField.getText().length() > 0 && idTextField.getText().length() > 0){
                if(Student.isIDAvailable(listOfStudent, ID)){
                    int index = Student.getIndexFromID(listOfStudent, ID);
                    if(listOfStudent.get(index).emailChecker(emailTextField.getText())){
                        if(listOfStudent.get(index).passwordChecker(passwordTextField.getText())){
                            nameOfStudentjLabel.setText(listOfStudent.get(index).getFirstName());
                            jTabbedPane1.setSelectedIndex(3);
                        }else{errorLogInLabel.setText(Student.errorInPassword());}
                    }else{errorLogInLabel.setText(Student.errorInEmail());}
                }else{errorLogInLabel.setText(Student.errorInID());}
            }else{
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "Please check that you entered all above requirments","Error", JOptionPane.ERROR_MESSAGE);}
        }
    }//GEN-LAST:event_idTextFieldKeyPressed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

         char [] pswd = passwordTextField.getPassword();
         String password=new String(pswd);
         
        boolean flag = true;
        int ID = 0;
        try{
            
            ID = Integer.parseInt(idTextField.getText());
        }catch(NumberFormatException e){
            flag = false;
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Enter valid ID","Error", JOptionPane.ERROR_MESSAGE);
        }
        if(flag && emailTextField.getText().length() > 0 && password.length() > 0 && idTextField.getText().length() > 0){
           mp3player.play();
            if(Student.isIDAvailable(listOfStudent, ID)){
                int index = Student.getIndexFromID(listOfStudent, ID);
                if(listOfStudent.get(index).emailChecker(emailTextField.getText())){
                    if(listOfStudent.get(index).passwordChecker(password)){
                        nameOfStudentjLabel.setText(listOfStudent.get(index).getFirstName());
                        jTabbedPane1.setSelectedIndex(3);
                    }else{
                        mp3player2.play();
                        errorLogInLabel.setText(Student.errorInPassword());}
                }else{
                    mp3player2.play();
                    errorLogInLabel.setText(Student.errorInEmail());}
            }else{
                mp3player2.play();
                errorLogInLabel.setText(Student.errorInID());}
        }
        else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Please check that you entered all above requirments","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_loginButtonActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jTextField1.getText().length()>0&&jTextField2.getText().length()>0&&jTextField3.getText().length()>0&&jTextField5.getText().endsWith("@gmail.com")&&jTextField6.getText().length()>=8 && (jRadioButton1.isSelected() || jRadioButton2.isSelected()))
            {
                boolean flag = true;
                try{
                    int age = Integer.parseInt(jTextField3.getText());
                }catch(NumberFormatException e){
                    flag = false;
                    JOptionPane.showMessageDialog(this, "Please, Enter valid age","Errror",JOptionPane.ERROR_MESSAGE);
                }
                if(flag){
                    listOfStudent.add(new Student(listOfStudent));
                    listOfStudent.get(listOfStudent.size() - 1).setFirstName(jTextField1.getText());
                    listOfStudent.get(listOfStudent.size() - 1).setLastName(jTextField2.getText());
                    listOfStudent.get(listOfStudent.size() - 1).setGender(jRadioButton2.getText());
                    if(jRadioButton1.isSelected())
                    {
                        listOfStudent.get(listOfStudent.size() - 1).setGender("Male");
                    }

                    if(jRadioButton2.isSelected())
                    {
                        listOfStudent.get(listOfStudent.size() - 1).setGender("Female");
                    }
                    listOfStudent.get(listOfStudent.size() - 1).setAge(Integer.parseInt(jTextField3.getText()));
                    listOfStudent.get(listOfStudent.size() - 1).setFaculty(jTextField4.getText());
                    listOfStudent.get(listOfStudent.size() - 1).setEmail(jTextField5.getText());
                    listOfStudent.get(listOfStudent.size() - 1).setPassword(jTextField6.getText());
                    listOfStudent.get(listOfStudent.size() - 1);
                    jTabbedPane1.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(this, "Your ID is " + (Student.getTotalNumberOfStudent() - 1));
                }
            }else{
                JOptionPane.showMessageDialog(this, "Please Check that you entered all above Requirment","Errror",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
 
        if(jTextField1.getText().length()>0&&jTextField2.getText().length()>0&&jTextField3.getText().length()>0&&jTextField5.getText().endsWith("@gmail.com")&&jTextField6.getText().length()>=8 && (jRadioButton1.isSelected() || jRadioButton2.isSelected()))
        {
            
            boolean flag = true;
            try{
                int age = Integer.parseInt(jTextField3.getText());
            }catch(NumberFormatException e){
                flag = false;
                mp3player2.play();
                JOptionPane.showMessageDialog(this, "Please, Enter valid age","Errror",JOptionPane.ERROR_MESSAGE);
            }
            if(flag){
                mp3player.play();
                Student s = new Student(listOfStudent);
                s.setFirstName(jTextField1.getText());
                s.setLastName(jTextField2.getText());
                s.setAge(Integer.parseInt(jTextField3.getText()));
                s.setFaculty(jTextField4.getText());
                if(jRadioButton1.isSelected())
                {
                    s.setGender("Male");
                }
                if(jRadioButton2.isSelected())
                {
                    s.setGender("Female");
                }
                s.setEmail(jTextField5.getText());
                s.setPassword(jTextField6.getText());
                listOfStudent.add(s);
                jTabbedPane1.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "Your ID is " + (Student.getTotalNumberOfStudent() - 1));

            }
        }else{
            mp3player2.play();
            JOptionPane.showMessageDialog(this, "Please Check that you entered all above Requirment","Errror",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        ////////////////////////////////////// ADDING TEN STUDENTS /////////////////////////////////////////////////////
        //student number 1
        mp3player.play();
        
        AddCourseFram.i=3;
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(0).setFirstName("Omar");
        listOfStudent.get(0).setLastName("Hamdy");
        listOfStudent.get(0).setAge(20);
        listOfStudent.get(0).setEmail("omar@gmail.com");
        listOfStudent.get(0).setPassword("12345678");
        listOfStudent.get(0).setGender("Male");
        listOfStudent.get(0).setFaculty("Engineering");
        //student number 2
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(1).setFirstName("Noor");
        listOfStudent.get(1).setLastName("Ahmed");
        listOfStudent.get(1).setAge(20);
        listOfStudent.get(1).setEmail("noor@gmail.com");
        listOfStudent.get(1).setPassword("87654321");
        listOfStudent.get(1).setGender("Male");
        listOfStudent.get(1).setFaculty("Engineering");
        //student number 3
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(2).setFirstName("Yasser");
        listOfStudent.get(2).setLastName("Hamdy");
        listOfStudent.get(2).setAge(20);
        listOfStudent.get(2).setEmail("yasser@gmail.com");
        listOfStudent.get(2).setPassword("12345678");
        listOfStudent.get(2).setGender("Male");
        listOfStudent.get(2).setFaculty("Engineering");
        //student number 4
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(3).setFirstName("Mohammed");
        listOfStudent.get(3).setLastName("Afsha");
        listOfStudent.get(3).setAge(20);
        listOfStudent.get(3).setEmail("afsha@gmail.com");
        listOfStudent.get(3).setPassword("87654321");
        listOfStudent.get(3).setGender("Male");
        listOfStudent.get(3).setFaculty("Football Player");
        //student number 5
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(4).setFirstName("Fatma");
        listOfStudent.get(4).setLastName("Hamdy");
        listOfStudent.get(4).setAge(20);
        listOfStudent.get(4).setEmail("fatma@gmail.com");
        listOfStudent.get(4).setPassword("12345678");
        listOfStudent.get(4).setGender("Female");
        listOfStudent.get(4).setFaculty("Engineering");
        //student number 6
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(5).setFirstName("Hassan");
        listOfStudent.get(5).setLastName("Hamdy");
        listOfStudent.get(5).setAge(20);
        listOfStudent.get(5).setEmail("hassan@gmail.com");
        listOfStudent.get(5).setPassword("87654321");
        listOfStudent.get(5).setGender("Male");
        listOfStudent.get(5).setFaculty("Engineering");
        //student number 7
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(6).setFirstName("Hossam");
        listOfStudent.get(6).setLastName("Hamdy");
        listOfStudent.get(6).setAge(20);
        listOfStudent.get(6).setEmail("hossam@gmail.com");
        listOfStudent.get(6).setPassword("12345678");
        listOfStudent.get(6).setGender("Male");
        listOfStudent.get(6).setFaculty("Engineering");
        //student number 8
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(7).setFirstName("Khalid");
        listOfStudent.get(7).setLastName("Hamdy");
        listOfStudent.get(7).setAge(20);
        listOfStudent.get(7).setEmail("khalid@gmail.com");
        listOfStudent.get(7).setPassword("87654321");
        listOfStudent.get(7).setGender("Male");
        listOfStudent.get(7).setFaculty("Engineering");
        //student number 9
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(8).setFirstName("Ahmed");
        listOfStudent.get(8).setLastName("Hamdy");
        listOfStudent.get(8).setAge(20);
        listOfStudent.get(8).setEmail("ahmed@gmail.com");
        listOfStudent.get(8).setPassword("12345678");
        listOfStudent.get(8).setGender("Male");
        listOfStudent.get(8).setFaculty("Engineering");
        //student number 10
        listOfStudent.add(new Student(listOfStudent));
        listOfStudent.get(9).setFirstName("Mohammed");
        listOfStudent.get(9).setLastName("Hamdy");
        listOfStudent.get(9).setAge(20);
        listOfStudent.get(9).setEmail("mohammed@gmail.com");
        listOfStudent.get(9).setPassword("87654321");
        listOfStudent.get(9).setGender("Male");
        listOfStudent.get(9).setFaculty("Engineering");
        //////////////////////////////////// ADDING TWO INSTRUCTOR /////////////////////////////////////////////////////
        // instructor 1
        employee.add(new Instructor((employee)));
        employee.get(0).setName("Khalid Hassan Mohammed");
        employee.get(0).setEmail("khalid@gmail.com");
        employee.get(0).setPassword("12345678");
        employee.get(0).setAge(42 + "");
        employee.get(0).setAddress("cairo");
        employee.get(0).setPhone("2131313131");
        employee.get(0).setSalary(10000);
        employee.get(0).setJopTitle("Developer");
        employee.get(0).setImageIcon(new ImageIcon(getClass().getResource("/photo/icon/instructor1.png")));
        //instructor 2
        employee.add(new Instructor((employee)));
        employee.get(1).setName("Ahmed Hassan Mohammed");
        employee.get(1).setEmail("ahmed@gmail.com");
        employee.get(1).setPassword("12345678");
        employee.get(1).setAge(30 + "");
        employee.get(1).setAddress("cairo :)");
        employee.get(1).setPhone("1234567891011");
        employee.get(1).setSalary(15000);
        employee.get(1).setJopTitle("Developer in semens");
        employee.get(1).setImageIcon(new ImageIcon(getClass().getResource("/photo/icon/instructor2.png")));
        /////////////////////////////////// ADDING  THREE COURSES //////////////////////////////////////////////////
        //course 1
        listOfCourses.add(new Course(listOfCourses));
        listOfCourses.get(0).setCourseName("Embaded System");
        listOfCourses.get(0).setCode("A1");
        listOfCourses.get(0).setCoursePrice(1000);
        listOfCourses.get(0).setLanguage("English");
        listOfCourses.get(0).setDescription("This Embedded Systems course is jam-packed with 60 days of lessons that take you from complete Embedded systems novice to feeling confident making your own Embedded systems products or starting a career in the industry.");
        listOfCourses.get(0).setRequirements("The student have basics knowladge about embaded system");
        listOfCourses.get(0).setObjective("Learn Embedded C");
        listOfCourses.get(0).setObjective("Learn PCB Fabrication from scratch");
        listOfCourses.get(0).setObjective("Learn to use all the software tools needed to be successful as an Embedded System Enginee");
        listOfCourses.get(0).setObjective("Learn how to solve complex problems with microcontrollers");
        listOfCourses.get(0).setObjective("How to implement communication protocols in your project");
        listOfCourses.get(0).setObjective("Build an Arduino prototype to create your own game using LEDs");
        listOfCourses.get(0).setContents("Embedded System Introduction");
        listOfCourses.get(0).setContents("C Programming - 10 Days");
        listOfCourses.get(0).setContents("The Power of Search");
        listOfCourses.get(0).setContents("Write and Compile C Codes in your browser");
        listOfCourses.get(0).setTotalHours(120);
        listOfCourses.get(0).setNumberOfLecture(100);
        listOfCourses.get(0).setNumberOfSection(150);
        listOfCourses.get(0).setInstructor(employee.get(0));
        listOfCourses.get(0).setImageIcon(new ImageIcon(getClass().getResource("/photo/icon/embadedSystem.jpg")));
        //course 2
        listOfCourses.add(new Course(listOfCourses));
        listOfCourses.get(1).setCourseName("Machine Learning");
        listOfCourses.get(1).setCode("A2");
        listOfCourses.get(1).setCoursePrice(5000);
        listOfCourses.get(1).setLanguage("English");
        listOfCourses.get(1).setDescription("In this course, we will be reviewing two main components: First, you will be learning about the purpose of Machine Learning and where it applies to the real world.Second, you will get a general overview of Machine Learning topics such as supervised vs unsupervised learning,  model evaluation, and Machine Learning algorithms.");
        listOfCourses.get(1).setRequirements("Just some high school mathematics level.");
        listOfCourses.get(1).setObjective("Learn Python");
        listOfCourses.get(1).setObjective("Master Machine Learning on Python & R");
        listOfCourses.get(1).setObjective("Have a great intuition of many Machine Learning models");
        listOfCourses.get(1).setObjective("Make accurate predictions");
        listOfCourses.get(1).setObjective("Make powerful analysis");
        listOfCourses.get(1).setObjective("Make robust Machine Learning models");
        listOfCourses.get(1).setContents("Data Preprocessing in python 9-lectures");
        listOfCourses.get(1).setContents("Data preprocessing in R 10-lectures");
        listOfCourses.get(1).setContents("simple linear Regression 12-lectures");
        listOfCourses.get(1).setContents("Multiple ;inear Regression 20-lectures");
        listOfCourses.get(1).setTotalHours(44);
        listOfCourses.get(1).setNumberOfLecture(62);
        listOfCourses.get(1).setNumberOfSection(45);
        listOfCourses.get(1).setInstructor(employee.get(1));
        listOfCourses.get(1).setImageIcon(new ImageIcon(getClass().getResource("/photo/icon/machineLearning.jpg")));
        //course 3
        listOfCourses.add(new Course(listOfCourses));
        listOfCourses.get(2).setCourseName("Artificial Intelligence");
        listOfCourses.get(2).setCode("A3");
        listOfCourses.get(2).setCoursePrice(3000);
        listOfCourses.get(2).setLanguage("English");
        listOfCourses.get(2).setDescription("Learn key AI concepts and intuition training to get you quickly up to speed with all things AI. Covering:1-How to start building AI with no previous coding experience using Python.2-How to merge AI with OpenAI Gym to learn as effectively as possible.3-How to optimize your AI to reach its maximum potential in the real world.");
        listOfCourses.get(2).setRequirements("High School Maths,Basic Python knowledge");
        listOfCourses.get(2).setObjective("Build an AI");
        listOfCourses.get(2).setObjective("Make a virtual Self Driving Car");
        listOfCourses.get(2).setObjective("Make an AI to beat games");
        listOfCourses.get(2).setObjective("Understand the theory behind Artificial Intelligence");
        listOfCourses.get(2).setObjective("Solve Real World Problems with AI");
        listOfCourses.get(2).setObjective("Master the State of the Art AI models");
        listOfCourses.get(2).setContents("Q-Learning Intuition 9-lectures");
        listOfCourses.get(2).setContents("Q=Learning Visualization 2-Lectures");
        listOfCourses.get(2).setContents("Deep Q-Learning Intuition 5-lectures");
        listOfCourses.get(2).setContents("Q=Learning Visualization 5-Lectures");
        listOfCourses.get(2).setTotalHours(322);
        listOfCourses.get(2).setNumberOfLecture(130);
        listOfCourses.get(2).setNumberOfSection(54);
        listOfCourses.get(2).setInstructor(employee.get(1));
        listOfCourses.get(2).setImageIcon(new ImageIcon(getClass().getResource("/photo/icon/AI.jpg")));
        employee.get(0).setRegisteredCourses(listOfCourses.get(0));
        employee.get(1).setRegisteredCourses(listOfCourses.get(1));
        employee.get(1).setRegisteredCourses(listOfCourses.get(2));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void b_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adminActionPerformed
        mp3player.play();
        o.setVisible(false);
        k.setVisible(true);
    }//GEN-LAST:event_b_adminActionPerformed

    private void b_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_studentActionPerformed
        mp3player.play();
        emailTextField.setText("Email");
        passwordTextField.setText(null);
        idTextField.setText("ID");
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_b_studentActionPerformed

    private void b_instructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_instructorActionPerformed
        mp3player.play();
        jTextField7.setText("Email");
        jPasswordField2.setText(null);
        jTabbedPane1.setSelectedIndex(15);
    }//GEN-LAST:event_b_instructorActionPerformed

    private void b_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registerActionPerformed
        mp3player.play();
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_b_registerActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(15);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        mp3player.play();
        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_jButton20ActionPerformed
    int clickCourse = 0;    int click = -1;    int clickNextRigsterdCourse = 0;        int clickQuastion = 0;    
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
            java.util.logging.Logger.getLogger(DesignCourseMangmentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignCourseMangmentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignCourseMangmentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignCourseMangmentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new DesignCourseMangmentSystem().setVisible(true);
               o.setVisible(true);
            }
        });
    }
   public static void addFromAddCourseFram (Course obj)
   {
       listOfCourses.add(obj);
   }
   public static  ArrayList <Course> listOfCourses = new ArrayList<Course>();
    ArrayList <Student> listOfStudent = new ArrayList();
    ArrayList<Quastion> listOfQuastion = new ArrayList();
    ArrayList<Options> listOfOption = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgejLabel;
    private javax.swing.JButton ChangeInfojButton;
    private javax.swing.JLabel CourseImagejLabel;
    private javax.swing.JTextArea CourseNamejTextArea;
    private javax.swing.JLabel EmailjLabel;
    private javax.swing.JPanel EnterToExam;
    private javax.swing.JLabel FacualtyjLabel;
    private javax.swing.JLabel GenderjLabel;
    private javax.swing.JLabel IDjLabel;
    private javax.swing.JButton LastCoursejButton;
    private javax.swing.JLabel NamejLabel;
    private javax.swing.JPanel Option3OfInstructor;
    private javax.swing.JLabel PasswordjLabel;
    private javax.swing.JButton RegisterNowjButton;
    private javax.swing.JButton RigsteredCoursesjButton;
    private javax.swing.JButton SeeCoursejButton;
    private javax.swing.JPanel addQuastionToExam;
    private javax.swing.JButton b_admin;
    private javax.swing.JButton b_instructor;
    private javax.swing.JButton b_register;
    private javax.swing.JButton b_student;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel changeAgejLabel;
    private javax.swing.JTextField changeAgejTextField4;
    private javax.swing.JLabel changeEmailjLabel;
    private javax.swing.JTextField changeEmailjTextField;
    private javax.swing.JLabel changeFacualtyjLabel;
    private javax.swing.JTextField changeFacualtyjTextField;
    private javax.swing.JLabel changeFirstNamejLabel;
    private javax.swing.JTextField changeFirstNamejTextField;
    private javax.swing.JPanel changeInfoStudent;
    private javax.swing.JLabel changeLastNamejLabel;
    private javax.swing.JTextField changeLastNamejTextField;
    private javax.swing.JLabel changePasswordjLabel;
    private javax.swing.JTextField changePasswordjTextField;
    private javax.swing.JLabel codejLabel;
    private javax.swing.JTextArea contentjTextArea;
    private javax.swing.JLabel coursePricejLabel;
    private javax.swing.JLabel courseRatingjLabel;
    private javax.swing.JLabel coursesjLabel;
    private javax.swing.JTextArea descriptionjTextArea;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel errorLogInLabel;
    private javax.swing.JLabel firstNamejLabel;
    private javax.swing.JLabel fivejLabel;
    private javax.swing.JLabel fourjLabel;
    private javax.swing.JLabel hallowjLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel instructorImagejLabel;
    private javax.swing.JLabel instructorNamejLabel;
    private javax.swing.JLabel instructorRatingjLabel;
    private javax.swing.JLabel invalidDataMassagejLabel;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAddExam;
    private javax.swing.JButton jButtonAddQuastion;
    private javax.swing.JButton jButtonEnterToExam;
    private javax.swing.JButton jButtonLastQuastion;
    private javax.swing.JButton jButtonMakeExam;
    private javax.swing.JButton jButtonNextQuastion;
    private javax.swing.JButton jButtonNextRegisteredCourse;
    private javax.swing.JButton jButtonOption1;
    private javax.swing.JButton jButtonOption2;
    private javax.swing.JButton jButtonOption3;
    private javax.swing.JButton jButtonOption4;
    private javax.swing.JButton jButtonReturnRegisteredCourse;
    private javax.swing.JButton jButtonSaveUpdate;
    private javax.swing.JButton jButtonStar1;
    private javax.swing.JButton jButtonStar10;
    private javax.swing.JButton jButtonStar2;
    private javax.swing.JButton jButtonStar3;
    private javax.swing.JButton jButtonStar4;
    private javax.swing.JButton jButtonStar5;
    private javax.swing.JButton jButtonStar6;
    private javax.swing.JButton jButtonStar7;
    private javax.swing.JButton jButtonStar8;
    private javax.swing.JButton jButtonStar9;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonUndo;
    private javax.swing.JButton jButtonUpdateInfoAboutCourse;
    private javax.swing.JButton jButtonUploadExamToStudent;
    private javax.swing.JButton jButtonloginInstructor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabelCodeNotAvailable;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelErrorCourseCodeToUpdate;
    private javax.swing.JLabel jLabelExamTitle;
    private javax.swing.JLabel jLabelExamTitleInStudentPage;
    private javax.swing.JLabel jLabelNextLec;
    private javax.swing.JLabel jLabelNote;
    private javax.swing.JLabel jLabelRegisteredCourseCode;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelnemeOfCourse;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButtonChangeGenderToFemale;
    private javax.swing.JRadioButton jRadioButtonChangeGenderToMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPaneSeeCourses;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaQuastionStatment;
    private javax.swing.JTextArea jTextAreaShowQuastion;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextFieldCorrectAns;
    private javax.swing.JTextField jTextFieldCourseCode;
    private javax.swing.JTextField jTextFieldCourseCodeToInfoAboutStudent;
    private javax.swing.JTextField jTextFieldCourseCodeToUpdate;
    private javax.swing.JTextField jTextFieldNumberOfQ;
    private javax.swing.JTextField jTextFieldOption1;
    private javax.swing.JTextField jTextFieldOption2;
    private javax.swing.JTextField jTextFieldOption3;
    private javax.swing.JTextField jTextFieldTitle;
    private javax.swing.JTextField jTextFieldTitleExamToUpload;
    private javax.swing.JTextField jTextFieldUpdateDate;
    private javax.swing.JTextField jTextFieldUpdateNextLec;
    private javax.swing.JTextField jTextFieldUpdateNote;
    private javax.swing.JTextField jTextFieldUpdateTime;
    private javax.swing.JLabel jopTitlejLabel;
    private javax.swing.JLabel languagejLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginInstructor;
    private javax.swing.JPanel loginStudent;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainOptionsInstructor;
    private javax.swing.JPanel mainOptionsStudent;
    private javax.swing.JButton myAccountjButton;
    private javax.swing.JLabel nameOfStudentjLabel;
    private javax.swing.JButton nextCoursejButton;
    private javax.swing.JLabel numberOfLecturesjLabel;
    private javax.swing.JLabel numberOfSectionjLabel;
    private javax.swing.JTextArea objectivejTextArea;
    private javax.swing.JLabel onejLabel;
    private javax.swing.JPanel option1Instructor;
    private javax.swing.JPanel option2Instructor;
    private javax.swing.JPanel option2Student;
    private javax.swing.JPanel option3Student;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JPanel registStudent;
    private javax.swing.JButton register;
    private javax.swing.JLabel requirementsjLabel;
    private javax.swing.JLabel reviewsjLabel;
    private javax.swing.JButton saveChangesjButton;
    private javax.swing.JLabel secondNamejLabel;
    private javax.swing.JPanel showinfo;
    private javax.swing.JLabel studentAgejLabel;
    private javax.swing.JLabel studentEmailjLabel;
    private javax.swing.JLabel studentFacualtyjLabel;
    private javax.swing.JLabel studentGenderjLabel;
    private javax.swing.JLabel studentIDjLabel;
    private javax.swing.JLabel studentPasswordjLabel;
    private javax.swing.JLabel studentRegisteredCoursesjLabel;
    private javax.swing.JLabel studentsjLabel;
    private javax.swing.JLabel threejLabel;
    private javax.swing.JLabel totalHoursjLabel;
    private javax.swing.JLabel twojLabel;
    private javax.swing.JPanel updateInfoAboutCourse;
    private javax.swing.JPanel uploadExamToStudent;
    // End of variables declaration//GEN-END:variables
}
