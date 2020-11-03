package com.service.impl;

import java.util.List;
import com.interf.SessionInterf;
import com.interf.impl.SessionImpl;
import com.entity.SeatUtil;
import com.service.SessionService;
import com.util.TransactionManager;

public class SessionServiceImpl implements SessionService {
	private SessionInterf sessionInterface = new SessionImpl();
	@Override
	public List<SeatUtil> queryMovieSession(SeatUtil seatUtil) {
		try{
			TransactionManager.begin();
			List<SeatUtil> queryMovieSession = sessionInterface.queryMovieSession(seatUtil);
			TransactionManager.commit();
			return queryMovieSession;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return null;
		}
	}

}
