/*  Tyrian.java
 	Android port of the awesome vertical scroller Tyrian
 	
    Copyright (c) 2010  Ethan Chen

    This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License along
   with this program; if not, write to the Free Software Foundation, Inc.,
   51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.intervigil.tyrian;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Tyrian extends Activity {
	
	private static final String OPENTYRIAN_LIB = "opentyrian";
	
	private GameView mGLSurfaceView;
	
	static {
		System.loadLibrary(OPENTYRIAN_LIB);
	}
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	Log.i("Tyrian", "onCreate()");
        super.onCreate(savedInstanceState);
        
        mGLSurfaceView = new GameView(Tyrian.this);
        setContentView(mGLSurfaceView);
    }
    
    @Override
    protected void onDestroy() {
    	Log.i("Tyrian", "onDestroy()");
    	super.onDestroy();
    }
    
    @Override
    protected void onPause() {
    	Log.i("Tyrian", "onPause()");
    	super.onPause();
    	mGLSurfaceView.onPause();
    }
    
    @Override
    protected void onResume() {
    	Log.i("Tyrian", "onResume()");
    	super.onResume();
    	mGLSurfaceView.onResume();
    }
}