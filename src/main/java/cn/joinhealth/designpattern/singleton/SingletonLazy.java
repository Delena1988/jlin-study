package cn.joinhealth.designpattern.singleton;

/**
 * @author linjian
 * @date 2023/2/8 16:55
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
