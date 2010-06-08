/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.eclipse.virgo.sample.dynamic.core.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.virgo.sample.dynamic.core.ContentProvider;

/**
 */
final class StandardContentProvider implements ContentProvider{

    private final Map<String, String> result;
    
    public StandardContentProvider(String driverClassName, String url, String username, String password) {
		this.result = new HashMap<String, String>();
		this.result.put("driverClassName", driverClassName);
		this.result.put("url", url);
		this.result.put("username", username);
		this.result.put("password", password);
    }

    /** 
     * {@inheritDoc}
     */
    public String getTitle() {
        // TODO Auto-generated method stub
        return "The properties used to configure the core of the application";
    }

    /** 
     * {@inheritDoc}
     */
    public Map<String, String> getContent() {
        return this.result;
    }

}
