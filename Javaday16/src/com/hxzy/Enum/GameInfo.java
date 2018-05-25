package com.hxzy.Enum;

public enum GameInfo {
	网易("WOW","ORPG"),
	腾讯("LOL","MOBA"),
	盛大("lovelive","MUG"),
	EA("刺客信条","ACT");
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
		return "游戏名："+value1+"类型："+value2;
		
	}
}
