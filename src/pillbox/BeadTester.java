package pillbox;

/**
 *
 * @author Mohit
 */
public class BeadTester {

    public static void main(String[] args)
    {
        Bead b1=new Bead("Yellow",'s');
        
        //Array of Objects (Bead)
        Bead[] b=new Bead[7];
        //char[] PillBox=new char[7];
        
        b[0]=b1;
        b[1]=new Bead("Pink",'h');
        b[2]=new Bead("Green",'e');
        
        System.out.println(b1.getColor());
        System.out.println(b[1].getColor());
        
    }

    
}
