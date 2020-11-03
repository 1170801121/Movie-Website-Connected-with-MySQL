package com.service.impl;

import java.util.List;
import com.interf.TicketInterf;
import com.interf.impl.TicketImpl;
import com.entity.SeatUtil;
import com.entity.Ticket;
import com.service.TicketService;
import com.util.TransactionManager;

public class TicketServiceImpl implements TicketService {
	private TicketInterf ticketInterface = new TicketImpl();
	@Override
	public boolean addTicket(Ticket ticket) {
		try{
			TransactionManager.begin();
			boolean addTicket = ticketInterface.addTicket(ticket);
			TransactionManager.commit();
			return addTicket;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return false;
		}
	}

}
