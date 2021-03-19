package com.bradnon.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IgoChessmanFactory {
    private static IgoChessmanFactory factory = new IgoChessmanFactory();
    private static Map<String, Object> map;

    private IgoChessmanFactory(){
        map = new HashMap<>();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        map.put("black", black);
        map.put("white", white);
    }

    public static IgoChessmanFactory getInstance(){
        return factory;
    }

    public IgoChessman getIgoChessman(String key){
        return (IgoChessman) map.get(key);
    }
}
