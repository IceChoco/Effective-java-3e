package item01.service_provide_Framework_exam;

/*
Item 01에 나오는 static factory method의 3, 4, 5번째 장점을 보이기 위한 간단한 예제를 만들어 봤어요. 아래 링크에 static factory method인 getSoundPlayer가 있어요.
이 getSoundPlayer에 인자(argument)로 주어진 동물이 개이면, 이 함수는 개소리를 내는 SonudPayer객체를 리턴합니다.
https://onlinegdb.com/oe1_Qn_mj 또는 http://jdoodle.com/ia/ksj
(혹시 하나가 없어질지 몰라 똑같은 두 개를 다른 사이트에 만들었습니다)
- 사용자는 getSoundPlayer가 리턴하는 게 SoundPlayer 라고 생각하고 쓸거에요. 하지만 실제로 리턴되는 건 자식 클래스인 DogSoundPlayer (개소리를 내는 플레이어) 객체에요.
  아니면 필요에 따라 또 다른 종류의 SoundPlayer 구현체를 리턴할 수도 있겠지요. 사용자는 실제로 뭐가 리턴됐는지는 알 필요도 없을 거에요 (실제로 DogSoundPlayer는 라이브러리 속에 숨어 있겠지요. 굳이 사용자 골치아프게 사용자한테 보여줄 필요도 없어요). 이게 3번째 장점입니다.
- 여러 가지 동물을 위한 드라이버가 등록되면, getSoundPlayer는 어떤 동물 이름이 주어지냐에 따라 다른 플레이어를 리턴할 거에요. 그게 4번째 장점입니다.
- 개 드라이버가 등록된 뒤엔 getSoundPlayer는 사실 DogSoundPlayer (개소리를 내는 플레이어) 를 리턴해요. 하지만, '프레임워크'인 getSoundPlayer를 만들 땐, DogSoundPlayer 클래스가 존재할 필요도 없었어요. 이게 5번째 장점입니다.
싱글톤 DogSoundPlayer를 리턴하게 바꾸면 2번째 장점도 보일 수 있을 것 같은데, 귀찮네요... (편집됨)
* */

import java.util.ArrayList;
import java.util.List;

/*
정적 팩터리 메서드의 5번째 장점
DriverManager.registerDriver 을 작성하는 시점에는 반환할 객체의 클래스가 아직 존재하지 않아도 동작이 가능하다
*/

// Service Provider Framework
// 1. Service Interface: SoundPlayer
// 2. Provider Registration API: DriverManager.registerDriver
// 3. Service Access API: DriverManager.getSoundPlayer
// 4. Service Provider Interface: Driver

    // 1. Service Interface.
    interface SoundPlayer {
        void play();
    }

    // 4. Service Provider Interface.
    interface Driver {
        boolean doesMatch(String animalType);
        SoundPlayer createSoundPlayer();
    }

    class DriverManager {
        private final static List<Driver> drivers = new ArrayList<Driver>();

        // 2. Provider Registration API.
        public static void registerDriver(Driver driver) {
            drivers.add(driver);
        }

        // 3. Service Access API.
        // This static factory method will return an implementation of SoundPlayer.: 이 정적 팩터리 메소드는 사운드 플에이어의 구현체를 리턴할 것입니다.
        // However, that implementation doesn't need to exist now.                 : 그러나 그 구현체는 지금 존재할 필요가 없습니다.
        public static SoundPlayer getSoundPlayer(String animalType) {
            for (Driver driver : drivers) {
                if (driver.doesMatch(animalType))
                    return driver.createSoundPlayer();
            }
            return null;
        }
    }

    // A concrete implementation of Driver, for dog sound. : 개소리를 위한 드라이버의 구체적인 구현체
    class DogDriver implements Driver {
        // Note that the static factory method DriverManager.getSoundPlayer of the : 위처럼 프레임워크의 정적팩토리메서드 DriverManager.getSoundPlayer는
        // framework above will return a DogSoundPlayer, for a animal type that    : 이 DogDriver와 일치하면 동물 유형에 대해 DogSoungPlayer를 반환합니다.
        // matches this DogDriver.
        // However, the static factory method DriverManager.getSoundPlayer was     : 하지만 정적팩토리메소드 DriverManager.getSoundPlayer는 DogSoundPlayer가 정의되기 전에 쓰여졌습니다.
        // written _before_ this DogSoundPlayer is defined.
        private class DogSoundPlayer implements SoundPlayer {
            public void play() {
                // Play doggy sound.
                System.out.println("Bow-wow Wuf-wuf");
            }
        }

        public boolean doesMatch(String animalType) {
            return animalType == "Yorkshire Terrier" ||
                    animalType == "Cocker Spaniel" ||
                    animalType == "Golden Retriever";
        }

        public SoundPlayer createSoundPlayer() {
            return new DogSoundPlayer();
        }
    }

// A program to test DogDriver.
public class Main {
    public static void main(String[] args) {
        DriverManager driverManager = new DriverManager();
        driverManager.registerDriver(new DogDriver());

        SoundPlayer player = driverManager.getSoundPlayer(
                "Golden Retriever");
        assert player != null;
        player.play();
    }
}