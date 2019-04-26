package edu.handong.csee.java.sec01.jonggangcalculator;

/**
 * This calss is for calculate date of due date from input day to the end of this semester.

 *
 */

public class JongGangCalculator{
/**
 * this field include data of current date and the day of end of this semester
 * 
 */
    int currentDate;
    int jongGangDate;
    int countDays;
/**
* This is a main method. using String argument to take input value.
*
 */
    static public void main(String[] args){
        JongGangCalculator jgCalc = new JongGangCalculator();
        System.out.println("The end date :" + args[0]);
        System.out.println("The end date :" + args[1]);

        jgCalc.countDays(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        jgCalc.displayDayCount();


    }
/**
 * this method return the due date until the end of this semester
 * and make the output of the due date.
 */
    public int countDays(int jgDate, int curDate){
        countDays = jgDate - curDate;
        return countDays;
    }

    public void displayDayCount(){
        System.out.println("The day left is :" + countDays);
    }
}
