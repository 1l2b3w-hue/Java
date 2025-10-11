package com.enum_;

import java.util.Objects;

public class QQState {
    private String state;
    public QQState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "QQState{" +
                "state='" + state + '\'' +
                '}';
    }

    public static final QQState online = new QQState("在线");
    public static final QQState underline = new QQState("离线");
    public static final QQState onMusic = new QQState("音乐中");
    public static final QQState onGame = new QQState("游戏中");
    public QQState(){

    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QQState qqState = (QQState) o;
        return Objects.equals(state, qqState.state);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void main(String[] args) {
        System.out.println(online);
        System.out.println(underline);
        System.out.println(onMusic);
        System.out.println(onGame);

    }
}
