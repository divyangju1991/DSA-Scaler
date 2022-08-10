package com.scaler.dsa.recursion.backtracking.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreakII {

	Map<Integer, ArrayList<String>> map = new HashMap<>();
	
	public ArrayList<String> wordBreak(String s, ArrayList<String> wordDictionary) {
        return wordBreakInternal(s, 0, new HashSet(wordDictionary),  wordDictionary.stream().max((o1, o2) -> o1.length() - o2.length()).orElse("").length());
    }

    private ArrayList<String> wordBreakInternal(String src, int start, Set<String> dict, int max) {
    	ArrayList<String> res = map.get(start);
        if (res != null) return res;
        res = new ArrayList<>();
        map.put(start, res);
        if (src.length() == start) res.add("");
        for (int i = start; i < src.length() && i - start + 1 <= max; i++) {
            String subStr = src.substring(start, i + 1);
            if (!dict.contains(subStr)) continue;
            List<String> tails = wordBreakInternal(src, i + 1, dict, max);
            for (String tail : tails) res.add(subStr + (tail.isEmpty() ? "" : " ") + tail);
        }
        return res;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
