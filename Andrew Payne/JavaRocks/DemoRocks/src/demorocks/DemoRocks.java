package demorocks;
import javax.swing.JOptionPane;

/**
 *
 * @author AndrewPayne
 */
public class DemoRocks {

    public static void main(String[] args) {
        
        Rock blueRock = new Rock(1,25);
        String one = makeInfo(blueRock);
        
        IgneousRock granite = new IgneousRock(2,15);
        String two = makeInfo(granite);
        
        MetamorphicRock marble = new MetamorphicRock(3, 50);
        String three = makeInfo(marble);
        
        SedimentaryRock sandStone = new SedimentaryRock(4, 5);
        String four = makeInfo(sandStone);
        
        String message = one + two + three + four;
        
        JOptionPane.showMessageDialog(null, message , "Natural History Museum Rock Collection", JOptionPane.PLAIN_MESSAGE);
        
        
    }
    
    static public String makeInfo(Rock rock){
        String m = "Sample Number: " + rock.getSampleNum() + " Weight: " + rock.getWeightG()
                + " grams \nDescription: " + rock.getRockDes() + "\n\n";
        return m;
    }
    
}
