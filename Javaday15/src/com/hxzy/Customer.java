package com.hxzy;

public class Customer {
	private String customerName;//�˿�����
	private int buyOfNumber;//�˿͹�������
	private String buyOfProduct;//�˿͹�����Ʒ����
	public String getCustomerName() {
		return customerName;
	}
	public Customer(String customerName, int buyOfNumber, String buyOfProduct) {
		super();
		this.customerName = customerName;
		this.buyOfNumber = buyOfNumber;
		this.buyOfProduct = buyOfProduct;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBuyOfNumber() {
		return buyOfNumber;
	}
	public void setBuyOfNumber(int buyOfNumber) {
		this.buyOfNumber = buyOfNumber;
	}
	public String getBuyOfProduct() {
		return buyOfProduct;
	}
	public void setBuyOfProduct(String buyOfProduct) {
		this.buyOfProduct = buyOfProduct;
	}
}
