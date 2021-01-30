package com.snack.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.snack.model.Favorite;

public interface FavoriteMapper {
	@Insert("insert into favorite(u_id,s_id) values(#{uId},#{sId})")
	public int insert(Integer uId,Integer sId);

	@Select("select * from favorite where s_id=#{sId}")
	public Favorite selectFavoriteexise(Integer sId);
}
