package chapter2.item03.springSingletonExam;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Config 라는 클래스가 있는 위치부터 컴포넌트 스캔을 하겠다.
@ComponentScan(basePackageClasses = Config.class)
public class Config {

}
