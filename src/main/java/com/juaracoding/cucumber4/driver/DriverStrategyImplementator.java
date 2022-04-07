package com.juaracoding.cucumber4.driver;

import com.juaracoding.cucumber4.utils.Constants;

public class DriverStrategyImplementator {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
		case Constants.FIREFOX:
			return new Firefox();
		default:
			return null;
		}
	}

}
