package com.sametdemirel.generic_eliminate_duplicates;

import java.util.ArrayList;

public class EliminateDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red"); list.add("Green"); list.add("Blue"); list.add("Red");

        //ArrayList<String> nodups = removeDups(list);
        System.out.println("First List--->>>"+list);
        System.out.println("Remove duplicates--->>>"+removeDups(list));
    }

    public static <E extends Comparable<E>> ArrayList<E> removeDups(ArrayList<E> list){
        boolean found = false;
        if (list.size()==0)
            return list;

        ArrayList<E> newList = new ArrayList<>();
        newList.add(list.get(0));

        for(int i=1; i<list.size(); i++){
            for(int j=0; j<newList.size(); j++){
                if (newList.get(j).compareTo(list.get(i))==0){
                    //CompareTo going to return negative value if the first value less than second value,
                    //otherwise going to return positive value. When the case of equality return 0.
                    found = true;
                    break;
                }
            }
            if(found!=true)
                newList.add(list.get(i));
            found = false;
        }
        return newList;
    }
}
