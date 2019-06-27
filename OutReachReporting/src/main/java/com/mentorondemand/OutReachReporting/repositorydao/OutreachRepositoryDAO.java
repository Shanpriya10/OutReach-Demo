package com.mentorondemand.OutReachReporting.repositorydao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.OutReachReporting.model.EventInfo;

@Repository
public interface OutreachRepositoryDAO extends CrudRepository<EventInfo,Long>{


}
