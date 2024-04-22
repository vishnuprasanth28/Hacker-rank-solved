package com.chainsys.day2;

public class CinemaRegulation extends OnlineRelease implements RulesForOtt {
	@Override
	public String onlinePlatforms() {
		System.out.println("movie is allowed to release in online");
		return null;
	}
	public void updatedRules() {
		System.out.println("Movie must run atleast 20 days in theatre before ott release");
	}
}
