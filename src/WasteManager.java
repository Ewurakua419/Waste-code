import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class WasteManager{
    ArrayList<String> wasteBinstr=new ArrayList<>();
    ArrayList<Paper>papers=new ArrayList<>();
    ArrayList<Plastic> plastics=new ArrayList<>();
    ArrayList<Metal> metals=new ArrayList<>();
    ArrayList<Organic> organics=new ArrayList<>();
    ArrayList<Waste> wasteBin = new ArrayList<>();

    public WasteManager(){
        this.plastics=new ArrayList<>();
        this.metals=new ArrayList<>();
        this.wasteBinstr= new ArrayList<>();
        this.organics= new ArrayList<>();
        this.metals= new ArrayList<>();
    }
    
    
    public void create(){
        for (Waste waste : wasteBin){
            types type=waste.getType(true);
            switch (type) {
                    case PLASTIC:
                        Plastic p1= new Plastic(waste.getNewType());
                        plastics.add(p1);
                        wasteBinstr.add(p1.toString());
                        break;
                    case METAL:
                        Metal metal= new Metal(waste.getNewType(), waste.getWeight(), waste.getIsMagnetic(), waste.getLightSpectra());
                        metals.add(metal);
                        wasteBinstr.add(metal.toString());
                        break;
                    case PAPER:
                        Paper paper= new Paper(waste.getColor(), waste.getWeight());
                        papers.add(paper);
                        wasteBinstr.add(paper.toString());
                        break;
                    case ORGANIC:
                        Organic organic=new Organic(waste.getNewType(), waste.getIsCompostable());
                        organics.add(organic);
                        wasteBinstr.add(organic.toString());
                        break;
                    
                    default:
                        wasteBinstr.add(waste.toString());
                        //leave as unknown
                        break;
            }
        
        }
        
    }
    
    public void saveToFile(String filename) throws IOException{
            // Use scanner to read patients data
            try(FileWriter files= new FileWriter(filename,true)){
                files.write("\n"+wasteBinstr+"\n");
                files.close();
                
                

            }catch(IOException e){
                System.out.println("Error in appending to file");
            }
            
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
                
                if (lines.length==10){
                    typeStr=lines[0].strip().toLowerCase();
                    switch (typeStr) {
                        case "paper":
                            type=types.PAPER;
                            break;
                    
                        case "metal":
                            type=types.METAL;
                            break;
                        
                        case "organic":
                            type=types.ORGANIC;
                            break;
                        
                        case "plastic":
                            type=types.PLASTIC;
                            break;
                        
                        
                        default:
                            type=types.UNKNOWN;
                            break;
                    }
                    weight=Double.parseDouble(lines[1]);
                    density=Double.parseDouble(lines[2]);
                    lightSpectra=Integer.parseInt(lines[3]);
                    color=lines[4];
                    item=lines[5];
                    if (lines[6].toLowerCase().equals("true")  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isMagnetic=true;
                    }
                    else if (lines[6].toLowerCase().equals("false")){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isMagnetic=false;
                    }
                    if (lines[7].toLowerCase().equals("true")  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isSinkable=true;
                    }
                    else if (lines[7].toLowerCase().equals("false")){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isSinkable=false;
                    }
                    if (lines[8].toLowerCase().equals("true")  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isWaterproof=true;
                    }
                    else if (lines[8].toLowerCase().equals("false")){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isWaterproof=false;
                    }

                    if (lines[9].toLowerCase().equals("true")  ){//converts the value to a boolean value true if the inputs are yes/ y/ true
                        isCompostable=true;
                    }
                    else if (lines[9].toLowerCase().equals("false")){// converts the vake to the valew to a boolean value false if inputs are no/false or n
                        isCompostable=false;
                    }

                    

                
                    try {
                        Waste waste=new Waste(type, weight, density, lightSpectra, color, item, isMagnetic,  isSinkable, isWaterproof, isCompostable);
                        wasteBin.add(waste);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Not a Waste object");
                    }
                }
            }    
                
            
        }catch(IOException e){
            System.out.println("Error in loading");
        }
    }

    
}
