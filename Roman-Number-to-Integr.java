class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        str = str + "I";
        for(int i = 0; i < str.length() - 1; i++) {
            int current = map.get(str.charAt(i));
            int value = map.get(str.charAt(i + 1));
            if(current >= value) {
                result = result + current; 
            } else {
                result = result + value - current;
                i++;
            }
        }
        return result;
        // code here
    }
}
