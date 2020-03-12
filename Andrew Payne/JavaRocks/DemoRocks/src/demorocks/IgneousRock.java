package demorocks;

/**
 *
 * @author AndrewPayne
 */
public class IgneousRock extends Rock {
    
    private String description;

    IgneousRock(int sampleNum, double weightG) {
        super(sampleNum, weightG);
        
        this.description = "Various crystalline or glassy rocks formed by the cooling and solidification of molten earth material.";
        
    }
    

    public String getDescription(){
        return description;
    }
}
