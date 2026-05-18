import java.util.*;
public class student {
    public String Name;
    int marks;
    public void Display() {
        if(marks>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void main(String args[]) {
        student s = new student();
        s.Name = "Rahul";
        s.marks = 80;
        s.Display();
    }
}
/*
Class name should start with uppercase (student)
Variable Name should start with lowercase
Variables should be private
Method name should start with lowercase (Display)
String args[] should be String[] args
Spacing and formatting is needed
 */