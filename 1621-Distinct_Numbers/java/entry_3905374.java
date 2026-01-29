//package com.rajan.codeforces.csesProblemSet.sortAndSearch;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class entry_3905374 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        String[] temp = reader.readLine().split("\\s+");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(temp[i]);
        writer.write(set.size() + "\n");
        writer.flush();
    }
}