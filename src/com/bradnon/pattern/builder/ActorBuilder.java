package com.bradnon.pattern.builder;

public abstract class ActorBuilder {

    Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor construct() {
        this.buildType();
        this.buildCostume();
        this.buildFace();
        if (!this.isBareheaded()) {
            this.buildHairstyle();
        }
        this.buildSex();
        return actor;
    }

    public boolean isBareheaded() {
        return false;
    }
}
