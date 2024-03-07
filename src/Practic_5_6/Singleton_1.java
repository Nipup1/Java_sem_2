package Practic_5_6;

class Singleton_1 {
    private Singleton_1 instance;
    public Singleton_1 getInstance(){
        if (instance == null){
            instance = new Singleton_1();
        }
        return instance;
    }
}


