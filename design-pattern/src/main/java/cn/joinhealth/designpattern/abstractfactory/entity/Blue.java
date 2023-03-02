package cn.joinhealth.designpattern.abstractfactory.entity;

import cn.joinhealth.designpattern.abstractfactory.Color;

/**
 * @author linjian
 * @date 2023/2/2 14:43
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
