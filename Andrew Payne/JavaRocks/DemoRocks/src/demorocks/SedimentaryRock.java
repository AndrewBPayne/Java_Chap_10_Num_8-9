package demorocks;

/**
 *
 * @author AndrewPayne
 */
public class SedimentaryRock extends Rock {
    
    private String description;
    
    public SedimentaryRock(int sampleNum, double weightG){
        super(sampleNum, weightG);
        
        this.description = "formed by the accumulation or deposition of small"
                + " particles and subsequent cementation of mineral or organic"
                + " particles on the floor of oceans or other bodies of water at the Earth's surface.";
        
    }
    
    public String getDescription(){
        return description;
    }
}
