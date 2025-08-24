class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<isActive.length;i++){
            if(isActive[i]==true && (!code[i].equals("") && code[i].matches("[A-Za-z0-9_]+"))){
                if(!map.containsKey(businessLine[i])){
                    map.put(businessLine[i], new ArrayList<String>());
                    map.get(businessLine[i]).add(code[i]); 
                }
                else{
                    map.get(businessLine[i]).add(code[i]);
                }
            }
        }
        TreeMap<Integer,String> pmap = new TreeMap<>();
        pmap.put(0,"electronics");
        pmap.put(1,"grocery");
        pmap.put(2,"pharmacy");
        pmap.put(3,"restaurant");
        List<String> list = new ArrayList<>();
        for(Map.Entry<Integer,String> e:pmap.entrySet()){
            String business = e.getValue();
            if(map.containsKey(business)){
                Collections.sort(map.get(business));
                list.addAll(map.get(business));
            }
        }
        return list;
        
    }
}