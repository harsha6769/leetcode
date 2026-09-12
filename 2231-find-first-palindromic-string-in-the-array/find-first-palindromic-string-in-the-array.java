class Solution {

    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {

            String str = words[i];

            int left = 0;
            int right = str.length() - 1;

            boolean palindrome = true;

            while (left < right) {

                if (str.charAt(left) != str.charAt(right)) {
                    palindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (palindrome) {
                return str;
            }
        }

        return "";
    }
}