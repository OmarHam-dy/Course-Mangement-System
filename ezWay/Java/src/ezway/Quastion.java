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
public class Quastion {
    private String quastionStatment;
    private boolean isCorrect = false;
    private boolean isSolved = false;
    private int selectedAns;
    private int [] pattrenOfQuastionOptions = new int[4];
    private ArrayList <Options> listOfOptions = new ArrayList(4);
    int index;

    public int[] getPattrenOfQuastionOptions() {
        return pattrenOfQuastionOptions;
    }

    public void setPattrenOfQuastionOptions(int[] pattrenOfQuastionOptions) {
        this.pattrenOfQuastionOptions = pattrenOfQuastionOptions;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public boolean getIsSolved() {
        return isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public int getSelectedAns() {
        return selectedAns;
    }

    public void setSelectedAns(int selectedAns) {
        this.selectedAns = selectedAns;
    }

    public String getQuastionStatment() {
        return quastionStatment;
    }

    public void setQuastionStatment(String quastionStatment) {
        this.quastionStatment = quastionStatment;
    }

    public ArrayList<Options> getListOfOptions() {
        return listOfOptions;
    }

    public void setListOfOptions(ArrayList<Options> listOfOptions) {
        ArrayList<Options> copyList = new ArrayList(listOfOptions);
        this.listOfOptions = copyList;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndexOfOptionFromOptionStatment(String statment){
        int index = -1;
        for(int i  = 0;i < 4;i++){
            if(statment.equals(this.getListOfOptions().get(i).getOptionStatment())){
                index = i;
                break;
            }
        }
        return index;
    }
    public boolean getisQuastionAnsCorrect(String statment){
        int index = getIndexOfOptionFromOptionStatment(statment);
        if(index == 3)
            return true;
        else 
            return false;
    }
}
