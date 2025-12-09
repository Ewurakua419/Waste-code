
public class Plastic extends Waste implements Recycable{
    private String type;

    public Plastic (String type){
        super(types.PLASTIC);
        this.type = type;
    }

    
    public void setType(String type){
        if (type == null){
            System.out.println("Error: Null input");
        }
        else{ this.type = type;}
    }

    
    
    
    public String getType(){
        return type;
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
               ", Recyclable=" + isRecycable() +
               "}";
    }
}