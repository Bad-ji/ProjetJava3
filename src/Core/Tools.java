package Core;

import java.util.Collections;
import java.util.List;

public abstract class Tools {
	 public static boolean primaire(int nombre ) {
		  int reste;
		  boolean X = true;
		        
		  for(int i=2; i <= nombre/2; i++)
		  {
		     //nombre est divisible par lui-meme
		     reste = nombre%i;
		            
		     //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
		     if(reste == 0)
		     {
		        X = false;
		        break;
		     }
		  }
		  return X;
	 }	  
	
	
	
	//Calcule_Factorielle
	public static int factorielle(int nombre) {
	int i, fact = 1 ;
	for(i=1;i<=nombre;i++){
		fact=fact*i;
	}
	return fact;
	}
	
	public static int Calcule_PPCM (int nombre1, int nombre2) {
		int Produit, Reste, PPCM;
		
		Produit = nombre1*nombre2;
		Reste   = nombre1%nombre2;
		while(Reste != 0){
		    nombre1 = nombre2;
		    nombre2 = Reste;
		    Reste = nombre1%nombre2;
	        }
		PPCM = Produit/nombre2;
		
		return PPCM;		
	    } // fin Calcule_PPCM 
	
	public static void PPMC(int[] array) {
	    int result = array[0];
	 
	    //Loop through the array and find GCD
	    //by combining the GCD of previous numbers 
	    for(int i=1; i<array.length; i++){
	      result = Calcule_PPCM(array[i], result);
	    }
	    System.out.print("PPMC: "+result);
	  }
	
	//Calcule PGCD
	 public static void PGCD(int[] array) {
		    int result = array[0];
		 
		    //Loop through the array and find GCD
		    //by combining the GCD of previous numbers 
		    for(int i=1; i<array.length; i++){
		      result = findGCD(array[i], result);
		    }
		    System.out.print("PGCD: "+result);
		  }
		 
		  //function to find GCD of two numbers
		  public static int findGCD(int a, int b){
		    if(b == 0)
		      return a;
		    return findGCD(b, a%b);
		  }
		  
		  public static boolean RechercheDico(List<Integer> tab,int val) {
				Collections.sort(tab);
			  	int left =0;
				int right = tab.size()-1;
				int medium;
				boolean find=false;
				
				while(left<=right && !find) {
					medium =(right+left)/2;
					find = tab.get(medium)==val;
					
					if(val>tab.get(medium)) {
						left=medium+1;
					}
					else {
						right=medium-1;
					}
				}
				
				return find;
			}
	}