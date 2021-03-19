package com.bradnon.pattern.flyweight;

public class Client {

    public static void main(String[] args) {
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        IgoChessman b1 = factory.getIgoChessman("black");
        IgoChessman b2 = factory.getIgoChessman("black");
        IgoChessman b3 = factory.getIgoChessman("black");
        IgoChessman white = factory.getIgoChessman("white");
        white.display(new Coordinates(1,2));
        b1.display(new Coordinates(3,9));
    }
}
