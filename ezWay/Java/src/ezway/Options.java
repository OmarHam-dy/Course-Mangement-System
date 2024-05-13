    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ezway;

/**
 *
 * @author h.d
 */
public class Options{
    String optionStatment;
    boolean isCorrect;

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
    

    public Options() {
    }
    
    public Options (String OptionStatment,boolean isCorrect){
        this.isCorrect = isCorrect;
        this.optionStatment = OptionStatment;
    }

    public String getOptionStatment() {
        return optionStatment;
    }

    public void setOptionStatment(String optionStatment) {
        this.optionStatment = optionStatment;
    }
 
}
