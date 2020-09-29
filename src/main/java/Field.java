import java.util.ArrayList;

public class Field {
    private ArrayList<CropRow> cropRows = new ArrayList<CropRow>();

    public Field() {
        this.cropRows = cropRows;
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    @Override
    public String toString() {
        return "Field{" +
                "cropRows=" + cropRows +
                '}';
    }

    public void add(CropRow croprow1) {
    }
}

