package consultorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/***
ColeçãoConsultas,	com	os	 métodos 
adicionaConsulta,
qtdConsultasData,
listagemConsultas,
qtdConsultasPorMedico,	
listaConsultasPorPaciente.	
 * @author diego
 *
 */

public class ColeçãoConsulta {

	ArrayList <CONSULTA> ListaConsulta = new ArrayList <>();

	
	public void AddConsulta(){
		
		Scanner input = new Scanner(System.in);
		String nome;
    	System.out.printf("\t INFORME NOME DO PACIENTE: ");
    	
    	do{
            nome = input.nextLine();
            if(nome.length()<4){
                System.out.print("O nome deve ter, no mínimo, 4 caracteres. Digite novamente: ");
            }
        }while(nome.length()<4);
    	
    	System.out.printf("\t INFORME NUMERO DO DOCUMENTO DO PACIENTE : ");
    	String documento = input.nextLine();
    	 
		String sexo;
		System.out.printf("\t INFORME O SEXO DO PACIENTE : ");	     

		String m="MASCULINO";
		String f="FEMININO";

	   sexo = input.nextLine();
	   String s=sexo.toUpperCase(); 
		    
   		while(!s.equals(f) && !s.equals(m)){	        	 
 		  System.out.printf("\t\n Sexo Inválido ===> %s \n ",s);
 		  System.out.println("\t\n INFORME Sexo Novamente:  ");
          s=input.nextLine();
          s = s.toUpperCase();
   		}
   		
   		sexo=s;
	
   		
   		String NOME;
    	System.out.printf("\t INFORME NOME DO MÉDICO(A): ");
    	
    	do{
            NOME = input.nextLine();
            if(NOME.length()<4){
                System.out.print("O nome deve ter, no mínimo, 4 caracteres. Digite novamente: ");
            }
        }while(NOME.length()<4);
    	
    	String CRM;
    	System.out.printf("\t INFORME CRM DO MÉDICO: ");
    	
    	do{
            CRM = input.nextLine();
            if(CRM.length()<6){
                System.out.print("CRM INCOMPLETO ! NO MÍNIMO 6 DIGITOS !  ");
            }
        }while(CRM.length()<6);
    	
    	System.out.printf("\t INFORME ESPECIALIDADE DO MÉDICO: ");
    	String Especialidade;
    	Especialidade = input.nextLine();
    	
	   	LocalDate date = LocalDate.now ();
	   	LocalTime hora = LocalTime.now();
	   
	   	Paciente paciente = new Paciente(nome,documento,sexo); 	
		Médico med = new Médico(CRM,NOME,Especialidade);		
		CONSULTA cons = new CONSULTA(paciente,med,hora,date);
		ListaConsulta.add(cons);	
		
		System.out.println(cons.toString());
}
	/***
	 * Listar Consulta 
	 */
	
	public void ListarConsulta(){
		
		if(ListaConsulta.isEmpty()){
			System.out.println("Não a Consultas ! ");
		}
		
		for (CONSULTA consulta : ListaConsulta){
			System.out.println(consulta);
		}
	}
	
	/***
	 * Listar consulta por médico.
	 */
	
public void QtdoListarConsultaPorMedico(){
		

		if(ListaConsulta.isEmpty()){
			System.out.printf("Não a Consultas ! ");
			return;
		}
		
		int cont =0;
		System.out.printf("Digite o nome do Médico:");
		
		Scanner teclado = new Scanner(System.in);
		String Nome = teclado.nextLine();
		for (CONSULTA consulta : ListaConsulta){	
			if(consulta.getMed().getNOME().contains (Nome)){
			cont++;	
			}
		}
		System.out.printf("\t\n quantidade ==> [  %d ]\n",cont);
}

/***
 * Listar Consulta por paciente.
 */

public void ListaConsultaPorPaciente(){
	
	if(ListaConsulta.isEmpty()){
		System.out.println("Não a Consultas ! ");
		return;
	}

		System.out.printf("DIGITE NOME DO PACIENTE: ");
		Scanner teclado = new Scanner(System.in);
		String Nome = teclado.nextLine();
	
		for( CONSULTA consulta : ListaConsulta ){
			if(consulta.getPac().getNOME().contains(Nome)){
			System.out.println(consulta);
			return;
			}
			else{
				System.out.println("\t\n Consulta não encontrada \n");
			}
		}
}

/***
 * Listar consulta por data.
 */

public void ListarConsultaPorData(){

	if(ListaConsulta.isEmpty()){
		System.out.println("Não a Consultas ! ");
		return;
	}
	
	System.out.println("\n\t DIGITE A DATA DA CONSULTA: ");
	
	Scanner teclado = new Scanner(System.in);
	
	String data = teclado.nextLine();
	int cont = 0;
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
	LocalDate dateconsulta = LocalDate.parse(data, formato);
	
		for(CONSULTA consulta : ListaConsulta){
				if(consulta.getData().equals(dateconsulta)){
					cont++;
				}
		}
		System.out.println("Quantidade de consultas : "+cont);
}

}
	
