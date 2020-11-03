package com.service.impl;

import java.util.List;
import com.interf.CommentsInterf;
import com.interf.impl.CommentsImpl;
import com.entity.Cinema;
import com.entity.Comments;
import com.entity.CommentsUtil;
import com.service.CommentsService;
import com.util.TransactionManager;

public class CommentsServiceImpl implements CommentsService {
	private CommentsInterf commentsInterface = new CommentsImpl();
	@Override
	public List<CommentsUtil> queryThreeTableData(int id) {
		try{
			TransactionManager.begin();
			List<CommentsUtil> queryThreeTableData = commentsInterface.queryThreeTableData(id);
			TransactionManager.commit();
			return queryThreeTableData;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return null;
		}
		
	}
	@Override
	public boolean addComments(Comments comments) {
		try{
			TransactionManager.begin();
			boolean addComments = commentsInterface.addComments(comments);
			TransactionManager.commit();
			return addComments;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return false;
		}
	}
	@Override
	public boolean deleteComments(int id) {
		try{
			TransactionManager.begin();
			boolean deleteComments = commentsInterface.deleteComments(id);
			TransactionManager.commit();
			return deleteComments;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return false;
		}
	}
	@Override
	public boolean updateComments(int id, String content) {
		try{
			TransactionManager.begin();
			boolean updateComments = commentsInterface.updateComments(id, content);
			TransactionManager.commit();
			return updateComments;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return false;
		}
	}

}
