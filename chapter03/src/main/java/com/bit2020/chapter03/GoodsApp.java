package com.bit2020.chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(30000);
		camera.setCountSold(20);
		camera.setCountStock(30);
		System.out.println(Goods.countofGoods);

	}

}
