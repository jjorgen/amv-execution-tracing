package CH.ifa.draw.apackage;

import CH.ifa.draw.apackage.ClassA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassA classA = new ClassA();
        System.out.println( "Hello World!" );
        classA.callingOnA(1, "numberOne");
        System.out.println( "Hello World2!" );
    }
}
