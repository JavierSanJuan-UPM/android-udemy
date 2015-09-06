package com.example.javi.mvcdemo;

import java.util.ArrayList;

/**
 * Created by Javi on 6/9/15.
 */
public class Model {
    private ArrayList<String> stringList;

    {
        stringList = new ArrayList<String>();
    }

    public void addString(String str) {
        stringList.add(str);
    }

    public String getList() {
        String retVal = "";
        for ( String str : stringList ) {
            retVal = retVal + " " + str;
        }
        return retVal;
    }
}
