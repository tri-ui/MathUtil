/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tri.util;

/**
 *
 * @author ASUS
 */
//đây là class chứa các hàm tiện ích xài chung cho các nơi khác
//nó chứa các hàm tính toán để bổ trợ cho các class khác
//do là đồ bổ trợ, xài chung, nên chúng là STATIC
public class MathUtil {
    //hàm tính n! = 1.2.3....n vì tăng kết quả rất nhanh, sớm tràn
    //int chỉ tối đa 2 tỷ 1, phải để long cho đỡ bị tràn kết quả
    //mình chỉ nen tính n <= 15, vì 20! to lắm
    public static long computeFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
