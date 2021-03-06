/*******************************************************************************
 * Copyright (c) 2007-2009 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org—epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     Jonathan Alvarsson
 *     Ola Spjuth
 *     Carl M�sak
 *     
 ******************************************************************************/
package net.bioclipse.core.domain;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;

/**
 * Definitions of the basic functionality of all domain objects
 * 
 * @author jonalv, ola
 *
 */
public interface IBioObject extends IAdaptable {
    
    /**
     * @return an Eclipse resource
     */
    public IResource getResource();
    
    /**
     * Associate an Eclipse resource for this <code>IBioObject</code>.
     */
    public void setResource(IResource resource);
    /**
     * @return an unique id for the object
     */
    public String getUID();
}
