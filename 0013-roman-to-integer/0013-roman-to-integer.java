class Solution {
    public int romanToInt(String s) {
        s=s+".";
        char m=' ';
        char n=' ';
        int num=0;
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('I',1);        
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length()-1;i++){
            m=s.charAt(i);
            n=s.charAt(i+1);
            if(m=='I' && (n=='V' || n=='X') || m=='X' && (n=='L' || n=='C') || 
               m=='C' && (n=='D' || n=='M'))
            {
                num+=map.get(n)-map.get(m);
                i++;
            }
            else num+=map.get(m);          
        }
        return num;
    }
}