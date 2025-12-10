import java.io.IOException;

public class WasteDriver {
    public static void main(String[] args) throws IOException {
        WasteManager manager = new WasteManager();
        manager.loadFromFile("waste_data.txt");
        for (Waste w : manager.wasteBin) {
            w.checkType();
        }
        manager.create();
        for (Plastic p : manager.plastics) {
            System.out.println(p.toString());
        }
        for (Metal m : manager.metals) {
            System.out.println(m.toString());
        }
        for (Paper pa : manager.papers) {
            System.out.println(pa.toString());
        }
        for (Organic o : manager.organics) {
            System.out.println(o.toString());
        }
        
        manager.saveToFile("new.txt");

        
    }
}
