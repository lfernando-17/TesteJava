package control;

import java.util.Scanner;
import java.io.*;

public class TorneioTenis {
	
    public int calcularGrupo(char args[]) {
	int wins = 0;
	char resp;
	   
	for (int i=0; i<args.length; i++) {
	    resp = args[i];
	    if(resp == 'V')
		wins++;
	}

	if (wins == 0) 
	    return (-1);
	else if (wins <= 2) 
		return(3);
	else if(wins <= 4)
		return(2);
	else if(wins <= 6)
		return(1);
	else 
		return (-1);
	}
	    
 }
