package com.state.pattern;

public class SpiteVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManger) {
		// 恶意刷票 取消用户的投票资格，并取消投票记录
	   String str = voteManger.getMapVote().get(user)   ;
	   if(str!=null)
	   {
		   voteManger.getMapVote().remove(user);
	   }
	   System.out.println("你有恶意刷屏行为，取消投票资格");
	   
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return SPITE_STATUS;
	}

}
