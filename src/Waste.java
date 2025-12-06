enum types{
    METAL, PLASTIC, PAPER, UNKNOWN,  ORGANIC
}
public class Waste {
    private types type=types.UNKNOWN;
    private double weight;
    private boolean isMagnetic;
    private double density;
    private boolean isRecyclable;
    private static int counter;
    private String color;
    private String item;
    private boolean isSinkable;
    private boolean isWaterproof;
    private int lightSpectra;//in nm
    private String newType="";
    //Getters and setters
    public void setLightSpectra(int lightSpectra){
        this.lightSpectra=lightSpectra;
    }
    public void setIsWterproof(boolean isWaterproof){
        this.isWaterproof=isWaterproof;
    }
    public void setIsSinkable(boolean isSinkable){
        this.isSinkable=isSinkable;
    }
    public void setColor(String color){
        this.color=color;
    }

    public void setItem(String item){
        this.item=item;
    }

    public void setType(types type){
        this.type=type;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }

    public void setIsMagnetic(boolean isMagnetic){
        this.isMagnetic=isMagnetic;
    }

    public void setDensity(double density){
        this.density=density;
    }

    public void setIsRecyclable(boolean isRecyclable){
        this.isRecyclable=isRecyclable;
    }

    public static void addCount(){
        counter++;
    }

    public String getType(){
       switch (type) {
            case types.PAPER:
                return "Paper";
        
            case types.METAL:
                return "Metal";
            
            case types.ORGANIC:
                return "Organic";
            
            case types.PLASTIC:
                return "Plastic";
            
            
            default:
                return "Unknown";
        }
    
    }
    public String getNewType(){
        return newType;
    }

    public double getWeight(){
        return this.weight;
    }

    public int getLightSpectra(){
        return this.lightSpectra;
    }
    public boolean getIsMagnetic(){
        return this.isMagnetic;
    }

    public double getDensity(){
        return this.density;
    }

    public boolean getIsRecyclable(){
        return this.isRecyclable;
    }

    public static int getCount(){
        return counter;
    }
    public String getColor(){
        return this.color;
    }

    public String getItem(){
        return this.item;
    }

    public boolean getIsSinkable(){
        return this.isSinkable;
    }
    public boolean getIsWaterproof(){
        return this.isWaterproof;
    }
    public Waste(types type){
        this.type=type;
    }

    public Waste(types type, double weight, double density, boolean isMagnetic, boolean isReyclable, String color, String item, boolean isSinkable, boolean isWaterproof){
        this.type=type;
        this.weight=weight;
        this.density=density;
        this.isMagnetic=isMagnetic;
        this.isRecyclable=isReyclable;
        this.color=color;
        this.item=item;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        addCount();
    }
    public String checkType(){
        
        if(color.toLowerCase().equals("black") && type==types.PLASTIC && item.toLowerCase().equals("bag")){
            
            setIsRecyclable(false);
            System.out.println("Must not be recycled");
            newType="Plastic, must not be recycled";
        }
        else if (isWaterproof){//checks if either plastic or metal
            
            if(isSinkable ){
                if(isMagnetic){//for magnetic metals
                    if (density==7.87){
                        newType="Iron";
                    }
                    else if (density>7.85 && density<7.87){
                        newType="Steel(low carbon)";
                    }
                    else if (density==7.85){
                        newType="Carbon Steel";
                    }
                    else if (density>6.9 && density<7.3){
                        newType="Cast Iron";
                    }
                    else if (density>7.70 && density<7.80){
                        newType="Stainless steel";
                    }
                    else if (density>7.9 && density<8.05){
                        newType="Stainless Steel";
                    }
                    else if (density==8.9){
                        newType="Cobalt / Nickel";
                    }
                    else {
                        newType="Unknown Metal";
                    }
                    type=types.METAL;
                }
                else{
                    //non-magnetic metals
                    if(density==2.7){
                    newType="Aluminum";
                    type=types.METAL;
                    }
                    
                    else if (density==8.96){
                        newType="Copper";
                        type=types.METAL;
                    }
                    
                    else if (density==4.5){
                        newType="Titanium";
                        type=types.METAL;
                    }
                    else if (density>=8.4 && density<8.7){
                        newType="Brass";
                        type=types.METAL;
                    }
                    else if (density==11.34){
                        newType="Lead";
                        type=types.METAL;
                    }
                    else if (density==7.29){
                        newType="Tin";
                        type=types.METAL;
                    }
                    //plastics which  sink
                    else if (density>=1.04 && density<1.06){
                        newType="PS- solid";//cutlery
                        type=types.PLASTIC;
                    }
                    else if (density>=1.34 && density<1.39){
                        newType="PET(#1)with PVC(#3)";//bottles
                        type=types.PLASTIC;
                    }
                    else if (density>=1.30 && density<1.45){
                        newType="PVC(#3) ";
                        type=types.METAL;
                    }
                    else{
                        newType="Unknown";
                    }
                    

                }  
            }
            else{
                if (density>=0.89 && density<0.91){
                    newType="PP(#5)";//
                }
                else if (density>=0.94 && density<0.97){
                    newType="  HDPE (High Density Polyethylene)";//bottles and caps
                }
                else if (density>=0.91 && density<0.94){
                    newType="LDPE(#4)";//Films and bags
                }
                else if (density>=0.02 && density<0.06){
                    newType="PS(Foam)";//foam
                }
                type=types.PLASTIC;
            }
        }
        else{//checking to see if organic or paper
            newType="";
            if (lightSpectra>520 && lightSpectra<680){
                type=types.ORGANIC;
            }
            else{
                type=types.PAPER;
            }
        }
        return getType();
    }

    public void createObjects(){
        switch (type) {
            case PLASTIC:
                //Plastic p1= new Plastic();
                break;
            case METAL:
                //create metal class
                break;
            case PAPER:
                //create paper class
                break;
            case ORGANIC:
                // create organic class
                break;
             
            default:
                //leave as unknown
                break;
        }
    }
}

