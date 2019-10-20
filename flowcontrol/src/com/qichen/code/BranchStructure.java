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
        switch(表达式){
            case 常量1:
                语句1;
                // break;
            case 常量2:
                语句2;
                // break;
            … …
            case 常量N:
                语句N;
                // break;
            default:
                语句;
                // break;
            }

     规则
         switch(表达式)中表达式的值必须是下述几种类型之一： byte， short，
            char， int， 枚举 (jdk 5.0)， String (jdk 7.0)；
         case子句中的值必须是常量，不能是变量名或不确定的表达式值；
         同一个switch语句，所有case子句中的常量值互不相同；
         break语句用来在执行完一个case分支后使程序跳出switch语句块；如
            果没有break，程序会顺序执行到switch结尾
         default子句是可任选的。同时，位置也是灵活的。当没有匹配的case时，
            执行default
 */
/*
if和switch语句很像，具体什么场景下，应用哪个语句呢？
     如果判断的具体数值不多，而且符合byte、 short 、 char、 int、 String、枚举等几
        种类型。虽然两个语句都可以使用，建议使用swtich语句。因为效率稍高。
     其他情况：对区间判断，对结果为boolean类型判断，使用if， if的使用范围更广。
        也就是说， 使用switch-case的，都可以改写为if-else。反之不成立。
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

        int i = 1;
        switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
        }

        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入有误");
                break;
        }
    }
}
