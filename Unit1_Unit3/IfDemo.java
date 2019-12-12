class IfDemo
{
   public static void main(String[] args) {
        // if 
        System.out.println("Demo of if:");
        int x = 3;
        if (x>1)
        {
            System.out.println("yes");
        }
        System.out.println("No");

        // if-else
        /* 当if-else有结果时可以用三元运算符替换 */
        System.out.println("Demo of if-else:");
        int y = 3;
        if (y>1)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        // if- else if - else:写多个条件
        if (false); // if 语句块已经结束，后面与他无关
   
        {
        /*局部代码块，里面的变量在括号外面就已经释放了
          ，是局部变量，可以节省内存空间。
        */
            System.out.println("Done");

        }

        // example1 : 由用户的输入输出某个对应的星期

        int week = 10;
        if (week == 1)
        {
            System.out.println(week + " 对应星期一");
        }
        
        else if (week == 2)
        {
            System.out.println(week + " 对应星期二");
        }
        else if (week == 3)
        {
            System.out.println(week + " 对应星期三");
        }
        else if (week == 4)
        {
            System.out.println(week + " 对应星期四");
        }
                       
        else if (week == 5)
        {
            System.out.println(week + " 对应星期五");
        }
        
        else if (week == 6)
        {
            System.out.println(week + " 对应星期六");
        }
        else if (week == 7)
        {
            System.out.println(week + " 对应星期七");
        }
        else
        {
            System.out.println(week + " 输入错误");
        }       

        /*example2： 一年四季
        春季： 3 4 5 
        夏季： 6 7 8 
        秋季： 9 10 11
        冬季： 12 1 2 
        */ 
        int month = 15;

        if (month==3 || month==4 || month==5)
        {
            System.out.println(month + " 输入春季");
        } 
        else if (month==6 || month==7 || month==8)
        {
            System.out.println(month + " 输入夏季");
        } 
        else if (month==9 || month==10 || month==11)
        {
            System.out.println(month + " 输入秋季");
        } 
        else if (month==12 || month==1 || month==2)
        {
            System.out.println(month + " 输入冬季");
        } 
        else
        {
            System.out.println(month + " 季节输入错误");
        } 



    }
}