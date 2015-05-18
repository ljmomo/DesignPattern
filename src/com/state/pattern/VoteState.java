package com.state.pattern;

public interface VoteState {
	
	//正常投票状态,要记录
	public final static int NORMAL_STATUS =0;
	//重复投票,暂时不做处理
     public final static int REPEAT_STATUS =1;
    // 恶意刷票 取消用户的投票资格，并取消投票记录
     public final static int SPITE_STATUS =2; 
     //记录黑名单中，禁止登录系统
     public final static int BLACK_STATUS =3; 
	 /**
     * 处理状态对应的行为
     * @param user    投票人
     * @param voteItem    投票项
     * @param voteManager    投票上下文，用来在实现状态对应的功能处理的时候，
     *                         可以回调上下文的数据
     */
     public void vote (String user, String voteItem,VoteManager voteManger);
     
     public int getStatus();
}
