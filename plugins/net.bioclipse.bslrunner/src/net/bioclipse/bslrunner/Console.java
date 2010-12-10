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

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import net.bioclipse.scripting.JsEnvironment;

/**
 * @author jonalv
 *
 */
public class Console {

    public static final Console _instance = new Console();
    
    private JsEnvironment js;
    
    private Console() {
        System.out.println("Welcome to BSL-runner");
    }
    
    public void run() throws ScriptException {
        js = new JsEnvironment();
        
        Scanner scanner = new Scanner( System.in );
        String line = "exit";
        while (true) {
            System.out.print("BSL> ");
            line = scanner.nextLine();
            if ( "exit".equals( line ) || "quit".equals( line ) ) {
                System.exit( 0 );
            }
            try {
                System.out.println( js.eval( line ) );
            }
            catch (Exception e) {
                System.out.println( 
                    e.getClass().getSimpleName() + ": " + e.getMessage() );
            }
        } 
    }
}
