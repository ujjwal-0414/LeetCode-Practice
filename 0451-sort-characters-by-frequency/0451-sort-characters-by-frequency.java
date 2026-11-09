class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        List<List<Character>> bucket = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            bucket.add(new ArrayList<>());
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char ch = entry.getKey();
            int f = entry.getValue();
            bucket.get(f).add(ch);
        }
        StringBuilder res = new StringBuilder();
        for (int i = s.length(); i >= 1; i--) {
            for (char ch : bucket.get(i)) {
                for (int j = 0; j < i; j++) {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}