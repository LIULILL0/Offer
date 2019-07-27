package jianzhiOffer;

public class Offer19 {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return mathCore(str, 0, pattern, 0);
    }

    private boolean mathCore(char[] str, int s, char[] pattern, int p) {
        if (s >= str.length && p >= pattern.length)
            return true;
        if (str.length > s && p >= pattern.length)
            return false;

        if (p + 1 < pattern.length && pattern[p + 1] == '*') {
            if (s >= str.length)
                return mathCore(str, s, pattern, p + 2);

            if (str[s] == pattern[p] || pattern[p] == '.') {
                return mathCore(str, s, pattern, p + 2)
                        || mathCore(str, s + 1, pattern, p)
                        || mathCore(str, s + 1, pattern, p + 2);
            } else {
                return mathCore(str, s, pattern, p + 2);

            }
        }

        if (s >= str.length)
            return false;
        else if (str[s] == pattern[p] || pattern[p] == '.') {
            return mathCore(str, s + 1, pattern, p + 1);
        }
        return false;

    }
}
