package java_seminar.homework_6;

import java.util.Map;

public class Laptops {
    private String model;
    private int ramGB;
    private int hddGB;
    private String opsystem;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public int getHddGB() {
        return hddGB;
    }

    public void setHddGB(int hddGB) {
        this.hddGB = hddGB;
    }

    public String getOpsystem() {
        return opsystem;
    }

    public void setOpsystem(String opsystem) {
        this.opsystem = opsystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Модель: " + model + ", ОЗУ: " + ramGB + ", Жесткий диск: " + hddGB + ", ОС: " + opsystem + ", Цвет: " + color;
    }

    public boolean chooseCriteria(Map<Integer, Object> criteria) {
        for (Map.Entry<Integer, Object> entry : criteria.entrySet()) {
            Integer filter = entry.getKey();
            Object value = entry.getValue();

            switch (filter) {
                case 1:
                    if (getRamGB() < (int) value) {
                        return false;
                    }
                    break;
                case 2:
                    if (getHddGB() < (int) value) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getOpsystem().equalsIgnoreCase((String) value)) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getColor().equalsIgnoreCase((String) value)) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getModel().equalsIgnoreCase((String) value)) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}