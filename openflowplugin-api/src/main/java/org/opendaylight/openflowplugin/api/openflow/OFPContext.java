/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.openflowplugin.api.openflow;

/**
 * General API for all OFP Context
 */
public interface OFPContext {

    /**
     * distinguished device context states
     */
    enum CONTEXT_STATE {
        /**
         * initial phase
         */
        INITIALIZATION,
        /**
         * standard phase
         */
        WORKING,
        /**
         * termination phase
         */
        TERMINATION
    }

    CONTEXT_STATE getState();

}
