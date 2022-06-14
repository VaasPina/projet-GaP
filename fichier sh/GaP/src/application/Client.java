package application;

public class Client {
	private Long IdClient;
	private String Name;
	
	public Long getId() {
		return IdClient;
	}
	public void setId(Long id) {
		this.IdClient = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public Client(Long IdClient, String Name) {
		super();
		this.IdClient = IdClient;
		this.Name = Name;
	}
}
