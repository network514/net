package net.swing;

import java.util.Arrays;

public class Lotto {
	int[] lotto = new int[6];
	
	public int[] getLotto(){
		return lotto;
	}
	
	public void setLotto() {
		for(int k=0; k<lotto.length; k++){  
		    lotto[k] = (int)(Math.random()*45)+1; 
		    
		    for(int j = 0; j<k; j++){
		     if(lotto[k] == lotto[j]){
		      k--;
		      break;
		      } 
		    }
		   }
		   sort(lotto);
		   
	}
	public void sort(int[] lotto){
		Arrays.sort(lotto);
	}
}
