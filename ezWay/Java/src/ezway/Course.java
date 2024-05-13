/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ezway;

import static ezway.DesignCourseMangmentSystem.listOfCourses;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author h.d
 */
public class Course {
    private String courseName;

    public Course() {
    }
    private String code;
    private double coursePrice;
    private Instructor instructor;
    private ArrayList <Exam> listOfExams = new  ArrayList ();
    private String language;
    private String description;
    private int numberOfStudent;
    private int numberOfSection;
    private int numberOfLecture;
    private int totalHours;
    private String nextlec = "Not spacfied";
    private String date = "Not spacfied";
    private String time = "Not spacfied";
    private String note = "Not spacfied";
    private ArrayList <String> Objective = new ArrayList();
    private ArrayList <String> contents = new ArrayList();
    private ArrayList <Integer> rates = new ArrayList();
    private double courseRating;
    private int finalGrade;
    private boolean state = false;
    private String  requirements;
    private int index;
    private boolean visibleExamButtonAndTitle = false;
    private static int totalNumberOfCourses = 0;
    //////////////////////////////////////////////////////////////////////
    private ImageIcon image = null;
    private int totalResponse = 0;
    private int oneOutOfFive = 0;
    private int twoOutOfFive = 0;
    private int threeOutOfFive = 0;
    private int fourOutOfFive = 0;
    private int fiveOutOfFive = 0;
    private boolean flagStar1 = false;
    private boolean flagStar2 = false;
    private boolean flagStar3 = false;
    private boolean flagStar4 = false;
    private boolean flagStar5 = false;
    private boolean visibiltyOfCourseFeadback = true;
    // and setter & getter

    public Course(ArrayList<Course> list) {
        totalNumberOfCourses++;
        index = list.size();
    }
    
    public Course(String courseName, String code, double coursePrice, String language, String description, int numberOfSturdent, int numberOfSection, int numberOfLecture, int totalHours, boolean state , String requirements) {
        this.courseName = courseName;
        this.code = code;
        this.coursePrice = coursePrice;
        this.language = language;
        this.description = description;
        this.numberOfStudent = numberOfSturdent;
        this.numberOfSection = numberOfSection;
        this.numberOfLecture = numberOfLecture;
        this.totalHours = totalHours;
        this.state = state;
        this.requirements = requirements;
    }

    public boolean isFlagStar1() {
        return flagStar1;
    }

    public void setFlagStar1(boolean flagStar1) {
        this.flagStar1 = flagStar1;
    }

    public boolean isFlagStar2() {
        return flagStar2;
    }

    public void setFlagStar2(boolean flagStar2) {
        this.flagStar2 = flagStar2;
    }

    public boolean isFlagStar3() {
        return flagStar3;
    }

    public void setFlagStar3(boolean flagStar3) {
        this.flagStar3 = flagStar3;
    }

    public boolean isFlagStar4() {
        return flagStar4;
    }

    public void setFlagStar4(boolean flagStar4) {
        this.flagStar4 = flagStar4;
    }

    public boolean isFlagStar5() {
        return flagStar5;
    }

    public void setFlagStar5(boolean flagStar5) {
        this.flagStar5 = flagStar5;
    }

    public boolean isVisibiltyOfCourseFeadback() {
        return visibiltyOfCourseFeadback;
    }

    public void setVisibiltyOfCourseFeadback(boolean visibiltyOfCourseFeadback) {
        this.visibiltyOfCourseFeadback = visibiltyOfCourseFeadback;
    }
    
    public int getTotalResponse() {
        this.totalResponse = oneOutOfFive + twoOutOfFive + threeOutOfFive + fourOutOfFive + fiveOutOfFive;
        return totalResponse;
    }
    public int getOneOutOfFive() {
        return oneOutOfFive;
    }

    public void setOneOutOfFive() {
        this.oneOutOfFive++;
    }

    public int getTwoOutOfFive() {
        return twoOutOfFive;
    }

    public void setTwoOutOfFive() {
        this.twoOutOfFive++;
    }

    public int getThreeOutOfFive() {
        return threeOutOfFive;
    }

    public void setThreeOutOfFive() {
        this.threeOutOfFive++;
    }

    public int getFourOutOfFive() {
        return fourOutOfFive;
    }

    public void setFourOutOfFive() {
        this.fourOutOfFive++;
    }

    public int getFiveOutOfFive() {
        return fiveOutOfFive;
    }

    public void setFiveOutOfFive() {
        this.fiveOutOfFive++;
    }
    
    public void setImageIcon(ImageIcon image){
        this.image = image;
    }
    public ImageIcon getImageIcon(){
        return image;
    }
    public void setVisibleExamButtonAndTitle(boolean x){
        this.visibleExamButtonAndTitle = x;
    }
    public boolean getVisibleExamButtonAndTitle(){
        return visibleExamButtonAndTitle;
    }
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNextlec() {
        return nextlec;
    }

    public void setNextlec(String nextlec) {
        this.nextlec = nextlec;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setObjective(String objective) {
        Objective.add(objective);
    }

    public ArrayList<Integer> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Integer> rates) {
        this.rates = rates;
    }

    public boolean isState() {
        return state;
    }

    public String getObjective(int index) {
        return Objective.get(index);
    }
    public ArrayList<Exam> getListOfExams() {
        return listOfExams;
    }

    public void setListOfExams(Exam exam) {
        this.listOfExams.add(exam);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfSturdent) {
        this.numberOfStudent = numberOfSturdent;
    }

    public int getNumberOfSection() {
        return numberOfSection;
    }

    public void setNumberOfSection(int numberOfSection) {
        this.numberOfSection = numberOfSection;
    }

    public int getNumberOfLecture() {
        return numberOfLecture;
    }

    public void setNumberOfLecture(int numberOfLecture) {
        this.numberOfLecture = numberOfLecture;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getContents(int index) {
        return contents.get(index);
    }

    public void setContents(String contents) {
        this.contents.add(contents);
    }

    public double getCourseRating() {
        int totalScore;
        totalScore = (5 * fiveOutOfFive) + (4 * fourOutOfFive) + (3 * threeOutOfFive) + (2 * twoOutOfFive) + (1 * oneOutOfFive);
        if(this.totalResponse != 0)
            this.courseRating = totalScore / (double)this.getTotalResponse();
        else
            this.courseRating = 2.5;
        return Math.round(courseRating * 10) / 10;
    }

    public void setCourseRating(int courseRating) {
        this.courseRating = courseRating;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    public double CalculateFinalGrade (){
        return 4.4;
    }
    ////////////////////////////////////////////
    public int getSizeOfObjective(){
        return Objective.size();
    }
    public int getSizeOfContents(){
        return contents.size();
    }
    public static boolean isCodeAvailable(ArrayList<Course> list, String Code){
        boolean isFound = false;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getCode().equals(Code)){
                isFound= true;
                break;
            }
        }
        return isFound;
    }
    public static int getIndexFromCode(ArrayList <Course> list,String code){
        int index = -1;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getCode().equals(code)){
                index = list.get(i).getIndex();
                break;
            }
        }
        return index;
    }
    public static void indicisMinusOne(ArrayList<Course> list,int indexOfDeletedCourse){
        for(int i = indexOfDeletedCourse;i < list.size();i++){
            list.get(i).index--;
        }
    }
    public static boolean isTitleAvailable(ArrayList<Exam> list,String title){
        boolean isFound = false;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).Title.equals(title)){
                isFound = true;
                break;
            }
        }
        return isFound;
    }
    public static boolean isUniqueCourseCode(ArrayList<Course> list ,String code){
        boolean isUnique = true;
        if(list.size() != 1){
            for(int i = 0;i < list.size();i++){
                if(list.get(i).getCode().equals(code)){
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }
    public static boolean  removeCourse (ArrayList<Course> list,String code){
       boolean flag = false;
       
     for(int i=0; i < list.size();i++)
     {
         
        if(list.get(i).getCode().equals(code))
        {
            flag = true;
            list.remove(i);
            AddCourseFram.i--;
            indicisMinusOne(list,i);
            totalNumberOfCourses--;
            break;
        }
       
     }  
     return flag;
    }
    public void IncreasNumberOfStudent(){
        numberOfStudent++;
    }
    public static String ErrorInCode(){
        return "The course code is not valid";
    }
}
