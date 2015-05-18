package com.state.pattern;

import java.util.ArrayList;
import java.util.List;

public class VoteClient {
	
	public static void main(String[] args) {
		 VoteManager vm = new VoteManager();
	        for(int i=0;i<9;i++){
	            vm.vote("u1","A");
	        }
   
		
	
	}

}
