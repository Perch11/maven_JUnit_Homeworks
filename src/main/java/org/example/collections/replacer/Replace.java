package org.example.collections.replacer;

import java.util.ArrayList;

public class Replace<T> {
    /**
     * this method replaces all such elements with the new element
     * @param list Type T ArrayList
     * @param itemToReplace type T
     * @param replacementItem type T
     */
    public void replaceItem(ArrayList<T> list, T itemToReplace, T replacementItem) {
        if(list.isEmpty()){
            throw new IllegalArgumentException("empty list");
        }
        for (int i = 0; i < list.size(); i++) {
            T currentItem = list.get(i);
            if (itemToReplace == null) {
                if (currentItem == null) {
                    list.set(i, replacementItem);
                }
            } else {
                if (itemToReplace.equals(currentItem)) {
                    list.set(i, replacementItem);
                }
            }
        }
    }

    /**
     * this method replaces all such elements with the new element
     * @param list Type T ArrayList
     * @param oldEl Type T
     * @param newEl Type T
     */
    public void replace(ArrayList<T> list, T oldEl, T newEl) {
        if(list.isEmpty()){
            throw new IllegalArgumentException("empty list");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldEl)){
                list.set(i,newEl);
            }
        }
    }
}
