/*  GameView.java
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

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class GameView extends GLSurfaceView {

	private GameRenderer mRenderer;
	
	public GameView(Context context) {
		super(context);
		mRenderer = new GameRenderer();
		setRenderer(mRenderer);
	}

	@Override
    public boolean onTrackballEvent(MotionEvent event) {
    	return false;
    }
    
    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	return false;
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	nativeHandleKeyEvent(keyCode);
    	return true;
    }
    
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
    	nativeHandleKeyEvent(keyCode);
    	return true;
    }
    
    private static native void nativeHandleKeyEvent(int keyCode);
}
