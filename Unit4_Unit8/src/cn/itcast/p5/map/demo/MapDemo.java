package src.cn.itcast.p5.map.demo;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class MapDemo {
    public static void main(String[] args) {
        // <Integer,String>:学号，姓名
        Map<Integer,String> map = new HashMap<Integer,String>();
        method1(map);   // 实现基础的增、删、改、查方法
        method2(map);   // 实现遍历map元素

    }

    public static void method2(Map<Integer, String> map) {
    }

    public static void method1(Map<Integer, String> map) {
        // 1、增-put:返回前一个和key相关的value，没有就返回null
        //      key重复的话,新的value会覆盖前一个value.
        System.out.println("\nBefore put,the map is :\t" + map); // lisi1
        System.out.println("put(8, lisi1) return ...."+ map.put(8, "lisi1")); // null
        System.out.println("put(8, lisi2) return ...."+ map.put(8, "lisi2")); // lisi1
        System.out.println("put(4, lisi3) return ...."+ map.put(4, "lisi3")); // null
        System.out.println("put(4, lisi4) return ...."+ map.put(4, "lisi4")); // lisi3
        System.out.println("put(3, lisi5) return ...."+ map.put(3, "lisi5")); // null
        System.out.println("After put,the map is :\t" + map); // lisi1

        // 2、获取
        System.out.println("\nBefore remove,the map is :\t" + map); // lisi1
        System.out.println("map.get(8) return ...."+ map.get(8)); // null
        System.out.println("map.size() return ...."+ map.size()); // lisi1

        // 3、判断
        System.out.println("\nThe map is :\t" + map); // lisi1
        System.out.println("map.containsKey(8) return ...."+ map.containsKey(8)); // null
        System.out.println("map.containsValue(lisi2) return ...."+ map.containsValue("lisi2")); // lisi1
        System.out.println("map.isEmpty return ...."+ map.isEmpty()); // lisi1

        // 4、删
        // remove(key):根据key删除
        System.out.println("\nBefore remove,the map is :\t" + map); // lisi1
        System.out.println("remove(8) return ...."+ map.remove(8)); // null
        System.out.println("put(3) return ...."+ map.remove(3)); // lisi1
        System.out.println("After remove,the map is :\t" + map); // lisi1
        //clear():清空map
        System.out.println("\nBefore clear,the map is :\t" + map); // lisi1
        map.clear();    // void clear()
        System.out.println("After clear,the map is :\t" + map); // lisi1


    }
}