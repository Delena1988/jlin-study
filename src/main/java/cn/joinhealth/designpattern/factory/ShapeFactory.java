package cn.joinhealth.designpattern.factory;

import cn.joinhealth.designpattern.factory.entity.Circle;
import cn.joinhealth.designpattern.factory.entity.Rectangle;
import cn.joinhealth.designpattern.factory.entity.Square;

/**
 * @author linjian
 * @date 2023/2/2 14:23
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
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
}
