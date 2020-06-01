package com.task1;

public class character {
    private action act;

    public void setAct(action a) {
        this.act = a;
    }

    public action getAct() {
        return act;
    }
    public void functionality(){
        act.functionality();
    }
    public void StartGame(){
        System.out.println("Game start");
    }
}
