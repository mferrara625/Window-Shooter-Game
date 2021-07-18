package com.company;

public class House {
    String window1 = "________";
    String window2 = "________";
    String window3 = "________";

    public House(){

    }
    public void reset(){
        window1 = "________";
        window2 = "________";
        window3 = "________";
    }
    public String toString(){
        return  "                                              ________________________________________\n" +
                "                                             /\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\n" +
                "                                            /oo\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\ \n" +
                "                                           /____\\_______________________________________\\\n" +
                "                                           | oooo|  __________  __________  __________  |                    \n" +
                "                                           |ooooo|  |        |  |        |  |        |  |\n" +
                "                                           |ooooo|  |"+ window1 +"|  |"+ window2 +"|  |"+ window3 +"|  |\n" +
                "                                           |ooooo|      __                __            |\n" +
                "                                           |ooooo|     | .|              | .|           |\n" +
                "                                           |ooooo|     |  |              |  |           |";
    }
}
