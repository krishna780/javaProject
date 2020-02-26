package Java8feactures;

public class Staffpublic {
	String name;
	int id;
	
	
	public Staffpublic(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	@Override
	public String toString() {
		return "Staffpublic [name=" + name + ", id=" + id + "]";
	}
	

}
