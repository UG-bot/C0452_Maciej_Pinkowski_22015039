
/**
 * Write a description of class ModuleMark here.
 *
 * @author Derek Peacock and Nicholas Day
 * Modified by Maciej Pinkowski
 * @version 26/10/2021
 */
public class ModuleMark
{
    private int mark;
    private Module module;
    
    /**
     * Constructor for objects of class ModuleMark
     */
    public ModuleMark(Module module)
    {
        mark = 0;
        this.module = module;
    }
    
    /**
     * return value of the module mark
     */
    public int getValue()
    {
        return mark;
    }
    
    /**
     * If the mark is 40% or more then the 
     * student is awarded the module's credit.
     */
    public int getCredit()
    {
        if(mark <= Grades.F.getValue())
        {
            return 0;
        }
        else
        {
            return Module.CREDIT;
        }
    }
    
    /**
     * let's us set the mark in module mark
     */
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    
    /**
     * return module of the module mark
     */
    public Module getModule()
    {
        return module;
    }
    
    /**
     * Print the module details and any credit
     * that has been awarded.
     */
    public void print()
    {
        module.print();
        System.out.print( "\t" + getCredit() + "\t" + mark + "\t");
    }
}
