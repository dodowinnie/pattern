package com.bradnon.pattern.builder;

public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setConstume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("秃头");
    }

    @Override
    public boolean isBareheaded() {
        return true;
    }
}
