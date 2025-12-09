import java.io.IOException;

public class WasteDriver {
    public static void main(String[] args) throws IOException {
        WasteManager manager = new WasteManager();
        manager.loadFromFile("waste_data.txt");
        for (Waste w : manager.wasteBin) {
            w.checkType();
        }
        manager.create();
        for (String s : manager.wasteBinstr) {
            System.out.println(s);
        }
        
        manager.saveToFile("new.txt");

        
    }
}
