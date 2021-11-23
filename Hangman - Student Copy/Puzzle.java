import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    
    private String word;
    private String guess;
    private int numRightGuesses;
    
    public Puzzle(String w){
        word = w.toUpperCase();
        guess = "";
    }
    
    /**
     * Whether or not the puzzle is solved
     */
    public boolean isUnsolved(){
        if (numRightGuesses==word.length()) return false;
        else return true;
    }

     /**
      * Whether or not the guess was coorect
      */
    public boolean makeGuess(String g){ 
        boolean isCorrect = false;
        
        guess += g.substring(0,1) + ", ";
        g = g.substring(0,1);
        
        
        for(int i=0; i<=word.length()-1;i++){
            if(word.substring(i, i+1).equals(g)){
                numRightGuesses++;
                isCorrect = true;
            }
        }
        
        return isCorrect;
    }
    
    /**
     * Makes puzzle visible
     */
    public void show(){
        System.out.print("Puzzle: ");
        
        for(int i=0; i<=word.length()-1;i++){
            if (guess.contains(word.substring(i,i+1))){
                System.out.print(word.substring(i,i+1));
            }
            else {
                System.out.print("_");
            }
        }
        
        System.out.println();
    }  
        
   
     /**
      * Returns to puzzle word
      */
    public String getWord(){
        return word;
    }
    
    public String getGuess(){
        return guess;
    }
}
