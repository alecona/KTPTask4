import java.util.Arrays;

public class Bessie {
    public static void main(String[] args) {
        System.out.println(BessieProcessor(10, 7, "hello my name is Bessie and this is my essay"));
    }

    /** Текстовый процессор Бесси со специфичным форматированием **/
    public static StringBuilder BessieProcessor(int n, int k, String string) {
        int momentlen = 0;
        StringBuilder sb = new StringBuilder();
        String[] splstr = string.split(" ");
        System.out.println(Arrays.toString(splstr));
        sb.append(splstr[0]);
        momentlen = splstr[0].length();

        for (int i = 1; i < n; i++) {
            if (momentlen + splstr[i].length() <= k) {
                sb.append(" ");
                sb.append(splstr[i]);
                momentlen += splstr[i].length();
            }
            else {
                sb.append("\n");
                sb.append(splstr[i]);
                momentlen = splstr[i].length();
            }


        }
        return sb;
    }
}