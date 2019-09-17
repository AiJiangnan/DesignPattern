package com.ajn.design.pattern.observer;

import java.util.Observable;

/**
 * @author 艾江南
 * @date 2019/5/25
 */
public class Subject extends Observable {

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
