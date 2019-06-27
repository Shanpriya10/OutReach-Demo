package com.mentorondemand.OutReachReporting.repositorydao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mentorondemand.SkillsTechnologies.model.EventInfo;

//import model.EventInfo;



@EnableJpaRepositories("com.mentorondemand.SkillsTechnologies.repositorydao")
@EntityScan("com.mentorondemand.SkillsTechnologies.model")
public class OutreachRepository implements CommandLineRunner{


	@Autowired
	DataSource datasource;
	
	@Autowired
	private  OutreachRepositoryDAO repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test data priya"+ datasource);
		//System.out.println("obj"+e.getAddress());
		Iterable<EventInfo> eventlist= repository.findAll();
		System.out.println("Afterrepository"+eventlist);
		for(EventInfo list:eventlist) {
			System.out.println(list.toString());
			System.out.println(list.getEmployeeId());
		}
		
}
