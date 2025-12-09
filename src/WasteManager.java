import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class WasteManager {
    ArrayList<String> wasteBinstr;
    ArrayList<Paper>papers;
    ArrayList<Plastic> plastics;
    ArrayList<Metal> metals;
    ArrayList<Organic> organics;
    ArrayList<Waste> wasteBin;
    public WasteManager(){
        this.plastics=new ArrayList<>();
        this.metals=new ArrayList<>();
        this.wasteBinstr= new ArrayList<>();
        this.organics= new ArrayList<>();
        this.metals= new ArrayList<>();
    }
    
    
    public void create(ArrayList<Waste> wasteBin){
        for (Waste waste : wasteBin){
            types type=waste.getType(true);
            switch (type) {
                    case PLASTIC:
                        Plastic p1= new Plastic(waste.getNewType(),waste.getIsMeltable());
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
                files.write("\n"+wasteBinstr);
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
