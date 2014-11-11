/*******************************************************************************
 * Copyright 2014 Pawel Pastuszak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package pl.kotcrab.vis.ui.widget;

import pl.kotcrab.vis.ui.VisUI;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Window;

public class VisWindow extends Window {
	private Stage parent;

	public VisWindow (Stage parent, String title) {
		this(parent, title, true);
	}

	public VisWindow (Stage parent, String title, boolean showBorder) {
		super(title, VisUI.skin, showBorder ? "default" : "noborder");
		this.parent = parent;
	}

	@Override
	public void setPosition (float x, float y) {
		super.setPosition((int)x, (int)y);
	}

	public void setPositionToCenter () {
		if (parent != null) setPosition((parent.getWidth() - getWidth()) / 2, (parent.getHeight() - getHeight()) / 2);
	}

}
