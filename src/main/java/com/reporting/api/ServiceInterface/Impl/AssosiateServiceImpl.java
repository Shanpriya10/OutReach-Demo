package com.reporting.api.ServiceInterface.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.reporting.api.EntityClass.AssosiateDetails;
import com.reporting.api.ServiceInterface.AssociateServiceInterface;
import com.reporting.api.dao.AssociateDAO;

public class AssosiateServiceImpl implements AssociateServiceInterface {

	@Autowired
	private AssociateDAO assoDAO;

	public void setAssoDAO(AssociateDAO assoDAO) {
		this.assoDAO = assoDAO;
	}

	@Override
	public AssosiateDetails getAllData() {

		return assoDAO.getData();
	}

}
