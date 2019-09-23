package com.yuditsky.one_dimensional_arrays.Task18;

import java.util.Random;

public class Lock {
    private int[] cells = new int[10];

    public Lock(){
        int[] positions = new int[2];
        Random random = new Random();

        positions[0] = random.nextInt(9);
        do {
            positions[1] = random.nextInt(9);
        }while(positions[0] == positions[1]);

        cells[positions[0]] = random.nextInt(5) + 1;
        cells[positions[1]] = random.nextInt(5) + 1;

    }

    public int[] getCells(){
        return cells;
    }

    public void setDice(int position, int value) {
        cells[position] = value;
    }

    public int getDice(int position){
        return cells[position];
    }

    public void pullOutDice(int position){
        cells[position] = 0;
    }

    public boolean provideAccess(){
        for(int i = 1; i < cells.length - 1; i++){
            if (cells[i - 1] != 0 && cells[i] != 0 && cells[i+1] != 0){
                if(cells[i-1]+cells[i]+cells[i+1] == 10){
                    return true;
                } else{
                    return false;
                }
            }

        }
        return false;
    }
}
