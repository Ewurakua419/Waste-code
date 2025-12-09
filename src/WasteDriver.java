import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class WasteDriver {
    private ArrayList<String> wasteBinstr;
    private ArrayList<Paper>papers;
    private ArrayList<Plastic> plastics;
    private ArrayList<Metal> metals;
    private ArrayList<Organic> organics;
    public WasteDriver(){
        this.plastics=new ArrayList<>();
        this.metals=new ArrayList<>();
        this.wasteBinstr= new ArrayList<>();
        this.organics= new ArrayList<>();
        this.metals= new ArrayList<>();
    }
    
    
    public void create(Waste waste){
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
    
    public void saveToFile(String filename) throws IOException{
            // Use scanner to read patients data
            try(FileWriter files= new FileWriter(filename,true)){
                files.write("\n"+wasteBinstr);
                files.close();
                
                

            }catch(IOException e){
                System.out.println("Error in appending to file");
            }
            
        }

    public static void main(String[] args) {
        WasteDriver driver= new WasteDriver();
        
        //start with asking what the user knows before asking for their inputs
    
        
    

        

    }
}
