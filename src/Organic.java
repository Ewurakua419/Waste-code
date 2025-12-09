import java.util.ArrayList;

public class Organic extends Waste {

    private boolean isCompostable;
    private String type;
   
    private ArrayList<Organic> organicList = new ArrayList<>();

    
    //constructors

    Organic(String type, boolean isCompostable ){
        super(types.ORGANIC);
        this.type = type;
        this.isCompostable = isCompostable;
    }

    //getters

    public String getType(){
        return type;
    }

    public boolean getIsCompostable(){
        return isCompostable;
    }

    //setters

    public void setType(String type){
        this.type = type;
    }

    public void setIsCompostable(boolean isCompostable){
        this.isCompostable = isCompostable;
    }

    // Add an Organic item to the list
    public void addOrganic(Organic o) {
        organicList.add(o);
    }

    @Override

    public String toString(){
        return "ORGANIC WASTE"+
                "{ Type: " + type +
                "Is Compostable: " + isCompostable+"}";
    }


    

}