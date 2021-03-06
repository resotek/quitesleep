/* 
 	Copyright 2010-2012 Cesar Valiente Gordo
 
 	This file is part of QuiteSleep.

    QuiteSleep is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    QuiteSleep is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with QuiteSleep.  If not, see <http://www.gnu.org/licenses/>.
*/


package es.cesar.quitesleep.application;

import android.app.Application;
import android.content.Context;

public class QuiteSleepApp extends Application {
	
	private static Context context = null;
	
	@Override
	public void onCreate () {
		
		super.onCreate();
		
		if (context == null)
			context = this.getApplicationContext();
	}
	
	/**
	 * 
	 * @return {@link Context}
	 */
	public static Context getContext () {
		return context;
	}

}
