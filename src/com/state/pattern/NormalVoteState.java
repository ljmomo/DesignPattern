package com.state.pattern;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManger) {
         //正常投票，记录到投票记录中
		voteManger.getMapVote().put(user, voteItem);
		 System.out.println("恭喜投票成功");
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return NORMAL_STATUS;
	}

}
