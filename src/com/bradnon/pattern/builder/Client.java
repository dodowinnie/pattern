package com.bradnon.pattern.builder;

public class Client {

    public static void main(String[] args) {
        ActorBuilder builder = new HeroBuilder();
        Actor actor = builder.construct();
        System.out.println(actor.toString());
    }
}
