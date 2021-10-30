import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day
 * Modified by Maciej Pinkowski
 * @version 0.1 26/10/2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    
    private String code;
    private String title;
    private Module module;
    private Grades finalGrade;
     
    public Course()
    {
        this("CO452", "BSc GamesDevelopment");
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
     public void createModules()
    {
        Module co450 = new Module("CO450" , "Computer Architectures");
        Module co452 = new Module("CO452" , "Programming Concepts  ");
        Module co459 = new Module("CO259" , "Game Design           ");
        Module co461 = new Module("CO461" , "3D Modeling           ");
        
        addModule(co450);
        addModule(co452);
        addModule(co459);
        addModule(co461);
    }
    
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /** 
     * Rates the mark of the modules from F to A 
     * if the mark isn't between 0 - 100 program will return 
     * informatio that the mark was not submitted
     */
    public Grades convertToGrade(int mark)
    {
        if(mark >= 0 && mark <=39)
            return Grades.F;
        else if(mark >= 40 && mark <=49)
            return Grades.D;
        else if(mark >= 50 && mark <=59)
            return Grades.C;
        else if(mark >= 60 && mark <=69)
            return Grades.B;
        else if(mark >= 70 && mark <=100)
            return Grades.A;
        else
            return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        
        for(ModuleMark mark : marks)
        {
            total = total + mark.getValue();
        }
        
        finalMark = total / 4;
        finalGrade = convertToGrade(finalMark);
        
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Prints out the details of a module and the
     * module credit
     */
    public void printModules()
        {for (Module module :modules)
            {module.print();
            module.printCredit();
        }
        }
    
}
