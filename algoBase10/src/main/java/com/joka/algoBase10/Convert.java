package com.joka.algoBase10;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Convert 
{
	public static String convertToBase(Integer nbr, Integer base){
		int resultat = nbr;
		String chaineResult = "";
		List<String>liste = new ArrayList<String>();
				
		while (resultat > 0){
			if (base != 16){
				liste.add(Integer.toString(resultat%base));
			}else{
				if (resultat%base == 10){
					liste.add("A");
				}else if (resultat%base == 11){
					liste.add("B");
				}else if (resultat%base == 12){
					liste.add("C");
				}else if (resultat%base == 13){
					liste.add("D");
				}else if (resultat%base == 14){
					liste.add("E");
				}else if (resultat%base == 15){
					liste.add("F");
				}else {
					liste.add(Integer.toString(resultat%base));
				}
			}
				resultat/=base;
		}
		for (int i = liste.size()-1; i >= 0 ; i--) {
			chaineResult = chaineResult + liste.get(i);
		}
		return chaineResult;
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( convertToBase(187, 16) );
    }
}
