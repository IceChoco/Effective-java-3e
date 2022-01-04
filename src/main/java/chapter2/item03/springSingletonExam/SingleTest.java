package chapter2.item03.springSingletonExam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class SingleTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserService userService1 = applicationContext.getBean(UserService.class);
        UserService userService2 = applicationContext.getBean(UserService.class);

        System.out.println(userService1 == userService2);//true: spring 안에서의 싱글턴이란 ApplicationContext 안에서의 범위를 얘기하는 것
    }
}
