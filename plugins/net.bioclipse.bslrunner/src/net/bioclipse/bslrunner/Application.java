/* 
 * Copyright (c) 2010  Jonathan Alvarsson <jonalv@users.sourceforge.net>
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package net.bioclipse.bslrunner;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;


/**
 * @author jonalv
 *
 */
public class Application implements IApplication {

    @Override
    public Object start( IApplicationContext context ) throws Exception {

        Console._instance.run();
        return EXIT_OK;
    }

    @Override
    public void stop() {

        // TODO Auto-generated method stub

    }

}
