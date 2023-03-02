package cn.joinhealth.designpattern.factory.entity;

import cn.joinhealth.designpattern.factory.Shape;

/**
 * @author linjian
 * @date 2023/2/2 14:21
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
