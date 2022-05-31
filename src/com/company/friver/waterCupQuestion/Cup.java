package com.company.friver.waterCupQuestion;

/**
 * 水杯类
 * 水杯默认容量10 水量0
 */
public class Cup {
    private double volume = 10;
    private double waterYield = 0;
    private String name = "默认水杯";

    Cup() {
        System.out.println("默认水杯:容量=10 水量=0");
    }

    Cup(double volume) {
        this.volume = volume;
        System.out.println("设置水杯:容量=" + volume + "水量=0");
    }

    public double getVolume() {
        return volume;
    }

    /**
     * 设置水杯容量
     *
     * @param volume 水杯容量
     */
    public void setVolume(double volume) {
        if (waterYield > 0) {
            System.out.println("水杯装水后不可以设置水杯容量!");
        } else {
            if (volume <= 0) {
                System.out.println("容量数据异常,已自动设为10");
                this.volume = 10;
            } else
                this.volume = volume;
        }

    }

    public double getWaterYield() {
        return waterYield;
    }

    /**
     * 水杯加水
     *
     * @param waterYield 设置水杯水量
     */
    public void setWaterYield(double waterYield) {
        if (waterYield > volume) {
            System.out.println("水量超出容量,水量自动归零");
            this.waterYield = 0;
        } else
            this.waterYield = waterYield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param waterYield 倒入的水量
     * @return 多出来的水量
     */
    public double pourWater(double waterYield) {
        double freeSpace = this.volume - this.waterYield;
        if (freeSpace >= waterYield) {
            this.waterYield += waterYield;
            System.out.println("倒入的水量:" + waterYield);
            System.out.println("当前水量:" + this.waterYield);
            return 0;
        } else {
            this.waterYield = this.volume;
            System.out.println("倒入的水量:" + waterYield + " 多出的水量:" + (waterYield - freeSpace));
            System.out.println("当前水满了!水量为:" + this.waterYield);
            return waterYield - freeSpace;

        }
    }

    public void cupStatus() {
        System.out.println("当前水杯状态: " + waterYield + "/" + volume);
    }


}
