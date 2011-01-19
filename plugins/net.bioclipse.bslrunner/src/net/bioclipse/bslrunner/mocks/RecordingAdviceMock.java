/* 
 * Copyright (c) 2010  Jonathan Alvarsson <jonalv@users.sourceforge.net>
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package net.bioclipse.bslrunner.mocks;

import java.lang.reflect.Method;

import net.bioclipse.core.api.recording.IRecordingAdvice;


/**
 * @author jonalv
 *
 */
public class RecordingAdviceMock implements IRecordingAdvice {

    @Override
    public void afterReturning( Object arg0,
                                Method arg1,
                                Object[] arg2,
                                Object arg3 ) throws Throwable {
        
    }
}
