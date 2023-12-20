package org.jsp.userapp.controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCfg {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		System.out.println(factory);
	}
}
