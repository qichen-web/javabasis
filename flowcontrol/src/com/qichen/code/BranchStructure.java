package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/20
 * @since JDK1.8
 */
/*
    if-else结构：（条件判断）
    形式：
      1. if(条件表达式){
            执行代码块；
        }
      2. if(条件表达式){
            执行代码块1;
        }
        else{
            执行代码块2;
        }
      3. if(条件表达式1){
            执行代码块1;
        }
        else if (条件表达式2){
            执行代码块2;
        }
        ……
        else{
            执行代码块n;
        }
     说明：
         条件表达式必须是布尔表达式（关系表达式或逻辑表达式）、布尔变量
         语句块只有一条执行语句时，一对{}可以省略，但建议保留
         if-else语句结构，根据需要可以嵌套使用
         当if-else结构是“多选一”时，最后的else是可选的，根据需要可以省略
         当多个条件是“互斥”关系时，条件判断语句及执行语句间顺序无所谓
        当多个条件是“包含”关系时，“小上大下 / 子上父下”
    switch-case结构：

 */
public class BranchStructure {
    public static void main(String[] args) {
        int age = 75;
        if (age< 0) {
            System.out.println("不可能！ ");
        } else if (age>250) {
            System.out.println("是个妖怪！ ");
        } else {
            System.out.println("人家芳龄 " + age +" ,马马乎乎啦！ ");
        }
    }
}
