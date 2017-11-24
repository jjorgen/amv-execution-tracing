package CH.ifa.draw.apackage;


import CH.ifa.draw.bpackage.ClassB;

/**
 * Created by John Jorgensen on 6/1/2017.
 */
public class ClassA {
    public void callingOnA(int numberOne, String numberOneAsString) {
        System.out.println("in ClassA called from main");
        ClassB classB = new ClassB();
        classB.callingOnB(2, "numberTwoAsString");
    }
}
