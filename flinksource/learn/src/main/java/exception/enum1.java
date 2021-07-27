package exception;

/**
 * @ClassName: enum1
 * @Author: yzh
 * @Description:
 * @Date: 2021/7/7 22:17
 * @Version: 1.0
 */
public enum enum1 {
    ZS("ZS",17);


    private String name ;
    private int age;

    enum1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
