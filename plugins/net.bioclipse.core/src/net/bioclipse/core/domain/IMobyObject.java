/*******************************************************************************
 * Copyright (c) 2008 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ola Spjuth
 *     
 ******************************************************************************/
package net.bioclipse.core.domain;

/**
 * A moby object has an ID and a NAMESPACE.
 * @author ola
 *
 */
public interface IMobyObject {

    public String getId();
    public void setId(String id);
    public String getNamespace();
    public void setNamespace(String namespace);    
    
}
