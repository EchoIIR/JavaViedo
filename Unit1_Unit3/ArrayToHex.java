import java.util.Stack;

class ArrayToHex
{
    public static void main(String[] args) {
        int num = 60;
        toHexInASCII(num);
        toHexInTable(num);
    }

    public static void toHexInASCII(int num)
    {// 方法一：用ASCII编码 + 栈存结果
        System.out.println("The num " + num + " transfer to Hex using ASCII is :" ); 
        int temp = 0;
        char numHex;
        Stack result = new Stack();
        //System.out.println("\n The result of push:");
        for(int i=0;i<8;i++){
            while(num != 0){
                temp = num & 15;
                if (temp>9){
                    numHex = (char)(temp - 10 + 'A');
                    //System.out.print("\t" + numHex);
                    result.push(numHex);
                }
                else {
                    //System.out.print("\t" + temp);
                    result.push(temp);
                }
                //System.out.print(numHex);
                num = num >>> 4;                
            }
        }
        //System.out.println("\n\n The result of pop:");
        
        while(!result.empty()){
           
            System.out.print( result.peek());
            result.pop(); // 一定要出栈，否则死循环
            //char a =(char) result.pop();
            //System.out.print("\t" + a);
        }
    }// end toHexInASCII

    public static void toHexInTable (int num) {
        //方法二：用查表法算2进制到16进制 + 数组存结果
        System.out.println("\n The num " + num + " transfer to Hex using Table is :" ); 
        char[] table = {'0','1','2','3','4','5','6',
                        '7','8','9','A','B','C',
                        'D','E'};
        char[] result = new char[8];
        int pos = 0;
        for(int x=0; x<8; x++){
            while (num != 0){
                int temp = num & 15;
                result[pos++] = table[temp]; 
                num = num>>>4;
            }
        }
        
        //System.out.println("\n result2"); 
        for (int x=(result.length-1); x>=0;x--){
            // 倒序打印数组元素
            System.out.print(result[x]);
        }
    }
}