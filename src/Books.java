import java.util.HashMap;

public class Books {

    public static void main(String[] args) {
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
    }

    /** Метод, вычисляющий общее количество уникальных символов между всеми парами концов книги **/
    public static int countUniqueBooks(String stringSequence, Character bookEnd) {
        boolean flag = false;
        HashMap hmap = new HashMap();
        for (char c: stringSequence.toCharArray()) {
            if (c != bookEnd && flag) {
                hmap.put(c, true);
            }
            if (c == bookEnd) {
                flag = !flag;
            }
        }
        return hmap.size();
    }
}
