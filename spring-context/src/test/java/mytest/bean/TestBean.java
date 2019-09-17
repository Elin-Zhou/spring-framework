package mytest.bean;

/**
 * @author ElinZhou eeelinzhou@gmail.com
 * @version $Id: TestBean.java , v 0.1 2019-09-17 15:44 ElinZhou Exp $
 */
public class TestBean implements TestInterface {
    @Override
    public String say() {
        return "hello world";
    }
}
