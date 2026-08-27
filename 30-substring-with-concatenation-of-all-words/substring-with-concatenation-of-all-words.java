class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        if (words.length == 0 || s.length() == 0)
            return ans;

        HashMap<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordMap.put(words[i], wordMap.getOrDefault(words[i], 0) + 1);
        }

        int wordlen = words[0].length();
        int n = words.length;
        int strlen = wordlen * n;

        for (int i = 0; i < wordlen; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            // String firstword = s.substring(i,i+wordlen);
            int cnt = 0;
            int start = i;

            for (int j = i; j <= s.length() - wordlen; j += wordlen) {
                String word = s.substring(j, j + wordlen);

                if (wordMap.containsKey(word)) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    cnt++;

                    while (map.get(word) > wordMap.get(word)) {
                        String firstword = s.substring(start, start + wordlen);

                        map.put(firstword, map.get(firstword) - 1);
                        start += wordlen;
                        cnt--;

                    }

                    if (cnt == n) {
                        ans.add(start);
                    }
                } else {
                    cnt = 0;
                    start = j + wordlen;
                    map.clear();
                }

            }

        }
        return ans;

    }
}