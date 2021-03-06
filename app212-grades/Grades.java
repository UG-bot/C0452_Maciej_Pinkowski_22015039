
/**
 * These are the grades used by BNU to classify 
 * students at the completion of their course
 * Each value is the top percentage mark for that grade
 * @author Derek Peacock and Nicholas Day
 * Modified by Maciej Pinkowski
 * @version 1.0 26/10/2020
 */
public enum Grades
{
    NS (0), 
    F  (39), 
    D  (49), 
    C  (59), 
    B  (69), 
    A  (100);
    
    private final int value;
    
    /**
     * Constructor for objects of class Grades
     */
    private Grades(int value)
    {
        this.value = value;
    }
    
    /**
     * return the value of the grade
     */
    public int getValue()
    {
        return value;
    }
}
