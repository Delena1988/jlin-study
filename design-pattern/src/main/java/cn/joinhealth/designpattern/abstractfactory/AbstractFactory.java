package cn.joinhealth.designpattern.abstractfactory;

import cn.joinhealth.designpattern.factory.Shape;

/**
 * @author linjian
 * @date 2023/2/2 14:44
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);

}
