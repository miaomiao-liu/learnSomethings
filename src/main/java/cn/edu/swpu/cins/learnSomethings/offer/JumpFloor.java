package cn.edu.swpu.cins.learnSomethings.offer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * Created by miaomiao on 17-8-3.
 */
public class JumpFloor {
    public int test(int target){
        if(target == 0){
            return 0;
        }else if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }
        return test(target-1)+test(target-2);
    }
}
