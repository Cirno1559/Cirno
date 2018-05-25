package com.hxzy.Enum;

public enum GameInfo {
	����("WOW","ORPG"),
	��Ѷ("LOL","MOBA"),
	ʢ��("lovelive","MUG"),
	EA("�̿�����","ACT");
	private final String name;
	private final String type;
	private GameInfo(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String toString() {
		String value1 = GameInfo.valueOf(super.name()).getName();
		String value2 = GameInfo.valueOf(super.name()).getType();
		return "��Ϸ����"+value1+"���ͣ�"+value2;
		
	}
}
