public class StringCountLetters {

    public int maxLength(String str) {

        if (str.length() == 1) return 1;

        char[] chars = str.toCharArray();
        int maxCount = 0;
        int count = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) count++;
            else count = 1;

            if (maxCount < count) maxCount = count;
        }
        return maxCount;

    }
}

