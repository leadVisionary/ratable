package com.visionarysoftwaresolutions.ratable;

import com.visionarysoftwaresolutions.ratable.Rater;

class User extends Rater {
    public final String name;
    
    public User(String string) {
        name = string;
    }
}