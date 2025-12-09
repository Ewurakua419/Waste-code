import java.util.*;

public class Paper extends Waste {
    boolean isRecyclable;
    private String paperType;  

    // Collections
    private static List<Paper> allPapers = new ArrayList<>();
    private static Map<String, List<Paper>> paperCategories = new TreeMap<>();


    public Paper (String paperType, double weight) {
        super(types.PAPER);
        this.paperType = paperType;

        // Override recyclable
        setIsRecyclable(true);

        storeInCollections();
        Waste.addCount();
    }

    public void setIsRecyclable(boolean isRecycable){
        this.isRecyclable=isRecycable;
    }
    public boolean getIsRecyclable(){
        return isRecyclable;
    }

    private void storeInCollections() {
        allPapers.add(this);

        String key = paperType.toLowerCase();
        paperCategories.putIfAbsent(key, new ArrayList<>());
        paperCategories.get(key).add(this);
    }

     //getters
    public String getPaperType() { 
        return paperType; 
    }
    public static List<Paper> getAllPapers() { 
        return allPapers; 
    }
    public static Map<String, List<Paper>> getPaperCategories() { 
        return paperCategories; 

    }

    // setters
    public void setPaperType(String paperType) { 
        this.paperType = paperType; 
    }

    @Override
    public String toString() {
        return "Paper {" +
               "Type=" + paperType +
               ", Weight=" + getWeight() + " kg" +
               ", Recyclable=" + getIsRecyclable() +
               "}";
    }
}