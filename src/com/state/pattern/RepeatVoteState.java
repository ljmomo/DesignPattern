package com.state.pattern;

public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManger) {
		// 重复投票  暂时不做处理
		System.out.println("请不要重复投票");

	}
	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return REPEAT_STATUS;
	}

}
