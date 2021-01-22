package com.github.lolleroo.capture_the_flag;

public class Driver {

    public static void main(String[] args) {
        double x =5, y=5, z=5;

        Player[] players = {new Player("nick"), new Player("gold"), new Player("Loll")};

        players[0].setLocation(4,1,5);
        players[1].setLocation(15,2,2);
        players[2].setLocation(3,3,40);

        for (Player player : players) {
            if (player.nearby(x, y, z)) {
                System.out.println(player.getName() + " is near the flag!" + " they are at " + player.getLocation());
            }
        }
    }
}
