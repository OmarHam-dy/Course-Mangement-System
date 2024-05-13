/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ezway;

import java.util.ArrayList;

/**
 *
 * @author h.d
 */
public class Exam {
    private int fianlGrade;
    private int gradesObtained;
    private ArrayList <Quastion> listOfQuastions = new ArrayList();
    private boolean isAttend;
    private String date;
    private int examDuration;
    private int numeberOfQuastion;
    String Title;
    boolean dgreeVision;
    private final static int [][] ExamPattern ={{0,1,2,3},{0,1,3,2},{0,2,1,3},{0,2,3,1},{0,3,1,2},{0,3,2,1},{1,0,2,3},{1,0,3,2},{1,2,0,3},{1,2,3,0},{1,3,0,2},{1,3,2,0},{2,0,1,3},{2,0,3,1},{2,1,0,3},{2,1,3,0},{2,3,0,1},{2,3,1,0},{3,0,1,2},{3,0,2,1},{3,1,0,2},{3,1,2,0},{3,2,0,1},{3,2,1,0}};
    private int index;

    public boolean isDgreeVision() {
        return dgreeVision;
    }

    public void setDgreeVision(boolean dgreeVision) {
        this.dgreeVision = dgreeVision;
    }

    public void setFianlGrade(int fianlGrade) {
        this.fianlGrade = fianlGrade;
    }

    public int getFianlGrade() {
        return fianlGrade;
    }

    public int getGradesObtaind() {
        int countGradesObtained = 0;
        for(int i = 0;i < listOfQuastions.size();i++){
            if(listOfQuastions.get(i).getIsCorrect() == true){
                countGradesObtained++;
            }
        }
        this.gradesObtained = countGradesObtained;
        return gradesObtained; 
    }

    public static int[] getOptionsPattern(int randomNumber) {
        int [] arr = ExamPattern[randomNumber];
        return arr;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Exam(int numeberOfQuastion, String Title, boolean dgreeVision) {
        this.numeberOfQuastion = numeberOfQuastion;
        this.Title = Title;
        this.dgreeVision = dgreeVision;
    }

    public ArrayList<Quastion> getListOfQuastions() {
        return listOfQuastions;
    }

    public void setListOfQuastions(ArrayList<Quastion> listOfQuastions) {
        ArrayList<Quastion> copyList = new ArrayList(listOfQuastions);
        this.listOfQuastions = copyList;
    }

    public int getNumeberOfQuastion() {
        return numeberOfQuastion;
    }
    public static boolean isUniqueTitle(ArrayList<Exam> list,String title){
        boolean isUnique = true;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getTitle().equals(title)){
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }
        public static int getIndexFromTitle(ArrayList <Exam> list,String title){
        int index = -1;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getTitle().equals(title)){
                index = i;
            }
        }
        return index;
    }
    public static String ErrorInTitle(){
        return "The exam title is used, change it";
    }
}
