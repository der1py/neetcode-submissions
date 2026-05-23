class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // cant use int[] as the key cuz reference =/= values
        HashMap<String, ArrayList<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] charCount = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                charCount[strs[i].charAt(j) - 'a']++;
            }
            String key = "";
            for (int j = 0; j < charCount.length; j++) {
                key += charCount[j] + "_"; // delimiter cuz more than 2 digit
            }
            
            ArrayList<String> temp = new ArrayList<>();
            if (groups.get(key) != null) temp = groups.get(key);
            temp.add(strs[i]);
            groups.put(key, temp);
        }

        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> g : groups.values()) {
            result.add(g);
        }

        return result;
    }
}
