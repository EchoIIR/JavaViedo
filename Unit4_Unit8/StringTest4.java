class StringTest4{
    public static void main(String[] args) {
        String s = "   ab  c  ";

        s = myTrim(s);
        System.out.println("-" + s + "-");
    }

    public static String myTrim(String s) {
        int start = 0;
        int end = s.length()-1;
        while(s.charAt(start) == ' ' && start<=end){
            start++;
        }
        while(s.charAt(end) == ' ' && start<end){
            end--; 
        }
        return s.substring(start, end+1);
    }

} 