package com.si56baqi.test;

import java.io.InputStream;

public class Resource {
    public static InputStream getResourceAsSteam(String path){
        InputStream resourceAsStream = Resource.class.getClassLoader().getResourceAsStream(path);
        return resourceAsStream;
    }
}
