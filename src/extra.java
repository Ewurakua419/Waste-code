/*
import java.util.Scanner;

public class extra {
String knowLightSpectra;
        boolean light=false;
        String knowtype;
        boolean typebool=false;
        String knowcolor;
        boolean colorbool=false;
        boolean check=false;

        String typeStr;
        types type= types.UNKNOWN;
        double weight=0;
        boolean isMagnetic=false;
        double density=0;
        boolean isRecyclable=false;
        String color="";
        String item="";
        boolean isSinkable=false;
        boolean isWaterproof=false;
        int lightSpectra=0;//in nm
        boolean isCompostable=false;
    public static void main(String[] args) {
        Scanner values= new Scanner(System.in);
        System.out.println("Welcome user");
        System.out.println("Do you know the light spectra of this item?");
        System.out.println("yes/ no or true/ false or y/ n");
        System.out.println("Or enter x to exit");
        while (check==false) {
            knowLightSpectra=values.nextLine();
            knowLightSpectra=knowLightSpectra.strip();
            if (knowLightSpectra.toLowerCase()=="yes" || knowLightSpectra.toLowerCase()=="true" || knowLightSpectra.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                light=true;
                check=true;
            }
            else if (knowLightSpectra.toLowerCase()=="no" || knowLightSpectra.toLowerCase()=="false" || knowLightSpectra.toLowerCase()=="n"|| knowLightSpectra.toLowerCase()=="x" ){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                light=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n or x to exit");
            }
        }

       
        check=false;
        System.out.println("Do you know the type of material of this item?");
        System.out.println("yes/ no or true/ false or y/ n");
        System.out.println("Or enter x to exit");
        while (check==false) {
            knowtype=values.nextLine();
            knowtype=knowtype.strip();
            if (knowtype.toLowerCase()=="yes" || knowtype.toLowerCase()=="true" || knowtype.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                typebool=true;
                check=true;
            }
            else if (knowtype.toLowerCase()=="no" || knowtype.toLowerCase()=="false" || knowtype.toLowerCase()=="n" || knowtype.toLowerCase()=="x"){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                typebool=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n or x to exit");
            }
        }

        check=false;
        System.out.println("Can you tell the color of this item?");
        System.out.println("yes/ no or true/ false or y/ n");
        System.out.println("Or enter x to exit");
        while (check==false) {
            knowcolor=values.nextLine();
            knowcolor=knowcolor.strip();
            if (knowcolor.toLowerCase()=="yes" || knowcolor.toLowerCase()=="true" || knowcolor.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                colorbool=true;
                check=true;
            }
            else if (knowcolor.toLowerCase()=="no" || knowcolor.toLowerCase()=="false" || knowcolor.toLowerCase()=="n" || knowcolor.toLowerCase()=="x" ){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                colorbool=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n or x to exit");
            }
        }
        
        //asking user inputs
        System.out.println("What is the weight in grams");
        try{
            weight=values.nextDouble();
        }
        catch (Exception e){
            System.out.println("Not approriate input");
        }

        System.out.println("What is the density in g/cm3");
        try{
            density=values.nextDouble();
        }
        catch (Exception e){
            System.out.println("Not approriate input");
        }

        check=false;
        System.out.println("Is it magnetic");
        System.out.println("yes/ no or true/ false or y/ n");
        String magnet;
        while (check==false) {
            magnet=values.nextLine();
            magnet=magnet.strip();
            if (magnet.toLowerCase()=="yes" || magnet.toLowerCase()=="true" || magnet.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                isMagnetic=true;
                check=true;
            }
            else if (magnet.toLowerCase()=="no" || magnet.toLowerCase()=="false" || magnet.toLowerCase()=="n"|| magnet.toLowerCase()=="x" ){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                isMagnetic=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n ");
            }
        }

        check=false;
        System.out.println("Is it Compostable");
        System.out.println("yes/ no or true/ false or y/ n");
        String compost;
        while (check==false) {
            compost=values.nextLine();
            compost=compost.strip();
            if (compost.toLowerCase()=="yes" || compost.toLowerCase()=="true" || compost.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                isCompostable=true;
                check=true;
            }
            else if (compost.toLowerCase()=="no" || compost.toLowerCase()=="false" || compost.toLowerCase()=="n"|| compost.toLowerCase()=="x" ){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                isCompostable=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n ");
            }
        }

        check=false;
        System.out.println("Is it Recyclable");
        System.out.println("yes/ no or true/ false or y/ n");
        String recycle;
        while (check==false) {
            recycle=values.nextLine();
            recycle=recycle.strip();
            if (recycle.toLowerCase()=="yes" || recycle.toLowerCase()=="true" || recycle.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                isRecyclable=true;
                check=true;
            }
            else if (recycle.toLowerCase()=="no" || recycle.toLowerCase()=="false" || recycle.toLowerCase()=="n"|| recycle.toLowerCase()=="x" ){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                isRecyclable=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n ");
            }
        }

        check=false;
        System.out.println("Is it Sinkable");
        System.out.println("yes/ no or true/ false or y/ n");
        String sink;
        while (check==false) {
            sink=values.nextLine();
            sink=sink.strip();
            if (sink.toLowerCase()=="yes" || sink.toLowerCase()=="true" || sink.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                isSinkable=true;
                check=true;
            }
            else if (sink.toLowerCase()=="no" || sink.toLowerCase()=="false" || sink.toLowerCase()=="n"|| sink.toLowerCase()=="x" ){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                isSinkable=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n ");
            }
        }

        check=false;
        System.out.println("Is it Waterproof");
        System.out.println("yes/ no or true/ false or y/ n");
        String waterproof;
        while (check==false) {
            waterproof=values.nextLine();
            waterproof=waterproof.strip();
            if (waterproof.toLowerCase()=="yes" || waterproof.toLowerCase()=="true" || waterproof.toLowerCase()=="y" ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                isWaterproof=true;
                check=true;
            }
            else if (waterproof.toLowerCase()=="no" || waterproof.toLowerCase()=="false" || waterproof.toLowerCase()=="n"|| waterproof.toLowerCase()=="x" ){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                isWaterproof=false;
                check=true;
            }
            else{
                System.out.println("Please check your input, make sure it is either yes/ no or true/ false or y/ n ");
            }
        }
        if (light){
            System.out.println("What is the lightSpectra in nms");
            try{
                lightSpectra=values.nextInt();
            }
            catch (Exception e){
                System.out.println("Not approriate input");
            }

        }
        if (colorbool){
            System.out.println("What is the color");
            try{
                color=values.nextLine();
            }
            catch (Exception e){
                System.out.println("Not approriate input");
            }

        }
        if (typebool){
            System.out.println("What is the type");
            try{
                typeStr=values.nextLine();
                typeStr=typeStr.strip().toLowerCase();
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
            }
            catch (Exception e){
                System.out.println("Not approriate input");
            }
        }

        if ((lightSpectra!=0) &&colorbool){
            Waste waste1=new Waste(weight, density, lightSpectra, color, isMagnetic, isRecyclable, isSinkable, isWaterproof, isCompostable);
        }
        else if ((lightSpectra==0) &&colorbool){
            Waste waste1= new Waste(type, weight, density, isMagnetic, isRecyclable, color, item, isSinkable, isWaterproof, isCompostable);
        }
        else if ((lightSpectra==0) && colorbool==false ){
            Waste waste1 = new Waste(weight, density, isMagnetic, isRecyclable, item, isSinkable, isWaterproof, isCompostable);
        }
        if ((lightSpectra!=0) &&colorbool==false){
            Waste waste1=new Waste(weight, density, lightSpectra, isMagnetic, isRecyclable, isSinkable, isWaterproof, isCompostable);
        }

            public Waste( double weight, double density, int lightSpectra, boolean isMagnetic, boolean isReyclable, boolean isSinkable, boolean isWaterproof, boolean isCompostable){
        this.type=types.UNKNOWN;
        this.weight=weight;
        this.density=density;
        this.lightSpectra=lightSpectra;
        this.isMagnetic=isMagnetic;
        this.isRecyclable=isReyclable;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        this.isCompostable=isCompostable;
        addCount();
    }
    
    public Waste( double weight, double density,  boolean isMagnetic, boolean isReyclable, boolean isSinkable, boolean isWaterproof, boolean isCompostable){
        this.type=types.UNKNOWN;
        this.weight=weight;
        this.density=density;
        this.isMagnetic=isMagnetic;
        this.isRecyclable=isReyclable;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        this.isCompostable=isCompostable;
        addCount();
    }

    public Waste( double weight, double density, String color, boolean isMagnetic, boolean isReyclable, boolean isSinkable, boolean isWaterproof, boolean isCompostable){
        this.type=types.UNKNOWN;
        this.weight=weight;
        this.density=density;
        this.isMagnetic=isMagnetic;
        this.color=color;
        this.isRecyclable=isReyclable;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        this.isCompostable=isCompostable;
        addCount();
    }
    public Waste(types type, double weight, double density, String color, String item, boolean isMagnetic, boolean isReyclable, boolean isSinkable, boolean isWaterproof, boolean isCompostable){
        this.type=type;
        this.weight=weight;
        this.density=density;
        this.isMagnetic=isMagnetic;
        this.isRecyclable=isReyclable;
        this.color=color;
        this.item=item;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        this.isCompostable=isCompostable;
        addCount();
    }
         public Waste( double weight, double density, boolean isMagnetic, boolean isReyclable, String item, boolean isSinkable, boolean isWaterproof, boolean isCompostable){
        this.type=types.UNKNOWN;
        this.weight=weight;
        this.density=density;
        this.isMagnetic=isMagnetic;
        this.isRecyclable=isReyclable;
        this.item=item;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        this.isCompostable=isCompostable;
        addCount();
    }
public Waste( double weight, double density, boolean isMagnetic, boolean isReyclable, String color, String item, boolean isSinkable, boolean isWaterproof, boolean isCompostable){
        this.type=types.UNKNOWN;
        this.weight=weight;
        this.density=density;
        this.isMagnetic=isMagnetic;
        this.isRecyclable=isReyclable;
        this.color=color;
        this.item=item;
        this.isSinkable=isSinkable;
        this.isWaterproof=isWaterproof;
        this.isCompostable=isCompostable;
        addCount();
    }
    }
}
 */