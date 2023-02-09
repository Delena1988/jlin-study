package cn.joinhealth.designpattern.singleton;

/**
 * @author linjian
 * @date 2023/2/9 14:13
 */
public class SingletonDCL {
    private volatile static SingletonDCL singletonDCL;

    private SingletonDCL() {
    }

    public static SingletonDCL getSingleton() {
        if (singletonDCL == null) {
            synchronized (SingletonDCL.class) {
                if (singletonDCL == null) {
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
