package com.java8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TradeTest {

	@Test
	public void shouldMergeTwoTradesUsingAnAnonymousClass() throws Exception {
		IAddable<Trade> mergedTrade = new IAddable<Trade>() {
			
			@Override
			public Trade add(Trade t1, Trade t2) {
				t1.setQuantity(t1.getQuantity() + t2.getQuantity());
				return t1;
			}
		};
		
		Trade trade1 = new Trade(10, "First Trade");
		Trade trade2 = new Trade(15, "Second Trade");
		
		Trade finalTrade = mergedTrade.add(trade1, trade2);
		
		assertEquals(25, finalTrade.getQuantity(), 0);
	}
	
	@Test
	public void shouldMergeTwoTradesUsingLambdaExpression() throws Exception {
		IAddable<Trade> mergedTrade = (t1, t2) -> {
			t1.setQuantity(t1.getQuantity() + t2.getQuantity());
			return t1;
		};
		
		Trade trade1 = new Trade(10, "First Trade");
		Trade trade2 = new Trade(15, "Second Trade");
		
		Trade finalTrade = mergedTrade.add(trade1, trade2);
		
		assertEquals(25, finalTrade.getQuantity(), 0);
	}
	
}
