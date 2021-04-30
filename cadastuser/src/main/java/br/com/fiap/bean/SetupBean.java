package br.com.fiap.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.NamedEvent;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@RequestScoped
@NamedEvent
public class SetupBean {
	
	private Setup setup = new Setup();


	public void save() {
		new SetupDao().save(this.setup);
		System.out.println("Salvando.." + this);
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage("Setup cadastrado com sucesso"));
	}


	public String getName() {
		return setup.getName();
	}


	public void setName(String name) {
		this.setup.setName(name);
	}


	public String getEmail() {
		return setup.getEmail();
	}


	public void setEmail(String email) {
		this.setup.setEmail(email);
	}


	public String getPass() {
		return setup.getPass();
	}


	public void setPass(String pass) {
		this.setup.setPass(pass);
	}


	@Override
	public String toString() {
		return "SetupBean [name=" + setup.getName() + ", email=" + setup.getEmail() + ", pass=" + setup.getPass() + "]";
	}
	
	
}
