package com.company;

public class FirstPosition extends House {
    int currentTargetPosition = 1;

    public FirstPosition(){

    }
    public String toString(){
        return "\n" +
                "                     _____________________\n" +
                "                    /\\uuuuuuuuuuuuuuuuuuuu\\\n" +
                "                   /oo\\uuuuuuuuuuuuuuuuuuuu\\\n" +
                "                  /____\\____________________\\\n" +
                "                  | oooo|  ___  ___  ___   |\n" +
                "                  |ooooo|  |O|  |_|  |_|   |\n" +
                "                  |ooooo|      __          |\n" +
                "                  |ooooo|     | .|         |\n" +
                "                  |ooooo|     |  |         |";
    }
}
