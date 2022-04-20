package com.company;
import java.util.ArrayList;
public class Set {
    private int setSize = 10;
    private ArrayList<Integer>[] set = new ArrayList[setSize];
    public Set() {
        for(int i=0;i<setSize;i++) {
            set[i] = new ArrayList<>();
        }
    }
    public void addSet(int x) {
        if(!findSet(x))
            set[x%setSize].add(x);
    }
    public boolean findSet(int x) {
        for(int now : set[x%setSize]) {
            if(now==x) {
                return true;
            }
        }
        return false;
    }
    public void deleteSet(int x) {
        ArrayList<Integer> xList = set[x%setSize];
        for(int i=0;i<xList.size();i++) {
            int temp = xList.get(i);
            if(temp==x) {
                xList.set(i,xList.get(xList.size()-1));
                xList.remove(xList.size()-1);
                break;
            }
        }
    }
}
