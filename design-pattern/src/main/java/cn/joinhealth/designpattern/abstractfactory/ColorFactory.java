package cn.joinhealth.designpattern.abstractfactory;

import cn.joinhealth.designpattern.abstractfactory.entity.Blue;
import cn.joinhealth.designpattern.abstractfactory.entity.Green;
import cn.joinhealth.designpattern.abstractfactory.entity.Red;
import cn.joinhealth.designpattern.factory.Shape;

/**
 * @author linjian
 * @date 2023/2/2 14:46
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
