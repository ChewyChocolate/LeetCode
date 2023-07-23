class Main {
    static public boolean isPalindrome(int x) {
        if(x == 0){
            return false;
        }
        int y = x;
        int palindrome = 0;

        while(y != 0){
            int temp = y % 10;
            palindrome = palindrome * 10 + temp;
            y /= 10;
        }
        return x == palindrome;
    }
    public static void main(String [] args){
        boolean result = isPalindrome(121);
        System.out.println(result);
    }
}
