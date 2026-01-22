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

    }

}
