
package consultorio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	ColeçaoMédico med = new ColeçaoMédico();
	
	ColeçãoConsulta cons = new ColeçãoConsulta();
	
	ColeçãoPaciente paciente = new ColeçãoPaciente();
	
	//int opcao;
	Scanner teclado = new Scanner(System.in);
	int escolha;	

	do{
		
		System.out.printf("\n\t ============================================== \n");
		System.out.printf("\t +              CONSULTORIO MÉDICO           + \n");
		System.out.printf("\t ============================================== \n");
		System.out.printf("\n\t [ 1 ] ADICIONAR PACIENTE  \n");
		System.out.printf("\t [ 2 ] PESQUISAR PELO DOCUMENTO  \n");
		System.out.printf("\t [ 3 ] REMOVER PELO DOCUMENTO  \n");
		System.out.printf("\t [ 4 ] QUANTIDADE DE PACIENTES POR SEXO  \n");
		System.out.printf("\t [ 5 ] LISTAR PACIENTES COM ENDEREÇO \n");
		System.out.printf("\t [ 6 ] LISTAR DE PACIENTES MAIORES DE 60 ANOS \n");
		System.out.printf("\n\t ============================================== \n");
		System.out.printf("\t [ 7 ] ADICIONAR MÉDICO  \n");
		System.out.printf("\t [ 8 ] PESQUISA PELO CRM \n");
		System.out.printf("\t [ 9 ] PESQUISA MÉDICO POR PARTE DO NOME  \n");
		System.out.printf("\n\t ============================================== \n");

		System.out.printf("\t [ 10 ]ADICIONAR CONSULTA \n ");
		System.out.printf("\t [ 11 ]QUANTIDADE DE CONSULTAS POR DATA \n");
		System.out.printf("\t [ 12 ]LISTAR CONSULTAS \n");
		System.out.printf("\t [ 13 ]QUANTIDADE DE CONSULTA POR MÉDICO \n");
		System.out.printf("\t [ 14 ]LISTAR CONSULTA POR PACIENTE \n");
		System.out.printf("\t [ 0 ] Para Sair ! \n");
		System.out.printf("\n\t ESCOLHA UMA DAS OPÇÕES ACIMA: ");
		escolha = teclado.nextInt();
		
		switch (escolha){
		
		case 0:
			break;
		
		case 1:
			paciente.AddPaciente();
			break;
			
		case 2:
			System.out.printf("\n\t INFORME NÚMERO DO DOCUMENTO: ");
			teclado.nextLine();
			String documento = teclado.next();
			paciente.PesquisarDocumento(documento);
			break;
			
		case 3:
			System.out.printf("\n\t INFORME NÚMERO DO DOCUMENTO: ");
			teclado.nextLine();
			String doc = teclado.next();
			paciente.Removerpaciente(doc);
			System.out.printf("\t\n");
			break;	
		
		case 4:
			System.out.printf("\t\n");
			paciente.QtdPacienteSexo();
			System.out.printf("\t\n");
			break;	
		
		case 5:
			paciente.listagemPacientesEndereço();
			break;	
			
		case 6:
			paciente.PacientesMaioresDe60anos();
			break;	
			
		case 7:
			med.addMedico();
			break;	
		
		case 8:
			med.PesquisaCRM();
			break;	
		
		case 9:
			med.PesquisaMedico();
			break;	
		
		case 10:
			cons.AddConsulta();
			break;	
			
		case 11:
			cons.ListarConsultaPorData();
			break;
			
		case 12:
			cons.ListarConsulta();
			break;
			
		case 13:
			cons.QtdoListarConsultaPorMedico();
			break;
			
		case 14:
			cons.ListaConsultaPorPaciente();
			break;
			
		default:
			System.out.println("OPÇÃO INVÁLIDA \n");
			break;
		}
		
	}while(escolha!=0);

	}
}
	