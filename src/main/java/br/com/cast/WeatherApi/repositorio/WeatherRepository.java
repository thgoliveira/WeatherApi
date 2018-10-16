package br.com.cast.WeatherApi.repositorio;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.cast.WeatherApi.modelo.WeatherResult;

@Repository
public class WeatherRepository {

	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public void inserir(WeatherResult wResult) {
		em.persist(wResult);
	}
	
	@SuppressWarnings("unchecked")
	public List<WeatherResult> buscarTudo(String cidade){
		StringBuilder qlString = new StringBuilder();
		qlString.append("from ").append(WeatherResult.class.getName())
				.append(" WHERE cidade = (:cidade) ")
				.append(" AND data >= (:data) ");

		Query query = em.createQuery(qlString.toString());
		
		query.setParameter("cidade", cidade);
		query.setParameter("data", new Date());
		
		return query.getResultList();
	}
	
	@Transactional
	public void buscarParaExcluir(String cidade) {
		StringBuilder qlString = new StringBuilder();
		qlString.append("DELETE ")
				.append(" FROM ").append(WeatherResult.class.getName())
				.append(" WHERE cidade = (:cidade) ");

		Query query = em.createQuery(qlString.toString());
		
		query.setParameter("cidade", cidade);
		
		query.executeUpdate();
	}
	
	
}
