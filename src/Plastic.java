public class Plastic extends Waste {
    private String type;
    private boolean meltable;
    private boolean isRecyclable;

    public Plastic (String type, boolean meltable, boolean isRecyclable){
        super(types.PLASTIC);
        this.type = type;
        this.meltable = meltable;
        this.isRecyclable = isRecyclable;
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
    
    public void setRecyclable(boolean isRecyclable){
        this.isRecyclable = isRecyclable;
    }
    
    public String getType(){
        return type;
    }
    public boolean getIsRecyclable(){
        return isRecyclable;
    }
    
    public boolean getMeltable(){
        return meltable;
    }
}