class TimeMap {

    HashMap<String,List<Pair>> map;    

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair p = new Pair(value,timestamp);
        if(!map.containsKey(key))
            map.put(key,new ArrayList<>());
        map.get(key).add(p);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> data=map.get(key);
        int low=0;
        int high=data.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(data.get(mid).timestamp==timestamp) return data.get(mid).val;
            else if(data.get(mid).timestamp>timestamp) high=mid-1;
            else low=mid+1;
        }
        if(high==-1) return "";
        return data.get(high).val;
    }
}

class Pair{
    String val;
    int timestamp;
    
    public Pair(String val,int timestamp){
        this.val=val;
        this.timestamp=timestamp;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */