package pillbox;

/**
 *
 * @author Mohit
 */
public class Bead {
    /**Model Class for Bead.
     *Bead has color and a single letter on it 
     *@param args the command line arguments
     **/
    
        private String color;
        private char letter;

    Bead(String pink, char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param givenLetter the letter to set
     */
    public void setLetter(char givenLetter) {
        letter = givenLetter;
    }

    
}
