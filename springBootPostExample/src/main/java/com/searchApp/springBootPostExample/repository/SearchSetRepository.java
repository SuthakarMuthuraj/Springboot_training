package com.searchApp.springBootPostExample.repository;

import org.springframework.data.repository.CrudRepository;

import com.searchApp.springBootPostExample.entity.SearchSet;

public interface SearchSetRepository extends CrudRepository<SearchSet, Long> {

}
