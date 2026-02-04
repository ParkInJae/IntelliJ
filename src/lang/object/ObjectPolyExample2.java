package lang.object;


import lang.object.poly.Car;
import lang.object.poly.Dog;

public class ObjectPolyExample2 {
    public static void main(String [] args){
        Dog dog = new lang.object.poly.Dog();
        Car car = new Car();

        Object object = new Object();       // Object  인스턴트도 생성할 수 있음

        /*길이가 3인 배열에  dog, car, object 대입 */
        // Object[] objects = {dog, car, object};

        /* 아래와 같음*/
        Object[] objects = new Object[3];   // 길이가 3인 배열을 생성 , 배열의 길이 > .toString
        objects[0] = dog;
        objects[1] = car;
        objects[2] = object;
        
        size(objects);



    }

    // static의 유무에 따라서, 클래스에 소속되는지, 객체에 소속되는지가 결정됨
    // static이 붙는다면 해당 클래스에 소속되기에, 사용할 때, 객체를 생성하지 않고 사용할 수 있다.

    // 만일 static이 붙지 않는다면, 해당 클래스에 소속된게 아닌 클래스를 통해 만들어진 인스턴스이기 때문에, 사용하기 위해서는
    // 객체를 먼저 생성 후 사용하여야한다.
    public static void size(Object[] object){
        // 객체의 길이 측정
        System.out.println("전달된 객체의 수 = " + object.length); // 배열에서 길이 잴 때는 length, 스트링에서는 length()
    }

}


/* 길이 측정
array :: length > 배열은 한 번 생성시 크기가 절대 변하지 않음 >즉, 생성 되는 순간크기가 배열 객체의 '속성'으로 고정되기에 메소드가 아닌 상수 필드로 제공됨

String :: length() > String은 java.lang.String이라는 클래스임. 클래스에서, 길이를 호출하는 메소드를 사용하기에 , length 뒤에 ()가 붙음

list :: size() > 일반적으로 Length()는 "길이"를 의미함. 그러나 Size는 "크기" (현재 담겨 있는 요소의 개수)를 의미함
즉 길이가 10인 리스트를 생성했을 때 내부적으로는 10칸짜리 배열이나, 데이터를 5개 넣으면, size()는 5를 반환함
* */