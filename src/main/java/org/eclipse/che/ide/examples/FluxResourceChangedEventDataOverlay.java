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

import com.google.gwt.core.client.JavaScriptObject;

public class FluxResourceChangedEventDataOverlay extends JavaScriptObject {

    protected FluxResourceChangedEventDataOverlay() {
    }

    // args":[{"username":"USER","project":"aProject","resource":"README.md","offset":161,"removedCharCount":0,"addedCharacters":"\n "}]}


    public final native String getUsername() /*-{
                                             return this.username;
                                             }-*/;

    public final native String getProject() /*-{
                                            return this.project;
                                            }-*/;


    public final native String getResource() /*-{
                                             return this.resource;
                                             }-*/;

    public final native int getOffset() /*-{
                                        return this.offset;
                                        }-*/;

    public final native int getRemovedCharCount() /*-{
                                                  return this.removedCharCount;
                                                  }-*/;

    public final native String getAddedCharacters() /*-{
                                                    return this.addedCharacters;
                                                    }-*/;


}
