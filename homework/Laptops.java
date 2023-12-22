package homework;

import java.util.Map;

public class Laptops {
    String model;
    int ram;
    int ssd;
    int price;
    String os;
    String color;
    String category;

    @Override
    public String toString() {
        return '{' +
                "model=" + model +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", os=" + os +
                ", color=" + color + 
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public boolean contains(Map<String, Object> reference) {
        for (Map.Entry<String, Object> entry : reference.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            switch (key) {
                case "price":
                    if(price != (int) value){
                        return false;
                    }
                    break;
                case "ram":
                    if (ram != (int) value) {
                        return false;
                    }
                    break;
                case "ssd":
                    if (ssd != (int) value) {
                        return false;
                    }
                    break;
                case "os":
                    if (!os.equalsIgnoreCase((String) value)) {
                        return false;
                    }
                    break;
                case "color":
                    if (!color.equalsIgnoreCase((String) value)) {
                        return false;
                    }
                    break;
                case "category":
                    if (!category.equalsIgnoreCase((String) value)){
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return true;
    }
}