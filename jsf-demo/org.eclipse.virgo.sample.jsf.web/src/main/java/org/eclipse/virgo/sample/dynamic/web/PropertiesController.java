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

package org.eclipse.virgo.sample.dynamic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * TODO Document AppController
 * </p>
 *
 * <strong>Concurrent Semantics</strong><br />
 *
 * TODO Document concurrent semantics of AppController
 *
 */
@Controller
@RequestMapping("/properties")
public final class PropertiesController {

    @Autowired
    private DomainMapper domainMapper;
    
    /**
     * Custom handler for displaying a list of properties.
     */
    @RequestMapping("/overview")
    public ModelAndView information() {
        
        ModelAndView modelAndView = new ModelAndView("properties").addObject("providers", domainMapper.getProviders());
        
        return modelAndView;
    }

}
