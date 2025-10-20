package com.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DAO <T>{
    private HashMap<String,T> Map;

    public DAO(HashMap<String, T> map) {
        Map = map;
    }

    public void save(String id, T entity) {
        Map.put(id,entity);
    }
    public T get(String id) {
        return Map.get(id);
    }
    public void update(String id, T entity) {
        Map.replace(id,entity);
    }
    public List<T> list() {
//        return new ArrayList<T>(Map.values());
        List<T> list = new ArrayList<>();
        for(T entity : Map.values()) {
            list.add(entity);
        }
        return list;
    }
    public void delete(String id) {
        Map.remove(id);
    }
}
