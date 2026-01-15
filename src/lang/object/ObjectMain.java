package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMain();
        child.parentMethod();

        // tostring은 Object 클래스의 메서드
        // (child > parent > Object이기 때문에, Object의 메소드 toString()을 사용할 수 있음 )
        String string = child.toString();
        System.out.println(string);

        // getClass > 현재 참조하고 있는 클래스를 확인할 수 있는 메소드
        // 즉, 위에서 선언한 변수의 클래스 위치를 찾아줌
        Class childGetClass = child.getClass();
        System.out.println(childGetClass);

        // getSuperClass > Class타입이며, 현재 참조하고 있는 클래스 타입의 변수의 부모를 가져옴 
        Class childGetSClass = childGetClass.getSuperclass();
        System.out.println(childGetSClass);





    }
}
