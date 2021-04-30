package br.com.fiap.model;

public class Setup {
	private String name;
	private String email;
	private String pass;

	public Setup() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Setup [name=" + name + ", email=" + email + ", pass=" + pass + "]";
	}
	
	
}