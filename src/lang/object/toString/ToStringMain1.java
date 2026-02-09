package lang.object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object obj = new Object();
        String str1 = obj.toString();

        // toString() 변환값 출력
        System.out.println(str1);   // @f6f4d33 > @ 뒤 16진수로 객체의 참조값을 나타낸다.

        //object 직접 출력
        System.out.println(obj);
    }


}
