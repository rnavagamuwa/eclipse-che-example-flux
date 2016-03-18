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
package org.eclipse.che.ide.socketio;

import com.google.gwt.core.client.JavaScriptObject;

public class SocketOverlay extends JavaScriptObject {

    protected SocketOverlay() {
    }

    public final native void reconnect() /*-{
        this.socket.reconnect();
    }-*/;

    public final native void emit(String type, JavaScriptObject json) /*-{
      this.emit(type, json, function(answer) {
            });
    }-*/;

    public final native void on(String eventName, Runnable runnable)  /*-{
            this.on(eventName,
                function() {
                    handler.@java.lang.Runnable::run()();
                });
    }-*/;


    public final native <T extends JavaScriptObject> void on(String eventName, Consumer<T> handler) /*-{
         this.on(eventName,
                     function(param) {
                         handler.@org.eclipse.che.ide.socketio.Consumer::accept(*)(param);
                     });
     }-*/;

}
