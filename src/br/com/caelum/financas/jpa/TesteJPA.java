package br.com.caelum.financas.jpa;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteJPA {

	public static void main(String[] args) {       

//		Conta conta = new Conta();
//		conta.setTitular("Teste ");
//		conta.setBanco("BB");
//		conta.setAgencia("123");
//		conta.setNumero("013305");

		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();
//		manager.persist(conta);
//		manager.getTransaction().commit();
//		manager.close();
		
		//Pesquisando
//		Conta conta = manager.find(Conta.class, 1);
//      System.out.println(conta.getTitular());
//      manager.getTransaction().commit();
//      manager.close();
		
		//Alterando o titular da conta
		Conta conta = manager.find(Conta.class, 1);
        System.out.println(conta.getTitular());
        conta.setTitular("Luiz Ferreira");
        System.out.println(conta.getTitular());
        manager.getTransaction().commit();
        manager.close();

	}
}
