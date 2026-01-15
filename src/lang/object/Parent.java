package lang.object;



// 부모가 없으면 묵시적으로 Object  클래스를 상속받음
public class Parent extends java.lang.Object {         // 묵시적으로 생성하기 때문에, 굳이 작성할 필요는 없다.

    public void parentMethod(){
        System.out.println("parent.ParentMethod");

    }
}
