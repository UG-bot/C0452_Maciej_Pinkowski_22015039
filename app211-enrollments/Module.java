
/**
 * Write a description of class Module here.
 *
 * @author (Maciej Pinkowski)
 * @version (18.10.2021)
 */
public class Module
{
    
    private String code;
    private String title;
    private int credit;
    

public Module (String code, String title, int credit)
    {
        this.code = code;
        this.title = title;
        credit = 0;
    }  
    
public String getCode()
    {
        return code;
    }
    
public String getTitle()
    {
        return title;
    }

public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    {
        printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println(" Credits for: " + title + ": " + credit);
        System.out.println();
    }
    
private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
}
