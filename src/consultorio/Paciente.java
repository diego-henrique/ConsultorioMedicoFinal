package consultorio;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author diego
A classe	Paciente deve possuir os	atributos	documento,	nome,	sexo,	endereço e data	
de	nascimento.	Esta	classe	deve	possuir	dois	construtores,
os	métodos	get,	o	método	toString, um	 método	 de	 retorna  o	 nome  do  paciente	 
formatado	 da	 forma	 último	 nome,	 iniciais.	
Ex: Medeiros,	F.	P	e	um	método	que	calcula	a	idade	do	paciente.
*/

public class Paciente {
	
private String NOME;
private String SEXO;
private Endereço ENDEREÇO; //dúvida sobre o tipo endereço.
private Date DATANASC;
private String DOCUMENTO;
/**
 * @param nome
 * @param sexo
 * @param endereço
 * @param datanasc
 */
public Paciente(String nome,String documento, String sexo, Endereço endereço, Date datanasc){
	this.DOCUMENTO=documento;
	this.DATANASC=datanasc;
	this.ENDEREÇO=endereço;
	this.NOME=nome;
	this.SEXO=sexo;
}

public Paciente(String nome,String documento, String sexo){
	this.DOCUMENTO=documento;
	this.NOME=nome;
	this.SEXO=sexo;
}


/**
 * Métodos gets.
 */

public String getDOCUMENTO() {
	return DOCUMENTO;
}

public String getNOME(){
	return NOME;
}

public String getSEXO(){
	return SEXO;
}

public Endereço getENDEREÇO(){
	return ENDEREÇO;
}

public Date getDATANASC(){
	return DATANASC;
}

/**
 * Métodos sets.
 */
public void setNOME(String nome){
	NOME=nome;
}

public void setSEXO(String sexo){
	SEXO=sexo;
}

public void setENDEREÇO(Endereço endereço){
	ENDEREÇO=endereço;
}

public void setDATANASC(Date data){
	DATANASC=data;
}

public void setDOCUMENTO(String dOCUMENTO) {
	DOCUMENTO = dOCUMENTO;
}
/**
 * método que formata nome. 
 * Ex: Sobrenome,	primeiroNome.
 * @param nome
 * @return
 */
public String FormatNome(Paciente pac){
	int i,l;
	String sobrenomeNome;
	i = pac.NOME.lastIndexOf(' '); //retorna a posição da última ocorrência do espaço em branco
	l = pac.NOME.lastIndexOf(1); //retorna a primeira posição de ocorrência do nome.
	String letra = pac.NOME.substring(l+1,1);
	String sob = pac.NOME.substring(i+1, pac.NOME.length());
	sobrenomeNome = sob + ", " + letra + ". ";	
	return sobrenomeNome;
}
/**
 * 
 * @param datarecebida
 * @return
*/
public int IdadePAC(String dataRecebida){
	
	Locale local = new Locale("pt","BR");
SimpleDateFormat Fdata = new SimpleDateFormat("yyyy", local);	
Date datahoje = new Date();
SimpleDateFormat formatodata = new SimpleDateFormat("ddMMyyyy");  

Date dat = new Date();
					      /***
				     //try, porque estamos fazendo operação de conversão,  
				    //Um bloco “try” é chamado de bloco “protegido” porque, 
				   //caso ocorra algum problema com os comandos dentro do bloco, 
				  //a execução desviará para os blocos “catch” correspondentes.
				  */					 
	try { 
		dat = formatodata.parse(dataRecebida);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	int num1 = Integer.parseInt(Fdata.format(dat));
	int num2 = Integer.parseInt(Fdata.format(datahoje));
	int idade = num2-num1;
	return idade;
}

public String toString() {
	return "Paciente [NOME=" + NOME +", DOCUMENTO="+ DOCUMENTO +", SEXO=" + SEXO + ", ENDEREÇO=" + ENDEREÇO + ", DATANASC=" + DATANASC + "]";
	}

	
}

