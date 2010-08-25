/* 
 * This file is part of the SpringSource dm Server.
 * 
 * Copyright (C) 2010 SpringSource Inc.
 * 
 * The SpringSource dm Server is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * The SpringSource dm Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * the SpringSource dm Server. If not, see <http://www.gnu.org/licenses/>.
 */

package org.eclipse.virgo.sample.dynamic.web;

import java.util.List;

import org.eclipse.virgo.sample.dynamic.core.ContentProvider;


/**
 * @author Christopher Frost
 */
final class DomainMapper {


    private final List<ContentProvider> providers;
    
    
    public DomainMapper(List<ContentProvider> providers) {
        this.providers = providers;
    }

    
    public List<ContentProvider> getProviders() {
        return providers;
    }
    
    
}
