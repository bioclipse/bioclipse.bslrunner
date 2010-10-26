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

/**
 * @author jonalv
 *
 */
public class Console {

    public static final Console _instance = new Console();
    
    private ScriptEngine engine;
    
    private Console() {
        System.out.println("Welcome to BSL-runner");
    }
    
    public void run() throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        engine = mgr.getEngineByName("JavaScript");
        
        Scanner scanner = new Scanner( System.in );
        String line = "exit";
        do {
            System.out.print("BSL> ");
            line = scanner.nextLine();
            System.out.println( engine.eval( line ) );
            
        } while( !"exit".equals( line ) );
        System.exit( 0 );
    }
}
