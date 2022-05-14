package com.company.friver.waterCupQuestion;

public class OperateCup {
    public static void main(String[] args) {
        Cup cup1 = new Cup();
        Cup cup2 = new Cup(8);
        cup1.setWaterYield(4);

//        changeWater(cup1,cup2);

        cup1.cupStatus();
        cup2.cupStatus();
    }

    /**
     * 封装水杯之间的相互倒水行为
     * @param a 倒水水杯
     * @param b 接水水杯
     */
    public void changeWater(Object a,Object b){
//        a.setVolume(b.pourWater(a.getWaterYield()));
        System.out.println("进行了倒水操作");
    }

}
