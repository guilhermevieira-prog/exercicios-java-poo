package entidade;

public class Empregado {
	private Integer Id;
	private String nome;
	private Double salario;
	public Empregado(Integer id, String nome, Double salario) {
		super();
		Id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

}
