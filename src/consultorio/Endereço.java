package consultorio;
/***
A	 classe	 Endereço	 deve	 conter	 os	 atributos	 CEP,	 rua,	 
bairro	 e	 complemento.
Criar	para	 esta	 classe	 dois	 construtores,	 os	 métodos	
get, os	 métodos set,o método toString	 e	equals.	
*/
public class Endereço {	
	
	private String CEP;
	private String RUA;
	private String BAIRRO;
	private String COMPLEMENTO;

	/**
	 * @param cep
	 * @param rua
	 * @param bairro
	 * @param complemento
	 */
	public Endereço( String cep, String rua, String bairro,String complemento){
			
		this.BAIRRO=bairro;
		this.RUA=rua;
		this.CEP=cep;
		this.COMPLEMENTO=complemento;
	}

	public Endereço(){
		this.BAIRRO=null;
		this.RUA=null;
		this.CEP=null;
		this.COMPLEMENTO=null;
	}

// MÉTODOS GETS #####
	public String getBAIRRO() {
		return BAIRRO;
	}
	
	public String getRUA(){
		return RUA;
	}
	
	public String getCEP(){
		return CEP;
	}
	
	public String getCOMPLEMENTO(){
		return COMPLEMENTO;
	}
//FIM GETS ###

// MÉTODOS SETS @@@@
	
	/**
	 * método set bairro.
	 * modifica o campo bairro.
	 * @param bairro
	 */
public void setBAIRRO(String bairro) {
	BAIRRO = bairro;
}
	/**
	 * método set CEP.
	 * modifica o campo CEP.
	 * @param cep
	 */
public void setCEP(String cep) {
	CEP = cep;
}
	/**
	 * método set complemento.
	 * modifica o campo complemento.
	 * @param complemento
	 */
public void setCOMPLEMENTO(String complemento) {
	COMPLEMENTO = complemento;
}
	/**
	 * método set RUA.
	 * modifica o campo RUA.
	 * @param rua
	 */
public void setRUA(String rua) {
	RUA = rua;
}
/**
 * método to String
 **/
public String toString() {
	return "Endereço [CEP=" + CEP + ", RUA=" + RUA + ", BAIRRO=" + BAIRRO + ", COMPLEMENTO=" + COMPLEMENTO + "]";
}
/**
 * metódo equals da classe <h2> ENDEREÇO </h2>
 */
public boolean Endequals(Object obj){
	
	if(!(obj instanceof Endereço)){
		return false;
	}
	
	Endereço end = (Endereço) obj; // casting
	
	if(end.CEP == this.CEP &&end.RUA == this.RUA && 
	   end.BAIRRO == this.BAIRRO &&   
	   end.COMPLEMENTO == this.COMPLEMENTO){
		return true;
	}
	return false;
}

}
