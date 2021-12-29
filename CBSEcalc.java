package com.company;
import java.util.Scanner;
class Subject{
    int max = 100;                                            //please share with everyone//
    int obtd;                                                //Dictator1 is my name//
}

public class CBSEcalc {
    public static void main(String[] args){
        System.out.println("CBSE Board Calculator");
       Subject s1 = new Subject();
        System.out.println("Enter Score of English");
        Scanner scn = new Scanner(System.in);
        s1.obtd = scn.nextInt();
        Subject s2 = new Subject();
        System.out.println("Enter Score of Maths");
        s2.obtd = scn.nextInt();
        Subject s3 = new Subject();
        System.out.println("Enter Score of Science");
        s3.obtd = scn.nextInt();
        Subject s4 = new Subject();
        System.out.println("Enter Score of Social Science");
        s4.obtd = scn.nextInt();
        Subject s5 = new Subject();
        System.out.println("Enter Score of Hindi");
        s5.obtd = scn.nextInt();
        int tobtd = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        int per = (tobtd*100/500);
        System.out.println("Percentage obtained:"+per);
        System.out.println("Have Fun!");
    }
}