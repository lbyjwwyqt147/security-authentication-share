
package pers.ljy.background.share.service.impl;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

import pers.ljy.background.share.dao.BaseDao;
import pers.ljy.background.share.service.BaseService;


/**
 * service实现类
 * @param <T> 实体
 * @param <KEY> 主键
 */
public abstract class BaseServiceImpl<T, KEY extends Serializable> implements BaseService<T, KEY> {
	/**
	 * 获取DAO操作类
	 */
	public abstract BaseDao<T, KEY> getDao();

	@Override
	public int deleteByPrimaryKey(Long id) {
		return getDao().deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T t) {
		return getDao().insert(t);
	}

	@Override
	public T selectByPrimaryKey(Long id) {
		return getDao().selectByPrimaryKey(id);
	}

	@Override
	public CopyOnWriteArrayList<T> selectAll() {
		CopyOnWriteArrayList<T> listAll =  getDao().selectAll();
		if(listAll == null || listAll.isEmpty()){
			listAll = new CopyOnWriteArrayList<>();
		}
		return listAll;
	}

	@Override
	public int updateByPrimaryKey(T t) {
		return getDao().updateByPrimaryKey(t);
	}
	
	
}
