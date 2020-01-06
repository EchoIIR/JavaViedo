package src.cn.itcast.p5.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

import src.cn.itcast.collection.set.treeset.comparator.ComparatorByName;
import src.cn.itcast.p3.bean.Student;

// 1、将学生对象和学生归属地通过键值对存储到map集合中。（HashMapDemo）
// 2、对学生排序
class ThreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparatorByName());
        tm.put(new Student(24, "lisi4"), "大连");
        tm.put(new Student(23, "lisi3"), "沈阳");
        tm.put(new Student(24, "lisi4"), "成都");
        tm.put(new Student(24, "lisi4"), "天水");
        tm.put(new Student(20, "lisi1"), "北京");
        tm.put(new Student(22, "lisi2"), "上海");


        System.out.println("\nTreeMap");
        // Set<Entry<Student, String>> entrySet = tm.entrySet();
        // Iterator<Entry<Student, String>> it = entrySet.iterator();
        Iterator<Entry<Student, String>> it = tm.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Student, String> me = it.next();
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println("key:" + key + "\tvalue:" + value);
        }
    }
}