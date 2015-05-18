package com.state.pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoteManager {
	
	static List<VoteState> list = new ArrayList<VoteState>();    
	  
	static {  
		       
		         list.add(new NormalVoteState());  
		         list.add(new RepeatVoteState());  
	             list.add(new SpiteVoteState());  
	             list.add(new BlackVoteState());  
	  }  

	
 

   //持有状体处理对象
   //private VoteState state = null;
    //记录用户投票的结果，Map<String,String>  对应Map<用户名称,投票的选项>
	private Map<String,String> mapVote = new HashMap<String,String>();
	//记录投票次数，Map<String,Integer> 对应Map<用户名称，投票次数>	
	private Map<String,Integer> mapVoteCount = new HashMap<String, Integer>();
	/**
     * 获取用户投票结果的Map
     */
	public Map<String, String> getMapVote() {
	        return mapVote;
    }
	
	 /**
     * 投票
     * @param user    投票人
     * @param voteItem    投票的选项
     */
	
	public void vote (String user,String voteItem)
	{
	   Integer it = null ;
       Integer oldVoteCount = mapVoteCount.get(user);
       if(oldVoteCount == null)
       {
    	   oldVoteCount = 0;
       }
       oldVoteCount +=1;
       mapVoteCount.put(user, oldVoteCount);
       
       if(oldVoteCount==1)
       {
    	  // state = new NormalVoteState();
    	   it=0;
       }
       else if(oldVoteCount >1 && oldVoteCount <5)
       {
    	   //state = new RepeatVoteState();
    	   it=1;
       }
       else if(oldVoteCount >=5 && oldVoteCount <=8)
       {
    	  // state = new SpiteVoteState();
    	   it=2;
       }
       else if (oldVoteCount >8)
       {
    	   //state = new BlackVoteState();
    	   it=3;
       }
       
       for (VoteState voteState : list) {
		   if(voteState.getStatus()==it)
		   {
			   voteState.vote(user, voteItem, this);
		   }
	   }
      
	}
}
