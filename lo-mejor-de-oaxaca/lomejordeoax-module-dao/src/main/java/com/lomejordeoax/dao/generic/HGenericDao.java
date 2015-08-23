package com.lomejordeoax.dao.generic;

import java.io.Serializable;

import org.lomejordeoax.utilities.exceptions.DataException;

public interface HGenericDao<Entity , PK extends Serializable> {
	void save(Entity entity)throws DataException;
	void update(Entity entity)throws DataException;
	Entity find(PK id)throws DataException;
	void delete(Entity entity)throws DataException;
}
