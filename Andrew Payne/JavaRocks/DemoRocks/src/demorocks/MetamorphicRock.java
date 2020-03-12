package demorocks;

/**
 *
 * @author 
 */
public class MetamorphicRock extends Rock {
    
    private String description;
    
    public MetamorphicRock(int sampleNum, double weightG){
        super(sampleNum, weightG);
        
        this.description = "were once igneous or sedimentary rocks, but have been changed (metamorphosed)"
                + " as a result of intense heat and/or pressure within the Earth's crust.";
        
    }
    public String getDescription(){
        return description;
    }
}
