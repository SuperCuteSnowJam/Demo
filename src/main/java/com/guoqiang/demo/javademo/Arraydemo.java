package com.guoqiang.demo.javademo;

public class Arraydemo {

    public static void main(String []args){
        demo_one();
        demo_two();
        demo_three();
    }
    //动态初始化
    public static void demo_one(){
        System.out.println("动态初始化数组实例------开始--------------");
        int arr[] = new int[5] ;
        arr[0] = 111;
        arr[1] = 222;
        arr[2] = 333;
        arr[3] = 444;
        arr[4] = 555;
        for(int i=0;i<arr.length;i++){System.out.println("arr数组的第"+i+"个值为："+arr[i]);}
        System.out.println("动态初始化数组实例------结束--------------");
    }
    //静态初始化
    public static void demo_two() {
        System.out.println("静态初始化数组实例------开始--------------");
        int arr[] = {96,97,98,99,100};
        for(int i=0;i<arr.length;i++){System.out.println("arr数组的第"+i+"个值为："+arr[i]);}
        System.out.println("静态初始化数组实例------结束--------------");
    }
    //数组的创建过程和栈，堆内存的变化情况
    public static void demo_three(){
        int arr[] = null;
        arr = new int[5];
        arr[0] = 15;
        arr[1] = 16;
        arr[2] = 17;
        arr[3] = 18;
        arr[4] = 19;
        for(int i=0;i<arr.length;i++){System.out.println("arr数组的第"+i+"个值为："+arr[i]);}
        int arr_second[] = null;
        arr_second = arr;
        for(int i=0;i<arr.length;i++){System.out.println("arr_second"+i+"个值为："+arr[i]);}
    }
}
