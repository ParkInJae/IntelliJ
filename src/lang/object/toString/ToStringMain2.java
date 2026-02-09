package lang.object.toString;

public class ToStringMain2 {

    public static void main(String []args){

        Car car = new Car("model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 3);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString() + "호출");  // 단순 주소만 가져옴
        System.out.println(dog1.toString() + "호출"); // Override 시킨 내용이 나옴
        System.out.println(dog2.toString() + "호출");

        System.out.println("3. Object 다형성 활용");
        // 여기서, ObjectPrinter라는 객체를 생성하지 않고 바로 사용할 수 있는 이유
        // 같은 패키지 내에 있는 클래스들은 서로의 static 멤버에 자유롭게 접근할 수 있기 때문
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);





    }




}
