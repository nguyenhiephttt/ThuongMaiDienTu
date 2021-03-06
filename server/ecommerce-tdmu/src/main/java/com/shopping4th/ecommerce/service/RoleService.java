package com.shopping4th.ecommerce.service;

import java.util.List;
import java.util.Set;

import com.shopping4th.ecommerce.entity.Role;

public interface RoleService {
	public Set<Role> findByName(String name);
	public List<Role> findAll();
}
