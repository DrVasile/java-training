# The DAO Pattern in Java

## Overview

The Data Access Object is a structural pattern that allows to isolate the business logic from the persistence layer.
 
## DAO API

    public interface Dao<T> {
         
        Optional<T> get(long id);
         
        List<T> getAll();
         
        void save(T t);
         
        void update(T t, String[] params);
         
        void delete(T t);
    }
    
The Dao interface defines an abstract API that performs CRUD operations on objects of type T.
