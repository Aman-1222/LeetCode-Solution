class Solution {
    public int compareVersion(String version1, String version2) {
        LinkedHashMap<Integer,Integer> map1=new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> map2=new LinkedHashMap<>();
        int rev1=1, rev2=1;
        int start1=0, start2=0;
        for(int i=0;i<version1.length();i++){
            if(version1.charAt(i)=='.') {
                map1.put(rev1,Integer.parseInt(version1.substring(start1,i)));
                start1=i+1;
                rev1++;
            }
        }
        map1.put(rev1,Integer.parseInt(version1.substring(start1,version1.length())));
        for(int i=0;i<version2.length();i++){
            if(version2.charAt(i)=='.') {
                map2.put(rev2,Integer.parseInt(version2.substring(start2,i)));
                start2=i+1;
                rev2++;
            }
        }
        map2.put(rev2,Integer.parseInt(version2.substring(start2,version2.length())));
        int i=1;
        while(i<=Math.min(map1.size(),map2.size())){
            int m=map1.get(i);
            int n=map2.get(i);
            if(m>n) return 1;
            else if(m<n) return -1;
            else if(map1.size()==map2.size() && i==map1.size()) return 0;
            i++;
        }
        while(i<=map1.size()){
            int m=map1.get(i);
            if(m>0) return 1;
            if(i==map1.size()) return 0;
            i++;
        }
           while(i<=map2.size()){
            int m=map2.get(i);
            if(m>0) return -1;
            if(i==map2.size()) return 0;
            i++;
        }
        return -2;
}
}

// class Solution {
// public:
//     int compareVersion(string version1, string version2) {
//         version1=version1+' ';
//         version2=version2+' ';
//         int i=0;
//         int j=0;
//         int n1=0;
//         int n2=0;
//         while(i<version1.size() || j<version2.size())
//         {
//             if(i<version1.size())
//             {
//                 while(version1[i]!='.' && version1[i]!=' ')
//                 {
//                     int dig=version1[i]-'0';
//                     n1=n1*10+dig;
//                     i++;
//                 }
//             }
//             if(j<version2.size())
//             {
//                 while(version2[j]!='.' && version2[j]!=' ')
//                 {
//                     int dig=version2[j]-'0';
//                     n2=n2*10+dig;
//                     j++;
//                 }
//             }
//             if(n1<n2)
//                 return -1;
//             if(n1>n2)
//                 return 1;
//             n1=0;
//             n2=0;
//             i++;
//             j++;
//         }
//         return 0;
//     }
// };