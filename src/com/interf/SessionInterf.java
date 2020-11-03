package com.interf;

import java.util.List;

import com.entity.SeatUtil;

public interface SessionInterf {
	public abstract List<SeatUtil> queryMovieSession(SeatUtil seatUtil);
}
