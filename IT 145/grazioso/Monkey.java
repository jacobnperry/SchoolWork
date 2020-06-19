public class Monkey extends RescueAnimal{
    // Instance variable
    public String monkeySpecies;
    public double tailLength;
    public double height;
    public double bodyLength;
    public double torsoMeasure;
    public double skullMeasure;
    public double neckMeasure;

    // Constructor
    public Monkey() {
    }

    // Accessor Method
    public String getMonkeySpecies() {
        return monkeySpecies;
    }

    public double getTailLength() {
        return tailLength;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public double getTorsoMeasure() {
        return torsoMeasure;
    }

    public double getSkullMeasure() {
        return skullMeasure;
    }

    public double getNeckMeasure() {
        return neckMeasure;
    }
    // Mutator Method
    public void setMonkeySpecies(String monkeySpecies) {
        this.monkeySpecies = monkeySpecies;
    }
    
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    public void setTorsoMeasure(double torsoMeasure) {
        this.torsoMeasure = torsoMeasure;
    }

    public void setSkullMeasure(double skullMeasure) {
        this.skullMeasure = skullMeasure;
    }

    public void setNeckMeasure(double neckMeasure) {
        this.neckMeasure = neckMeasure;
    }
    
}