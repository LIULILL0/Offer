package jianzhiOffer;

public class Offer4 {
    public boolean Find(int target, int [][] array) {
        int rows = array.length-1;
        int cols = array[0].length-1;
        int col = cols;
        int row = 0;
        while (row<=rows && col>=0  && col<=cols && row>=0){
            if(array[row][col]==target){
               return true;
            }else if(array[row][col]>target){
                col--;
            }else if(array[row][col]<target){
                row++;
            }
        }
        return false;
    }
}
