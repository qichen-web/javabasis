package com.qichen.day08;

/**
 * 对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数： Math.random()，返回值类型double;
 * 2) 四舍五入取整： Math.round(double d)，返回值类型long。
 *
 * @author qichen
 * @date 2019/10/25
 * @since JDK1.8
 */
public class StudentTest {
    public static void main(String[] args) {

        Student[] students = new Student[20];

        for (int i = 0; i < 20; i++) {
            students[i] = new Student();

            students[i].number = i + 1;
            //年级，[1,6]
            students[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //成绩，[0,100]
            students[i].score = (int) (Math.random() * (100 - 1 + 1) + 0);

        }

        /*for (Student student : students) {
            System.out.println(student);
            System.out.println(student.number);
            System.out.println(student.state);
            System.out.println(student.score);
            System.out.println(student.info());
        }*/
        /*
         * 打印出3年级(state值为3）的学生信息。
         */
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3) {
                System.out.println(students[i].info());
            }
        }
        /*
         *  使用冒泡排序按学生成绩排序，并遍历所有学生信息
         * 冒泡排序，每次浮一个最大值，且下次排序无需再对比此数据；
         * 每次对比仅限于相邻的两个元素
         */
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j + 1].score < students[j].score) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }

        for (Student student : students) {
            System.out.println(student.info());
        }

    }
}

class Student {
    //学号
    int number;
    //年级
    int state;
    //成绩
    int score;

    //学生信息返回
    public String info() {
        return "学号：" + number +
                "，年级：" + state +
                "，成绩：" + score;
    }


}
