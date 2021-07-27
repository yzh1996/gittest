package exception;

/**
 * @ClassName: demo01
 * @Author: yzh
 * @Description:
 * @Date: 2021/7/7 21:26
 * @Version: 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        devide(1,-2);
    }

    public static void devide(int x, int y){

            try {
                if (y<0){
                    throw  new userDefException("被除数是一个负数");
                }
            } catch (userDefException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());

            }
        }

}
