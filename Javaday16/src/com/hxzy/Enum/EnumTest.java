package com.hxzy.Enum;

public class EnumTest {

	public static void main(String[] args) {
		GameInfo game = GameInfo.ʢ��;
		System.out.println(game.toString());
		System.out.println("������Ϸ��Ϣ");
		GameInfo [] game1= GameInfo.values(); 
		for (GameInfo game2 : game1) {
			System.out.println(game2.toString());
		}
		System.out.println();
		GameInfo g = GameInfo.valueOf("����");
		System.out.println(g.toString());

	}

}
