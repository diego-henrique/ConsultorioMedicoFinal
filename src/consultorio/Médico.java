package consultorio;
/***
 * 
 * @author diego
 *	A	classe	Médico	deve	possui	os	
	atributos	CRM,	nome	e	especialidade.	
 */
public class Médico {
	
	private String NOME;
	private String CRM;
	private String ESPECIALIDADE;
		
	/**
 * construtor
 */
	
/*public Médico(){
	this.CRM=null;
	this.NOME=null;
	this.ESPECIALIDADE=null;
}*/

/**
 * @param crm
 * @param nome
 */
	public Médico(String crm, String nome , String especialidade){
		this.CRM=crm;
		this.NOME=nome;
		this.ESPECIALIDADE=especialidade;
	}
	
	
	/**
	 * Métodos Gets
	 */
	
	public String getCRM(){
		return CRM;
	}
	
	public String getNOME(){
		return NOME;
	}
	
	public String getESPECIALIDADE(){
		return ESPECIALIDADE;
	}
	
	/**
	 * Métodos Sets
	 * @param crm
	 */
	
	public void setCRM(String crm){
		this.CRM=crm;
	}
	
	/** 
	 * @param nome
	 */
	
	public void setNOME(String nome){
		this.NOME=nome;
	}
	
	/***
	 * @param especialidade
	 */
		public void setESPECIALIDADE(String especialidade){
			this.ESPECIALIDADE=especialidade;
		}
		
	public String toString() {
		return "\n\t Médico [NOME=" + NOME + ", CRM=" + CRM + ", ESPECIALIDADE=" + ESPECIALIDADE + "]";
	}

		
		
	}

