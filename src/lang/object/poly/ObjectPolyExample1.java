package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        // Object는 모든 클래스의 부모 
        action(dog); // Dog 타입의 dog는 Obejct타입의 자식임, 즉, Car타입은 Object 타입의 자식이며,
                     // action 메소드의 파라미터로 dog가 가능함
        action(car); // Car 타입의 car는 Object타입의 자식이며, action 메소드의 파라미터로 car를 전달할 수 있음
    }

    private static void action(Object obj){
        //obj.sound();    // 컴파일 에러 발생 , Object 타입에 Sound()가 없기 때문에
        //obj.move();     // 컴파일 에러 발생 , Object 타입에 move()가 없기 때문에

        //instanceof를 통해 객체의 타입을 확인하며, 형변환 가능 여부를 확인한다.

        // 객체 instanceof 클래스
        // 객체에 맞는 다운캐스팅이 필요함
        if (obj instanceof Dog dog){    // 만약 obj의 타입이 Dog타입일 때
            dog.sound();        // (Dog)obj.sound와 같음 (명시적 형변환)
        } else if (obj instanceof Car car){
            car.move();

        }

    }

}
