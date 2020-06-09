public class BuggerClass {

    public static void main(String[] args) {
        System.out.println(bugger(39));
    }

    /** Метод, преобразующий строку в звездную стенографию **/
    public static int bugger(int num) {
        int count = 0;
        while(Integer.valueOf(num).toString().toCharArray().length > 1){
            int i = 1;
            for(char c : Integer.valueOf(num).toString().toCharArray())
                i *= Integer.parseInt(String.valueOf(c));
            num = i;
            count++;
        }
        return count;
    }

}
