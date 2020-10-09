package com.yjzh.java.week1;

import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description 实现求取最值以及排序
 * @Author WL
 * @Date 2020/10/5
 **/
public class ArrayTest {
    final static int MAX = 5;
    public static void main(String[] args) {
        //创建一个10个元素的整形数组
        int[] a=new int[MAX];
        //创建随机数种子
        Random random = new Random();
        //数组原始值为
        for(int i = 0;i< MAX;i++){
            //循环生成100以内的随机整数赋值给数组
            a[i] = random.nextInt(100);
            System.out.print(a[i]+" ");
        }
        /*
        **用一次循环把最大值、最小值、和求出来
         */
        int max,min,sum = 0;
        min = max = a[0];
        for(int i = 0;i< MAX;i++){
            //求最大值
            if(max < a[i]) {
                max = a[i];
            }
            //求最小值
            if(min > a[i]){
                min = a[i];
            }
            //求和
            sum=sum+a[i];
        }
        System.out.println();
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("和为："+sum);
        /**
        **使用递归排序
         */

       /* bubbleSort(a);
        System.out.println("--冒泡排序--");
        for(int i = 0;i< MAX;i++){
            System.out.print(a[i]+" ");
        }*/
        selectSort(a);
        System.out.println("--选择排序--");
        for(int i = 0;i< MAX;i++){
            System.out.print(a[i]+" ");
        }
       /* insertSort(a);
        System.out.println("--插入排序--");
        for(int i = 0;i< MAX;i++){
            System.out.print(a[i]+" ");
        }*/


    }
    /**
     * 冒泡法排序<br/>

     * <li>比较相邻的元素。如果第一个比第二个大，就交换他们两个。</li>
     * <li>对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。</li>
     * <li>针对所有的元素重复以上的步骤，除了最后一个。</li>
     * <li>持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。</li>

     *
     * @param numbers
     *            需要排序的整型数组
     */

    public static void bubbleSort(int[] numbers){
        int temp;//记录临时中间值
        int size = numbers.length;//数组大小
        for(int i = 0;i< size - 1;i++){
            for (int j = i + 1;j < size;j++){
                if (numbers[i] < numbers[j]){//交换两数的位置
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    /**
     * 选择排序<br/>
     * <li>在未排序序列中找到最小元素，存放到排序序列的起始位置</li>
     * <li>再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。</li>
     * <li>以此类推，直到所有元素均排序完毕。</li>

     *
     * @param numbers
     */
    public static void selectSort(int[] numbers){
        int size = numbers.length, temp;
        for (int i = 0;i < size;i++){
            int k = i;
            for (int j = size - 1;j > i;j++){
                if (numbers[j] < numbers[k] ) k = j;
            }
            temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
    }
    /**
     * 插入排序<br/>
     * <ul>
     * <li>从第一个元素开始，该元素可以认为已经被排序</li>
     * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>
     * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>
     * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>
     * <li>将新元素插入到该位置中</li>
     * <li>重复步骤2</li>
     * </ul>
     *
     * @param numbers
     */
    public static void insertSort(int[] numbers){
        int size = numbers.length, temp, j;
        for(int i = 1;i<size;i++){
            temp = numbers[i];
            for (j = i;j > 0 && temp < numbers[j-1]; j--)
             numbers[j] = numbers[j-1];
            numbers[j] = temp;
        }
    }


}
