package br.edu.SistemaDeEventos.apresentacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.edu.SistemaDeEventos.dto.EventoDTO;
import br.edu.SistemaDeEventos.rn.EventoRN;

public class main {

	public static void main(String[] args) {
		

    	try {
    		
    		SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy h:m:s");    		
    		
			Date objDataEvento = objSimpleDateFormat.parse("18/09/2016 12:00:00");
						
			EventoDTO objEventoDTO = new EventoDTO("Show dos Beatles", objDataEvento);				
			EventoRN objEventoRN = new EventoRN();						
			
			try {
				objEventoRN.cadastrarEvento(objEventoDTO);
			} catch (Exception e) {			
				System.out.println(e.getMessage());
			}														
			
		} catch (ParseException e1) {
			e1.printStackTrace();
		}		
		

		
	}

}
