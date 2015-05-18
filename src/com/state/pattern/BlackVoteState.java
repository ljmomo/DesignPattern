package com.state.pattern;

import java.util.ArrayList;
import java.util.List;

public class BlackVoteState implements VoteState {

	
	@Override
	public void vote(String user, String voteItem, VoteManager voteManger) {
		//记录黑名单中，禁止登录系统
	    System.out.println("进入黑名单，将禁止登录和使用本系统");
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return BLACK_STATUS;
	}

}
