package consultorio;

import java.util.ArrayList;
import java.util.Scanner;

/***
ColeçãoMédicos,	 com os	 seguintes métodos:	
adicionaMédico,	pesquisaPeloCRM,pesquisaMédicoPorParteDoNome.
 * @author diego
 *
 */

public class ColeçaoMédico {

	Scanner input = new Scanner(System.in);
    ArrayList <Médico> ListaMed = new ArrayList <>();

  
    /***
     * MÉTODO PARA ADICIONAR MÉDICO
     */
    
    public void addMedico(){
    	
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
    	
    	Médico med = new Médico(CRM,NOME,Especialidade);
    	ListaMed.add(med);
    	
    	System.out.println(ListaMed.toString());
    }
    
	public void PesquisaCRM(){
		
		if(ListaMed.isEmpty()){
			 System.out.printf(" Não á Médicos Cadastrados Lista Vazia");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\t Informe Número do CRM: ");
		String CRM = in.nextLine();

		for(Médico med: ListaMed){
			if(med.getCRM().equals(CRM)){
			System.out.println(med);
			}
			else{
			System.out.printf(" médico não encontrado ! \n");
			}	
		}			
	}
	
	/***
	 * pesquisa Médico Por Parte Do Nome.
	 * 
	 */
	
	public void PesquisaMedico(){	
		
		if(ListaMed.isEmpty()){
			System.out.println("A lista de médicos está vazia.");
			return;
		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\t Digite o nome do Médico: ");
		String Nome = teclado .nextLine();
		
		for(Médico med: ListaMed){
			if(med.getNOME().contains(Nome)){
				System.out.println(med);
				return;
			}
			else{
			System.out.println("\n\t médico não encontrado ! \n");
			}	
		}
	}
}
