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

package org.eclipse.virgo.sample.dynamic.provider.one;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.virgo.sample.dynamic.core.ContentProvider;

/**
 */
final class ContentProviderOne implements ContentProvider{

    private final Map<String, String> result;
    
    public ContentProviderOne() {
		this.result = new HashMap<String, String>();
		this.result.put("one1", "Steve");
		this.result.put("one2", "Glyn");
		this.result.put("one3", "Chris");
		this.result.put("one4", "More");
    }

    /** 
     * {@inheritDoc}
     */
    public String getTitle() {
        return "Some content from provider one";
    }

    /** 
     * {@inheritDoc}
     */
    public Map<String, String> getContent() {
        return this.result;
    }

}
