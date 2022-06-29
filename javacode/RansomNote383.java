package javacode;

public class RansomNote383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            Integer index = sb.indexOf(ransomNote.charAt(i) + "");

            if (index != null && index >= 0) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }

        }

        return true;
    }

}