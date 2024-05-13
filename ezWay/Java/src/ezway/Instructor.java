package ezway;

import static ezway.Add_instructor.employee;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Instructor 
{
    private String name;
    private String address;
    private String age;
    private int index;
    private static int totalNumberOfInstructors = 0;
    private String password;
    private double   salary;
    private String phone;
    private String jopTitle;
    private ImageIcon image = null;
    private String email;
    private ArrayList<Course> registeredCourses = new ArrayList<>();
    private int totalNumebrOfStudent = 0;
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
    private double InstructorRating;
    
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
    
    private boolean visibiltyOfInstructorFeadback = true;

    public boolean isVisibiltyOfInstructorFeadback() {
        return visibiltyOfInstructorFeadback;
    }

    public void setVisibiltyOfInstructorFeadback(boolean visibiltyOfInstructorFeadback) {
        this.visibiltyOfInstructorFeadback = visibiltyOfInstructorFeadback;
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
    
    public static int getTotalNumberOfInstructors() {
        return totalNumberOfInstructors;
    }

    public int getTotalNumebrOfStudent() {
        calculateTotaNumberOfStudent();
        return totalNumebrOfStudent;
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(Course obj) {
        this.registeredCourses.add(obj);
    }

    public String getJopTitle() {
        return jopTitle;
    }

    public void setJopTitle(String jopTitle) {
        this.jopTitle = jopTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setImageIcon(ImageIcon image){
	this.image = image;
    }
    public ImageIcon getImageIcon(){
        return image;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    public Instructor(ArrayList<Instructor> list) {
        totalNumberOfInstructors++;
        index = list.size();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString ()
            
    {
        return "NAME : "+name+"\n "+"PASSWORD : "+password+"\n "+"AGE : "+age+"\n "+"ADDRESS : "+address+"\n "+"PHONE : "+phone+"\n "+"\n "+"SLARY : "+salary;
    }
    public boolean IsUniqueEmail(ArrayList <Instructor> list,String email){
        boolean flag = true;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getEmail().equals(email)){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static boolean searsh (ArrayList <Instructor> list,String email){
        boolean flag = true;
        if(list.size() != 1){
            for(int i=0 ; i < list.size() ; i++)
            {
               if(email.equals(list.get(i).getEmail()))
               {
                   flag=false;
                   break;
               }
            }
        }
        return flag;
    }
       public static boolean  removeinstrucrore (ArrayList <Instructor> list,String email){
       boolean flag = false;
        for(int i =0 ; i< list.size(); i++)
        {
            if(list.get(i).getEmail().equals(email))
            {
                flag = true;
                list.remove(i);
                indicisMinusOne(list, i);
                totalNumberOfInstructors--;
                break;
            }
        }
        return flag;

   }
   public static void indicisMinusOne(ArrayList <Instructor> list ,int indexOfDeletedStudent){
        for(int i = indexOfDeletedStudent;i < list.size(); i++){
            list.get(i).index--;
        }
    }
   public void calculateTotaNumberOfStudent(){
       for(int i = 0;i < registeredCourses.size();i++){
           totalNumebrOfStudent += registeredCourses.get(i).getNumberOfStudent();
       }
   }
   public static boolean isEmailAvailable(ArrayList<Instructor> list,String email){
       boolean isFound = false;
       for(int i = 0;i < list.size();i++){
           if(list.get(i).getEmail().equals(email)){
               isFound = true;
               break;
           }
       }
       return isFound;
   }
   public static int getIndexFromEmail(ArrayList<Instructor> list , String email){
       int index = -1;
       for(int i = 0;i < list.size();i++){
           if(list.get(i).getEmail().equals(email)){
               index = i;
               break;
           }
       }
       return index;
   }
   public static String ErrorInEmail(){
       return "The email you entered is incorrect. Please try again ";
   }
   public static String ErrorInPassword(){
       return "The password you entered is incorrect. Please try again ";
   }

    public void setInstructorRating(double InstructorRating) {
        this.InstructorRating = InstructorRating;
    }
   
   public double getInstructorRating() {
        int totalScore;
        totalScore = (5 * fiveOutOfFive) + (4 * fourOutOfFive) + (3 * threeOutOfFive) + (2 * twoOutOfFive) + (1 * oneOutOfFive);
        if(this.totalResponse != 0)
            this.InstructorRating = totalScore / (double)this.getTotalResponse();
        else
            InstructorRating = 2.5;
        return Math.round(InstructorRating * 10) / 10;
   }
}
