class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ans=new ArrayList<>();
	        HashMap<String,ArrayList<String>> map=new HashMap<>();
	        for(String curr: strs)
	        {
	            char[] temp=curr.toCharArray();
	            Arrays.sort(temp);
	            String sorted=new String(temp);
	            if(!map.containsKey(sorted))
	            {
	                 map.put(sorted,new ArrayList<>());
	            }
	       
	        map.get(sorted).add(curr);
	            
	        }
	        ans.addAll(map.values());
	        return ans;
        
    }
}
