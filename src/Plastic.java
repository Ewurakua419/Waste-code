
public class Plastic extends Waste implements Recycable{
    private String type;
    private boolean meltable;

    public Plastic (String type, boolean meltable){
        super(types.PLASTIC);
        this.type = type;
        this.meltable = meltable;
    }

    
    public void setType(String type){
        if (type == null){
            System.out.println("Error: Null input");
        }
        else{ this.type = type;}
    }

    public void setMeltable(boolean meltable){
        this.meltable = meltable;
    }
    
    
    public String getType(){
        return type;
    }
    
    public boolean getMeltable(){
        return meltable;
    }
    @Override
    public boolean isRecycable(){
        if (type=="HDPE (High Density Polyethylene)"|| type=="LDPE(#4)" || type=="PP(#5)"){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Plastic {" +
               "Type=" + type +
               ", Weight=" + getWeight() +
               ", Meltable=" + meltable +
               ", Recyclable=" + isRecycable() +
               "}";
    }
}