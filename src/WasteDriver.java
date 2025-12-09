import java.util.Scanner;
public class WasteDriver {
    public static void main(String[] args) {
        String knowLightSpectra;
        boolean light;
        String knowtype;
        boolean typebool;
        String knowcolor;
        boolean colorbool;
        boolean check=false;

        double weight;
        boolean isMagnetic;
        double density;
        boolean isRecyclable;
        String color;
        String item;
        boolean isSinkable;
        boolean isWaterproof;
        int lightSpectra;//in nm
        String newType="";
        boolean isCompostable;
        //start with asking what the user knows before asking for their inputs
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
        
    }
}
