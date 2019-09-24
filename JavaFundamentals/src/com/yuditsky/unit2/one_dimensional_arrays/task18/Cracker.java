package com.yuditsky.unit2.one_dimensional_arrays.task18;

public class Cracker {
    Lock lock;

    public Cracker(Lock lock){
        this.lock = lock;
    }

    public void hack(){
        for(int i = 0; i < lock.getCells().length; i++){
            if(lock.getDice(i)==0){
                for(int j = 1; j <= 6; j++){
                    lock.setDice(i, j);
                    if(lock.provideAccess()){
                        System.out.println("Access is allowed!");
                        return;
                    }
                }
                lock.pullOutDice(i);
            }
        }
        System.out.println("Access is denied");
    }

}
