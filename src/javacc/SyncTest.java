package javacc;

/**
 * <p>
 *   javac .java文件编译为.class文件 ，再用javap反编译
 * </p >
 *
 * @author wujianlong
 * @package javacc
 * @date 2019-10-23 14:09
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class SyncTest {

    // 关键字在实例方法上，锁为当前实例
    public synchronized void method1() {
        // code
    }

    // 关键字在代码块上，锁为括号里面的对象
    public void method2() {
        Object o = new Object();
        synchronized (o) {
            // code
        }
    }
}
