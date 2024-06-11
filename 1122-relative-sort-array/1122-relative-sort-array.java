class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer,Integer> map= new TreeMap<>();
        for(int i=0;i<arr1.length;i++)
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        int i=0;
        for(int j=0;j<arr2.length;j++){
            while(map.get(arr2[j])!=0){
                arr1[i]=arr2[j];
                map.put(arr1[i],map.get(arr1[i])-1);
                i++;
        }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            while(entry.getValue()>0){
                arr1[i]=entry.getKey();
                map.put(arr1[i],map.get(arr1[i])-1);
                i++;
            }
        }
        return arr1;
    }
}