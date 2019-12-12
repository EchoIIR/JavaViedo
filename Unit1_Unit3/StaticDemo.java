class PersonII
{
    String name;
    static String country = "cn"; 
    // 修饰所有对象共享的属性
    public void show() 
    {
        System.out.println(country + ":" + name);
    }
}

class StaticDemo 
{
    public static void main(String[] args)
    {
        PersonII p = new PersonII();
        // System.out.println(p.country);
        //System.out.println(PersonII.country);
        System.out.println("对象访问静态属性:" + p.country);
        System.out.println("类名访问静态属性:" + PersonII.country);
    }
}