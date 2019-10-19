package com.qichen.code;

/**
 * @author qichen
 * @Date 2019/10/19
 * @since JDK1.8
 */
/*
    基本数据类型
        数值型
            整数类型
                Java各整数类型有固定的表数范围和字段长度，不受具体OS的影响，以保证java程序的可移植性。
                java的整型常量默认为 int 型，声明long型常量须后加‘l’或‘L’
                java程序中变量通常声明为int型，除非不足以表示较大的数，才使用long
            浮点类型
                浮点型常量有两种表示形式：
                     十进制数形式：如： 5.12 512.0f .512 (必须有小数点）
                     科学计数法形式:如： 5.12e2 512E2 100E-2
                 float:单精度，尾数可以精确到7位有效数字。很多情况下，精度很难满足需求。
                    double:双精度，精度是float的两倍。通常采用此类型。
                 Java 的浮点型常量默认为double型， 声明float型常量，须后加‘f’或‘F’。
        字符型
            char 型数据用来表示通常意义上“字符”(2字节)
            Java中的所有字符都使用Unicode编码，故一个字符可以存储一个字母，一个汉字，或其他书面语的一个字符。
            字符型变量的三种表现形式：
                字符常量是用单引号(‘ ’)括起来的单个字符。 例如： char c1 = 'a'; char c2= '中'; char c3 = '9';
                 Java中还允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。
                    例如： char c3 = ‘\n’; // '\n'表示换行符
                直接使用 Unicode 值来表示字符型常量：‘\\uXXXX’。其中， XXXX代表一个十六进制整数。如： \u000a 表示 \n。
            char类型是可以进行运算的。因为它都对应有Unicode码。
        布尔型
            boolean 类型用来判断逻辑条件，一般用于程序流程控制：
                if条件控制语句；
                while循环控制语句；
                do-while循环控制语句；
                for循环控制语句；
            boolean类型数据只允许取值true和false，无null。
                不可以使用0或非 0 的整数替代false和true，这点和C语言不同。
                Java虚拟机中没有任何供boolean值专用的字节码指令， Java语言表达所操作的boolean值，在编译之后都使用java虚拟机中的int数据类型来代替： true用1表示， false用0表示。
 */
/*
    自动类型转换：容量小的类型自动转换为容量大的数据类型。数据类型按容量大小排序为：
    有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
    byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型。
    boolean类型不能与其它数据类型运算。
    当把任何基本数据类型的值和字符串(String)进行连接运算时(+)， 基本数据类型的值将自动转化为字符串(String)类型。
 */
/*
    强制类型转换
        自动类型转换的逆过程， 将容量大的数据类型转换为容量小的数据类型。 使用时要加上强制转换符： ()， 但可能造成精度降低或溢出,格外要注意。
        通常， 字符串不能直接转换为基本类型， 但通过基本类型对应的包装类则可以实现把字符串转换成基本类型。
            如： String a = “43”; int i = Integer.parseInt(a);
            boolean类型不可以转换为其它的数据类型。
 */
public class PrimitiveType {
    public static void main(String[] args) {

        long var = 123456L;

        int number1;
        number1 = 10;
        int number2;
        number2 = 20;
        int number3;
        number3 = number1 + number2;
        System.out.println("Number3 = " + number3);
        int number4 = 50;
        int number5 = number4 - number3;
        System.out.println("Number5 = " + number5);

    }
}
