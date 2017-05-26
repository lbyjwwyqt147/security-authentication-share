package pers.ljy.background.share.dao;

import java.io.Serializable;
import java.util.List;


/***
 * dao基类<实体,主键>
 * @param <T> 实体
 * @param <KEY> 主键
 */
public interface BaseDao<T,KEY extends Serializable> {
	
	/**
     * 根据主键删除数据库的记录
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     * @param t
     */
    int insert(T t);

    /**
     * 根据主键获取一条数据库记录
     * @param id
     */
    T selectByPrimaryKey(Long id);

    /**
     * 获取全部数据库记录
     */
    List<T> selectAll();

    /**
     * 根据主键来更新数据库记录
     * @param t
     */
    int updateByPrimaryKey(T t);
}
