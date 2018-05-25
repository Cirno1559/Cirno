package com.hxzy.Enum;

public class EnumTest {

	public static void main(String[] args) {
		GameInfo game = GameInfo.盛大;
		System.out.println(game.toString());
		System.out.println("所有游戏信息");
		GameInfo [] game1= GameInfo.values(); 
		for (GameInfo game2 : game1) {
			System.out.println(game2.toString());
		}
		System.out.println();
		GameInfo g = GameInfo.valueOf("网易");
		System.out.println(g.toString());

	}

}
