package com.anupam.com.anupam;

public class MySingleton implements Cloneable{
    private final static MySingleton mySigSINGLETON = new MySingleton();
    private MySingleton(){
    }

    public  static MySingleton getInstance() {
        return mySigSINGLETON;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This operation not supported");
    }
}

class MySingletonThreadSafe {
    private  volatile static MySingletonThreadSafe mySingleton;
    private MySingletonThreadSafe() {

    }

    public static MySingletonThreadSafe getInstance() {
        if(mySingleton == null) {
            synchronized (MySingletonThreadSafe.class) {
                if(mySingleton == null) {
                    mySingleton = new MySingletonThreadSafe();
                }
            }
        }
        return mySingleton;

    }
}
