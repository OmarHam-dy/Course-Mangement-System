package ezway;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int id;
    private String faculty;
    private String email;
    private String password;
    private ArrayList  <Course> listOfRegisteredCourse = new ArrayList();
    private static int totalNumberOfStudent = 0;
    private int totalNumberOfRegisteredCourses = 0;
    private int index;
    
    public Student(String firstName, String lastName, String gender, int age, String faculty, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.faculty = faculty;
        this.email = email;
        this.password = password;
        this.id = totalNumberOfStudent;
       totalNumberOfStudent++;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
   public int getId() {
        return id;
    }

    public int getTotalNumberOfRegisteredCourses() {
        return totalNumberOfRegisteredCourses;
    }
    public Student(String name) {
        this.firstName = name;
    }
    public static int getTotalNumberOfStudent() {
        return totalNumberOfStudent;
    }

//    public void setNumberOfStudent(int numberOfStudent) {
//        this.id = numberOfStudent;
//        numberOfStudent++;
//    }
    
    Student(ArrayList<Student> list) {
        id = totalNumberOfStudent;
        totalNumberOfStudent++;
        index = list.size();
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Course> getListOfRegisteredCourse() {
        return listOfRegisteredCourse;
    }

    public void setListOfRegisteredCourse(Course obj) {
        listOfRegisteredCourse.add(obj);
        totalNumberOfRegisteredCourses++;
    }
    
    public boolean emailChecker (String email){
       if(email.equals(this.email))
           return true;
       else
           return false;
    }
    public boolean passwordChecker(String password){
        if(password.equals(this.password))
            return true;
        else
            return false;
    }
    public static String errorInPassword(){
        return "The password you entered is incorrect. Please try again ";
    }
    public static String errorInEmail(){
        return "The Email you entered is incorrect. Please try again ";
    }
    public String Rank(){
        return " asdsa";
    }
    public static String errorInID(){
        return "The ID you entered is incorrect. Please try again ";
    }
    public String getCertainCourse (String code){
        return "sad";
    }
    public static boolean isIDAvailable(ArrayList <Student> list,int ID){
        boolean isFound = false;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getId() == ID){
                isFound = true;
                break;
            }
        }
        return isFound;
    }
    public static int getIndexFromID(ArrayList<Student> list , int id){
        int index = -1;
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getId() == id){
                index = list.get(i).getIndex();
            }
        }
        return index;
    }
    public static void indicisMinusOne(ArrayList <Student> list ,int indexOfDeletedStudent){
        for(int i = indexOfDeletedStudent;i < list.size(); i++){
            list.get(i).index--;
        }
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + ", id=" + id + ", faculty=" + faculty + ", email=" + email + ", password=" + password + ", listOfRegisteredCourse=" + listOfRegisteredCourse + ", registeredCourses=" + totalNumberOfRegisteredCourses + ", index=" + index + '}';
    }
    
}
