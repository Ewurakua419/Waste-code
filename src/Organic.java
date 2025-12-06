public class Organic{

    private boolean isCompostable;
    private String type;

    //constructors

    Organic(boolean isCompostable, String type ){
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

    

}