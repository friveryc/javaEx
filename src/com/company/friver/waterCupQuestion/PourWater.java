package com.company.friver.waterCupQuestion;

public class PourWater {
    public static void main(String[] args) {
        Glass glass1 = new Glass("马克杯", 10);
        Glass glass2 = new Glass("玻璃杯", 8,6);
        pour(glass2,glass1);
        glass1.glassStatus();
        glass2.glassStatus();

    }

    public static void pour(Glass glass1, Glass glass2) {
        //glass1 倒水给 glass2
        System.out.println(glass1.getName() + " 给" + glass2.getName() + " 倒水");
        if (glass2.getCapacity() <= glass2.getWaterYield()) {
            System.out.println(glass2.getName() + " 已满!");
            return;
        }
        if (glass1.getWaterYield() <= 0) {
            System.out.println(glass1.getName() + " 没有水");
            return;
        }
        if (glass1.getWaterYield() + glass2.getWaterYield() <= glass2.getCapacity()) {
            glass2.setWaterYield(glass1.getWaterYield() + glass2.getWaterYield());
            glass1.setWaterYield(0);

        }else{
            glass2.setWaterYield(glass2.getCapacity());
            glass1.setWaterYield(glass1.getWaterYield()+(glass2.getCapacity()- glass2.getWaterYield()));
        }
        glass1.glassStatus();
        glass2.glassStatus();
    }
}

class Glass {
    private String name;
    private double capacity;//水杯的容量
    private double waterYield;//水杯的水量

    Glass(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    Glass(String name, double capacity, double waterYield) {
        this.name = name;
        this.capacity = capacity;
        this.waterYield = waterYield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

//    public void setCapacity(double capacity) {
//        this.capacity = capacity;
//    }

    public double getWaterYield() {
        return waterYield;
    }

    public void setWaterYield(double waterYield) {
        this.waterYield = waterYield;
    }

    public void glassStatus() {
        System.out.println(name + "的容量:" + capacity + " 水量:" + waterYield);
    }
}
