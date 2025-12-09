import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

enum types{
    METAL, PLASTIC, PAPER, UNKNOWN,  ORGANIC
}
public class Waste {
    private types type=types.UNKNOWN;
    private double weight;//in grams
    private boolean isMagnetic;
    private double density;// in g/cm3
    private static int counter;
    private String color;
    private String item;
    private boolean isSinkable;
    private boolean isWaterproof;
    private int lightSpectra;//in nm
    private String newType="";
    private boolean isCompostable;
    private boolean isMeltable;
    
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

    public boolean getIsMeltable(){
        return this.isMeltable;
    }

    public boolean getIsCompostable(){
        return this.isCompostable;
    }
    public types getType(boolean val){
        return type;
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
    public String checkType(){
        boolean isMeltable;
        if(color.toLowerCase().equals("black") && type==types.PLASTIC && item.toLowerCase().equals("bag")){
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
                        type=types.PLASTIC;
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
                if (isCompostable){
                    newType="Compost";
                }
                else{
                    newType="Not Compost";
                }
            }
            else{
                type=types.PAPER;
            }
        }
        switch (type) {
                case PLASTIC:
                    Plastic p1= new Plastic(newType,isMeltable);
                    break;
                case METAL:
                    Metal metal= new Metal(color, weight, lightSpectra);
                    break;
                case PAPER:
                    Paper paper= new Paper(color, weight);
                    break;
                case ORGANIC:
                    Organic organic=new Organic(newType, isCompostable);
                    break;
                
                default:
                    //leave as unknown
                    break;
        }
        return getType();
    }
   
    public Waste( types type, double weight, double density, int lightSpectra,String color, String item,boolean isMagnetic, boolean isSinkable, boolean isWaterproof, boolean isCompostable){
        this.type=type;
        this.weight=weight;
        this.density=density;
        this.lightSpectra=lightSpectra;
        this.isMagnetic=isMagnetic;
        this.color=color;
        this.item=item;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        this.isCompostable=isCompostable;
        addCount();
    }

    @Override
    public String toString(){
        return "WASTE ITEM"+"Type: " + type +"Weight (g): " + weight +"Density (g/cm3): " + density+
                "Light Spectra (nm): " + lightSpectra +"Color: " + color +"Item: " + item +"Is Magnetic: " + isMagnetic +
                "Is Sinkable: " + isSinkable +
                "Is Waterproof: " + isWaterproof +
                "Is Compostable: " + isCompostable;
    }


   
    
    

    public void loadFromFile(String filename){
        String typeStr;
        types type= types.UNKNOWN;
        double weight=0;
        boolean isMagnetic=false;
        double density=0;
        String color="";
        String item="";
        boolean isSinkable=false;
        boolean isWaterproof=false;
        int lightSpectra=0;//in nm
        boolean isCompostable=false;
        try (Scanner scanner= new Scanner(new File(filename))){
            while (scanner.hasNextLine()){
                String line= scanner.nextLine();
                String[] lines=line.split(",");
                System.out.println(line);
                if (lines.length==11){
                    typeStr=lines[0].strip().toLowerCase();
                    switch (typeStr) {
                        case "paper":
                            type=types.PAPER;
                    
                        case "metal":
                            type=types.METAL;
                        
                        case "organic":
                            type=types.ORGANIC;
                        
                        case "plastic":
                            type=types.PLASTIC;
                        
                        
                        default:
                            type=types.UNKNOWN;
                    }
                    weight=Double.parseDouble(lines[1]);
                    density=Double.parseDouble(lines[2]);
                    lightSpectra=Integer.parseInt(lines[3]);
                    color=lines[4];
                    item=lines[5];
                    if (lines[6].toLowerCase()=="true"  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isMagnetic=true;
                    }
                    else if (lines[6].toLowerCase()=="false"){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isMagnetic=false;
                    }
                    if (lines[7].toLowerCase()=="true"  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isSinkable=true;
                    }
                    else if (lines[7].toLowerCase()=="false"){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isSinkable=false;
                    }
                    if (lines[8].toLowerCase()=="true"  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isWaterproof=true;
                    }
                    else if (lines[8].toLowerCase()=="false"){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isWaterproof=false;
                    }

                    if (lines[9].toLowerCase()=="true"  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isCompostable=true;
                    }
                    else if (lines[9].toLowerCase()=="false"){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isCompostable=false;
                    }
        }

                }
                try {
                    Waste waste=new Waste(type, weight, density, lightSpectra, color, item, isMagnetic,  isSinkable, isWaterproof, isCompostable);
                    wasteBin.add(waste);
                } catch (Exception e) {
                    System.out.println("Not a Waste object");
                }
                
                
            
        }catch(IOException e){
            System.out.println("Error in loading");
        }
    }
}

