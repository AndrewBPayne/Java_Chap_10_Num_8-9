package demorocks;

/**
 *
 * @author AndrewPayne
 */
public class Rock {
    
    private int sampleNum;
    private String rockDes;
    private double weightG;
    
    
    public int getSampleNum() {
        return sampleNum;
    }

    public String getRockDes() {
        return rockDes;
    }

    public double getWeightG() {
        return weightG;
    }
    
    Rock(int sampleNum, double weightG){
        this.sampleNum = sampleNum;
        this.weightG = weightG;
        
        this.rockDes = "Unclassified";
    }

    
}
