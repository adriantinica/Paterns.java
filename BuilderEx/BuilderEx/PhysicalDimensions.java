public class PhysicalDimensions {
    private Double value;
    private String unit;  // ex (20.00 inch)

    public PhysicalDimensions(){

    }

    public PhysicalDimensions(Double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return  "[ "+ value +" "+ unit + " ]";
    }

    

    
}
