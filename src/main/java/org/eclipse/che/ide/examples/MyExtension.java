/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.examples;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.che.ide.api.action.ActionManager;
import org.eclipse.che.ide.api.action.DefaultActionGroup;
import org.eclipse.che.ide.api.constraints.Constraints;
import org.eclipse.che.ide.api.extension.Extension;

import static org.eclipse.che.ide.api.action.IdeActions.GROUP_MAIN_MENU;

@Singleton
@Extension(title = "My Extension", version = "1.0.0")
public class MyExtension {

    @Inject
    public MyExtension(MyResources resources, ActionManager actionManager, MyAction action) {

        DefaultActionGroup mainMenu = (DefaultActionGroup) actionManager.getAction(GROUP_MAIN_MENU);
        DefaultActionGroup myMenu = new DefaultActionGroup("My Menu", true, actionManager);
        mainMenu.add(myMenu, Constraints.LAST);

        actionManager.registerAction("MyMenuID", myMenu);
        actionManager.registerAction("MyActionID", action);
        myMenu.add(action);

    }
}
