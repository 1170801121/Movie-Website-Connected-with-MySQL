package com.interf;

import java.util.List;

import com.entity.Comments;
import com.entity.CommentsUtil;



public interface CommentsInterf {
	public abstract List<CommentsUtil> queryThreeTableData(int id);
	public abstract boolean addComments(Comments comments);
	public abstract boolean deleteComments(int id);
	public abstract boolean updateComments(int id,String content);
}
