package cn.joinhealth.designpattern.abstractfactory;

import cn.joinhealth.designpattern.factory.Shape;
import cn.joinhealth.designpattern.factory.entity.Circle;
import cn.joinhealth.designpattern.factory.entity.Rectangle;
import cn.joinhealth.designpattern.factory.entity.Square;

/**
 * @author linjian
 * @date 2023/2/2 14:48
 */
public class NewShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
