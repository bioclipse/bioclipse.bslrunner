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

import org.aopalliance.intercept.MethodInvocation;

import net.bioclipse.core.api.recording.IWrapInProxyAdvice;


/**
 * @author jonalv
 *
 */
public class WrapInProxyAdvice implements IWrapInProxyAdvice {

    @Override
    public Object invoke( MethodInvocation arg0 ) throws Throwable {
        return arg0.proceed();
    }
}
