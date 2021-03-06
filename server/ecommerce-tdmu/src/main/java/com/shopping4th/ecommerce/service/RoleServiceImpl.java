package com.shopping4th.ecommerce.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping4th.ecommerce.dao.RoleRepo;
import com.shopping4th.ecommerce.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {

	
	private RoleRepo roleRepo;
	@Autowired
	public RoleServiceImpl(RoleRepo roleRepo) {
		this.roleRepo = roleRepo;
	}

	@Override
	public Set<Role> findByName(String name) {
		return this.roleRepo.findByName(name);
	}

	@Override
	public List<Role> findAll() {
		return this.roleRepo.findAll();
	}

}
