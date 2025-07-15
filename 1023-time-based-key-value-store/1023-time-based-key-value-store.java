class TimeMap {

    HashMap<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key,new TreeMap<>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> data=map.get(key);
        if(!map.containsKey(key)) return "";
        if(data.containsKey(timestamp)) return data.get(timestamp);
        Integer prevTime=data.floorKey(timestamp);
        if(prevTime==null) return "";
        return data.get(prevTime);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */