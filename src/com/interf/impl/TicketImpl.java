package com.interf.impl;

import com.entity.Cinema;
import com.entity.Ticket;
import com.interf.TicketInterf;
import com.util.JDBCTemplate;
import com.util.rowMapper.CinemaRowMapper;

public class TicketImpl implements TicketInterf {

	private static final String ADD_TICKET = "insert into ticket (user_id,session_id,hall_id,seat) values (?,?,?,?)";

	@Override
	public boolean addTicket(Ticket ticket) {
		JDBCTemplate<Cinema> jdbcTemplate = new JDBCTemplate<Cinema>();
		boolean addTicket = jdbcTemplate.update(ADD_TICKET, ticket.getUserId(),ticket.getSessionId(),ticket.getHallId(),ticket.getSeat());
		return addTicket;
	}

}
