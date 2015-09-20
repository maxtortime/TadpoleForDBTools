/*******************************************************************************
 * Copyright (c) 2013 hangum.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     hangum - initial API and implementation
 ******************************************************************************/
package com.hangum.tadpole.manager.core.editor.auth;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import com.hangum.tadpole.manager.core.Messages;
import com.hangum.tadpole.session.manager.SessionManager;

/**
 * user management input
 * 
 * @author hangum
 *
 */
public class UserManagementEditorInput implements IEditorInput {
	
	public UserManagementEditorInput() {
	}

	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return true;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof UserManagementEditorInput) ) return false;
		return ((UserManagementEditorInput)obj).getName().equals(getName());
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor.getMissingImageDescriptor();
	}

	@Override
	public String getName() {
		if(SessionManager.isAdmin()) {
			return Messages.UserManagementEditorInput_0;
		} else {
			return Messages.UserManagementEditorInput_2;
		}
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		if(SessionManager.isAdmin()) {
			return Messages.UserManagementEditorInput_1;
		} else {
			return Messages.UserManagementEditorInput_3;
		}
	}

}
