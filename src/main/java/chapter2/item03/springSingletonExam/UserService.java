package chapter2.item03.springSingletonExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype") - 이걸 쓰면 싱글턴 스콥이 달라져서 UserService 클래스의 인스턴스 생성할때마다 싱글턴이 아니게됨 
public class UserService {

    @Autowired
    UserRepository userRepository;

}
