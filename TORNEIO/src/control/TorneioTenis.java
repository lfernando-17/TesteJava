package control;

import java.util.Scanner;
import java.io.*;

public class TorneioTenis {
    public int Torneio (char[] partidas) {
	    

	for (int i=0; i<partidas.length; i++) {
	    if(partidas[i] == 'V')
		wins++;
	}
	
	if (wins == 0)
	    return(-1);
	else if(wins <= 2)
		return(3);
	else if(wins <= 4)
		return(2);
	else
		return(1);

	}
	    
 }
