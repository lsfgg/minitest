package com.lsf.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MiNiTestDemo {

    public static void main(String[] args) {
        //再此输入参数,参数用逗号分隔
        Integer[] arr = {2,3,4,5};
        numsConvert(arr);
    }

    public static void numsConvert(Integer[] arr) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F"};
        String[] arr3 = {"G", "H", "I"};
        String[] arr4 = {"J", "K", "L"};
        String[] arr5 = {"M", "N", "O"};
        String[] arr6 = {"P", "Q", "R", "S"};
        String[] arr7 = {"T", "U", "V"};
        String[] arr8 = {"W", "X", "Y", "Z"};
        ArrayList list = new ArrayList();
        Map<Integer, String[]> map = new HashMap<Integer, String[]>();
        map.put(2, arr1);
        map.put(3, arr2);
        map.put(4, arr3);
        map.put(5, arr4);
        map.put(6, arr5);
        map.put(7, arr6);
        map.put(8, arr7);
        map.put(9, arr8);
        if (arr.length == 0 || arr == null) {
            throw new RuntimeException("请输入数组");
        } else if (arr.length == 1) {
            //1个情况
            if (map.get(arr[0]).length > 0 && map.get(arr[0]) != null) {
                String[] s = map.get(arr[0]);
                for (String s1 : s) {
                    System.out.print(s1 + " ");
                }
            }
        } else {
            //2个以上情况
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if(map.get(arr[i])==null){
                    throw new RuntimeException("输入的数字"+arr[i]+"不存在对应字母");
                }
                list.add(map.get(arr[i]));
            }
            String[] s0 = map.get(arr[0]);
            String[] s1 = map.get(arr[1]);
            for (String s00 : s0) {
                for (String s11 : s1) {
                    sb.append(s00 + s11 + " ");
                }
            }
            list.remove(0);
            list.remove(0);
            while (list.size() > 0) {
                String s = sb.toString();
                String[] o = (String[]) list.get(0);
                String[] ss = s.split(" ");
                sb.delete(0,sb.toString().length());
                for (String sss : ss) {
                    for (String oo : o) {
                        sb.append(sss + oo + " ");
                    }
                }
                list.remove(0);
            }
            System.out.println(sb.toString());
            System.out.println(sb.toString().split(" ").length);
        }
    }
}
