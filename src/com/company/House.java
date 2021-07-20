package com.company;

public class House {
    String window1 = "________";
    String window2 = "________";
    String window3 = "________";
    String topOf1 = "        ";
    String topOf2 = "        ";
    String topOf3 = "        ";

    public House(){

    }
    public void reset(){
        window1 = "________";
        window2 = "________";
        window3 = "________";
        topOf1 = "        ";
        topOf2 = "        ";
        topOf3 = "        ";
    }
    public String toString(){
        return  "                                              ________________________________________\n" +
                "                                             /\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\n" +
                "                                            /oo\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\ \n" +
                "                                           /____\\_______________________________________\\\n" +
                "                                           | oooo|  __________  __________  __________  |\n" +
                "                                           |ooooo|  |"+topOf1+"|  |"+topOf2+"|  |"+topOf3+"|  |\n" +
                "                                           |ooooo|  |"+ window1 +"|  |"+ window2 +"|  |"+ window3 +"|  |\n" +
                "                                           |ooooo|      __                __            |\n" +
                "                                           |ooooo|     | .|              | .|           |\n" +
                "                                           |ooooo|     |  |              |  |           |";
    }
}
