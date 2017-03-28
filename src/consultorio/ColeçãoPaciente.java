package consultorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/***
ColeçãoPacientes, com os seguintesmétodos: 
adicionarPaciente, 
pesquisaPeloDocumento,	
removePeloDocumento,	
qtdPacientesPorSexo,	
listagemPacientesComEndereço		
listagemDePacientesMaioresDe60anos.
 * @author diego
 *
 */
public class ColeçãoPaciente {

	Scanner input = new Scanner(System.in);
    ArrayList <Paciente> Listapac = new ArrayList <>();
   
    /***
     * Método adicionar Paciente.
     */
    public void AddPaciente(){
    		String nome;
    	System.out.printf("\t INFORME NOME DO PACIENTE: ");
    	do{
            nome = input.nextLine();
            if(nome.length()<4){
                System.out.print("O nome deve ter, no mínimo, 4 caracteres. Digite novamente: ");
            }
        }while(nome.length()<4);
    	
    	System.out.printf("\t INFORME O NÚMERO DO DOCUMENTO DO PACIENTE : ");
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
   		
   		System.out.printf("\t INFORME DATA DE NASCIMENTO: ");
   		Date data = new Date();
	   	String recebedata = input.nextLine();
	   	 
		SimpleDateFormat formatodata = new SimpleDateFormat("ddMMyyyy");  
		
		try {
			data = formatodata.parse(recebedata);
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
		System.out.printf("\t INFORME CEP DO PACIENTE: ");
	   	String cep;
	   	do {
	   		cep = input.nextLine();
	   		if (cep.length()<9){
	   		 System.out.println("CEP INVÁLIDO !!! ");
	   		}
	   	}while(cep.length()<9);
	   	
	   	System.out.printf("\t INFORME RUA DO PACIENTE: ");
	   	String rua = input.nextLine();
		
	   	System.out.printf("\t INFORME BAIRRO DO PACIENTE: ");	
	   	String bairro = input.nextLine();
	   
		System.out.printf("\t INFORME COMPLEMENTO DO PACIENTE: ");
	   	String complemento = input.nextLine();
	   	
 Endereço end = new Endereço(cep,rua,bairro,complemento);		
 Paciente Pac = new Paciente(nome,documento, sexo, end,data);
 Listapac.add(Pac);
	
 System.out.println(Pac.toString());
    }
    
    /***
     * Pesquisa paciente pelo documento cadastrado
     * @param documento
     */
    public void PesquisarDocumento(String documento){
    	 if(Listapac.isEmpty()){
		   System.out.printf(" Não á Pacientes Cadastrados Lista Vazia \n");
		  }
    	 
	      for (Paciente paciente : Listapac){
			  if(paciente.getDOCUMENTO().equals(documento)){
				  System.out.println("\n\t PACIENTE ENCONTRADO => [   " + paciente.getNOME()+"   ]");  
			  } 
			  else{
			  System.out.printf("Não á Paciente Cadastrado com esse DOCUMENTO ! \n");
			  }
	      }
   }  
    
   /***
    * remover paciente Pelo Documento. 
    * @param documento
    */
    
   public void Removerpaciente(String documento){
	   if(Listapac.isEmpty()){
		   System.out.printf(" Não á Pacientes Cadastrados Lista Vazia !");
	   }
	   for (Paciente paciente: Listapac){
		   if(paciente.getDOCUMENTO().equals(documento)){
			   Listapac.remove(paciente);
			   System.out.println("\n \tPaciente Removido com sucesso ! ");
			   return;
		   }
		   else{
			System.out.printf("Não á Paciente Cadastrado com esse DOCUMENTO ! ");
		   }
	   }
   }
  
   /***
    * quantidade de Pacientes Por Sexo
    */
   
   public void QtdPacienteSexo(){
	   int m=0,f=0;
	   
	   if(Listapac.isEmpty()){
		   System.out.printf(" Não á Pacientes Cadastrados Lista Vazia !");
	   }
	   
	   for(Paciente pac : Listapac){
		  if(pac.getSEXO().equals("MASCULINO")){
			 m++;
		  }
		  if(pac.getSEXO().equals("FEMININO")){
			  f++;
		  }  
	   }  
	   
	   	  System.out.printf("\t\n QUANTIDADE DE PACIENTES DO SEXO MASCULINO ");
		  System.out.printf("\t [ %d ] \n ",m);
		  
		  System.out.printf("\t\n QUANTIDADE DE PACIENTES DO SEXO FEMININO ");
		  System.out.printf("\t [ %d ] \n",f);
   }
   
   /***
    * 	Método para listar Paciente pelo endereço	 
    * 	@param  end
    * 	end tipo String
    */
   
   public void listagemPacientesEndereço(){
	   
		System.out.printf("\t INFORME DATA DE NASCIMENTO: ");
   		Date data = new Date();
	   	String recebedata = input.nextLine();
	   	 
		SimpleDateFormat formatodata = new SimpleDateFormat("ddMMyyyy");  
		
				try {
					data = formatodata.parse(recebedata);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
	System.out.printf("\t INFORME CEP DO PACIENTE: ");
   	String cep;
   	do {
   		cep = input.nextLine();
   			 if (cep.length()<9){
   				 System.out.println("CEP INVÁLIDO !!! ");
   			 }
   	}while(cep.length()<9);
   	
   	System.out.printf("\t INFORME RUA DO PACIENTE: ");
   	String rua = input.nextLine();
	
   	System.out.printf("\t INFORME BAIRRO DO PACIENTE: ");	
   	String bairro = input.nextLine();
   
	System.out.printf("\t INFORME COMPLEMENTO DO PACIENTE: ");
   	String complemento = input.nextLine();
   	
   	
Endereço end = new Endereço(cep,rua,bairro,complemento);   
	   
	   if(Listapac.isEmpty()){
		   System.out.printf(" \n Não á Pacientes Cadastrados Lista Vazia ! \n");
	   }
	   
	   for(Paciente pac : Listapac){
		 
		  if(pac.getENDEREÇO().equals(end)){
			System.out.println(pac);
		  } 
		  
		  else{
			 System.out.printf("Não á Paciente Cadastrado com esse ENDEREÇO ! ");
		  }
	   }
   	}
   
   /***
    * listagemDePacientesMaioresDe60anos.
    */
   public void PacientesMaioresDe60anos(){ 
	   
	   	Locale local = new Locale("pt","BR");
		SimpleDateFormat Fdata = new SimpleDateFormat("ddMMyyyy", local);
	   
	   if(Listapac.isEmpty()){
		   System.out.printf(" Não á Pacientes Cadastrados Lista Vazia ! \n");
	   }
	   
	   int idade;
	   String data;
	   for(Paciente pac : Listapac){

		data = ""+Fdata.format(pac.getDATANASC());
		
			idade=pac.IdadePAC(data);
			  
			if(idade>=60){
			  System.out.println(pac.FormatNome(pac));
			 }
	   }	   
   } 
}
