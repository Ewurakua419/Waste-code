import java.io.IOException;

public class WasteDriver {
    public static void main(String[] args) throws IOException {
        WasteManager manager = new WasteManager();
        manager.loadFromFile("waste_data.txt");
        for(int i=0; i < manager.wasteBin.size();i++){
            manager.wasteBin.get(i).checkType();
        }
        manager.saveToFile("new.txt");
    }
}
