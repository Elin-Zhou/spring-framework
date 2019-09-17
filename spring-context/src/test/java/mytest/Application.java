package mytest;

import mytest.bean.TestInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ElinZhou eeelinzhou@gmail.com
 * @version $Id: mytest.Application.java , v 0.1 2019-09-17 15:16 ElinZhou Exp $
 */
public class Application {

    public static void main(String... args) {
        // 用我们的配置文件来启动一个 ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

        TestInterface bean = context.getBean(TestInterface.class);
        System.out.println(bean.say());
    }

}
