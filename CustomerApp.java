
public class CustomerApp {
	int id;
	String name;
	Float amount;
	public CustomerApp(int id, String name, float amount ) {
		this.id = id;
		this.name = name;
		this.amount =amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	

}
