package com.nomadsoft.aracihaletur.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import com.nomadsoft.aracihaletur.entity.Examples;

import com.nomadsoft.aracihaletur.repository.ExampleRepository;


@Service
public class ExampleService implements ExampleRepository{

	@Autowired
	ExampleRepository exampleRepository;

	@Override
	public <S extends Examples> S insert(S entity) {
		// TODO Auto-generated method stub
		return exampleRepository.insert(entity);
	}

	@Override
	public <S extends Examples> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Examples> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Examples> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Examples> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Examples> findAll() {
		// TODO Auto-generated method stub
		return exampleRepository.findAll();
	}

	@Override
	public List<Examples> findAllById(Iterable<ObjectId> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Examples> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Examples> findById(ObjectId id) {
		// TODO Auto-generated method stub
		return exampleRepository.findById(id);
	}

	@Override
	public boolean existsById(ObjectId id) {
		boolean var = exampleRepository.existsById(id);
		if(var)
			return true;
		else
			return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(ObjectId id) {
		// TODO Auto-generated method stub
		exampleRepository.deleteById(id);
	}
	

	@Override
	public void delete(Examples entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends ObjectId> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Examples> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Examples> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Examples> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Examples> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Examples> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Examples> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Examples> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Examples, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}




} 