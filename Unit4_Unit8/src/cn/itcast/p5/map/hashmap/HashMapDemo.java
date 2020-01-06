package src.cn.itcast.p5.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import src.cn.itcast.p3.bean.Student;
// 将学生对象和学生归属地通过键值对存储到map集合中。
class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Student, String> hm = new HashMap<Student, String>();
        // key:Student, value:String
        // 要保证key唯一性，当key相同时，新的值会覆盖前面的值.
        // 而key存在于Hash表中，
        // 故只要保证hashCode,equals方法正确就可以保证key的唯一性。
        hm.put(new Student(20, "lisi1"), "北京"); 
        hm.put(new Student(22, "lisi2"), "上海");
        hm.put(new Student(23, "lisi3"), "沈阳");
        hm.put(new Student(24, "lisi4"), "大连");  
        hm.put(new Student(24, "lisi4"), "成都");
        hm.put(new Student(24, "lisi4"), "天水");
        

        System.out.println("\nHashMap");
        Set<Student> keySet = hm.keySet();
        Iterator<Student> it = keySet.iterator();
        while (it.hasNext()) {
            Student key = it.next();
            String value = hm.get(key);
            System.out.println("key:" + key + "\tvalue:" + value);

        }
    }
}