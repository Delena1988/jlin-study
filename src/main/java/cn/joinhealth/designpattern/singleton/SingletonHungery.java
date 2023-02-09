package cn.joinhealth.designpattern.singleton;

/**
 * @author linjian
 * @date 2023/2/8 16:57
 */
public class SingletonHungery {
    private static SingletonHungery instance = new SingletonHungery();
    private SingletonHungery() {

    }

    public static SingletonHungery getInstance() {
        return instance;
    }
}
